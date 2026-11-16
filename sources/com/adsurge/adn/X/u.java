package com.adsurge.adn.X;

import android.os.Build;
import com.adsurge.adn.ads.AdSurgeAdFormat;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class u {
    public static final boolean a;
    public static final boolean b;

    static {
        int i = Build.VERSION.SDK_INT;
        a = i >= 33 && com.adsurge.adn.N.b.a("spre", 0, (AdSurgeAdFormat) null, (String) null) == 1;
        b = i >= 33 && com.adsurge.adn.N.b.a("lsdlo", 0, (AdSurgeAdFormat) null, (String) null) == 1;
    }
}
