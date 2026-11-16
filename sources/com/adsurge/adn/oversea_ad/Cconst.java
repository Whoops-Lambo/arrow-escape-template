package com.adsurge.adn.oversea_ad;

import android.app.Application;
import android.content.Context;

/* JADX INFO: renamed from: com.adsurge.adn.oversea_ad.const, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class Cconst {
    public static Context a;

    public static synchronized Context a() {
        return a;
    }

    public static synchronized Application b() {
        Context context = a;
        if (!(context instanceof Application)) {
            return null;
        }
        return (Application) context;
    }
}
