package com.galaxy.red.hat.demo.javaswingpuremvcdemo.controller;

import com.galaxy.red.hat.demo.javaswingpuremvcdemo.view.AppScreenMediator;
import org.puremvc.java.interfaces.INotification;
import org.puremvc.java.patterns.command.SimpleCommand;

public class AppViewCommand extends SimpleCommand {
    @Override
    public void execute(INotification notification) {
        super.execute(notification);
        facade.registerMediator(new AppScreenMediator(notification.getBody()));
        /** send notification if needed */
//        facade.sendNotification(ApiConstants.<registered API>);
    }
}
