package com.app.service;

import com.app.mapper.AppInfoMapper;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Appinfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AppinfoSreviceImpl implements AppinfoSrevice {

    @Resource
    private AppInfoMapper appInfoMapper;
    @Override
    public List<Appinfo> findAppinfoList() {
        return appInfoMapper.findAppinfoList();
    }
}
