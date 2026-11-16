package com.google.android.gms.internal.ads;

import defpackage.nx4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzicx {
    public static final zzicx b = new zzicx(new zzicy());
    public static final zzicx c = new zzicx(new zzidc());
    public static final zzicx d = new zzicx(new zzide());
    public static final zzicx e = new zzicx(new zzidd());
    public static final zzicx f;
    public static final zzicx g;
    public final nx4 a;

    static {
        new zzicx(new zzicz());
        f = new zzicx(new zzidb());
        g = new zzicx(new zzida());
    }

    public zzicx(zzidf zzidfVar) {
        nx4 nx4Var;
        if (!zzhno.a()) {
            if ("The Android Project".equals(System.getProperty("java.vendor"))) {
                nx4Var = new nx4(zzidfVar, 0);
            } else {
                nx4Var = new nx4(zzidfVar, 1);
            }
        } else {
            nx4Var = new nx4(zzidfVar, 2);
        }
        this.a = nx4Var;
    }
}
