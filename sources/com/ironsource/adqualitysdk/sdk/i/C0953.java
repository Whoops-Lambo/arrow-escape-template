package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᚁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C0953 extends AbstractC1237 {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractC0599[] f2574;

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0599
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj)) {
            return Arrays.equals(this.f2574, ((C0953) obj).f2574);
        }
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0599
    public final int hashCode() {
        return Arrays.hashCode(this.f2574);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("4VE=\n", "mlvg8aV8m18=\n"));
        for (AbstractC0599 abstractC0599 : this.f2574) {
            byte b = this.f3750;
            for (int i = 0; i < b; i++) {
                sb.append("  ");
            }
            sb.append(abstractC0599.toString());
            sb.append("\n");
        }
        int i2 = this.f3750 - 1;
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append("  ");
        }
        sb.append(StringFog.decrypt("Hw==\n", "Ypn8tWgxoUg=\n"));
        return sb.toString();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0599
    /* JADX INFO: renamed from: ﾒ */
    public final C1033 mo365(C0890 c0890, C1199 c1199) {
        C1033 c1033 = new C1033(null);
        C0890 c0891 = new C0890(new HashMap(), c0890, false);
        int i = c0890.f2380;
        c0890.f2380 = 0;
        for (AbstractC0599 abstractC0599 : this.f2574) {
            c1033 = abstractC0599.m533(c0891, c1199);
            if (c1033.f3011 || c1033.f3010 || c1033.f3009) {
                c0890.f2380 = i;
                return c1033;
            }
            c0890.f2380++;
        }
        c0890.f2380 = i;
        return c1033;
    }

    public C0953(ArrayList arrayList, byte b) {
        super(b);
        AbstractC0599[] abstractC0599Arr = new AbstractC0599[arrayList.size()];
        this.f2574 = abstractC0599Arr;
        arrayList.toArray(abstractC0599Arr);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0599
    /* JADX INFO: renamed from: ﾒ */
    public final int mo390() {
        int iMo390 = 2;
        for (AbstractC0599 abstractC0599 : this.f2574) {
            iMo390 += abstractC0599.mo390();
        }
        return iMo390;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0599
    /* JADX INFO: renamed from: ﾒ */
    public final int mo391(C0890 c0890) {
        int iMo390 = 1;
        for (int i = 0; i < c0890.f2380; i++) {
            iMo390 += this.f2574[i].mo390();
        }
        return iMo390;
    }
}
