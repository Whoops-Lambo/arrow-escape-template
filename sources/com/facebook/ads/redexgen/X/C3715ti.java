package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ti, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C3715ti {
    public static byte[] A01;
    public static String[] A02 = {"CvydOG1rdpeZVjh1I2HxFGGpkCBtP1uR", "LPAb8wO4e9Bm4297vBHQiNlf50jewka4", "p6i6iSivtdsam", "kr1L5mV", "OjxdnAkOIagRjcigNYlctVvlDEXS237l", "CTcf", "XEPmNqkHOtxVdZCukAC2cQoZWEBCmlPv", "qw43eBE0dfm3vpW8jqKcT1ME9HQ7Rm2E"};
    public final Map<String, String> A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 113);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {70, 71, 81, 86, 75, 76, 67, 86, 75, 77, 76, 125, 87, 80, 78, 20, 9, 5, 3, 16, 46, 25, 24, 31, 5, 2, 64, 91, 65, 87, 92};
        String[] strArr = A02;
        if (strArr[6].charAt(15) == strArr[1].charAt(15)) {
            throw new RuntimeException();
        }
        A02[3] = "rnLFNN7HWa";
        A01 = bArr;
    }

    static {
        A01();
    }

    public C3715ti() {
        this.A00 = new HashMap();
    }

    public C3715ti(Map<String, String> extraData) {
        this.A00 = extraData;
    }

    public final C3715ti A02(Context context, AbstractC2798ef abstractC2798ef) {
        Uri linkUrl;
        if ((abstractC2798ef instanceof C18267v) && (linkUrl = ((C18267v) abstractC2798ef).A0O()) != null) {
            A03(context, linkUrl.toString());
        }
        return this;
    }

    public final C3715ti A03(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str) && C3300mv.A2V(context)) {
            this.A00.put(A00(0, 15, 83), str);
        }
        return this;
    }

    public final C3715ti A04(C3514qT c3514qT) {
        if (c3514qT != null) {
            this.A00.put(A00(26, 5, 69), AbstractC3489q4.A01(c3514qT.A04()));
        }
        return this;
    }

    public final C3715ti A05(C2636c2 c2636c2) {
        if (c2636c2 != null) {
            this.A00.putAll(c2636c2.A0S());
        }
        return this;
    }

    public final C3715ti A06(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.A00.put(A00(15, 11, 0), str);
        }
        return this;
    }

    public final Map<String, String> A07() {
        return this.A00;
    }
}
