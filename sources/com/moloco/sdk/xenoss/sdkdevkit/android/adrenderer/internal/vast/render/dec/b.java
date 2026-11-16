package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec;

import android.content.Context;
import com.moloco.sdk.internal.services.bidtoken.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.m1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.n1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.z0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d;
import defpackage.at;
import defpackage.ba0;
import defpackage.dn;
import defpackage.eb1;
import defpackage.eu;
import defpackage.kc2;
import defpackage.l22;
import defpackage.vi2;
import defpackage.vq0;
import defpackage.wg1;
import defpackage.xc0;
import defpackage.ye2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class b implements c, p {
    public final t0 a;
    public final k b;
    public final dn c;
    public final eb1 d;
    public final vq0 e;
    public final ye2 f;
    public final ye2 g;
    public final String h;
    public final z0 i;
    public final s j;

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p
    public final void destroy() {
        kc2.g(this.c, null);
        this.j.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g
    public final vi2 l() {
        return (l22) this.d.d;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g
    public final void reset() {
        this.d.reset();
    }

    public b(t0 t0Var, h hVar, int i, Context context, com.moloco.sdk.internal.services.events.c cVar, a1 a1Var, k kVar) {
        i0 i0Var;
        Integer numValueOf;
        Integer numValueOf2;
        t0Var.getClass();
        context.getClass();
        cVar.getClass();
        a1Var.getClass();
        kVar.getClass();
        this.a = t0Var;
        this.b = kVar;
        ba0 ba0Var = xc0.a;
        dn dnVarA = kc2.a(wg1.a);
        this.c = dnVarA;
        this.d = new eb1(dnVarA, i);
        List listA = eu.A(t0Var.c);
        List listA2 = eu.A(t0Var.d);
        List listA3 = eu.A(t0Var.e);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h hVarA = j.a();
        m1 m1VarA = n1.a();
        cVar.getClass();
        hVarA.getClass();
        m1VarA.getClass();
        vq0 vq0Var = new vq0();
        vq0Var.a = cVar;
        vq0Var.b = listA;
        vq0Var.c = listA2;
        vq0Var.d = listA3;
        vq0Var.e = hVarA;
        vq0Var.f = m1VarA;
        this.e = vq0Var;
        ye2 ye2VarB = at.b(0, 0, 7);
        this.f = ye2VarB;
        this.g = ye2VarB;
        this.h = t0Var.a;
        this.i = new z0(t0Var.f, t0Var.g, t0Var.h, t0Var.i);
        if (hVar != null) {
            i0Var = hVar.a;
        } else {
            i0Var = null;
        }
        if (hVar != null) {
            numValueOf = Integer.valueOf(hVar.b);
        } else {
            numValueOf = null;
        }
        if (hVar != null) {
            numValueOf2 = Integer.valueOf(hVar.c);
        } else {
            numValueOf2 = null;
        }
        this.j = new s(i0Var, numValueOf, numValueOf2, hVar != null ? hVar.d : null, dnVarA, context, cVar, a1Var, null, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public final void a(d dVar) {
        dVar.getClass();
        vq0 vq0Var = this.e;
        vq0Var.getClass();
        ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h) vq0Var.e).a(dVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c cVar) {
        cVar.getClass();
        vq0 vq0Var = this.e;
        vq0Var.getClass();
        ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h) vq0Var.e).a(cVar);
    }
}
