package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzezj implements zzipf {
    public final zzipo a;
    public final zzipo b;
    public final zzipo c;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        Object zzevlVar = new zzevl(((zzcox) ((zzevn) this.a).a).a());
        zzeyj zzeyjVar = (zzeyj) this.b.zzb();
        if (true == ((List) this.c.zzb()).contains("2")) {
            zzevlVar = zzeyjVar;
        }
        zzipn.a(zzevlVar);
        return zzevlVar;
    }

    public zzezj(zzipo zzipoVar, zzipo zzipoVar2, zzipo zzipoVar3) {
        this.a = zzipoVar;
        this.b = zzipoVar2;
        this.c = zzipoVar3;
    }
}
