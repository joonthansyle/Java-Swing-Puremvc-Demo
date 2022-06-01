package com.galaxy.red.hat.demo.javaswingpuremvcdemo;

import com.galaxy.red.hat.demo.javaswingpuremvcdemo.constants.ApiConstants;
import com.galaxy.red.hat.demo.javaswingpuremvcdemo.controller.AppStartupMacroCommand;
import com.galaxy.red.hat.demo.javaswingpuremvcdemo.model.AppSettingsManagerProxy;
import com.galaxy.red.hat.demo.javaswingpuremvcdemo.view.AppScreenView;
import org.puremvc.java.patterns.facade.Facade;
import org.puremvc.java.patterns.observer.Notification;

public class AppFacade extends Facade {
    private static final String TAG = AppFacade.class.getCanonicalName();
    private static final String NAME = TAG;
    private static final String START_COMMAND = ApiConstants.START_COMMAND;
    private static AppFacade instance;

    private static synchronized void createInstance(){
        instance = new AppFacade();
    }
    public static AppFacade getInstance(){
        if(instance == null){
            createInstance();
        }
        return instance;
    }

    @Override
    protected void initializeController() {
        super.initializeController();
        System.out.println("INITIALIZE CONTROLLER");
        registerCommand(START_COMMAND, AppStartupMacroCommand::new);
    }


    /**
     * Initialize required Proxy since the AppProxyCommand will be called before sendNotification in the startup
     * If any proxy is required after sendNotification, add the proxy inside AppProxyCommand
     */
    @Override
    protected void initializeModel() {
        super.initializeModel();
        registerProxy(new AppSettingsManagerProxy());
    }

    public void startup(){
        AppSettingsManagerProxy amp = retrieveProxy(AppSettingsManagerProxy.NAME);
        AppScreenView appScreenView = new AppScreenView();
        appScreenView.setBounds(amp.getX(),amp.getY(),amp.getWidth(), amp.getHeight());
        appScreenView.setVisible(true);
        sendNotification(START_COMMAND, appScreenView);
        registerProxy(new AppSettingsManagerProxy());
    }

    @Override
    public void sendNotification(String notificationName, Object body, String type) {
        notifyObservers( new Notification( notificationName, body, type ) );
    }
}
