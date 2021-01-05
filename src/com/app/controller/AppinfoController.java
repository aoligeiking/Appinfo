package com.app.controller;


import com.app.service.AppinfoSrevice;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Appinfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/dev")
public class AppinfoController {

    @Resource
    private AppinfoSrevice appinfoSrevice;

    @RequestMapping("/flatform/app/list")
    public String appInfoList(HttpServletRequest request){

        List<Appinfo> appinfoList =  appinfoSrevice.findAppinfoList();
        request.setAttribute("appInfoList",appinfoList);

        return "developer/appinfolist";
    }
}
