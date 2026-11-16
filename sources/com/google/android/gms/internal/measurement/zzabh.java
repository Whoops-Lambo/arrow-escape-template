package com.google.android.gms.internal.measurement;

import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class zzabh {
    public final int a;
    public final zzza b;

    public abstract void a(zzyy zzyyVar, Object obj);

    public zzabh(zzza zzzaVar, int i) {
        if (zzzaVar != null) {
            if (i >= 0) {
                this.a = i;
                this.b = zzzaVar;
                return;
            } else {
                defpackage.d.r(pv1.l(i, "invalid index: ", new StringBuilder(String.valueOf(i).length() + 15)));
                throw null;
            }
        }
        defpackage.d.r("format options cannot be null");
        throw null;
    }
}
