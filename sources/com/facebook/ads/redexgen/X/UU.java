package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class UU implements InterfaceC2115Jt {
    public final C2124Kc A00;
    public static final UU A02 = new LE().A04();
    public static final String A03 = N1.A0h(0);
    public static final InterfaceC2114Js<UU> A01 = new InterfaceC2114Js() { // from class: com.facebook.ads.redexgen.X.UV
        @Override // com.facebook.ads.redexgen.X.InterfaceC2114Js
        public final InterfaceC2115Jt A7F(Bundle bundle) {
            return UU.A01(bundle);
        }
    };

    public UU(C2124Kc c2124Kc) {
        this.A00 = c2124Kc;
    }

    public static UU A01(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(A03);
        if (integerArrayList == null) {
            return A02;
        }
        LE le = new LE();
        for (int i = 0; i < integerArrayList.size(); i++) {
            le.A00(integerArrayList.get(i).intValue());
        }
        return le.A04();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UU)) {
            return false;
        }
        return this.A00.equals(((UU) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
