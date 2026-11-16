package com.adsurge.adn.oversea_ad;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class Cranberry {
    public static Object a(SparseArray sparseArray, int i, Class cls) {
        if (sparseArray == null) {
            return null;
        }
        Object obj = sparseArray.get(i);
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        return null;
    }

    public static int a(SparseArray sparseArray) {
        Integer num = (Integer) a(sparseArray, 0, Integer.class);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }
}
