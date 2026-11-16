package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion;

import android.content.Context;
import androidx.compose.ui.geometry.Offset;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.m1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.n1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.t;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p;
import defpackage.at;
import defpackage.ba0;
import defpackage.dn;
import defpackage.dy;
import defpackage.eb1;
import defpackage.kc2;
import defpackage.l22;
import defpackage.li2;
import defpackage.qb5;
import defpackage.tb5;
import defpackage.vi2;
import defpackage.wg1;
import defpackage.xc0;
import defpackage.xi2;
import defpackage.ye2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements i, p {
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b a;
    public final Context b;
    public final com.moloco.sdk.internal.services.events.c c;
    public final a1 d;
    public final boolean e;
    public final k f;
    public final dn g;
    public final eb1 h;
    public com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g i;
    public final com.moloco.sdk.internal.ilrd.p j;
    public final ye2 k;
    public final ye2 l;
    public final boolean m;
    public t n;
    public final xi2 o;
    public final xi2 p;

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p
    public final void destroy() {
        kc2.g(this.g, null);
        t tVar = this.n;
        if (tVar != null) {
            tVar.destroy();
        }
        this.n = null;
        this.o.j(null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g
    public final vi2 l() {
        return (l22) this.h.d;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g
    public final void reset() {
        this.h.reset();
    }

    public f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b bVar, int i, Context context, com.moloco.sdk.internal.services.events.c cVar, a1 a1Var, boolean z, k kVar) {
        s sVar;
        bVar.getClass();
        context.getClass();
        cVar.getClass();
        a1Var.getClass();
        kVar.getClass();
        this.a = bVar;
        this.b = context;
        this.c = cVar;
        this.d = a1Var;
        this.e = z;
        this.f = kVar;
        ba0 ba0Var = xc0.a;
        dn dnVarA = kc2.a(wg1.a);
        this.g = dnVarA;
        this.h = new eb1(dnVarA, i);
        this.i = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c.a.a(Offset.b);
        List list = bVar.e;
        ArrayList arrayList = bVar.f;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h hVarA = j.a();
        m1 m1VarA = n1.a();
        cVar.getClass();
        hVarA.getClass();
        m1VarA.getClass();
        com.moloco.sdk.internal.ilrd.p pVar = new com.moloco.sdk.internal.ilrd.p();
        pVar.a = cVar;
        pVar.c = list;
        pVar.d = arrayList;
        pVar.b = hVarA;
        pVar.e = m1VarA;
        this.j = pVar;
        ye2 ye2VarB = at.b(0, 0, 7);
        this.k = ye2VarB;
        this.l = ye2VarB;
        this.m = bVar.d != null;
        t tVar = this.n;
        dy dyVar = null;
        if (tVar != null) {
            sVar = tVar.a;
        } else {
            sVar = null;
        }
        xi2 xi2VarA = qb5.a(sVar);
        this.o = xi2VarA;
        this.p = xi2VarA;
        tb5.t(dnVarA, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.b(this, dyVar, 5), 3);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d dVar) {
        dVar.getClass();
        com.moloco.sdk.internal.ilrd.p pVar = this.j;
        pVar.getClass();
        ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h) pVar.b).a(dVar);
    }

    public final void b(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g gVar) {
        gVar.getClass();
        String str = this.a.d;
        if (str != null) {
            this.j.b(gVar);
            a(a.a);
            this.f.a(str);
        }
    }

    public final li2 a(e eVar) {
        return tb5.t(this.g, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.b(this, eVar, null, 6), 3);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c cVar) {
        cVar.getClass();
        com.moloco.sdk.internal.ilrd.p pVar = this.j;
        pVar.getClass();
        ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h) pVar.b).a(cVar);
    }
}
