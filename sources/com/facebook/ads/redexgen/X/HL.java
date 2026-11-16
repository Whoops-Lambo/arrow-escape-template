package com.facebook.ads.redexgen.X;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class HL implements InterfaceC2738dg {
    public static byte[] A01;
    public static String[] A02 = {"EcOoOPxvgIM5VM8gU5MNIX90mja3CaI7", "nhJ", "HCYDUCxXnFbS3htlRPDiG7BoiyzyMxIV", "Fv3YAwH75PiBj9X6AN971g", "yIx", "", "9xkhFmOksAfwag3lVFNPfz", "xjMRz"};
    public final C3192lA A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 90);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        String[] strArr = A02;
        if (strArr[1].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[0] = "mKsg4hxQhHaV0fiKABuoeRg1A6SJU8YP";
        strArr2[2] = "TgUrCFxQKf96ICwhyLjRHk1rYV6JKdAm";
        A01 = new byte[]{-91, -111, -94, -120, -18, 29, 22, 22, 13, 20, -12, 35, 28, 28, 19, 26, -24, -50, -3, 12, 34, -16, 33, 16, 25, 31, 10, -37, -22, -29, -29, -38, -31, 57, 72, 65, 65, 56, 63, 50, 63, 66, 58, 58, 56, 55, 23, 38, 31, 31, 22, 29, 16, 29, 32, 24, 24, 26, 31, 24, 16, 30, 32, 21, 22};
    }

    static {
        A01();
    }

    public HL(C3192lA c3192lA) {
        this.A00 = c3192lA;
    }

    private void A02(int i, String str, JSONObject jSONObject, boolean z, int i2) {
        C3224lg c3224lg = new C3224lg(A00(4, 6, 78));
        c3224lg.A07(jSONObject);
        c3224lg.A05(1);
        c3224lg.A09(z);
        c3224lg.A04(i2);
        try {
            jSONObject.put(A00(33, 13, Sdk.SDKError.Reason.TPAT_ERROR_VALUE), C3217lZ.A0H(this.A00));
        } catch (JSONException unused) {
        }
        try {
            jSONObject.put(A00(46, 19, 87), i2);
        } catch (JSONException unused2) {
        }
        this.A00.A08().AC0(A00(27, 6, 27), i + 4000, c3224lg);
        C3192lA c3192lA = this.A00;
        String[] strArr = A02;
        if (strArr[1].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[5] = "";
        strArr2[7] = "Bzrm1";
        if (c3192lA.A05().AB6()) {
            String str2 = A00(10, 8, 84) + str + A00(0, 1, 35) + i + A00(1, 3, 14) + jSONObject.toString();
        }
    }

    public static boolean A03(EnumC2740di enumC2740di) {
        for (EnumC2740di enumC2740di2 : HD.A06) {
            if (enumC2740di2.equals(enumC2740di)) {
                String[] strArr = A02;
                if (strArr[5].length() == strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[0] = "Wnbl1SxbPUMoFXuq6aB18pNeXqZWWzDi";
                strArr2[2] = "Lc0ARXxjXBXBpMD71LOao0gY4EKFysHu";
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2738dg
    public final void AC1(EnumC2740di enumC2740di, JSONObject jSONObject, int i) {
        A02(enumC2740di.A03(), enumC2740di.toString(), jSONObject, A03(enumC2740di), i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2738dg
    public final void ACh(int i, JSONObject jSONObject, int i2) {
        A02(i, A00(18, 9, 81) + i, jSONObject, false, i2);
    }
}
