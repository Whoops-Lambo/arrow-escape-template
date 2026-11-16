package com.adsurge.adn.p018e1;

import defpackage.h50;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a {
    public static final HashMap a = new HashMap();

    public static String a(String str, Class cls) {
        StringBuilder sbQ = h50.q(str, "_");
        sbQ.append(cls.getCanonicalName());
        return sbQ.toString();
    }

    public static b b(String str, Class cls) {
        b bVar;
        String strA = a(str, cls);
        HashMap map = a;
        b bVar2 = (b) map.get(strA);
        if (bVar2 != null) {
            return bVar2;
        }
        synchronized (cls) {
            try {
                bVar = (b) Class.forName(cls.getName().concat("Impl")).newInstance();
                try {
                    map.put(strA, bVar);
                } catch (Throwable unused) {
                    bVar2 = bVar;
                    bVar = bVar2;
                }
            } catch (Throwable unused2) {
            }
        }
        return bVar;
    }

    public static void c(String str, Class cls) {
        a.remove(a(str, cls));
    }
}
