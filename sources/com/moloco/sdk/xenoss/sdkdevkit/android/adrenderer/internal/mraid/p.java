package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.webkit.WebView;
import defpackage.at;
import defpackage.cz;
import defpackage.eb1;
import defpackage.ep0;
import defpackage.if2;
import defpackage.l22;
import defpackage.sr0;
import defpackage.ue2;
import defpackage.vi2;
import defpackage.ye2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class p implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p {
    public final sr0 a;
    public final cz b;
    public final WebView c;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k d;
    public final eb1 e;
    public final ye2 f;
    public final ye2 g;
    public final l22 h;

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p
    public final void destroy() {
        this.a.invoke();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g
    public final vi2 l() {
        return (l22) this.e.d;
    }

    public p(com.moloco.sdk.internal.error.crash.delivery.d dVar, cz czVar, WebView webView, ue2 ue2Var) {
        czVar.getClass();
        webView.getClass();
        ue2Var.getClass();
        this.a = dVar;
        this.b = czVar;
        this.c = webView;
        this.d = null;
        this.e = new eb1(czVar, 0);
        ye2 ye2VarB = at.b(0, 0, 7);
        this.f = ye2VarB;
        this.g = ye2VarB;
        this.h = ep0.G(new o(ue2Var, 0), czVar, if2.a, null);
    }
}
