package com.facebook.ads.redexgen.X;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
@MetaExoPlayerCustomization
public final class C18287x implements InterfaceC2182Ml {
    public static byte[] A03;

    @MetaExoPlayerCustomization
    public long A00;

    @MetaExoPlayerCustomization
    public final long A01;

    @MetaExoPlayerCustomization
    public final TreeSet<C2778eL> A02 = new TreeSet<>(new Comparator() { // from class: com.facebook.ads.redexgen.X.eZ
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C18287x.A00((C2778eL) obj, (C2778eL) obj2);
        }
    });

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 123);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-9, 8, -5, -11, 6, -43, -13, -11, -6, -9};
    }

    public C18287x(long j) {
        this.A01 = j;
    }

    @MetaExoPlayerCustomization
    public static int A00(C2778eL c2778eL, C2778eL c2778eL2) {
        if (c2778eL.A00 - c2778eL2.A00 == 0) {
            return c2778eL.compareTo(c2778eL2);
        }
        return c2778eL.A00 < c2778eL2.A00 ? -1 : 1;
    }

    private void A03(InterfaceC2768eB interfaceC2768eB, long j) {
        AbstractC2190Mt.A02(A01(0, 10, 23));
        while (this.A00 + j > this.A01 && !this.A02.isEmpty()) {
            interfaceC2768eB.AJm(this.A02.first());
        }
        AbstractC2190Mt.A00();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2767eA
    public final void AH9(InterfaceC2768eB interfaceC2768eB, C2778eL c2778eL) {
        this.A02.add(c2778eL);
        this.A00 += c2778eL.A01;
        A03(interfaceC2768eB, 0L);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2767eA
    public final void AHA(InterfaceC2768eB interfaceC2768eB, C2778eL c2778eL) {
        this.A02.remove(c2778eL);
        this.A00 -= c2778eL.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2767eA
    public final void AHB(InterfaceC2768eB interfaceC2768eB, C2778eL c2778eL, C2778eL c2778eL2) {
        AHA(interfaceC2768eB, c2778eL);
        AH9(interfaceC2768eB, c2778eL2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2182Ml
    public final void AHC(InterfaceC2768eB interfaceC2768eB, String str, long j, long j2) {
        if (j2 != -1) {
            A03(interfaceC2768eB, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2182Ml
    public final boolean AK1() {
        return true;
    }
}
