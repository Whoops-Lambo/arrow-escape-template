package androidx.browser.customtabs;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.Dimension;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.IntentCompat;
import com.safedk.android.utils.Logger;
import defpackage.d;
import defpackage.pv1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class CustomTabsIntent {
    public static final int ACTIVITY_HEIGHT_ADJUSTABLE = 1;
    public static final int ACTIVITY_HEIGHT_DEFAULT = 0;
    public static final int ACTIVITY_HEIGHT_FIXED = 2;
    private static final int ACTIVITY_HEIGHT_MAX = 2;
    public static final int ACTIVITY_SIDE_SHEET_DECORATION_TYPE_DEFAULT = 0;
    public static final int ACTIVITY_SIDE_SHEET_DECORATION_TYPE_DIVIDER = 3;
    private static final int ACTIVITY_SIDE_SHEET_DECORATION_TYPE_MAX = 3;
    public static final int ACTIVITY_SIDE_SHEET_DECORATION_TYPE_NONE = 1;
    public static final int ACTIVITY_SIDE_SHEET_DECORATION_TYPE_SHADOW = 2;
    public static final int ACTIVITY_SIDE_SHEET_POSITION_DEFAULT = 0;
    public static final int ACTIVITY_SIDE_SHEET_POSITION_END = 2;
    private static final int ACTIVITY_SIDE_SHEET_POSITION_MAX = 2;
    public static final int ACTIVITY_SIDE_SHEET_POSITION_START = 1;
    public static final int ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION_DEFAULT = 0;
    private static final int ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION_MAX = 2;
    public static final int ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION_NONE = 1;
    public static final int ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION_TOP = 2;
    public static final int CLOSE_BUTTON_POSITION_DEFAULT = 0;
    public static final int CLOSE_BUTTON_POSITION_END = 2;
    private static final int CLOSE_BUTTON_POSITION_MAX = 2;
    public static final int CLOSE_BUTTON_POSITION_START = 1;
    public static final int COLOR_SCHEME_DARK = 2;
    public static final int COLOR_SCHEME_LIGHT = 1;
    private static final int COLOR_SCHEME_MAX = 2;
    public static final int COLOR_SCHEME_SYSTEM = 0;

    @ExperimentalCustomContentAction
    public static final int CONTENT_TARGET_TYPE_IMAGE = 1;

    @ExperimentalCustomContentAction
    public static final int CONTENT_TARGET_TYPE_LINK = 2;
    public static final String EXTRA_ACTION_BUTTON_BUNDLE = "android.support.customtabs.extra.ACTION_BUTTON_BUNDLE";
    public static final String EXTRA_ACTIVITY_HEIGHT_RESIZE_BEHAVIOR = "androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR";
    public static final String EXTRA_ACTIVITY_SIDE_SHEET_BREAKPOINT_DP = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_BREAKPOINT_DP";
    public static final String EXTRA_ACTIVITY_SIDE_SHEET_DECORATION_TYPE = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_DECORATION_TYPE";
    public static final String EXTRA_ACTIVITY_SIDE_SHEET_ENABLE_MAXIMIZATION = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ENABLE_MAXIMIZATION";
    public static final String EXTRA_ACTIVITY_SIDE_SHEET_POSITION = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_POSITION";
    public static final String EXTRA_ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION";

    @ExperimentalCustomContentAction
    public static final String EXTRA_CLICKED_CONTENT_TARGET_TYPE = "androidx.browser.customtabs.extra.CLICKED_CONTENT_TARGET_TYPE";
    public static final String EXTRA_CLOSE_BUTTON_ENABLED = "androidx.browser.customtabs.extra.CLOSE_BUTTON_ENABLED";
    public static final String EXTRA_CLOSE_BUTTON_ICON = "android.support.customtabs.extra.CLOSE_BUTTON_ICON";
    public static final String EXTRA_CLOSE_BUTTON_POSITION = "androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION";
    public static final String EXTRA_COLOR_SCHEME = "androidx.browser.customtabs.extra.COLOR_SCHEME";
    public static final String EXTRA_COLOR_SCHEME_PARAMS = "androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS";

    @ExperimentalCustomContentAction
    public static final String EXTRA_CONTEXT_IMAGE_ALT_TEXT = "androidx.browser.customtabs.extra.CONTEXT_IMAGE_ALT_TEXT";

    @ExperimentalCustomContentAction
    public static final String EXTRA_CONTEXT_IMAGE_DATA_URI = "androidx.browser.customtabs.extra.CONTEXT_IMAGE_DATA_URI";

    @ExperimentalCustomContentAction
    public static final String EXTRA_CONTEXT_IMAGE_URL = "androidx.browser.customtabs.extra.CONTEXT_IMAGE_URL";

    @ExperimentalCustomContentAction
    public static final String EXTRA_CONTEXT_LINK_TEXT = "androidx.browser.customtabs.extra.CONTEXT_LINK_TEXT";

    @ExperimentalCustomContentAction
    public static final String EXTRA_CONTEXT_LINK_URL = "androidx.browser.customtabs.extra.CONTEXT_LINK_URL";

    @ExperimentalCustomContentAction
    public static final String EXTRA_CUSTOM_CONTENT_ACTIONS = "androidx.browser.customtabs.extra.CUSTOM_CONTENT_ACTIONS";

    @Deprecated
    public static final String EXTRA_DEFAULT_SHARE_MENU_ITEM = "android.support.customtabs.extra.SHARE_MENU_ITEM";
    public static final String EXTRA_DISABLE_BACKGROUND_INTERACTION = "androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION";
    public static final String EXTRA_DISABLE_BOOKMARKS_BUTTON = "org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_STAR_BUTTON";
    public static final String EXTRA_DISABLE_DOWNLOAD_BUTTON = "org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_DOWNLOAD_BUTTON";
    public static final String EXTRA_ENABLE_EPHEMERAL_BROWSING = "androidx.browser.customtabs.extra.ENABLE_EPHEMERAL_BROWSING";
    public static final String EXTRA_ENABLE_INSTANT_APPS = "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS";
    public static final String EXTRA_ENABLE_URLBAR_HIDING = "android.support.customtabs.extra.ENABLE_URLBAR_HIDING";
    public static final String EXTRA_EXIT_ANIMATION_BUNDLE = "android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE";
    public static final String EXTRA_INITIAL_ACTIVITY_HEIGHT_PX = "androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX";
    public static final String EXTRA_INITIAL_ACTIVITY_WIDTH_PX = "androidx.browser.customtabs.extra.INITIAL_ACTIVITY_WIDTH_PX";
    public static final String EXTRA_MENU_ITEMS = "android.support.customtabs.extra.MENU_ITEMS";
    public static final String EXTRA_NAVIGATION_BAR_COLOR = "androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR";
    public static final String EXTRA_NAVIGATION_BAR_DIVIDER_COLOR = "androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR";
    public static final String EXTRA_NETWORK = "androidx.browser.customtabs.extra.NETWORK";

    @ExperimentalOpenInBrowser
    public static final String EXTRA_OPEN_IN_BROWSER_STATE = "androidx.browser.customtabs.extra.OPEN_IN_BROWSER_STATE";
    public static final String EXTRA_REMOTEVIEWS = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS";
    public static final String EXTRA_REMOTEVIEWS_CLICKED_ID = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_CLICKED_ID";
    public static final String EXTRA_REMOTEVIEWS_PENDINGINTENT = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT";
    public static final String EXTRA_REMOTEVIEWS_VIEW_IDS = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS";
    public static final String EXTRA_SECONDARY_TOOLBAR_COLOR = "android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR";
    public static final String EXTRA_SECONDARY_TOOLBAR_SWIPE_UP_GESTURE = "androidx.browser.customtabs.extra.SECONDARY_TOOLBAR_SWIPE_UP_GESTURE";
    public static final String EXTRA_SEND_TO_EXTERNAL_DEFAULT_HANDLER = "android.support.customtabs.extra.SEND_TO_EXTERNAL_HANDLER";
    public static final String EXTRA_SESSION = "android.support.customtabs.extra.SESSION";

    @RestrictTo
    public static final String EXTRA_SESSION_ID = "android.support.customtabs.extra.SESSION_ID";
    public static final String EXTRA_SHARE_STATE = "androidx.browser.customtabs.extra.SHARE_STATE";
    public static final String EXTRA_TINT_ACTION_BUTTON = "android.support.customtabs.extra.TINT_ACTION_BUTTON";
    public static final String EXTRA_TITLE_VISIBILITY_STATE = "android.support.customtabs.extra.TITLE_VISIBILITY";
    public static final String EXTRA_TOOLBAR_COLOR = "android.support.customtabs.extra.TOOLBAR_COLOR";
    public static final String EXTRA_TOOLBAR_CORNER_RADIUS_DP = "androidx.browser.customtabs.extra.TOOLBAR_CORNER_RADIUS_DP";
    public static final String EXTRA_TOOLBAR_ITEMS = "android.support.customtabs.extra.TOOLBAR_ITEMS";
    public static final String EXTRA_TRANSLATE_LANGUAGE_TAG = "androidx.browser.customtabs.extra.TRANSLATE_LANGUAGE_TAG";

    @ExperimentalCustomContentAction
    public static final String EXTRA_TRIGGERED_CUSTOM_CONTENT_ACTION_ID = "androidx.browser.customtabs.extra.TRIGGERED_CUSTOM_CONTENT_ACTION_ID";
    private static final String EXTRA_USER_OPT_OUT_FROM_CUSTOM_TABS = "android.support.customtabs.extra.user_opt_out";
    private static final String HTTP_ACCEPT_LANGUAGE = "Accept-Language";
    public static final String KEY_DESCRIPTION = "android.support.customtabs.customaction.DESCRIPTION";
    public static final String KEY_ICON = "android.support.customtabs.customaction.ICON";
    public static final String KEY_ID = "android.support.customtabs.customaction.ID";
    public static final String KEY_MENU_ITEM_TITLE = "android.support.customtabs.customaction.MENU_ITEM_TITLE";
    public static final String KEY_PENDING_INTENT = "android.support.customtabs.customaction.PENDING_INTENT";
    private static final int MAX_TOOLBAR_CORNER_RADIUS_DP = 16;
    private static final int MAX_TOOLBAR_ITEMS = 5;
    public static final int NO_TITLE = 0;

    @ExperimentalOpenInBrowser
    public static final int OPEN_IN_BROWSER_STATE_DEFAULT = 0;

    @ExperimentalOpenInBrowser
    private static final int OPEN_IN_BROWSER_STATE_MAX = 2;

    @ExperimentalOpenInBrowser
    public static final int OPEN_IN_BROWSER_STATE_OFF = 2;

    @ExperimentalOpenInBrowser
    public static final int OPEN_IN_BROWSER_STATE_ON = 1;
    public static final int SHARE_STATE_DEFAULT = 0;
    private static final int SHARE_STATE_MAX = 2;
    public static final int SHARE_STATE_OFF = 2;
    public static final int SHARE_STATE_ON = 1;
    public static final int SHOW_PAGE_TITLE = 1;
    public static final int TOOLBAR_ACTION_BUTTON_ID = 0;
    public final Intent intent;
    public final Bundle startAnimationBundle;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ActivityHeightResizeBehavior {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ActivitySideSheetDecorationType {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ActivitySideSheetPosition {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ActivitySideSheetRoundedCornersPosition {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api21Impl {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api23Impl {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api24Impl {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api34Impl {
        public static void a(ActivityOptions activityOptions) {
            activityOptions.setShareIdentityEnabled(false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder {
        public final Intent a;
        public final CustomTabColorSchemeParams.Builder b;
        public ActivityOptions c;
        public SparseArray d;
        public Bundle e;
        public int f;
        public boolean g;

        public Builder b(int i) {
            c(i, 0);
            return this;
        }

        public final CustomTabsIntent a() {
            Intent intent = this.a;
            if (!intent.hasExtra(CustomTabsIntent.EXTRA_SESSION)) {
                Bundle bundle = new Bundle();
                bundle.putBinder(CustomTabsIntent.EXTRA_SESSION, null);
                intent.putExtras(bundle);
            }
            intent.putExtra(CustomTabsIntent.EXTRA_ENABLE_INSTANT_APPS, this.g);
            this.b.getClass();
            intent.putExtras(new CustomTabColorSchemeParams(null, null, null, null).b());
            Bundle bundle2 = this.e;
            if (bundle2 != null) {
                intent.putExtras(bundle2);
            }
            if (this.d != null) {
                Bundle bundle3 = new Bundle();
                bundle3.putSparseParcelableArray(CustomTabsIntent.EXTRA_COLOR_SCHEME_PARAMS, this.d);
                intent.putExtras(bundle3);
            }
            intent.putExtra(CustomTabsIntent.EXTRA_SHARE_STATE, this.f);
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            String languageTag = adjustedDefault.size() > 0 ? adjustedDefault.get(0).toLanguageTag() : null;
            if (!TextUtils.isEmpty(languageTag)) {
                Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
                if (!bundleExtra.containsKey(CustomTabsIntent.HTTP_ACCEPT_LANGUAGE)) {
                    bundleExtra.putString(CustomTabsIntent.HTTP_ACCEPT_LANGUAGE, languageTag);
                    intent.putExtra("com.android.browser.headers", bundleExtra);
                }
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                if (this.c == null) {
                    this.c = ActivityOptions.makeBasic();
                }
                Api34Impl.a(this.c);
            }
            if (i >= 36) {
                if (this.c == null) {
                    this.c = ActivityOptions.makeBasic();
                }
                Api36Impl.a(this.c, CustomTabsIntent.isBackgroundInteractionEnabled(intent));
            }
            ActivityOptions activityOptions = this.c;
            return new CustomTabsIntent(intent, activityOptions != null ? activityOptions.toBundle() : null);
        }

        public final void c(int i, int i2) {
            if (i <= 0) {
                d.r("Invalid value for the initialHeightPx argument");
                return;
            }
            if (i2 < 0 || i2 > 2) {
                d.r("Invalid value for the activityHeightResizeBehavior argument");
                return;
            }
            Intent intent = this.a;
            intent.putExtra(CustomTabsIntent.EXTRA_INITIAL_ACTIVITY_HEIGHT_PX, i);
            intent.putExtra(CustomTabsIntent.EXTRA_ACTIVITY_HEIGHT_RESIZE_BEHAVIOR, i2);
        }

        public Builder d(int i) {
            if (i > 0) {
                this.a.putExtra(CustomTabsIntent.EXTRA_INITIAL_ACTIVITY_WIDTH_PX, i);
                return this;
            }
            d.r("Invalid value for the initialWidthPx argument");
            return null;
        }

        public final void e(int i) {
            if (i < 0 || i > 2) {
                d.r("Invalid value for the shareState argument");
                return;
            }
            this.f = i;
            Intent intent = this.a;
            if (i == 1) {
                intent.putExtra(CustomTabsIntent.EXTRA_DEFAULT_SHARE_MENU_ITEM, true);
            } else if (i == 2) {
                intent.putExtra(CustomTabsIntent.EXTRA_DEFAULT_SHARE_MENU_ITEM, false);
            } else {
                intent.removeExtra(CustomTabsIntent.EXTRA_DEFAULT_SHARE_MENU_ITEM);
            }
        }

        public Builder(CustomTabsSession customTabsSession) {
            Intent intent = new Intent("android.intent.action.VIEW");
            this.a = intent;
            this.b = new CustomTabColorSchemeParams.Builder();
            this.f = 0;
            this.g = true;
            if (customTabsSession != null) {
                intent.setPackage(customTabsSession.d.getPackageName());
                IBinder iBinderAsBinder = customTabsSession.c.asBinder();
                Bundle bundle = new Bundle();
                bundle.putBinder(CustomTabsIntent.EXTRA_SESSION, iBinderAsBinder);
                intent.putExtras(bundle);
            }
        }

        public Builder() {
            this.a = new Intent("android.intent.action.VIEW");
            this.b = new CustomTabColorSchemeParams.Builder();
            this.f = 0;
            this.g = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface CloseButtonPosition {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ColorScheme {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @ExperimentalCustomContentAction
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ContentTargetType {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @ExperimentalOpenInBrowser
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface OpenInBrowserState {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ShareState {
    }

    public static CustomTabColorSchemeParams getColorSchemeParams(Intent intent, int i) {
        Bundle bundle;
        if (i < 0 || i > 2 || i == 0) {
            d.r(pv1.k(i, "Invalid colorScheme: "));
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return CustomTabColorSchemeParams.a(null);
        }
        CustomTabColorSchemeParams customTabColorSchemeParamsA = CustomTabColorSchemeParams.a(extras);
        SparseArray sparseParcelableArray = extras.getSparseParcelableArray(EXTRA_COLOR_SCHEME_PARAMS);
        if (sparseParcelableArray == null || (bundle = (Bundle) sparseParcelableArray.get(i)) == null) {
            return customTabColorSchemeParamsA;
        }
        CustomTabColorSchemeParams customTabColorSchemeParamsA2 = CustomTabColorSchemeParams.a(bundle);
        Integer num = customTabColorSchemeParamsA2.a;
        if (num == null) {
            num = customTabColorSchemeParamsA.a;
        }
        Integer num2 = customTabColorSchemeParamsA2.b;
        if (num2 == null) {
            num2 = customTabColorSchemeParamsA.b;
        }
        Integer num3 = customTabColorSchemeParamsA2.c;
        if (num3 == null) {
            num3 = customTabColorSchemeParamsA.c;
        }
        Integer num4 = customTabColorSchemeParamsA2.d;
        if (num4 == null) {
            num4 = customTabColorSchemeParamsA.d;
        }
        return new CustomTabColorSchemeParams(num, num2, num3, num4);
    }

    public static int getMaxToolbarItems() {
        return 5;
    }

    public static void safedk_Context_startActivity_0c4df6808b5c0cfc92f23c850e40a674(Context p0, Intent p1, Bundle p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1, p2);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api36Impl {
        public static void a(ActivityOptions activityOptions, boolean z) {
            activityOptions.setAllowPassThroughOnTouchOutside(z);
        }
    }

    public static int getActivityResizeBehavior(Intent intent) {
        return intent.getIntExtra(EXTRA_ACTIVITY_HEIGHT_RESIZE_BEHAVIOR, 0);
    }

    @Dimension
    public static int getActivitySideSheetBreakpointDp(Intent intent) {
        return intent.getIntExtra(EXTRA_ACTIVITY_SIDE_SHEET_BREAKPOINT_DP, 0);
    }

    public static int getActivitySideSheetDecorationType(Intent intent) {
        return intent.getIntExtra(EXTRA_ACTIVITY_SIDE_SHEET_DECORATION_TYPE, 0);
    }

    public static int getActivitySideSheetPosition(Intent intent) {
        return intent.getIntExtra(EXTRA_ACTIVITY_SIDE_SHEET_POSITION, 0);
    }

    public static int getActivitySideSheetRoundedCornersPosition(Intent intent) {
        return intent.getIntExtra(EXTRA_ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION, 0);
    }

    public static int getCloseButtonPosition(Intent intent) {
        return intent.getIntExtra(EXTRA_CLOSE_BUTTON_POSITION, 0);
    }

    @Dimension
    public static int getInitialActivityHeightPx(Intent intent) {
        return intent.getIntExtra(EXTRA_INITIAL_ACTIVITY_HEIGHT_PX, 0);
    }

    @Dimension
    public static int getInitialActivityWidthPx(Intent intent) {
        return intent.getIntExtra(EXTRA_INITIAL_ACTIVITY_WIDTH_PX, 0);
    }

    @RequiresApi
    private static Locale getLocaleForLanguageTag(Intent intent) {
        String stringExtra = intent.getStringExtra(EXTRA_TRANSLATE_LANGUAGE_TAG);
        if (stringExtra != null) {
            return Locale.forLanguageTag(stringExtra);
        }
        return null;
    }

    @ExperimentalOpenInBrowser
    public static int getOpenInBrowserButtonState(Intent intent) {
        return intent.getIntExtra(EXTRA_OPEN_IN_BROWSER_STATE, 0);
    }

    public static PendingIntent getSecondaryToolbarSwipeUpGesture(Intent intent) {
        return (PendingIntent) intent.getParcelableExtra(EXTRA_SECONDARY_TOOLBAR_SWIPE_UP_GESTURE);
    }

    @Dimension
    public static int getToolbarCornerRadiusDp(Intent intent) {
        return intent.getIntExtra(EXTRA_TOOLBAR_CORNER_RADIUS_DP, 16);
    }

    public static boolean isActivitySideSheetMaximizationEnabled(Intent intent) {
        return intent.getBooleanExtra(EXTRA_ACTIVITY_SIDE_SHEET_ENABLE_MAXIMIZATION, false);
    }

    public static boolean isBackgroundInteractionEnabled(Intent intent) {
        return !intent.getBooleanExtra(EXTRA_DISABLE_BACKGROUND_INTERACTION, false);
    }

    public static boolean isBookmarksButtonEnabled(Intent intent) {
        return !intent.getBooleanExtra(EXTRA_DISABLE_BOOKMARKS_BUTTON, false);
    }

    public static boolean isCloseButtonEnabled(Intent intent) {
        return intent.getBooleanExtra(EXTRA_CLOSE_BUTTON_ENABLED, true);
    }

    public static boolean isDownloadButtonEnabled(Intent intent) {
        return !intent.getBooleanExtra(EXTRA_DISABLE_DOWNLOAD_BUTTON, false);
    }

    public static boolean isSendToExternalDefaultHandlerEnabled(Intent intent) {
        return intent.getBooleanExtra(EXTRA_SEND_TO_EXTERNAL_DEFAULT_HANDLER, false);
    }

    public static Intent setAlwaysUseBrowserUI(Intent intent) {
        if (intent == null) {
            intent = new Intent("android.intent.action.VIEW");
        }
        intent.addFlags(268435456);
        intent.putExtra(EXTRA_USER_OPT_OUT_FROM_CUSTOM_TABS, true);
        return intent;
    }

    public static boolean shouldAlwaysUseBrowserUI(Intent intent) {
        return intent.getBooleanExtra(EXTRA_USER_OPT_OUT_FROM_CUSTOM_TABS, false) && (intent.getFlags() & 268435456) != 0;
    }

    public boolean isEphemeralBrowsingEnabled() {
        return this.intent.getBooleanExtra(EXTRA_ENABLE_EPHEMERAL_BROWSING, false);
    }

    public void launchUrl(Context context, Uri uri) {
        this.intent.setData(uri);
        safedk_Context_startActivity_0c4df6808b5c0cfc92f23c850e40a674(context, this.intent, this.startAnimationBundle);
    }

    public CustomTabsIntent(Intent intent, Bundle bundle) {
        this.intent = intent;
        this.startAnimationBundle = bundle;
    }

    @ExperimentalCustomContentAction
    public static List<CustomContentAction> getCustomContentActions(Intent intent) {
        PendingIntent pendingIntent;
        int i;
        ArrayList arrayListA = IntentCompat.a(intent);
        if (arrayListA == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(arrayListA.size());
        int size = arrayListA.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListA.get(i2);
            i2++;
            Bundle bundle = (Bundle) obj;
            CustomContentAction customContentAction = null;
            if (bundle.containsKey("androidx.browser.customtabs.customcontentaction.ID")) {
                bundle.getInt("androidx.browser.customtabs.customcontentaction.ID");
                if (!TextUtils.isEmpty(bundle.getString("androidx.browser.customtabs.customcontentaction.LABEL"))) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        pendingIntent = (PendingIntent) bundle.getParcelable("androidx.browser.customtabs.customcontentaction.PENDING_INTENT", PendingIntent.class);
                    } else {
                        pendingIntent = (PendingIntent) bundle.getParcelable("androidx.browser.customtabs.customcontentaction.PENDING_INTENT");
                    }
                    if (pendingIntent != null && ((i = bundle.getInt("androidx.browser.customtabs.customcontentaction.TARGET_TYPE", 0)) == 1 || i == 2)) {
                        customContentAction = new CustomContentAction();
                    }
                }
            }
            if (customContentAction != null) {
                arrayList.add(customContentAction);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static Network getNetwork(Intent intent) {
        return (Network) IntentCompat.b(intent);
    }

    public static Locale getTranslateLocale(Intent intent) {
        return getLocaleForLanguageTag(intent);
    }
}
