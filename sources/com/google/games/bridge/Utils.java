package com.google.games.bridge;

import android.app.Fragment;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.util.Log;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Utils {
    private static final String TAG = "Utils";

    public static void safedk_Fragment_startActivityForResult_217cff818a3a1b3aacc309b44c0675e4(Fragment p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "com.google.android.gms.games");
        p0.startActivityForResult(p1, p2);
    }

    private Utils() {
    }

    public static void startActivityForResult(Fragment fragment, Intent intent, int i) {
        try {
            safedk_Fragment_startActivityForResult_217cff818a3a1b3aacc309b44c0675e4(fragment, intent, i);
        } catch (ActivityNotFoundException unused) {
            Log.e(TAG, "Activity not found. Please install Play Games App.");
        }
    }
}
