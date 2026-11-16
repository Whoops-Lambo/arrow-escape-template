package com.google.android.gms.internal.ads;

import defpackage.hy3;
import defpackage.qk4;
import defpackage.tb5;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdyf {
    public final zzgew a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final AtomicBoolean c = new AtomicBoolean(false);

    public final void a(zzbgm zzbgmVar) {
        this.c.set(true);
        synchronized (zzbgmVar.a) {
            try {
                if (zzbgmVar.b == null) {
                    zzbgmVar.b = new hy3();
                }
                hy3 hy3Var = zzbgmVar.b;
                synchronized (hy3Var.c) {
                    hy3Var.g.add(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzgew zzgewVar = this.a;
        zzgewVar.getClass();
        tb5.t(zzgewVar.a, null, null, new qk4(zzgewVar, null, 3), 3);
    }

    public zzdyf(zzgew zzgewVar) {
        this.a = zzgewVar;
    }
}
