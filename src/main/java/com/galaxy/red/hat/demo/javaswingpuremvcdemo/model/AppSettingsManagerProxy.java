package com.galaxy.red.hat.demo.javaswingpuremvcdemo.model;

import org.puremvc.java.patterns.proxy.Proxy;

public class AppSettingsManagerProxy extends Proxy {
    public static final String NAME = AppSettingsManagerProxy.class.getCanonicalName();

    AppSettingsManagerVO appSettingsManagerVO;

    public AppSettingsManagerProxy(){
        super(NAME);
        appSettingsManagerVO = appSettingsManagerVO == null ? new AppSettingsManagerVO() : appSettingsManagerVO;
    }
    @Override
    public void onRegister() {
        super.onRegister();
    }

    public int getX(){
        return appSettingsManagerVO.getX();
    }
    public int getY(){
        return appSettingsManagerVO.getY();
    }
    public int getWidth(){
        return appSettingsManagerVO.getWidth();
    }
    public int getHeight(){
        return appSettingsManagerVO.getHeight();
    }

}
