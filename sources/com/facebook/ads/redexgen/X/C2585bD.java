package com.facebook.ads.redexgen.X;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
@MetaExoPlayerCustomization
public final class C2585bD {
    public final int A00;
    public final int A01;
    public final long A02;
    public final C2582bA A03;
    public final int[] A04;
    public final int[] A05;
    public final long[] A06;
    public final long[] A07;

    public C2585bD(C2582bA c2582bA, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        AbstractC2159Ln.A07(iArr.length == jArr2.length);
        AbstractC2159Ln.A07(jArr.length == jArr2.length);
        AbstractC2159Ln.A07(iArr2.length == jArr2.length);
        this.A03 = c2582bA;
        this.A06 = jArr;
        this.A05 = iArr;
        this.A00 = i;
        this.A07 = jArr2;
        this.A04 = iArr2;
        this.A02 = j;
        this.A01 = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int A00(long j) {
        for (int i = N1.A0L(this.A07, j, true, false); i >= 0; i--) {
            int startIndex = this.A04[i];
            if ((startIndex & 1) != 0) {
                return i;
            }
        }
        return -1;
    }

    public final int A01(long j) {
        for (int i = N1.A0K(this.A07, j, true, false); i < startIndex; i++) {
            int startIndex = this.A04[i];
            if ((startIndex & 1) != 0) {
                return i;
            }
        }
        return -1;
    }
}
