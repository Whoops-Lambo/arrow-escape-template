package com.facebook.ads.redexgen.X;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class V7 {
    public static String[] A07 = {"mW7OOoPen6v8lIS9gRjPOcLgr19PV69b", "4II", "OpY0PDcxd4YQUiLGm1", "pWnzAU", "iBjHb9", "ttct0QJuk4n7ZDwV2TPNE35XfY4Y", "IcvegCSF7knR6vORhUHkyFsVormUfrvR", "Q8IlWw1jKWrGiTCJkPxPTl0LJBPxPB"};
    public long A00;
    public C2292Rd A01;
    public C2292Rd A02;
    public C2292Rd A03;
    public final int A04;
    public final C2181Mk A05 = new C2181Mk(32);
    public final InterfaceC2424Wm A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C2292Rd A04(C2292Rd c2292Rd, T2 t2, V9 v9, C2181Mk c2181Mk) {
        int iA0M;
        long j = v9.A01;
        c2181Mk.A0d(1);
        C2292Rd c2292RdA03 = A03(c2292Rd, j, c2181Mk.A0l(), 1);
        long j2 = j + 1;
        byte b = c2181Mk.A0l()[0];
        boolean z = (b & 128) != 0;
        int i = b & 127;
        C2211No c2211No = t2.A05;
        if (c2211No.A04 == null) {
            c2211No.A04 = new byte[16];
        } else {
            Arrays.fill(c2211No.A04, (byte) 0);
        }
        C2292Rd c2292RdA04 = A03(c2292RdA03, j2, c2211No.A04, i);
        long j3 = j2 + ((long) i);
        if (z) {
            c2181Mk.A0d(2);
            c2292RdA04 = A03(c2292RdA04, j3, c2181Mk.A0l(), 2);
            j3 += 2;
            iA0M = c2181Mk.A0M();
        } else {
            iA0M = 1;
        }
        int[] iArr = c2211No.A06;
        if (iArr == null || iArr.length < iA0M) {
            iArr = new int[iA0M];
        }
        int[] iArr2 = c2211No.A07;
        if (iArr2 == null || iArr2.length < iA0M) {
            iArr2 = new int[iA0M];
        }
        if (z) {
            int i2 = iA0M * 6;
            c2181Mk.A0d(i2);
            c2292RdA04 = A03(c2292RdA04, j3, c2181Mk.A0l(), i2);
            j3 += (long) i2;
            c2181Mk.A0f(0);
            for (int i3 = 0; i3 < iA0M; i3++) {
                iArr[i3] = c2181Mk.A0M();
                iArr2[i3] = c2181Mk.A0L();
            }
        } else {
            iArr[0] = 0;
            iArr2[0] = v9.A00 - ((int) (j3 - v9.A01));
        }
        ZN zn = (ZN) N1.A0f(v9.A02);
        c2211No.A02(iA0M, iArr, iArr2, zn.A03, c2211No.A04, zn.A01, zn.A02, zn.A00);
        int i4 = (int) (j3 - v9.A01);
        v9.A01 += (long) i4;
        v9.A00 -= i4;
        return c2292RdA04;
    }

    public V7(InterfaceC2424Wm interfaceC2424Wm) {
        this.A06 = interfaceC2424Wm;
        this.A04 = interfaceC2424Wm.A8u();
        this.A01 = new C2292Rd(0L, this.A04);
        this.A02 = this.A01;
        this.A03 = this.A01;
    }

    private int A00(int i) {
        if (this.A03.A03 == null) {
            this.A03.A03(this.A06.A4Z(), new C2292Rd(this.A03.A00, this.A04));
        }
        return Math.min(i, (int) (this.A03.A00 - this.A00));
    }

    public static C2292Rd A01(C2292Rd c2292Rd, long j) {
        while (j >= c2292Rd.A00) {
            c2292Rd = c2292Rd.A02;
        }
        return c2292Rd;
    }

    public static C2292Rd A02(C2292Rd c2292Rd, long j, ByteBuffer byteBuffer, int i) {
        C2292Rd c2292RdA01 = A01(c2292Rd, j);
        while (i > 0) {
            int remaining = (int) (c2292RdA01.A00 - j);
            int iMin = Math.min(i, remaining);
            byte[] bArr = c2292RdA01.A03.A01;
            int remaining2 = c2292RdA01.A00(j);
            byteBuffer.put(bArr, remaining2, iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == c2292RdA01.A00) {
                c2292RdA01 = c2292RdA01.A02;
            }
        }
        return c2292RdA01;
    }

    public static C2292Rd A03(C2292Rd c2292Rd, long j, byte[] bArr, int i) {
        C2292Rd c2292RdA01 = A01(c2292Rd, j);
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (c2292RdA01.A00 - j));
            byte[] bArr2 = c2292RdA01.A03.A01;
            int toCopy = c2292RdA01.A00(j);
            int remaining = i - i2;
            System.arraycopy(bArr2, toCopy, bArr, remaining, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == c2292RdA01.A00) {
                c2292RdA01 = c2292RdA01.A02;
            }
        }
        return c2292RdA01;
    }

    public static C2292Rd A05(C2292Rd c2292Rd, T2 t2, V9 v9, C2181Mk c2181Mk) {
        if (t2.A0E()) {
            c2292Rd = A04(c2292Rd, t2, v9, c2181Mk);
        }
        if (t2.A03()) {
            c2181Mk.A0d(4);
            C2292Rd c2292RdA03 = A03(c2292Rd, v9.A01, c2181Mk.A0l(), 4);
            int iA0L = c2181Mk.A0L();
            v9.A01 += 4;
            v9.A00 -= 4;
            t2.A0C(iA0L);
            C2292Rd c2292RdA02 = A02(c2292RdA03, v9.A01, t2.A02, iA0L);
            v9.A01 += (long) iA0L;
            v9.A00 -= iA0L;
            t2.A0D(v9.A00);
            return A02(c2292RdA02, v9.A01, t2.A03, v9.A00);
        }
        t2.A0C(v9.A00);
        return A02(c2292Rd, v9.A01, t2.A02, v9.A00);
    }

    private void A06(int i) {
        this.A00 += (long) i;
        if (this.A00 == this.A03.A00) {
            this.A03 = this.A03.A02;
        }
    }

    private void A07(C2292Rd c2292Rd) {
        if (c2292Rd.A03 == null) {
            return;
        }
        this.A06.AIs(c2292Rd);
        c2292Rd.A01();
    }

    public final int A08(KR kr, int i, boolean z) throws IOException {
        int i2 = kr.read(this.A03.A03.A01, this.A03.A00(this.A00), A00(i));
        if (i2 == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        A06(i2);
        return i2;
    }

    public final long A09() {
        return this.A00;
    }

    public final void A0A() {
        A07(this.A01);
        this.A01.A02(0L, this.A04);
        this.A02 = this.A01;
        this.A03 = this.A01;
        this.A00 = 0L;
        this.A06.ALn();
    }

    public final void A0B() {
        this.A02 = this.A01;
    }

    public final void A0C(long j) {
        if (j == -1) {
            return;
        }
        while (j >= this.A01.A00) {
            InterfaceC2424Wm interfaceC2424Wm = this.A06;
            C2422Wk c2422Wk = this.A01.A03;
            String[] strArr = A07;
            if (strArr[4].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A07[1] = "FHIHsn1zJK";
            interfaceC2424Wm.AIr(c2422Wk);
            this.A01 = this.A01.A01();
        }
        if (this.A02.A01 < this.A01.A01) {
            this.A02 = this.A01;
        }
    }

    public final void A0D(C2181Mk c2181Mk, int i) {
        while (i > 0) {
            int iA00 = A00(i);
            byte[] bArr = this.A03.A03.A01;
            int bytesAppended = this.A03.A00(this.A00);
            c2181Mk.A0k(bArr, bytesAppended, iA00);
            i -= iA00;
            A06(iA00);
        }
    }

    public final void A0E(T2 t2, V9 v9) {
        A05(this.A02, t2, v9, this.A05);
    }

    public final void A0F(T2 t2, V9 v9) {
        this.A02 = A05(this.A02, t2, v9, this.A05);
    }
}
