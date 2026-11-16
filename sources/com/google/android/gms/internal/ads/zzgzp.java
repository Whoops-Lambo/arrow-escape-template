package com.google.android.gms.internal.ads;

import defpackage.ms4;
import defpackage.ns4;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzgzp {
    public static Object a(ns4 ns4Var, String str) {
        ms4 it = ns4Var.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return str;
    }

    public static void b(List list, zzgwa zzgwaVar, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (zzgwaVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 >= i) {
                list.remove(i2);
            } else {
                return;
            }
        }
    }
}
