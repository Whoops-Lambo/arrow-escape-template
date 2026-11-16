package com.google.android.gms.internal.ads;

import defpackage.ss4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzggv {
    public static byte[] a(String str, boolean z) {
        ss4 ss4VarH;
        ss4 ss4Var;
        if (z) {
            ss4Var = zzhbw.b;
            if (ss4Var.e != null) {
                ss4VarH = ss4Var;
                ss4VarH = ss4Var.h(ss4Var.d, null);
            }
        } else {
            ss4VarH = zzhbw.a;
        }
        ss4VarH = ss4Var;
        byte[] bArrG = ss4VarH.g(str);
        if (bArrG.length != 0 || str.length() <= 0) {
            return bArrG;
        }
        defpackage.d.r("Unable to decode ".concat(str));
        return null;
    }
}
