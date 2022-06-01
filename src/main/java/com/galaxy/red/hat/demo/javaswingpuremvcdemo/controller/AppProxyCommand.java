package com.galaxy.red.hat.demo.javaswingpuremvcdemo.controller;


import com.galaxy.red.hat.demo.javaswingpuremvcdemo.AppFacade;
import com.galaxy.red.hat.demo.javaswingpuremvcdemo.model.AppSettingsManagerProxy;
import org.puremvc.java.interfaces.INotification;
import org.puremvc.java.patterns.command.SimpleCommand;

public class AppProxyCommand extends SimpleCommand {
    @Override
    public void execute(INotification notification) {
        super.execute(notification);
        facade = AppFacade.getInstance();
        /** register proxy */
//        facade.registerProxy(new AppSettingsManagerProxy());
    }
}
