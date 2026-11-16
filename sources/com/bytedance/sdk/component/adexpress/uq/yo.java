package com.bytedance.sdk.component.adexpress.uq;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.ay;
import com.unity3d.services.UnityAdsConstants;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class yo {
    public static int ahm(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().rz().ahm();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static String rz(@NonNull Context context) {
        String language = "";
        try {
            Locale locale = ay.ahm(context).getConfiguration().getLocales().get(0);
            language = locale.getLanguage();
            if (locale.getCountry().equals("TW")) {
                language = "zhHant";
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJ804lGxA==", "aO0/kAayXNOJRsQ=", "XOs5uQKybtKBTdI=", 126);
        }
        return kgy(language);
    }

    private static String kgy(String str) {
        str.getClass();
        switch (str) {
            case "ar":
                return "aa";
            case "ja":
                return "japan";
            case "ko":
                return "korea";
            case "ms":
                return "my";
            case "zh":
                return "cn";
            default:
                return str;
        }
    }

    private static float uq(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int ahm(Context context, float f) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().rz().ahm();
        }
        float fUq = uq(context);
        if (fUq <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fUq = 1.0f;
        }
        return (int) ((f / fUq) + 0.5f);
    }

    public static float rz(Context context, float f) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().rz().ahm();
        }
        return f * uq(context);
    }

    public static float kgy(Context context, float f) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().rz().ahm();
        }
        return (f * uq(context)) + 0.5f;
    }

    public static int kgy(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().rz().ahm();
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int kgy(float f, float f2, float f3, float f4) {
        return (((int) ((f * 255.0f) + 0.5f)) << 24) | (((int) ((f2 * 255.0f) + 0.5f)) << 16) | (((int) ((f3 * 255.0f) + 0.5f)) << 8) | ((int) ((f4 * 255.0f) + 0.5f));
    }
}
