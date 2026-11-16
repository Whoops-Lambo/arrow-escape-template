package io.p071bidmachine.iab.mraid;

import defpackage.r6;
import io.p071bidmachine.AdProcessCallback;
import io.p071bidmachine.iab.b;
import io.p071bidmachine.unified.c;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class m implements c {
    public final Object a;

    public abstract void c();

    public abstract void d(String str);

    public abstract void e();

    public abstract void f();

    public void a() {
        ((AdProcessCallback) this.a).processExpired();
    }

    public void b(b bVar) {
        u.a("MraidAdView", new r6(bVar, 20));
        MraidAdView mraidAdView = (MraidAdView) this.a;
        int i = MraidAdView.z;
        mraidAdView.a(bVar);
    }

    public m(AdProcessCallback adProcessCallback) {
        adProcessCallback.getClass();
        this.a = adProcessCallback;
    }
}
