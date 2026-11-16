package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C2374Uk implements InterfaceC2115Jt {
    public final float A00;
    public final float A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public static String[] A05 = {"qnKsSHhqap", "", "cUTdyaGGiVWkS4mAAsRuvFYFZTmOUWHx", "d9PN3P609LWiHZ4WaJEEigU3Xw52boud", "3Bzj", "t441T8WV9LQC3wNFQfuXYmVulfNtQcUh", "XmSRzun0SVrlpg5CvKpTiSL6VD9nKWrE", "GsIwkPFPk5Xbti76ybE"};
    public static final C2374Uk A07 = new C2137Kp().A05();
    public static final InterfaceC2114Js<C2374Uk> A06 = new InterfaceC2114Js() { // from class: com.facebook.ads.redexgen.X.Ul
        @Override // com.facebook.ads.redexgen.X.InterfaceC2114Js
        public final InterfaceC2115Jt A7F(Bundle bundle) {
            return C2374Uk.A00(bundle);
        }
    };

    @Deprecated
    public C2374Uk(long j, long j2, long j3, float f, float f2) {
        this.A04 = j;
        this.A03 = j2;
        this.A02 = j3;
        this.A01 = f;
        this.A00 = f2;
    }

    public C2374Uk(C2137Kp c2137Kp) {
        this(c2137Kp.A04, c2137Kp.A03, c2137Kp.A02, c2137Kp.A01, c2137Kp.A00);
    }

    public static /* synthetic */ C2374Uk A00(Bundle bundle) {
        return new C2374Uk(bundle.getLong(A01(0), -9223372036854775807L), bundle.getLong(A01(1), -9223372036854775807L), bundle.getLong(A01(2), -9223372036854775807L), bundle.getFloat(A01(3), -3.4028235E38f), bundle.getFloat(A01(4), -3.4028235E38f));
    }

    public static String A01(int i) {
        return Integer.toString(i, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean z = obj instanceof C2374Uk;
        if (A05[7].length() == 24) {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[4] = "Jm74";
        strArr[0] = "dTDU5I0i2H";
        if (!z) {
            return false;
        }
        C2374Uk c2374Uk = (C2374Uk) obj;
        return this.A04 == c2374Uk.A04 && this.A03 == c2374Uk.A03 && this.A02 == c2374Uk.A02 && this.A01 == c2374Uk.A01 && this.A00 == c2374Uk.A00;
    }

    public final int hashCode() {
        int i = ((((int) (this.A04 ^ (this.A04 >>> 32))) * 31) + ((int) (this.A03 ^ (this.A03 >>> 32)))) * 31;
        int result = (int) (this.A02 ^ (this.A02 >>> 32));
        return ((((i + result) * 31) + (this.A01 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.floatToIntBits(this.A01) : 0)) * 31) + (this.A00 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.floatToIntBits(this.A00) : 0);
    }
}
