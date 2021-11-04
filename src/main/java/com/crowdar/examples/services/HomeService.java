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
        MobileActionManager.waitVisibility(HomeConstants.TIME_ENTRIES_TEXT);
        Assert.assertTrue(MobileActionManager.isVisible(HomeConstants.HAMBURGER_MENU_DRAWER), HomeConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }
    public static void HamburgerMenu(){
        MobileActionManager.click(HomeConstants.HAMBURGER_MENU_DRAWER);
    }
    public static void settings(){
        MobileActionManager.click(HomeConstants.SETTINGS_OPTION);
    }
    public static void mode(){
        MobileActionManager.click(HomeConstants.DARK_MODE_TAP);
    }
    public static void tasks(){
        MobileActionManager.click(HomeConstants.TASKS_OPTION);
    }
    public static void uploadsTask(){
        MobileActionManager.click(HomeConstants.TASKS_FLOATING_ACTION_BUTTON);
        MobileActionManager.setInput(HomeConstants.TASKS_INPUT,HomeConstants.TASKS_TEXT);
       MobileActionManager.click(HomeConstants.TASKS_LOAD);
    }

    public static void isDarkMode(){
        Assert.assertTrue(MobileActionManager
                   .waitVisibility(HomeConstants.DARK_MODE_TAP)
                   .getText()
                   .contains("ON"));
    }

    public static void TaskLoaded(){
        MobileActionManager.isVisible(HomeConstants.TASKS_OPTION);
        String task = MobileActionManager.getElement(HomeConstants.TASKS_LOADED).getText();
        Assert.assertSame(HomeConstants.TASKS_TEXT, task);
    }


}
