package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C2040Gt implements InterfaceC3321nG {
    public static InterfaceC3321nG A03;
    public static byte[] A04;
    public static final String A05;
    public static volatile boolean A06;
    public final C2054Hh A00;
    public final InterfaceC3273mU A01;
    public final InterfaceC3320nF A02;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 79);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{-90, -21, -4, -21, -12, -6, -76, -88, -37, -37, -52, -44, -41, -37, -48, -43, -50, -121, -37, -42, -121, -45, -42, -50, -121, -56, -43, -121, -48, -43, -35, -56, -45, -48, -53, -121, -43, -13, -30, -28, -26, -24, -26, -17, -26, -13, -22, -28, 46, 51, 42, 31};
    }

    static {
        A03();
        A05 = C2040Gt.class.getSimpleName();
        A06 = false;
    }

    public C2040Gt(C2054Hh c2054Hh) {
        InterfaceC3319nE dispatchCallback;
        this.A00 = c2054Hh;
        if (AbstractC3302mx.A0T(c2054Hh)) {
            this.A01 = AbstractC3271mS.A00(c2054Hh);
            dispatchCallback = AbstractC3326nL.A00(c2054Hh, this.A01);
        } else {
            C7A c7aA01 = AbstractC3271mS.A01(c2054Hh);
            dispatchCallback = AbstractC3326nL.A01(c2054Hh, c7aA01);
            this.A01 = c7aA01;
        }
        this.A02 = new C2043Gw(c2054Hh, dispatchCallback);
        ExecutorC3528qh.A08.execute(new C2042Gv(this));
        A04(c2054Hh);
    }

    public static synchronized InterfaceC3321nG A01(C2054Hh c2054Hh) {
        if (A03 == null) {
            A03 = new C2040Gt(c2054Hh);
        }
        return A03;
    }

    public static synchronized void A04(C2054Hh c2054Hh) {
        if (A06) {
            return;
        }
        c2054Hh.A04().ADj();
        A06 = true;
    }

    private void A05(C3318nD c3318nD) {
        if (!c3318nD.A0A()) {
            Log.e(A05, A02(7, 29, 24) + c3318nD.A06() + A02(0, 7, 55));
        } else {
            A06(c3318nD);
            this.A01.AMQ(c3318nD, new C2041Gu(this, c3318nD));
        }
    }

    private void A06(C3318nD c3318nD) {
        switch (C3322nH.A00[c3318nD.A06().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                C3224lg c3224lg = new C3224lg(new Exception(A02(36, 5, 50)));
                c3224lg.A05(1);
                try {
                    c3224lg.A07(new JSONObject().put(A02(48, 4, 107), c3318nD.A06().toString()));
                    break;
                } catch (JSONException unused) {
                }
                this.A00.A08().AC0(A02(41, 7, 50), AbstractC3223lf.A1H, c3224lg);
                break;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3321nG
    public final void ABo(String str, Map<String, String> data) {
        A05(new C3317nC().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC3323nI.A04).A02(EnumC3324nJ.A04).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3321nG
    public final void ABq(String str, Map<String, String> data) {
        A05(new C3317nC().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC3323nI.A04).A02(EnumC3324nJ.A06).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3321nG
    public final void ABr(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3317nC().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC3323nI.A04).A02(EnumC3324nJ.A07).A06(AbstractC3331nQ.A0A(str, EnumC3328nN.A0I)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3321nG
    public final void ABt(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3317nC().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC3323nI.A04).A02(EnumC3324nJ.A08).A06(AbstractC3331nQ.A0A(str, EnumC3328nN.A06)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3321nG
    public final void ABy(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3317nC().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC3323nI.A04).A02(EnumC3324nJ.A0B).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3321nG
    public final void AC2(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3317nC().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC3323nI.A04).A02(EnumC3324nJ.A0C).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3321nG
    public final void AC7(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3317nC().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC3323nI.A05).A02(EnumC3324nJ.A0D).A06(AbstractC3331nQ.A0A(str, EnumC3328nN.A0T)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3321nG
    public final void AC8(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3317nC().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC3323nI.A05).A02(EnumC3324nJ.A0E).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3321nG
    public final void AC9(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3317nC().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC3323nI.A05).A02(EnumC3324nJ.A0F).A06(AbstractC3331nQ.A0A(str, EnumC3328nN.A0V)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3321nG
    public final void ACA(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3317nC().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC3323nI.A05).A02(EnumC3324nJ.A0K).A06(AbstractC3331nQ.A0A(str, EnumC3328nN.A0W)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3321nG
    public final void ACb(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3317nC().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC3323nI.A05).A02(EnumC3324nJ.A0H).A06(AbstractC3331nQ.A0A(str, EnumC3328nN.A0X)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3321nG
    public final void ACd(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3317nC().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC3323nI.A04).A02(EnumC3324nJ.A0J).A06(AbstractC3331nQ.A0A(str, EnumC3328nN.A0a)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3321nG
    public final void ACe(String str, Map<String, String> data, String str2, EnumC3323nI enumC3323nI) {
        A05(new C3317nC().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(enumC3323nI).A02(EnumC3324nJ.A00(str2)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3321nG
    public final void ACf(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C3318nD adEvent = new C3317nC().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC3323nI.A04).A02(EnumC3324nJ.A0L).A07(this.A00);
        A05(adEvent);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3321nG
    public final void ACg(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C3318nD adEvent = new C3317nC().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC3323nI.A04).A02(EnumC3324nJ.A0M).A07(this.A00);
        A05(adEvent);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3321nG
    public final void ACn(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3317nC().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC3323nI.A05).A02(EnumC3324nJ.A0O).A06(AbstractC3331nQ.A0A(str, EnumC3328nN.A0w)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3321nG
    public final void ACo(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3317nC().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC3323nI.A05).A02(EnumC3324nJ.A0P).A06(AbstractC3331nQ.A0A(str, EnumC3328nN.A0x)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3321nG
    public final void ACq(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3317nC().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A01(EnumC3323nI.A04).A02(EnumC3324nJ.A0Q).A06(AbstractC3331nQ.A0A(str, EnumC3328nN.A0y)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3321nG
    public final void ACt(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3317nC().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC3323nI.A04).A02(EnumC3324nJ.A0G).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3321nG
    public final void ACy(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3317nC().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC3323nI.A05).A02(EnumC3324nJ.A0R).A06(AbstractC3331nQ.A0A(str, EnumC3328nN.A12)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3321nG
    public final void ACz(String str, Map<String, String> data) {
        A05(new C3317nC().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC3323nI.A05).A02(EnumC3324nJ.A0W).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3321nG
    public final void AD1(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C3317nC().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(EnumC3323nI.A05).A02(EnumC3324nJ.A0X).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3321nG
    public final void AIC(String str) {
        new C2539aT(this.A00).A0C(str);
    }
}
