package com.facebook.ads.redexgen.X;

import androidx.media3.common.PlaybackException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C2467Yh {
    public static byte[] A06;
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final List<byte[]> A05;

    static {
        A02();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C2467Yh A00(C2181Mk c2181Mk) throws L9 {
        try {
            c2181Mk.A0g(4);
            int iA0I = (c2181Mk.A0I() & 3) + 1;
            if (iA0I == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iA0I2 = c2181Mk.A0I() & 31;
            for (int i = 0; i < iA0I2; i++) {
                arrayList.add(A03(c2181Mk));
            }
            int iA0I3 = c2181Mk.A0I();
            for (int i2 = 0; i2 < iA0I3; i2++) {
                arrayList.add(A03(c2181Mk));
            }
            int i3 = -1;
            int i4 = -1;
            float f = 1.0f;
            String strA01 = null;
            if (iA0I2 > 0) {
                ZD zdA09 = ZE.A09((byte[]) arrayList.get(0), iA0I, ((byte[]) arrayList.get(0)).length);
                i3 = zdA09.A0A;
                i4 = zdA09.A03;
                f = zdA09.A00;
                strA01 = Lv.A01(zdA09.A08, zdA09.A01, zdA09.A04);
            }
            return new C2467Yh(arrayList, iA0I, i3, i4, f, strA01);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw L9.A01(A01(0, 24, 92), e);
        }
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) + PlaybackException.ERROR_CODE_NOT_AVAILABLE_IN_REGION);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{11, 56, 56, 53, 56, -26, 54, 39, 56, 57, 47, 52, 45, -26, 7, 28, 9, -26, 41, 53, 52, 44, 47, 45};
    }

    public C2467Yh(List<byte[]> initializationData, int i, int i2, int i3, float f, String str) {
        this.A05 = initializationData;
        this.A02 = i;
        this.A03 = i2;
        this.A01 = i3;
        this.A00 = f;
        this.A04 = str;
    }

    public static byte[] A03(C2181Mk c2181Mk) {
        int iA0M = c2181Mk.A0M();
        int offset = c2181Mk.A09();
        c2181Mk.A0g(iA0M);
        return Lv.A07(c2181Mk.A0l(), offset, iA0M);
    }
}
