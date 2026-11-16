package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C4664b4;
import defpackage.v8;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzwx implements v8 {
    public final /* synthetic */ zzws a;
    public final /* synthetic */ v8 b;

    public final String toString() {
        v8 v8Var = this.b;
        StringBuilder sb = new StringBuilder(v8Var.toString().length() + 14);
        sb.append("propagating=[");
        sb.append(v8Var);
        sb.append(C4664b4.j.e);
        return sb.toString();
    }

    public zzwx(zzws zzwsVar, v8 v8Var) {
        this.a = zzwsVar;
        this.b = v8Var;
    }

    @Override // defpackage.v8
    public final ListenableFuture call() {
        zzwq zzwqVarC = zzvy.c();
        zzws zzwsVarB = zzvy.b(zzwqVarC, this.a);
        try {
            ListenableFuture listenableFutureCall = this.b.call();
            zzvy.b(zzwqVarC, zzwsVarB);
            listenableFutureCall.getClass();
            return listenableFutureCall;
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
