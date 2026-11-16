package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoAdKt;
import defpackage.hg0;
import defpackage.kp;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class e1 implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l {
    public final /* synthetic */ h1 a;
    public final /* synthetic */ a b;

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r
    public final void a(boolean z) {
        String str;
        h1 h1Var = this.a;
        com.moloco.sdk.internal.ortb.model.u uVar = h1Var.r;
        if (uVar != null && uVar.a && ((!z || uVar.b) && (str = uVar.c) != null)) {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k) h1Var.e).a(str);
        }
        kp kpVar = h1Var.s;
        if (kpVar != null) {
            kpVar.invoke(Boolean.valueOf(z));
        }
    }

    public final void b() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "FullscreenAdImpl", "Ad skip button shown, triggering callback", null, false, 12, null);
        g gVar = this.a.t;
        if (gVar != null) {
            gVar.invoke();
        }
        a aVar = this.b;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    public final void c() {
        a aVar = this.b;
        if (aVar != null) {
            aVar.onAdClicked(MolocoAdKt.createAdInfo$default(this.a.d, null, null, 6, null));
        }
    }

    public e1(h1 h1Var, com.facebook.internal.j0 j0Var) {
        this.a = h1Var;
        this.b = j0Var;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
        cVar.getClass();
        h1 h1Var = this.a;
        h1Var.b(com.moloco.sdk.internal.f0.a(h1Var.d, MolocoAdError.ErrorType.AD_SHOW_ERROR, cVar, hg0.a));
    }
}
