package com.google.unity.ads.nextgen;

import android.app.Activity;
import com.google.android.libraries.ads.mobile.sdk.MobileAds;
import com.google.android.libraries.ads.mobile.sdk.common.AdInspectorError;
import com.google.android.libraries.ads.mobile.sdk.common.OnAdInspectorClosedListener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class UnityAdInspector {
    public static void openAdInspector(Activity activity, final UnityAdInspectorListener unityAdInspectorListener) {
        MobileAds.openAdInspector(new OnAdInspectorClosedListener() { // from class: com.google.unity.ads.nextgen.UnityAdInspector.1
            public void onAdInspectorClosed(AdInspectorError adInspectorError) {
                UnityAdInspectorListener unityAdInspectorListener2 = unityAdInspectorListener;
                if (unityAdInspectorListener2 != null) {
                    unityAdInspectorListener2.onAdInspectorClosed(adInspectorError);
                }
            }
        });
    }

    private UnityAdInspector() {
    }
}
