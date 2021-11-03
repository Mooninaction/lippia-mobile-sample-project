package com.crowdar.examples.constants;

public class HomeConstants {

    public static final String TIME_ENTRIES_TEXT = "ID:me.clockify.android:id/toolbar_title";
    public static final String HAMBURGER_MENU_DRAWER = "xpath://android.widget.ImageButton[@content-desc='Open navigation drawer']";
    public static final String VIEW_NOT_DISPLAYED_MESSAGE = "Home page is not displayed.";

    public static final String SETTINGS_OPTION = "xpath:/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[3]/android.widget.CheckedTextView";
    public static final String DARK_MODE_TAP = "id:me.clockify.android:id/settings_dark_mode";
    //MODE_TAP su texto es off/on para verificar .getText()


    public static final String SIGN_OUT_BUTTON_LOCATOR = "ACCESSIBILITY_ID:signOutButtonHome";
    public static final String CHANGE_LANGUAGE_BUTTON_LOCATOR = "ACCESSIBILITY_ID:changeLanguageButtonHome";
    public static final String CAMERA_BUTTON_LOCATOR = "ACCESSIBILITY_ID:cameraButtonHome";
    public static final String PHONE_INPUT_LOCATOR = "ACCESSIBILITY_ID:phoneInputHome";



    // necesito para el tap -HamburgerMenu, settings, tap, verificar que este activado modo oscuro
    // necesito para task -proyecto, Tasks, cargar task, palabras de lo que se va a cargar, verificar task

}
