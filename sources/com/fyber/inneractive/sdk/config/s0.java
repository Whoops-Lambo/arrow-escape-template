package com.fyber.inneractive.sdk.config;

import android.content.Context;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class s0 {
    public static void a(Context context, z zVar) {
        boolean zIsLimitAdTrackingEnabled;
        String id = null;
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
            try {
                IAlog.e("limit ad tracking: %s", Boolean.valueOf(zIsLimitAdTrackingEnabled));
                if (zIsLimitAdTrackingEnabled) {
                    IAlog.e("user has opt out of Ads Personalization. not accessing Advertising ID.", new Object[0]);
                } else {
                    id = advertisingIdInfo.getId();
                    IAlog.e("advertising id: %s", id);
                }
            } catch (Throwable th) {
                th = th;
                IAlog.e("Handled Exception:", new Object[0]);
                IAlog.e(com.fyber.inneractive.sdk.util.v.b(th), new Object[0]);
                IAlog.c("Advertising ID is not available. Please add Google Play Services library to improve your ad targeting.", new Object[0]);
            }
        } catch (Throwable th2) {
            th = th2;
            zIsLimitAdTrackingEnabled = false;
        }
        synchronized (zVar) {
            y yVar = zVar.b;
            yVar.a = id;
            yVar.b = zIsLimitAdTrackingEnabled;
            yVar.c = false;
        }
    }
}
