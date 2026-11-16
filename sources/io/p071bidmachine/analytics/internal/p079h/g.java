package io.p071bidmachine.analytics.internal.p079h;

import defpackage.az2;
import defpackage.rc1;
import defpackage.sr0;
import io.p071bidmachine.analytics.internal.p072a.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class g extends rc1 implements sr0 {
    final /* synthetic */ a a;
    final /* synthetic */ String b;
    final /* synthetic */ Throwable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a aVar, String str, Throwable th) {
        super(0);
        this.a = aVar;
        this.b = str;
        this.c = th;
    }

    public final void a() {
        e.a.a(this.a, this.b, this.c);
    }

    @Override // defpackage.sr0
    public /* bridge */ /* synthetic */ Object invoke() {
        a();
        return az2.a;
    }
}
