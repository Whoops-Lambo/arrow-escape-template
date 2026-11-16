package com.google.android.recaptcha.internal;

import defpackage.ad0;
import defpackage.c91;
import defpackage.d91;
import defpackage.dy;
import defpackage.fv;
import defpackage.gv;
import defpackage.kr;
import defpackage.l92;
import defpackage.mr;
import defpackage.n91;
import defpackage.nl0;
import defpackage.o82;
import defpackage.o91;
import defpackage.os2;
import defpackage.p82;
import defpackage.qb5;
import defpackage.qy;
import defpackage.ry;
import defpackage.sy;
import defpackage.wr0;
import defpackage.xa0;
import defpackage.zr0;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzbw implements xa0 {
    private final /* synthetic */ fv zza;

    @Override // defpackage.c91
    public final kr attachChild(mr mrVar) {
        return this.zza.attachChild(mrVar);
    }

    @Override // defpackage.xa0
    public final Object await(dy dyVar) {
        return ((gv) this.zza).m(dyVar);
    }

    public final /* synthetic */ boolean cancel(Throwable th) {
        CancellationException d91Var;
        o91 o91Var = (o91) this.zza;
        if (th != null) {
            o91Var.getClass();
            d91Var = o91.X(o91Var, th);
        } else {
            d91Var = new d91(o91Var.u(), null, o91Var);
        }
        o91Var.q(d91Var);
        return true;
    }

    @Override // defpackage.sy
    public final Object fold(Object obj, zr0 zr0Var) {
        o91 o91Var = (o91) this.zza;
        o91Var.getClass();
        return qb5.g(o91Var, obj, zr0Var);
    }

    @Override // defpackage.sy
    public final qy get(ry ryVar) {
        o91 o91Var = (o91) this.zza;
        o91Var.getClass();
        return qb5.h(o91Var, ryVar);
    }

    @Override // defpackage.c91
    public final CancellationException getCancellationException() {
        return this.zza.getCancellationException();
    }

    @Override // defpackage.c91
    public final l92 getChildren() {
        return this.zza.getChildren();
    }

    @Override // defpackage.xa0
    public final Object getCompleted() {
        return ((gv) this.zza).A();
    }

    @Override // defpackage.xa0
    public final Throwable getCompletionExceptionOrNull() {
        return ((o91) this.zza).getCompletionExceptionOrNull();
    }

    @Override // defpackage.qy
    public final ry getKey() {
        this.zza.getClass();
        return nl0.i;
    }

    public final p82 getOnAwait() {
        return ((gv) this.zza).D();
    }

    public final o82 getOnJoin() {
        ((o91) this.zza).getClass();
        os2.j(3, n91.b);
        return new nl0(15);
    }

    public final c91 getParent() {
        o91 o91Var = (o91) this.zza;
        o91Var.getClass();
        kr krVar = (kr) o91.b.get(o91Var);
        if (krVar != null) {
            return krVar.getParent();
        }
        return null;
    }

    @Override // defpackage.c91
    public final ad0 invokeOnCompletion(boolean z, boolean z2, wr0 wr0Var) {
        return ((o91) this.zza).invokeOnCompletion(z, z2, wr0Var);
    }

    @Override // defpackage.c91
    public final boolean isActive() {
        return this.zza.isActive();
    }

    @Override // defpackage.c91
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // defpackage.c91
    public final boolean isCompleted() {
        return this.zza.isCompleted();
    }

    @Override // defpackage.c91
    public final Object join(dy dyVar) {
        return this.zza.join(dyVar);
    }

    @Override // defpackage.sy
    public final sy minusKey(ry ryVar) {
        return this.zza.minusKey(ryVar);
    }

    @Override // defpackage.sy
    public final sy plus(sy syVar) {
        return this.zza.plus(syVar);
    }

    @Override // defpackage.c91
    public final boolean start() {
        return this.zza.start();
    }

    public zzbw(fv fvVar) {
        this.zza = fvVar;
    }

    public final c91 plus(c91 c91Var) {
        this.zza.getClass();
        return c91Var;
    }

    @Override // defpackage.c91
    public final ad0 invokeOnCompletion(wr0 wr0Var) {
        return this.zza.invokeOnCompletion(wr0Var);
    }

    @Override // defpackage.c91
    public final void cancel(CancellationException cancellationException) {
        this.zza.cancel(cancellationException);
    }

    public final /* synthetic */ void cancel() {
        ((o91) this.zza).cancel(null);
    }
}
