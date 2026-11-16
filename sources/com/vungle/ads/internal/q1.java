package com.vungle.ads.internal;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class q1 {
    public final ServiceLocator a(Context context) {
        ServiceLocator serviceLocator;
        context.getClass();
        ServiceLocator serviceLocator2 = ServiceLocator.INSTANCE;
        if (serviceLocator2 == null) {
            synchronized (this) {
                serviceLocator = ServiceLocator.INSTANCE;
                if (serviceLocator == null) {
                    serviceLocator = new ServiceLocator(context, 0);
                    ServiceLocator.INSTANCE = serviceLocator;
                }
            }
            return serviceLocator;
        }
        return serviceLocator2;
    }

    public static ServiceLocator a() {
        return ServiceLocator.INSTANCE;
    }
}
