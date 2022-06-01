package com.galaxy.red.hat.demo.javaswingpuremvcdemo.view;

import com.galaxy.red.hat.demo.javaswingpuremvcdemo.AppFacade;
import com.galaxy.red.hat.demo.javaswingpuremvcdemo.constants.ApiConstants;
import org.puremvc.java.interfaces.INotification;
import org.puremvc.java.patterns.mediator.Mediator;

public class AppScreenMediator extends Mediator<AppScreenView> {
    private static final String TAG = AppScreenMediator.class.getCanonicalName();
    private static final String NAME = TAG;

    public AppScreenMediator(AppScreenView appScreenView){
        super(NAME, appScreenView);
    }

    @Override
    public void onRegister() {
        super.onRegister();
        facade = AppFacade.getInstance();
    }

    @Override
    public String[] listNotificationInterests() {
        return new String[]{
                ApiConstants.ADDITION,
                ApiConstants.SUBTRACTION,
                ApiConstants.MULTIPLICATION,
                ApiConstants.DIVISION
        };
    }

    @Override
    public void handleNotification(INotification notification) {
        super.handleNotification(notification);
        switch (notification.getName()){
            case ApiConstants.ADDITION:
                System.out.println("ADDITION");
                viewComponent.add();
                break;
            case ApiConstants.SUBTRACTION:
                System.out.println("SUBTRACTION");
                viewComponent.subtract();
                break;
            case ApiConstants.MULTIPLICATION:
                System.out.println("MULTIPLICATION");
                viewComponent.multiply();
                break;
            case ApiConstants.DIVISION:
                System.out.println("DIVISION");
                viewComponent.divide();
                break;
        }
    }
}
