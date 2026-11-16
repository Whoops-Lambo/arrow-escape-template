package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.do4;
import defpackage.fu4;
import defpackage.ku4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgsw {
    public final zzgic a;

    public final zzgsu a(int i) {
        return new zzgsu(i, this.a);
    }

    public final void b(int i) {
        this.a.b(null, null, i - 1, -1L);
    }

    public final void c(int i, String str) {
        this.a.b(str, null, i - 1, -1L);
    }

    public final void d(int i, Throwable th) {
        this.a.b(null, th, i - 1, -1L);
    }

    public zzgsw(zzgff zzgffVar, zzgic zzgicVar) {
        this.a = zzgicVar;
    }

    public final void e(int i, ListenableFuture listenableFuture) {
        zzgsu zzgsuVarA = a(i);
        zzgsuVarA.a();
        listenableFuture.addListener(new ku4(0, listenableFuture, new do4(this, zzgsuVarA)), fu4.a);
    }

    public final void f(int i, Runnable runnable) {
        zzgsu zzgsuVarA = a(i);
        try {
            zzgsuVarA.a();
            runnable.run();
            zzgsuVarA.c();
        } catch (Throwable th) {
            try {
                zzgsuVarA.b(th);
                throw th;
            } catch (Throwable th2) {
                zzgsuVarA.c();
                throw th2;
            }
        }
    }
}
