package com.galaxy.red.hat.demo.javaswingpuremvcdemo.controller;

import org.puremvc.java.patterns.command.MacroCommand;

public class AppStartupMacroCommand extends MacroCommand {
    @Override
    protected void initializeMacroCommand() {
        super.initializeMacroCommand();
        addSubCommand(AppProxyCommand::new);
        addSubCommand(AppViewCommand::new);
    }
}
