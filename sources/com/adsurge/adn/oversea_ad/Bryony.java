package com.adsurge.adn.oversea_ad;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class Bryony {
    public static Bennet a(Context context) {
        Bennet bennet = Bennet.b;
        if (Build.VERSION.SDK_INT < 33) {
            return Blackberry.a(Resources.getSystem().getConfiguration());
        }
        Object systemService = context.getSystemService("locale");
        return systemService != null ? new Bennet(new Betelnut(Blueberry.a(systemService))) : bennet;
    }
}
