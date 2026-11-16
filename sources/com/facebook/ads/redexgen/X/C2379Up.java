package com.facebook.ads.redexgen.X;

import android.os.Bundle;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Up, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C2379Up implements InterfaceC2115Jt {
    public final long A00;
    public final long A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public static final C2379Up A06 = new C2132Kk().A0A();
    public static final InterfaceC2114Js<C9P> A05 = new InterfaceC2114Js() { // from class: com.facebook.ads.redexgen.X.Us
        @Override // com.facebook.ads.redexgen.X.InterfaceC2114Js
        public final InterfaceC2115Jt A7F(Bundle bundle) {
            return new C2132Kk().A06(bundle.getLong(C2379Up.A01(0), 0L)).A05(bundle.getLong(C2379Up.A01(1), Long.MIN_VALUE)).A08(bundle.getBoolean(C2379Up.A01(2), false)).A07(bundle.getBoolean(C2379Up.A01(3), false)).A09(bundle.getBoolean(C2379Up.A01(4), false)).A0B();
        }
    };

    public C2379Up(C2132Kk c2132Kk) {
        this.A01 = c2132Kk.A01;
        this.A00 = c2132Kk.A00;
        this.A03 = c2132Kk.A03;
        this.A02 = c2132Kk.A02;
        this.A04 = c2132Kk.A04;
    }

    public static String A01(int i) {
        return Integer.toString(i, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2379Up)) {
            return false;
        }
        C2379Up c2379Up = (C2379Up) obj;
        return this.A01 == c2379Up.A01 && this.A00 == c2379Up.A00 && this.A03 == c2379Up.A03 && this.A02 == c2379Up.A02 && this.A04 == c2379Up.A04;
    }

    public final int hashCode() {
        return (((((((((int) (this.A01 ^ (this.A01 >>> 32))) * 31) + ((int) (this.A00 ^ (this.A00 >>> 32)))) * 31) + (this.A03 ? 1 : 0)) * 31) + (this.A02 ? 1 : 0)) * 31) + (this.A04 ? 1 : 0);
    }
}
