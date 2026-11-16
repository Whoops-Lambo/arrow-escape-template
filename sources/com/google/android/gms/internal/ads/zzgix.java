package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.a04;
import defpackage.b64;
import defpackage.fu4;
import defpackage.ku4;
import defpackage.rl4;
import defpackage.sl4;
import defpackage.tc4;
import defpackage.ut4;
import defpackage.vt4;
import defpackage.wm4;
import defpackage.xm4;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzgix implements zzghy {
    public final zzgfx a;
    public final sl4 b;
    public final zzgin c;
    public final ExecutorService d;
    public final zzgsw e;
    public final AtomicReference f = new AtomicReference();

    @Override // com.google.android.gms.internal.ads.zzghy
    public final ListenableFuture zza() {
        zzgfx zzgfxVar = this.a;
        int iQ = zzgfxVar.Q();
        boolean zW = zzgfxVar.W();
        sl4 sl4Var = this.b;
        sl4Var.getClass();
        zzhdy zzhdyVarS = zzhdy.s(zzheh.c(sl4Var.e, new rl4(sl4Var, iQ)));
        b64 b64Var = b64.n;
        fu4 fu4Var = fu4.a;
        ut4 ut4VarH = zzheh.h(zzhdyVarS, b64Var, fu4Var);
        if (zW && iQ != sl4Var.g) {
            ut4VarH = zzheh.h(zzheh.e(zzhdy.s(ut4VarH), Throwable.class, xm4.z, fu4Var), new a04(sl4Var), fu4Var);
        }
        vt4 vt4VarI = zzheh.i(zzhdy.s(ut4VarH), new wm4(this, 10), fu4Var);
        vt4VarI.addListener(new ku4(0, vt4VarI, new tc4(this, 29)), this.d);
        return vt4VarI;
    }

    public zzgix(zzgfx zzgfxVar, sl4 sl4Var, zzgin zzginVar, ExecutorService executorService, zzgsw zzgswVar) {
        this.a = zzgfxVar;
        this.b = sl4Var;
        this.c = zzginVar;
        this.d = executorService;
        this.e = zzgswVar;
    }
}
