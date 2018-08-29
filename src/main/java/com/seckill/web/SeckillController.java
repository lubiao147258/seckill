package com.seckill.web;

import com.seckill.dto.Exposer;
import com.seckill.dto.SeckillExecution;
import com.seckill.dto.SeckillResult;
import com.seckill.entity.Seckill;
import com.seckill.execption.RepeatKillException;
import com.seckill.execption.SeckillCloseException;
import com.seckill.service.SeckillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.List;

@Controller
@RequestMapping("/seckill") //url:/模块/资源/...
public class SeckillController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SeckillService seckillService;


    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping({"/main","/",""})
    public String main(){
        return "main";
    }

    @RequestMapping(name = "/list",method = RequestMethod.GET)
    public String list(Model model){//list.jsp + model = ModelAndView
        //获取列表页
        List<Seckill> list = seckillService.getSeckillList();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping(value = "/{seckillId}/detail",method = RequestMethod.GET)
    public String detail(@PathVariable("seckillId") Long seckillId , Model model){
        if(seckillId == null){
            return "redirect:/seckill/list";
        }
        Seckill seckill = seckillService.getById(seckillId);
        if(seckill == null){
            return "forward:/seckill/list";
        }
        model.addAttribute("seckill", seckill);
        return "detail";
    }

    //ajax json
    @RequestMapping(value = "/{seckillId}/exposer",
            method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public SeckillResult<Exposer> exposer(Long seckillId){
        SeckillResult<Exposer> result;
        try {
            Exposer exposer = this.seckillService.exportSeckillUrl(seckillId);
            result = new SeckillResult<Exposer>(true, exposer);
        }catch(Exception e){
            logger.error(e.getMessage());
            result = new SeckillResult<Exposer>(false, e.getMessage());
        }
        return result;
    }


    @RequestMapping(value = "/{seckillId}/{md5}/execution",
            method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public SeckillResult<SeckillExecution> execute(@PathVariable("seckillId") Long seckillId,
                                                   @PathVariable("md5") String md5,
                                                   @CookieValue(value = "killPhone",required = false) Long phone){
        if (phone == null){
            return new SeckillResult<SeckillExecution>(false, "未注册");
        }
        SeckillResult<SeckillExecution> result;
        try {
            SeckillExecution seckillExecution = this.seckillService.executeSeckill(seckillId, phone, md5);
            return new SeckillResult<SeckillExecution>(true, seckillExecution);
        } catch(RepeatKillException e){

        } catch(SeckillCloseException e){

        } catch (Exception e){
            logger.error(e.getMessage());
            //TODO
            //result = new SeckillResult<SeckillExecution>(false, e.getMessage());
        }
        return null;
    }


    @RequestMapping(value = "/downloadFile")
    public void download(HttpServletRequest request , HttpServletResponse response , String path, String fileName) throws Exception{
        downloadTemplate(request,response, path , fileName);
    }

    private void downloadTemplate(HttpServletRequest request,HttpServletResponse response,String rootPath, String fileName) throws IOException {
        String path = request.getServletContext().getRealPath("/") + rootPath;
        //1、设置response 响应头
        response.reset();
        response.setCharacterEncoding("UTF-8");
        response.setContentType("multipart/form-data");
        response.setHeader("Content-Disposition",
                "attachment;fileName="+ URLEncoder.encode(fileName, "UTF-8"));

        File file = new File(path,fileName);
        //2、 读取文件--输入流
        InputStream input=new FileInputStream(file);
        //3、 写出文件--输出流
        OutputStream out = response.getOutputStream();
        byte[] buff =new byte[1024];
        int index=0;
        //4、执行 写出操作
        while((index= input.read(buff))!= -1){
            out.write(buff, 0, index);
            out.flush();
        }
        out.close();
        input.close();
    }
}
