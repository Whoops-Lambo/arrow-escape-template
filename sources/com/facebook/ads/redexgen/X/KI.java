package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public abstract class KI implements InterfaceC3384oJ {
    public static byte[] A0D;
    public static String[] A0E = {"4yJhIog9RzpC9w4XHjq79o6hmz2pMXrt", "bLneqHgNlbzxjE", "P7gevZ65hMGDm5VmgpkLcWEi46YxYduR", "Pajg2XTKXpS0pN0AoGLcPnQoa2IWF6Z7", "YyJRdl3XxpBTstTmsw", "OvgbPt0JG7dlaj99kqPbJKVmb9CPKTVr", "21VbiQWRKHmC0d4xB3zoTsbqXtN2ZOxw", "Q3Y9mBD7X4l0uaedlY7FP5X0xCsXbtIX"};
    public static final C2810es A0F = null;
    public static final C3385oK A0G = null;
    public static final Handler A0H;
    public InterfaceC2805en A00;
    public InterfaceC2805en A01;
    public C3242ly A04;
    public C3382oH A05;
    public C3385oK A06;
    public AbstractC2806eo A07;
    public final C2878fy A08;
    public final InterfaceC3321nG A09;
    public final C2810es A0A;
    public final C2055Hi A0B;
    public volatile boolean A0C;
    public long A03 = -1;
    public String A02 = null;

    public static String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 8);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A0D = new byte[]{75, 110, 107, 122, 126, 111, 120, 42, 110, 101, 111, 121, 42, 100, 101, 126, 42, 111, 114, 99, 121, 126, 78, 107, 110, 127, 123, 106, 125, 47, 102, 124, 47, 97, 122, 99, 99, 47, 39, 108, 103, 110, 102, 97, 47, 97, 96, 123, 47, 99, 96, 110, 107, 106, 107, 38, 57, 28, 25, 8, 12, 29, 10, 88, 17, 11, 88, 22, 13, 20, 20, 88, 80, 27, 16, 25, 17, 22, 29, 28, 81, 45, 8, 13, 28, 24, 9, 30, 76, 5, 31, 76, 2, 25, 0, 0, 76, 68, 2, 3, 76, 15, 4, 13, 5, 2, 69, 78, 107, 110, 127, 123, 106, 125, 47, 102, 124, 47, 97, 122, 99, 99, 47, 96, 97, 47, 124, 123, 110, 125, 123, 78, 107, 5, 36, 107, 38, 36, 57, 46, 107, 42, 47, 107, 40, 42, 37, 47, 34, 47, 42, 63, 46, 56, 101, 122, 95, 66, 67, 74, 13, 76, 73, 76, 93, 89, 72, 95, 13, 89, 84, 93, 72, 3, 46, 43, 111, 46, 35, 61, 42, 46, 43, 54, 111, 60, 59, 46, 61, 59, 42, 43, 94, 91, 76, 52, 37, 60, 26, 17, 24, 16, 23, 38, 9, 24, 11, 24, 20, 10, 76, 91, 74, 79, 90, 79, 97, 76, 68, 75, 77, 90, 14, 71, 93, 14, 64, 91, 66, 66, 38, 45, 32, 49, 58, 51, 55, 38, 39, 28, 42, 39, 122, 113, 105, 118, 109, 112, 113, 114, 122, 113, 107, 63, 118, 108, 63, 122, 114, 111, 107, 102, 38, 50, 37, 49, 53, 37, 46, 35, 57, 31, 35, 33, 48, 48, 41, 46, 39, 28, 27, 3, 20, 25, 28, 17, 85, 5, 25, 20, 22, 16, 24, 16, 27, 1, 85, 28, 27, 85, 7, 16, 6, 5, 26, 27, 6, 16, 10, 9, 7, 2, 57, 18, 15, 11, 3, 57, 11, 21, 44, 59, 47, 43, 59, 45, 42, 1, 55, 58};
    }

    public abstract void A0O();

    public abstract void A0Q(InterfaceC2805en interfaceC2805en, C3242ly c3242ly, C3240lw c3240lw, C2879fz c2879fz);

    static {
        A08();
        AbstractC3525qe.A02();
        A0H = new Handler(Looper.getMainLooper());
    }

    public KI(C2055Hi c2055Hi, C2878fy c2878fy) {
        this.A0B = c2055Hi;
        this.A08 = c2878fy;
        if (A0G != null) {
            this.A06 = A0G;
        } else {
            this.A06 = new C3385oK(this.A0B);
        }
        this.A06.A0R(this);
        if (A0F != null) {
            this.A0A = A0F;
        } else {
            this.A0A = new C2810es();
        }
        DynamicLoaderFactory.makeLoader(this.A0B).getInitApi().onAdLoadInvoked(this.A0B);
        this.A09 = c2055Hi.A0A();
        this.A0B.A0F().A6D();
    }

    private void A09(C3242ly c3242ly) {
        this.A0B.A0F().AKk(c3242ly.A0G());
    }

    /* JADX WARN: Code duplicated, block: B:39:0x012d  */
    private void A0A(GG gg) {
        C3242ly placement = gg.A00();
        if (placement == null || placement.A05() == null) {
            String strA07 = A07(279, 29, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE);
            C3359nt c3359nt = new C3359nt(AdErrorType.NO_AD_PLACEMENT, strA07);
            this.A0B.A0F().A6F(c3359nt.A03().getErrorCode(), strA07);
            if (this.A07 != null) {
                AbstractC2806eo abstractC2806eo = this.A07;
                if (A0E[6].charAt(21) == '6') {
                    throw new RuntimeException();
                }
                String[] strArr = A0E;
                strArr[4] = "hfobwSBumZGDhQ4bXq";
                strArr[1] = "msoQnE8enpyN8f";
                abstractC2806eo.A0G(c3359nt);
                return;
            }
            return;
        }
        this.A04 = placement;
        this.A00 = null;
        C3242ly c3242ly = this.A04;
        JSONObject jSONObjectA0D = c3242ly.A0D();
        String strA08 = A07(195, 3, 93);
        if (jSONObjectA0D == null) {
            C3240lw c3240lwA04 = c3242ly.A04();
            if (!A0E(c3242ly, c3240lwA04)) {
                return;
            }
            if (this.A00 == null) {
                this.A0B.A08().ABz(strA08, AbstractC3223lf.A0a, new C3224lg(A07(81, 26, 100), c3240lwA04.A02()));
                AEr(C3359nt.A00(AdErrorType.INTERNAL_ERROR));
                return;
            }
            A0Q(this.A00, c3242ly, c3240lwA04, new C2879fz(c3240lwA04.A04(), c3242ly.A05(), this.A08.A0A, c3242ly.A05().A0C()));
        } else {
            ArrayList arrayList = new ArrayList();
            C3240lw c3240lwA05 = c3242ly.A04();
            do {
                if (arrayList.isEmpty()) {
                    if (A0E(c3242ly, c3240lwA05)) {
                        arrayList.add(c3240lwA05);
                    } else {
                        return;
                    }
                } else {
                    boolean zA0D = A0D(c3240lwA05);
                    if (A0E[2].charAt(5) == 'Z') {
                        String[] strArr2 = A0E;
                        strArr2[4] = "D4dH5FuixlBYVHNYJB";
                        strArr2[1] = "4bAHADqJrSynaw";
                        if (zA0D) {
                            arrayList.add(c3240lwA05);
                        }
                    } else if (zA0D) {
                        arrayList.add(c3240lwA05);
                    }
                }
                c3240lwA05 = c3242ly.A04();
            } while (c3240lwA05 != null);
            if (this.A00 == null) {
                this.A0B.A08().ABz(strA08, AbstractC3223lf.A0a, new C3224lg(A07(56, 25, 112), ((C3240lw) arrayList.get(0)).A02()));
                AEr(C3359nt.A00(AdErrorType.INTERNAL_ERROR));
                return;
            }
            boolean z = false;
            try {
                if (arrayList.size() > 1 && this.A00 != null && this.A00.ALe()) {
                    JSONObject jSONObject = new JSONObject();
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(((C3240lw) it.next()).A04());
                    }
                    jSONObject.put(A07(192, 3, 55), jSONArray);
                    jSONObject.put(A07(198, 12, 113), c3242ly.A0D());
                    A0Q(this.A00, c3242ly, c3240lwA05, new C2879fz(jSONObject, c3242ly.A05(), this.A08.A0A, c3242ly.A05().A0C()));
                    z = true;
                }
            } catch (Exception unused) {
                z = false;
            }
            if (!z) {
                if (arrayList.isEmpty()) {
                    C3359nt c3359ntA01 = C3359nt.A01(AdErrorType.NO_FILL, A07(0, 0, 73));
                    this.A0B.A0F().A6F(c3359ntA01.A03().getErrorCode(), A07(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 22, 67));
                    if (this.A07 != null) {
                        this.A07.A0G(c3359ntA01);
                        return;
                    }
                    return;
                }
                if (this.A00 == null) {
                    this.A0B.A08().ABz(strA08, AbstractC3223lf.A0a, new C3224lg(A07(22, 34, 7), ((C3240lw) arrayList.get(0)).A02()));
                    AEr(C3359nt.A00(AdErrorType.INTERNAL_ERROR));
                    return;
                }
                C3240lw c3240lw = (C3240lw) arrayList.get(0);
                A0Q(this.A00, c3242ly, c3240lw, new C2879fz(c3240lw.A04(), c3242ly.A05(), this.A08.A0A, c3242ly.A05().A0C()));
            }
        }
        A09(placement);
    }

    private final void A0B(String str, AdExperienceType adExperienceType) {
        this.A0B.A0F().A6G(str != null);
        this.A03 = System.currentTimeMillis();
        try {
            C3366o1 bidPayload = new C3366o1(this.A0B, str, this.A08.A0A, this.A08.A09);
            this.A05 = this.A08.A00(this.A0B, bidPayload, adExperienceType);
            if (this.A06 != null) {
                this.A06.A0Q(this.A05);
            }
        } catch (C3360nu e) {
            AEr(C3359nt.A02(e));
        }
    }

    private void A0C(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.A02 = jSONObject.optString(A07(230, 12, 75));
            C2812eu.A01(this.A0B).A0O(jSONObject);
        }
    }

    private boolean A0D(C3240lw c3240lw) {
        return (c3240lw == null || c3240lw.A04() == null) ? false : true;
    }

    private boolean A0E(C3242ly c3242ly, C3240lw c3240lw) {
        String strA07 = A07(0, 0, 73);
        if (c3240lw == null) {
            C3359nt c3359ntA01 = C3359nt.A01(AdErrorType.NO_FILL, strA07);
            this.A0B.A0F().A6F(c3359ntA01.A03().getErrorCode(), A07(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 22, 67));
            if (this.A07 != null) {
                AbstractC2806eo abstractC2806eo = this.A07;
                String[] strArr = A0E;
                if (strArr[7].charAt(9) == strArr[3].charAt(9)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0E;
                strArr2[7] = "7nYL2NF6M0xF4EMWgzzLH5X7HNcHVA2i";
                strArr2[3] = "4zdAiZz94ZfdEW2uI31voJBW941pIR5b";
                abstractC2806eo.A0G(c3359ntA01);
            }
            return false;
        }
        String strA02 = c3240lw.A02();
        InterfaceC2805en interfaceC2805enA00 = this.A0A.A00(this.A0B, c3242ly.A05().A0D());
        if (interfaceC2805enA00 == null) {
            this.A0B.A08().ABz(A07(195, 3, 93), AbstractC3223lf.A0a, new C3224lg(A07(0, 22, 2), strA02));
            AEr(C3359nt.A00(AdErrorType.INTERNAL_ERROR));
            return false;
        }
        if (!this.A08.A01().contains(interfaceC2805enA00.A9N())) {
            C3359nt c3359ntA02 = C3359nt.A01(AdErrorType.INTERNAL_ERROR, strA07);
            this.A0B.A0F().A6F(c3359ntA02.A03().getErrorCode(), A07(155, 19, 37));
            if (this.A07 != null) {
                this.A07.A0G(c3359ntA02);
            }
            return false;
        }
        this.A00 = interfaceC2805enA00;
        JSONObject jSONObjectA04 = c3240lw.A04();
        if (jSONObjectA04 != null) {
            String strOptString = jSONObjectA04.optString(A07(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 10, 86));
            this.A0B.A0F().AL2(strOptString);
            this.A0B.A0D(strOptString);
            C2054Hh c2054HhA00 = AbstractC3191l9.A00();
            if (c2054HhA00 != null) {
                c2054HhA00.A0D(strOptString);
            }
            JSONObject dataObject = jSONObjectA04.optJSONObject(A07(262, 17, 72));
            A0C(dataObject);
            if (this.A05 == null) {
                String strA08 = A07(242, 20, 23);
                C3359nt c3359ntA03 = C3359nt.A01(AdErrorType.UNKNOWN_ERROR, strA08);
                this.A0B.A0F().A6F(c3359ntA03.A03().getErrorCode(), strA08);
                if (this.A07 != null) {
                    this.A07.A0G(c3359ntA03);
                }
                return false;
            }
            return true;
        }
        String strA09 = A07(212, 18, 38);
        C3359nt c3359ntA04 = C3359nt.A01(AdErrorType.UNKNOWN_ERROR, strA09);
        this.A0B.A0F().A6F(c3359ntA04.A03().getErrorCode(), strA09);
        if (this.A07 != null) {
            this.A07.A0G(c3359ntA04);
        }
        return false;
    }

    public final long A0F() {
        if (this.A04 != null) {
            return this.A04.A03();
        }
        return -1L;
    }

    public final Handler A0G() {
        return A0H;
    }

    public AbstractC2831fD A0H() {
        if (this.A01 == null) {
            return null;
        }
        LG lg = (LG) this.A01;
        String[] strArr = A0E;
        if (strArr[0].charAt(1) == strArr[5].charAt(1)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[7] = "5bjG0IlN5e6ox7gGPwyNsTo6l8HjLpNA";
        strArr2[3] = "l5hnmXhlsnMB98vwFTttotkGHt3lxhSt";
        return lg.A0J();
    }

    public final C3243lz A0I() {
        if (this.A04 == null) {
            return null;
        }
        return this.A04.A05();
    }

    public final void A0J() {
        if (!C3300mv.A1v(this.A0B)) {
            return;
        }
        if (this.A01 != null) {
            C3425oz.A00(this.A0B).A0D(this.A01.A9N().toString(), this.A01.A7z());
        }
        if (this.A06 != null) {
            this.A06.A0R(null);
            this.A06 = null;
        }
        this.A07 = null;
        this.A00 = null;
        this.A01 = null;
    }

    public final void A0K() {
        String strA7z;
        this.A0B.A0F().A3n(C3513qS.A01(this.A03));
        if (this.A01 == null || (strA7z = this.A01.A7z()) == null) {
            return;
        }
        HashMap map = new HashMap();
        String strA05 = C3513qS.A05(this.A03);
        String clientToken = A07(308, 12, 110);
        map.put(clientToken, strA05);
        new C3329nO(strA7z, this.A09).A04(EnumC3328nN.A08, map);
    }

    public final void A0L() {
        InterfaceC2805en interfaceC2805en = this.A01;
        String strA07 = A07(195, 3, 93);
        if (interfaceC2805en == null) {
            String strA08 = A07(107, 26, 7);
            this.A0B.A08().ABz(strA07, AbstractC3223lf.A0Q, new C3224lg(strA08));
            AdErrorType adErrorType = AdErrorType.INTERNAL_ERROR;
            this.A0B.A0F().A6F(adErrorType.getErrorCode(), strA08);
            if (this.A07 != null) {
                AbstractC2806eo abstractC2806eo = this.A07;
                String errorMessage = adErrorType.getDefaultErrorMessage();
                abstractC2806eo.A0G(C3359nt.A01(adErrorType, errorMessage));
            }
            this.A0B.A0F().A6I();
            return;
        }
        if (this.A0C) {
            String strA09 = A07(174, 18, 71);
            this.A0B.A08().ABz(strA07, AbstractC3223lf.A0M, new C3224lg(strA09));
            AdErrorType adErrorType2 = AdErrorType.AD_ALREADY_STARTED;
            this.A0B.A0F().A6F(adErrorType2.getErrorCode(), strA09);
            if (this.A07 != null) {
                AbstractC2806eo abstractC2806eo2 = this.A07;
                String errorMessage2 = adErrorType2.getDefaultErrorMessage();
                abstractC2806eo2.A0G(C3359nt.A01(adErrorType2, errorMessage2));
            }
            this.A0B.A0F().A6H();
            return;
        }
        if (!TextUtils.isEmpty(this.A01.A7z())) {
            this.A09.ACq(this.A01.A7z());
        }
        this.A0B.A0F().A6J();
        this.A0C = true;
        A0O();
    }

    public final void A0M() {
        A0X(false);
    }

    public final void A0N() {
        if (this.A02 != null) {
            C2812eu.A01(this.A0B).A0N(this.A02);
        }
    }

    public final void A0P(InterfaceC2805en interfaceC2805en) {
        if (interfaceC2805en != null) {
            interfaceC2805en.onDestroy();
        }
    }

    public final void A0R(AbstractC2806eo abstractC2806eo) {
        this.A07 = abstractC2806eo;
    }

    public final void A0S(C2879fz c2879fz) {
        A0U(c2879fz.A03().optString(A07(210, 2, 39)));
    }

    public void A0T(String str) {
        A0B(str, null);
    }

    public final void A0U(String str) {
        this.A0B.A0F().A6C();
        if (!TextUtils.isEmpty(str)) {
            new C3329nO(str, this.A09).A04(EnumC3328nN.A04, null);
        }
    }

    public final void A0V(String str) {
        A0T(str);
    }

    public final void A0W(String str, AdExperienceType adExperienceType) {
        A0B(str, adExperienceType);
    }

    public void A0X(boolean z) {
        if (!z && !this.A0C) {
            return;
        }
        this.A0B.A0F().A6K();
        A0P(this.A01);
        this.A0C = false;
    }

    public final boolean A0Y() {
        return this.A04 == null || this.A04.A0H();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3384oJ
    public final synchronized void AEr(C3359nt c3359nt) {
        A0G().post(new KJ(this, c3359nt));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3384oJ
    public final synchronized void AHE(GG gg) {
        try {
            A0A(gg);
        } catch (Exception e) {
            this.A0B.A08().ABz(A07(195, 3, 93), AbstractC3223lf.A0T, new C3224lg(e));
        }
    }
}
