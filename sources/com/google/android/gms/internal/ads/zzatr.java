package com.google.android.gms.internal.ads;

import android.os.Handler;
import defpackage.bf3;
import defpackage.kw0;
import defpackage.o64;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzatr {
    public final bf3 a;

    public zzatr(Handler handler) {
        this.a = new bf3(this, handler);
    }

    public final void a(zzaua zzauaVar, zzaug zzaugVar, o64 o64Var) {
        zzauaVar.zzp();
        zzauaVar.zzc("post-response");
        this.a.b.post(new kw0(zzauaVar, zzaugVar, o64Var, false, 5));
    }
}
