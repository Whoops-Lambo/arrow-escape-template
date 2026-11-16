package com.facebook.ads.redexgen.X;

import android.os.Bundle;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C2356Tp implements InterfaceC2115Jt {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public static final C2356Tp A05 = new C2356Tp(0, 0);
    public static final String A09 = N1.A0h(0);
    public static final String A06 = N1.A0h(1);
    public static final String A08 = N1.A0h(2);
    public static final String A07 = N1.A0h(3);
    public static final InterfaceC2114Js<C2356Tp> A04 = new InterfaceC2114Js() { // from class: com.facebook.ads.redexgen.X.Tv
        @Override // com.facebook.ads.redexgen.X.InterfaceC2114Js
        public final InterfaceC2115Jt A7F(Bundle bundle) {
            return C2356Tp.A00(bundle);
        }
    };

    public C2356Tp(int i, int i2) {
        this(i, i2, 0, 1.0f);
    }

    public C2356Tp(int i, int i2, int i3, float f) {
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A00 = f;
    }

    public static /* synthetic */ C2356Tp A00(Bundle bundle) {
        int i = bundle.getInt(A09, 0);
        int i2 = bundle.getInt(A06, 0);
        int height = bundle.getInt(A08, 0);
        return new C2356Tp(i, i2, height, bundle.getFloat(A07, 1.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2356Tp)) {
            return false;
        }
        C2356Tp c2356Tp = (C2356Tp) obj;
        return this.A03 == c2356Tp.A03 && this.A01 == c2356Tp.A01 && this.A02 == c2356Tp.A02 && this.A00 == c2356Tp.A00;
    }

    public final int hashCode() {
        int result = this.A03;
        int result2 = ((((7 * 31) + result) * 31) + this.A01) * 31;
        int result3 = this.A02;
        return ((result2 + result3) * 31) + Float.floatToRawIntBits(this.A00);
    }
}
