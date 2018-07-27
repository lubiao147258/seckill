<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="basePath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<h2>Hello World!</h2>
<a href="javascript:void(0);" onclick="downloadTemplate('employee')">从业人员下载</a><br/>
<a href="javascript:void(0);" onclick="downloadTemplate('student')">学生下载</a>

<script>
    function downloadTemplate(type)
    {
        var path = "attachment/";
        var fileName;
        if(type == 'employee'){
            fileName = '从业人员信息导入模板.xlsx';
        }else{
            fileName = '学生信息导入模板.xlsx';
        }
        var url = "${basePath}/seckill/downloadFile?path="+path+"&fileName="+fileName;
        window.location.href=url;
    }
</script>
</body>
</html>
