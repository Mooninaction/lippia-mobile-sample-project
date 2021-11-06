package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import org.testng.Assert;

/**
 * This class contains the business logic.
 * We can have querys, requests or steps to do certain things (how to log into the app).
 * If we need to only complete a field or click a button, we can put it in the steps.
 */
public class HomeService {

    public static void isViewLoaded() {
        MobileActionManager.waitVisibility(HomeConstants.HAMBURGER_MENU_DRAWER);
        Assert.assertTrue(MobileActionManager.isVisible(HomeConstants.HAMBURGER_MENU_DRAWER), HomeConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }
    public static void HamburgerMenu(){
        MobileActionManager.click(HomeConstants.HAMBURGER_MENU_DRAWER);
    }
    public static void settings(){
        MobileActionManager.click(HomeConstants.SETTINGS_OPTION);
    }
    public static void mode(){
        MobileActionManager.waitVisibility(HomeConstants.DARK_MODE_TAP);
        MobileActionManager.click(HomeConstants.DARK_MODE_TAP);
    }
    public static void tasks(){
        MobileActionManager.waitVisibility(HomeConstants.TASKS_OPTION);
        MobileActionManager.click(HomeConstants.TASKS_OPTION);
    }
    public static void uploadsTask(){
        MobileActionManager.waitVisibility(HomeConstants.TASKS_FLOATING_ACTION_BUTTON);
        MobileActionManager.click(HomeConstants.TASKS_FLOATING_ACTION_BUTTON);
        MobileActionManager.waitVisibility(HomeConstants.TASKS_INPUT);
        MobileActionManager.setInput(HomeConstants.TASKS_INPUT,HomeConstants.TASKS_TEXT);
        MobileActionManager.waitVisibility(HomeConstants.TASKS_LOAD);
       MobileActionManager.click(HomeConstants.TASKS_LOAD);
    }

    public static void isDarkMode(){
        Assert.assertTrue(MobileActionManager
                   .waitVisibility(HomeConstants.DARK_MODE_TAP)
                   .getText()
                   .contains("ON"));
    }

    public static void TaskLoaded(){
        MobileActionManager.waitVisibility(HomeConstants.TASKS_LOADED);
        String task = MobileActionManager
                .waitVisibility(HomeConstants.TASKS_LOADED)
                .getText();
        Assert.assertTrue(task.contains(HomeConstants.TASKS_TEXT));
    }


    public static void goProject() {
        MobileActionManager.waitVisibility(HomeConstants.PROJECT);
        MobileActionManager.click(HomeConstants.PROJECT);
    }
}
