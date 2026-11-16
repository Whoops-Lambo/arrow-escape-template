package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C3192lA extends ContextWrapper {
    public final InterfaceC3194lC A00;
    public final AtomicReference<String> A01;

    public C3192lA(Context context, InterfaceC3194lC interfaceC3194lC) {
        super(context.getApplicationContext());
        this.A01 = new AtomicReference<>();
        this.A00 = interfaceC3194lC;
    }

    public final InterfaceC2741dj A00(C3192lA c3192lA) {
        return this.A00.A8n(c3192lA);
    }

    public final InterfaceC3187l3 A01() {
        return this.A00.A7r();
    }

    public final C2054Hh A02() {
        return this.A00.A9c(this);
    }

    public final InterfaceC3193lB A03() {
        return this.A00.A7e(this);
    }

    public final InterfaceC3195lD A04() {
        return this.A00.A8Y(this);
    }

    public final InterfaceC3197lF A05() {
        return this.A00.A9b(this);
    }

    public final InterfaceC3198lG A06() {
        return this.A00.A9s();
    }

    public final InterfaceC3209lR A07() {
        return this.A00.A8M(this);
    }

    public final InterfaceC3222le A08() {
        return this.A00.A8O(this);
    }

    public final C3253mA A09() {
        return this.A00.A9j();
    }

    public final InterfaceC3321nG A0A() {
        return this.A00.A7N(A02());
    }

    public final InterfaceC3333nS A0B() {
        return this.A00.A9d(A02());
    }

    public final String A0C() {
        return this.A01.get();
    }

    public final void A0D(String str) {
        this.A01.set(str);
    }
}
