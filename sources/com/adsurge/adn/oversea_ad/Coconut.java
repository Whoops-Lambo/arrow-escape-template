package com.adsurge.adn.oversea_ad;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class Coconut {
    public static final ConcurrentHashMap a;
    public static final AtomicReference b;
    public static final String c;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        a = concurrentHashMap;
        b = new AtomicReference();
        concurrentHashMap.put("C892BA2", new Filbert());
        concurrentHashMap.put("43780D5", new Filbert());
        concurrentHashMap.put("7CD3AF2", new Filbert());
        concurrentHashMap.put("22792AF", new Damson());
        c = "";
        try {
            c = c.a(Casaba.a(Build.MANUFACTURER.toLowerCase().getBytes())).substring(0, 7);
        } catch (Throwable unused) {
        }
    }

    public static Codlin a(Context context) {
        AtomicReference atomicReference = b;
        Codlin codlin = (Codlin) atomicReference.get();
        if (codlin != null) {
            return codlin;
        }
        synchronized (atomicReference) {
            try {
                Codlin codlin2 = (Codlin) atomicReference.get();
                if (codlin2 != null) {
                    return codlin2;
                }
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    return new Codlin("");
                }
                Norma norma = (Norma) a.get(c);
                if (norma == null) {
                    return new Codlin("");
                }
                Codlin codlinA = norma.a(context);
                atomicReference.set(codlinA);
                return codlinA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
