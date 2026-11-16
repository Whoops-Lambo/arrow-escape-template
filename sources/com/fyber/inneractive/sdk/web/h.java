package com.fyber.inneractive.sdk.web;

import androidx.media3.extractor.text.ttml.TtmlNode;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class h implements f {
    public final String a;
    public final com.fyber.inneractive.sdk.util.g1 b;
    public final /* synthetic */ i c;

    @Override // com.fyber.inneractive.sdk.web.f
    public final String a() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final void b() {
    }

    public h(i iVar, String str, com.fyber.inneractive.sdk.util.g1 g1Var) {
        this.c = iVar;
        this.b = g1Var;
        this.a = str;
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final String c() {
        return TtmlNode.TEXT_EMPHASIS_MARK_OPEN;
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final void d() {
        i iVar = this.c;
        String str = this.a;
        com.fyber.inneractive.sdk.util.g1 g1Var = this.b;
        j1 j1Var = iVar.g;
        if (j1Var != null) {
            com.fyber.inneractive.sdk.util.g0 g0Var = j1Var.a(str, g1Var).a;
        }
    }

    public final String toString() {
        return "action: open url: " + this.a;
    }
}
