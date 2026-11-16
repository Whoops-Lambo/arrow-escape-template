package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import com.moloco.sdk.internal.o0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a1;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.kp;
import defpackage.sr0;
import defpackage.wr0;
import defpackage.wz2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class s extends k implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g {
    public final sr0 k;
    public final sr0 l;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k m;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, String str, sr0 sr0Var, sr0 sr0Var2, sr0 sr0Var3, wr0 wr0Var, a1 a1Var, l lVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k kVar) {
        super(context, str, 1, sr0Var3, new kp(12, sr0Var3, kVar), wr0Var, a1Var, true, lVar);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h hVarA = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.j.a();
        context.getClass();
        str.getClass();
        sr0Var3.getClass();
        wr0Var.getClass();
        a1Var.getClass();
        hVarA.getClass();
        this.k = sr0Var;
        this.l = sr0Var2;
        this.m = kVar;
        this.n = hVarA;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k
    public final void e() {
        if (this.i == 4) {
            d(2);
        }
        this.l.invoke();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(fy fyVar) {
        r rVar;
        if (fyVar instanceof r) {
            rVar = (r) fyVar;
            int i = rVar.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                rVar.u = i - Integer.MIN_VALUE;
            } else {
                rVar = new r(this, fyVar);
            }
        } else {
            rVar = new r(this, fyVar);
        }
        Object objB = rVar.s;
        int i2 = rVar.u;
        if (i2 == 0) {
            wz2.a0(objB);
            rVar.r = this;
            rVar.u = 1;
            objB = b(rVar);
            dz dzVar = dz.a;
            if (objB == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = rVar.r;
            wz2.a0(objB);
        }
        if (objB instanceof o0) {
            return (f0) this.g.f;
        }
        return null;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d dVar) {
        dVar.getClass();
        this.n.a(dVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k
    public final void a() {
        this.k.invoke();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c cVar) {
        cVar.getClass();
        this.n.a(cVar);
    }
}
