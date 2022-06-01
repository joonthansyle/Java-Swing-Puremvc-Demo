package com.galaxy.red.hat.demo.javaswingpuremvcdemo.view;

import com.galaxy.red.hat.demo.javaswingpuremvcdemo.AppFacade;
import com.galaxy.red.hat.demo.javaswingpuremvcdemo.constants.ApiConstants;

import javax.swing.*;
import java.awt.*;

public class AppScreenView extends JFrame {
    private static final String TAG = AppScreenView.class.getCanonicalName();
    private final AppFacade facade;
    private final JLabel lTotal;
    private final JTextField t1, t2;

    public AppScreenView(){
        facade = AppFacade.getInstance();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        final JLabel lTitle = new JLabel("Simple Calculator");
        lTitle.setFont(new Font("Courier New", Font.BOLD, 12));
        lTitle.setForeground(Color.DARK_GRAY);
        lTitle.setBounds(30,10, 300, 30);

        t1 = new JTextField(60);
        t2 = new JTextField(60);
        t1.setBounds(100,60, 120,30);
        t2.setBounds(100,100, 120,30);

        final JButton b1 = new JButton("Add");
        final JButton b2 = new JButton("Sub");
        final JButton b3 = new JButton("Mul");
        final JButton b4 = new JButton("Div");
        b1.setBounds(100,140, 60,30);
        b2.setBounds(160,140, 60,30);
        b3.setBounds(100,180, 60,30);
        b4.setBounds(160,180, 60,30);

        lTotal = new JLabel("RESULT");
        lTotal.setBounds(250,80,100,30);

        add(lTitle);
        add(lTotal);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(t1);
        add(t2);
        b1.addActionListener(e -> {
            facade.sendNotification(ApiConstants.ADDITION);
        });
        b2.addActionListener(e -> {
            facade.sendNotification(ApiConstants.SUBTRACTION);
        });
        b3.addActionListener(e -> {
            facade.sendNotification(ApiConstants.MULTIPLICATION);
        });
        b4.addActionListener(e -> {
            facade.sendNotification(ApiConstants.DIVISION);
        });
    }
    public void add(){
        int x = Integer.parseInt(t1.getText());
        int y = Integer.parseInt(t2.getText());
        lTotal.setText("RESULT: "+(x+y));
    }
    public void subtract(){
        int x = Integer.parseInt(t1.getText());
        int y = Integer.parseInt(t2.getText());
        lTotal.setText("RESULT: "+(x-y));
    }
    public void multiply(){
        int x = Integer.parseInt(t1.getText());
        int y = Integer.parseInt(t2.getText());
        lTotal.setText("RESULT: "+(x*y));
    }
    public void divide(){
        int x = Integer.parseInt(t1.getText());
        int y = Integer.parseInt(t2.getText());
        lTotal.setText("RESULT: "+(x/y));
    }
}
