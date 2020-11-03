package com.yogo.demo.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QueryService {
    public List getListOfCountry(){
        List list = new ArrayList();
        list.add("China");
        list.add("German");
        list.add("America");
        return list;
    }

    public List getListOfMenuBar() {
        List list = new ArrayList();
        list.add(new MenuBar("demo","/demo"));
        list.add(new MenuBar("comunication","/comunication"));
        list.add(new MenuBar("lifecycle","/lifecycle"));
        return list;
    }
}

class MenuBar{
    public String label;
    public String routerLink;

    public MenuBar(String label, String routerLink) {
        this.label = label;
        this.routerLink = routerLink;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getRouterLink() {
        return routerLink;
    }

    public void setRouterLink(String routerLink) {
        this.routerLink = routerLink;
    }
}
