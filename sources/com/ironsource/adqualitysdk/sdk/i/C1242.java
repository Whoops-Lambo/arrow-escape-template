package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.h50;
import defpackage.rl3;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ﹲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C1242 {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String f3759;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final int f3760;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String f3761;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String f3762;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String f3763;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        rl3.p(this.f3763, "JQ==\n", sb, "C5UGaMmdBNM=\n");
        rl3.p(this.f3762, "JA==\n", sb, "DElaaJSRCMY=\n");
        rl3.p(this.f3761, "GQ==\n", sb, "I5Ke4H7VLgA=\n");
        sb.append(this.f3760);
        String strM868 = AbstractC1156.m868("Dg==\n", "J1yv7bOdANs=\n", sb);
        if (this.f3759 == null) {
            return strM868;
        }
        StringBuilder sbP = h50.p(strM868);
        sbP.append(StringFog.decrypt("5AU=\n", "xDkehkGXy+s=\n"));
        sbP.append(this.f3759);
        return AbstractC1156.m868("+A==\n", "xiKm730iFXw=\n", sbP);
    }

    public C1242(String str, String str2, String str3, int i, String str4) {
        this.f3763 = str;
        this.f3762 = str2;
        this.f3761 = str3;
        this.f3760 = i;
        this.f3759 = str4;
    }
}
