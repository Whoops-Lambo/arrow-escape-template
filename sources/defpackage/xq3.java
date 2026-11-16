package defpackage;

import com.google.android.gms.internal.ads.zzey;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class xq3 extends wt0 {
    public long b;
    public long[] c;
    public long[] d;

    public static Serializable w(int i, zzey zzeyVar) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(zzeyVar.d()));
        }
        if (i == 1) {
            return Boolean.valueOf(zzeyVar.K() == 1);
        }
        if (i == 2) {
            return u(zzeyVar);
        }
        if (i != 3) {
            if (i == 8) {
                return v(zzeyVar);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(zzeyVar.d()));
                zzeyVar.G(2);
                return date;
            }
            int iH = zzeyVar.h();
            ArrayList arrayList = new ArrayList(iH);
            for (int i2 = 0; i2 < iH; i2++) {
                Serializable serializableW = w(zzeyVar.K(), zzeyVar);
                if (serializableW != null) {
                    arrayList.add(serializableW);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strU = u(zzeyVar);
            int iK = zzeyVar.K();
            if (iK == 9) {
                return map;
            }
            Serializable serializableW2 = w(iK, zzeyVar);
            if (serializableW2 != null) {
                map.put(strU, serializableW2);
            }
        }
    }

    public static String u(zzey zzeyVar) {
        int iL = zzeyVar.L();
        int i = zzeyVar.b;
        zzeyVar.G(iL);
        return new String(zzeyVar.a, i, iL);
    }

    public static HashMap v(zzey zzeyVar) {
        int iH = zzeyVar.h();
        HashMap map = new HashMap(iH);
        for (int i = 0; i < iH; i++) {
            String strU = u(zzeyVar);
            Serializable serializableW = w(zzeyVar.K(), zzeyVar);
            if (serializableW != null) {
                map.put(strU, serializableW);
            }
        }
        return map;
    }
}
