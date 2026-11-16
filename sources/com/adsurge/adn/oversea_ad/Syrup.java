package com.adsurge.adn.oversea_ad;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class Syrup {
    public static final HashMap a = new HashMap();
    public static final Object b;

    static {
        new AtomicBoolean(false);
        b = new Object();
        new AtomicReference();
    }

    public static void a(long j, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Sultana sultana = new Sultana(j, str);
        String strValueOf = String.valueOf(Core.a(str.getBytes()));
        HashMap map = a;
        synchronized (map) {
            map.put(strValueOf, sultana);
        }
        Cepheus.b.submit(new Sugarcane(sultana));
    }

    public static File a() {
        Context context;
        synchronized (Cconst.class) {
            context = Cconst.a;
        }
        return new File(context.getDir("turingfd_pri", 0), p.f);
    }
}
