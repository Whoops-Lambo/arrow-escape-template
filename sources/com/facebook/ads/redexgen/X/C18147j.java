package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C18147j extends LA {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772012L;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 8);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-123, -124, -111, -111, -120, -107};
    }

    public C18147j(List<C2832fE> list) {
        super(list);
    }

    public static C18147j A00(JSONObject jSONObject, C2055Hi c2055Hi) {
        C18147j c18147j = new C18147j(LA.A07(jSONObject, c2055Hi, new L0()));
        c18147j.A3B(jSONObject);
        c18147j.A23(A01(0, 6, 27));
        return c18147j;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2831fD
    public final int A1L() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2831fD
    public final int A1M() {
        return 0;
    }
}
