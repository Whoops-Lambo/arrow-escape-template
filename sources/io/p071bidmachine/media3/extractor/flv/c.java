package io.p071bidmachine.media3.extractor.flv;

import io.p071bidmachine.iab.mraid.m;
import io.p071bidmachine.media3.common.util.q;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class c extends m {
    public long b;
    public long[] c;
    public long[] d;

    public static Serializable g(int i, q qVar) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(qVar.n()));
        }
        if (i == 1) {
            return Boolean.valueOf(qVar.t() == 1);
        }
        if (i == 2) {
            return i(qVar);
        }
        if (i != 3) {
            if (i == 8) {
                return h(qVar);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(qVar.n()));
                qVar.G(2);
                return date;
            }
            int iX = qVar.x();
            ArrayList arrayList = new ArrayList(iX);
            for (int i2 = 0; i2 < iX; i2++) {
                Serializable serializableG = g(qVar.t(), qVar);
                if (serializableG != null) {
                    arrayList.add(serializableG);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strI = i(qVar);
            int iT = qVar.t();
            if (iT == 9) {
                return map;
            }
            Serializable serializableG2 = g(iT, qVar);
            if (serializableG2 != null) {
                map.put(strI, serializableG2);
            }
        }
    }

    public static HashMap h(q qVar) {
        int iX = qVar.x();
        HashMap map = new HashMap(iX);
        for (int i = 0; i < iX; i++) {
            String strI = i(qVar);
            Serializable serializableG = g(qVar.t(), qVar);
            if (serializableG != null) {
                map.put(strI, serializableG);
            }
        }
        return map;
    }

    public static String i(q qVar) {
        int iZ = qVar.z();
        int i = qVar.b;
        qVar.G(iZ);
        return new String(qVar.a, i, iZ);
    }
}
