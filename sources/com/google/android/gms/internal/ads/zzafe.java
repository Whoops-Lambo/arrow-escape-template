package com.google.android.gms.internal.ads;

import android.os.Handler;
import defpackage.e15;
import defpackage.os0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzafe {
    public final Handler a;
    public final zzaff b;

    public final void a(zzbv zzbvVar) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new os0(5, this, zzbvVar));
        }
    }

    public zzafe(Handler handler, e15 e15Var) {
        if (e15Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.a = handler;
        this.b = e15Var;
    }
}
