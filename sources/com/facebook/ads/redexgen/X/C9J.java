package com.facebook.ads.redexgen.X;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9J, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public abstract class C9J implements TE {
    public static String[] A04 = {"isuZk4LYvPtzcJmYXN55NQD4bjZcpqJn", "6Js", "4Hvb7CdVaEKj9bi8gEJZKIBZaVtBBdMl", "YCKTvsMXz3llo15twFpneIfIj1hgPSnw", "UeqJ4HHO1DLcEUC6RLoigQ09", "r2W4uoxvkTEWcf6mnFycXLGKFVJU", "wE1NNsV0QTEKxapJX1OFponH", "nRXIAIHDX3jmS6ZOUJ00SCHf0iMD"};
    public int A00;
    public NX A01;
    public final ArrayList<InterfaceC2205Ni> A02 = new ArrayList<>(1);
    public final boolean A03;

    @Override // com.facebook.ads.redexgen.X.TE
    public /* synthetic */ Map A9W() {
        return NM.A00(this);
    }

    public C9J(boolean z) {
        this.A03 = z;
    }

    @MetaExoPlayerCustomization
    private final void A0D(NX nx, boolean z) {
        this.A01 = nx;
        for (int i = 0; i < i; i++) {
            this.A02.get(i).AHQ(this, nx, this.A03, z);
        }
    }

    public final void A0E() {
        NX nx = (NX) N1.A0f(this.A01);
        for (int i = 0; i < this.A00; i++) {
            this.A02.get(i).AHP(this, nx, this.A03);
        }
        this.A01 = null;
    }

    public final void A0F(int i) {
        NX nx = (NX) N1.A0f(this.A01);
        int i2 = 0;
        while (true) {
            int i3 = this.A00;
            String[] strArr = A04;
            String str = strArr[0];
            String str2 = strArr[2];
            int i4 = str.charAt(12);
            if (i4 == str2.charAt(12)) {
                throw new RuntimeException();
            }
            A04[1] = "0wB";
            if (i2 < i3) {
                this.A02.get(i2).AEI(this, nx, this.A03, i);
                i2++;
            } else {
                return;
            }
        }
    }

    public final void A0G(NX nx) {
        for (int i = 0; i < i; i++) {
            this.A02.get(i);
        }
    }

    public final void A0H(NX nx) {
        A0D(nx, false);
    }

    @Override // com.facebook.ads.redexgen.X.TE
    public final void A4T(InterfaceC2205Ni interfaceC2205Ni) {
        AbstractC2159Ln.A01(interfaceC2205Ni);
        if (!this.A02.contains(interfaceC2205Ni)) {
            this.A02.add(interfaceC2205Ni);
            this.A00++;
        }
    }
}
