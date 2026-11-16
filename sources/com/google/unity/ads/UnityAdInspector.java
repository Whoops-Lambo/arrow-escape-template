package com.google.unity.ads;

import android.app.Activity;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class UnityAdInspector {
    public static void openAdInspector(final Activity activity, final UnityAdInspectorListener unityAdInspectorListener) {
        activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.UnityAdInspector.1
            @Override // java.lang.Runnable
            public void run() {
                Activity activity2 = activity;
                final UnityAdInspectorListener unityAdInspectorListener2 = unityAdInspectorListener;
                MobileAds.openAdInspector(activity2, new OnAdInspectorClosedListener(this) { // from class: com.google.unity.ads.UnityAdInspector.1.1
                    {
                        Objects.requireNonNull(this);
                    }

                    @Override // com.google.android.gms.ads.OnAdInspectorClosedListener
                    public void onAdInspectorClosed(AdInspectorError adInspectorError) {
                        UnityAdInspectorListener unityAdInspectorListener3 = unityAdInspectorListener2;
                        if (unityAdInspectorListener3 != null) {
                            unityAdInspectorListener3.onAdInspectorClosed(adInspectorError);
                        }
                    }
                });
            }
        });
    }

    private UnityAdInspector() {
    }
}
