package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C4664b4;
import defpackage.w8;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzwy implements w8 {
    public final /* synthetic */ zzws a;
    public final /* synthetic */ w8 b;

    public final String toString() {
        w8 w8Var = this.b;
        StringBuilder sb = new StringBuilder(w8Var.toString().length() + 14);
        sb.append("propagating=[");
        sb.append(w8Var);
        sb.append(C4664b4.j.e);
        return sb.toString();
    }

    public zzwy(zzws zzwsVar, w8 w8Var) {
        this.a = zzwsVar;
        this.b = w8Var;
    }

    @Override // defpackage.w8
    public final ListenableFuture apply(Object obj) {
        zzwq zzwqVarC = zzvy.c();
        zzws zzwsVarB = zzvy.b(zzwqVarC, this.a);
        try {
            ListenableFuture listenableFutureApply = this.b.apply(obj);
            if (listenableFutureApply != null) {
                zzvy.b(zzwqVarC, zzwsVarB);
                return listenableFutureApply;
            }
            throw new IllegalStateException("AsyncFunction should return a ListenableFuture instead of null.");
        } catch (Throwable th) {
            try {
                zzvu.a(th);
                throw th;
            } catch (Throwable th2) {
                zzvy.b(zzwqVarC, zzwsVarB);
                throw th2;
            }
        }
    }
}
