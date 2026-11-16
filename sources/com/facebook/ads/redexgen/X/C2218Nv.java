package com.facebook.ads.redexgen.X;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C2218Nv implements InterfaceC2472Yn {
    public static String[] A04 = {"RLAlGP8S1DSoS72DYU8wZ8AX45", "A6eaT6jJa", "2mFwODVwh52i5QBvOlEgNE4ybkDRDOCf", "KuOsktzp3x818lDv5uDr6lC4YF", "wVqU5ZkhhGLQ1t8pizd9XHSKop", "2RKV86AtSMgi18RmHH4LwO1qcK", "HA", "JlThFtiPrXA6USExEli2F6rd93zikkV3"};
    public final int A00;
    public final int A01;
    public final C2181Mk A02 = new C2181Mk();
    public final C2189Ms A03;

    public C2218Nv(int i, C2189Ms c2189Ms, int i2) {
        this.A00 = i;
        this.A03 = c2189Ms;
        this.A01 = i2;
    }

    private C2470Yl A00(C2181Mk c2181Mk, long j, long j2) {
        int iA00;
        int iA01;
        int iA0A = c2181Mk.A0A();
        long j3 = -1;
        long j4 = -1;
        long lastPcrTimeUsInRange = -9223372036854775807L;
        while (c2181Mk.A07() >= 188 && (iA01 = (iA00 = AbstractC2700d4.A00(c2181Mk.A0l(), c2181Mk.A09(), iA0A)) + 188) <= iA0A) {
            long jA01 = AbstractC2700d4.A01(c2181Mk, iA00, this.A00);
            if (jA01 != -9223372036854775807L) {
                long jA06 = this.A03.A06(jA01);
                if (A04[1].length() == 15) {
                    throw new RuntimeException();
                }
                String[] strArr = A04;
                strArr[2] = "erK58Snr16wV4tgsNlP4CY6fSs4SFCk6";
                strArr[7] = "bez4joxev592tBuTsloFEwMQX3bGJ8tl";
                if (jA06 > j) {
                    if (lastPcrTimeUsInRange == -9223372036854775807L) {
                        return C2470Yl.A04(jA06, j2);
                    }
                    long j5 = j2 + j3;
                    String[] strArr2 = A04;
                    if (strArr2[2].charAt(17) != strArr2[7].charAt(17)) {
                        throw new RuntimeException();
                    }
                    String[] strArr3 = A04;
                    strArr3[4] = "rdKAfEqj9LG96MS1peXmFhiWHg";
                    strArr3[0] = "OVbZe2Ml1jCzI6iN57G5dXZdr2";
                    return C2470Yl.A03(j5);
                }
                long endOfLastPacketPositionInStream = jA06 + SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US;
                if (endOfLastPacketPositionInStream > j) {
                    return C2470Yl.A03(((long) iA00) + j2);
                }
                j3 = iA00;
                lastPcrTimeUsInRange = jA06;
            }
            c2181Mk.A0f(iA01);
            j4 = iA01;
        }
        if (lastPcrTimeUsInRange != -9223372036854775807L) {
            return C2470Yl.A05(lastPcrTimeUsInRange, j2 + j4);
        }
        return C2470Yl.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2472Yn
    public final void AGz() {
        this.A02.A0i(N1.A07);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2472Yn
    public final C2470Yl AKE(Q9 q9, long j) throws IOException {
        long jA9Q = q9.A9Q();
        int iMin = (int) Math.min(this.A01, q9.A90() - jA9Q);
        this.A02.A0d(iMin);
        q9.AI6(this.A02.A0l(), 0, iMin);
        return A00(this.A02, j, jA9Q);
    }
}
