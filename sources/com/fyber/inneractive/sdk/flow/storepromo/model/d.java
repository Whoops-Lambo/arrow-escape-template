package com.fyber.inneractive.sdk.flow.storepromo.model;

import com.fyber.inneractive.sdk.util.h;
import defpackage.n30;
import java.text.DecimalFormat;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class d {
    public final String a;
    public final String b;
    public final String c;

    public d(String str, String str2, String str3) {
        String strM;
        this.c = "";
        this.a = str;
        this.b = str2;
        h hVar = new h(str3);
        Long l = hVar.a;
        if (l == null) {
            strM = "N/A";
        } else {
            double dLongValue = l.longValue() / 1024.0d;
            double d = dLongValue / 1024.0d;
            double d2 = d / 1024.0d;
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            String strM2 = n30.m(decimalFormat.format(hVar.a), " bytes");
            if (d > 850.0d) {
                strM = n30.m(decimalFormat.format(d2), " GB");
            } else if (dLongValue > 850.0d) {
                strM = n30.m(decimalFormat.format(d), " MB");
            } else if (hVar.a.longValue() > 850) {
                strM = n30.m(decimalFormat.format(dLongValue), " kB");
            } else {
                strM = strM2;
            }
        }
        this.c = strM;
    }
}
