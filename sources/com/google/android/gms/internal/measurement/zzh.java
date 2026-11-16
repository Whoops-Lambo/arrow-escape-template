package com.google.android.gms.internal.measurement;

import defpackage.e32;
import defpackage.n30;
import defpackage.pv1;
import defpackage.vq2;
import io.p071bidmachine.media3.extractor.ts.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzh {
    public static boolean d(zzao zzaoVar) {
        if (zzaoVar == null) {
            return false;
        }
        Double dZzd = zzaoVar.zzd();
        return !dZzd.isNaN() && dZzd.doubleValue() >= 0.0d && dZzd.equals(Double.valueOf(Math.floor(dZzd.doubleValue())));
    }

    public static zzbk e(String str) {
        zzbk zzbkVar;
        if (str == null || str.isEmpty()) {
            zzbkVar = null;
        } else {
            zzbkVar = (zzbk) zzbk.l0.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (zzbkVar != null) {
            return zzbkVar;
        }
        defpackage.d.r(n30.y("Unsupported commandId ", str));
        return null;
    }

    public static Object i(zzao zzaoVar) {
        if (zzao.f9.equals(zzaoVar)) {
            return null;
        }
        if (zzao.e9.equals(zzaoVar)) {
            return "";
        }
        if (zzaoVar instanceof zzal) {
            return j((zzal) zzaoVar);
        }
        if (!(zzaoVar instanceof zzae)) {
            return !zzaoVar.zzd().isNaN() ? zzaoVar.zzd() : zzaoVar.zzc();
        }
        ArrayList arrayList = new ArrayList();
        zzae zzaeVar = (zzae) zzaoVar;
        int i = 0;
        while (i < zzaeVar.i()) {
            if (i >= zzaeVar.i()) {
                vq2.s(pv1.l(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
                return null;
            }
            int i2 = i + 1;
            Object objI = i(zzaeVar.k(i));
            if (objI != null) {
                arrayList.add(objI);
            }
            i = i2;
        }
        return arrayList;
    }

    public static HashMap j(zzal zzalVar) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList(zzalVar.a.keySet());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            Object objI = i(zzalVar.zzk(str));
            if (objI != null) {
                map.put(str, objI);
            }
        }
        return map;
    }

    public static void k(zzg zzgVar) {
        int iG = g(zzgVar.g("runtime.counter").zzd().doubleValue() + 1.0d);
        if (iG <= 1000000) {
            zzgVar.e("runtime.counter", new zzah(Double.valueOf(iG)));
        } else {
            e32.i("Instructions allowed exceeded");
        }
    }

    public static void a(int i, String str, List list) {
        if (list.size() == i) {
            return;
        }
        y.g(i, str, " operation requires ", list.size());
    }

    public static void b(int i, String str, List list) {
        if (list.size() >= i) {
            return;
        }
        y.g(i, str, " operation requires at least ", list.size());
    }

    public static void c(String str, int i, ArrayList arrayList) {
        if (arrayList.size() <= i) {
            return;
        }
        y.g(i, str, " operation requires at most ", arrayList.size());
    }

    public static boolean f(zzao zzaoVar, zzao zzaoVar2) {
        if (!zzaoVar.getClass().equals(zzaoVar2.getClass())) {
            return false;
        }
        if ((zzaoVar instanceof zzat) || (zzaoVar instanceof zzam)) {
            return true;
        }
        if (zzaoVar instanceof zzah) {
            if (Double.isNaN(zzaoVar.zzd().doubleValue()) || Double.isNaN(zzaoVar2.zzd().doubleValue())) {
                return false;
            }
            return zzaoVar.zzd().equals(zzaoVar2.zzd());
        }
        if (zzaoVar instanceof zzas) {
            return zzaoVar.zzc().equals(zzaoVar2.zzc());
        }
        if (zzaoVar instanceof zzaf) {
            return zzaoVar.zze().equals(zzaoVar2.zze());
        }
        if (zzaoVar != zzaoVar2) {
            return false;
        }
        return true;
    }

    public static int g(double d) {
        int i;
        if (!Double.isNaN(d) && !Double.isInfinite(d) && d != 0.0d) {
            if (d > 0.0d) {
                i = 1;
            } else {
                i = -1;
            }
            return (int) ((((double) i) * Math.floor(Math.abs(d))) % 4.294967296E9d);
        }
        return 0;
    }

    public static double h(double d) {
        int i;
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (!Double.isInfinite(d) && d != 0.0d && d != 0.0d) {
            if (d > 0.0d) {
                i = 1;
            } else {
                i = -1;
            }
            return ((double) i) * Math.floor(Math.abs(d));
        }
        return d;
    }
}
