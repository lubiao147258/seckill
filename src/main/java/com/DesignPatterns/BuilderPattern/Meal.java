package com.DesignPatterns.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lubiao
 * @createDate 2018年07月27日 下午 03:28:00
 */
public class Meal {
    private List<Item> itemList = new ArrayList<Item>();

    public void addItem(Item item){
        itemList.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for(Item item : itemList){
            cost += item.Price()*item.number();
        }
        return cost;
    }

    public void showItems(){
        for(Item item : itemList){
            System.out.print("条目 : "+item.name());
            System.out.print(", 包装 : "+item.packing().Pack());
            System.out.print(", 数量 : "+item.number());
            System.out.print(", 单价 : "+item.Price());
            System.out.println(", 价格 : "+item.Price()*item.number() +"￥");
        }
    }
}
