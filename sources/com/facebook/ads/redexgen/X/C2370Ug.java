package com.facebook.ads.redexgen.X;

import android.os.Bundle;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ug, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C2370Ug implements InterfaceC2115Jt {
    public final C2379Up A00;

    @Deprecated
    public final C9P A01;
    public final C2374Uk A02;
    public final C2139Kr A03;

    @Deprecated
    public final C2371Uh A04;
    public final C2367Ud A05;
    public final String A06;
    public static final C2370Ug A08 = new C2131Kj().A05();
    public static final InterfaceC2114Js<C2370Ug> A07 = new InterfaceC2114Js() { // from class: com.facebook.ads.redexgen.X.Uw
        @Override // com.facebook.ads.redexgen.X.InterfaceC2114Js
        public final InterfaceC2115Jt A7F(Bundle bundle) {
            return C2370Ug.A00(bundle);
        }
    };

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C2370Ug A00(Bundle bundle) {
        String str = (String) AbstractC2159Ln.A01(bundle.getString(A02(0), ""));
        Bundle bundle2 = bundle.getBundle(A02(1));
        C2374Uk c2374Uk = bundle2 == null ? C2374Uk.A07 : (C2374Uk) C2374Uk.A06.A7F(bundle2);
        Bundle bundle3 = bundle.getBundle(A02(2));
        C2367Ud c2367Ud = bundle3 == null ? C2367Ud.A0Z : (C2367Ud) C2367Ud.A0Y.A7F(bundle3);
        Bundle bundle4 = bundle.getBundle(A02(3));
        return new C2370Ug(str, bundle4 == null ? C9P.A00 : (C9P) C2379Up.A05.A7F(bundle4), null, c2374Uk, c2367Ud);
    }

    public C2370Ug(String str, C9P c9p, C2371Uh c2371Uh, C2374Uk c2374Uk, C2367Ud c2367Ud) {
        this.A06 = str;
        this.A03 = c2371Uh;
        this.A04 = c2371Uh;
        this.A02 = c2374Uk;
        this.A05 = c2367Ud;
        this.A00 = c9p;
        this.A01 = c9p;
    }

    public static String A02(int i) {
        return Integer.toString(i, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2370Ug)) {
            return false;
        }
        C2370Ug c2370Ug = (C2370Ug) obj;
        if (N1.A1E(this.A06, c2370Ug.A06) && this.A00.equals(c2370Ug.A00) && N1.A1E(this.A03, c2370Ug.A03) && N1.A1E(this.A02, c2370Ug.A02) && N1.A1E(this.A05, c2370Ug.A05)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A06.hashCode();
        int i = result * 31;
        int result2 = this.A03 != null ? this.A03.hashCode() : 0;
        int result3 = (((i + result2) * 31) + this.A02.hashCode()) * 31;
        int result4 = this.A00.hashCode();
        return ((result3 + result4) * 31) + this.A05.hashCode();
    }
}
