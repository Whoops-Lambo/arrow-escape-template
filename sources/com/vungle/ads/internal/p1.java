package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.internal.model.j3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class p1 extends x0 implements com.vungle.ads.internal.presenter.z {
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;

    @Override // com.vungle.ads.internal.x0
    public final com.vungle.ads.internal.presenter.z k() {
        return this;
    }

    public final void b(String str) {
        this.t = str;
    }

    public final void c(String str) {
        this.u = str;
    }

    public final void d(String str) {
        this.r = str;
    }

    public final void e(String str) {
        this.v = str;
    }

    public final String l() {
        return this.s;
    }

    public final String m() {
        return this.t;
    }

    public final String n() {
        return this.u;
    }

    public final String o() {
        return this.r;
    }

    public final String p() {
        return this.v;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(Context context) {
        super(context);
        context.getClass();
    }

    @Override // com.vungle.ads.internal.r
    public final boolean a(j3 j3Var) {
        j3Var.getClass();
        return j3Var.j();
    }

    public final void a(String str) {
        this.s = str;
    }
}
