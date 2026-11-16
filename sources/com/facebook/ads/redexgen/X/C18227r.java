package com.facebook.ads.redexgen.X;

import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import android.widget.LinearLayout;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C18227r<NativeViewabilityLogger> implements MA {
    public static byte[] A0I;
    public static String[] A0J = {"1VlIdrj3fRAASVh0IRQbA", "AKXoeI10d8PJONEXEmQHjWIEkAB2E", "HfXt1ktTFXNYFvURT1ePpe", "VNbNAjzqH3UXN3t9RrTP5z6I5Qa6gPQJ", "DeawL9PzUIlDumNdtXISYTaSpfy6P3Cj", "KNbO6MhxkLbBAZAqlm1H7U8Ouut8mEhI", "i536pd2CEb7n0lc", "TelURl5RBqiFivFSJRRvco6RCKborqoX"};
    public static final String A0K;
    public InterfaceC2813ev A00;
    public C2814ew A01;
    public LN A02;
    public C18147j A03;
    public C7D A04;
    public InterfaceC3321nG A05;
    public EnumC3361nw A06;
    public InterfaceC3707ta A07;
    public C1991Ev A08;
    public C6T A09;
    public AbstractC2637c3 A0A;
    public C2636c2 A0B;
    public String A0C;
    public final String A0H = UUID.randomUUID().toString();
    public boolean A0D = false;
    public boolean A0E = false;
    public boolean A0F = false;
    public final C3514qT A0G = new C3514qT();

    public static String A08(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0I, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 19);
            if (A0J[2].length() == 29) {
                throw new RuntimeException();
            }
            String[] strArr = A0J;
            strArr[3] = "viF0h1063r6cbXDqGfnWrC6qPBVBGzAv";
            strArr[7] = "3ywSXssJKLxMazlfVUMLvW6ymO505mlb";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A0I = new byte[]{-28, -16, -18, -81, -25, -30, -28, -26, -29, -16, -16, -20, -81, -30, -27, -12, -81, -29, -30, -17, -17, -26, -13, -81, -28, -19, -22, -28, -20, -26, -27, -24, -39, -20, -24, -93, -36, -24, -31, -32, -68, -69, -83, 116, 127};
    }

    static {
        A0B();
        A0K = C18227r.class.getSimpleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7r != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public void A0A() {
        if (this.A00 != null && this.A09 != null && this.A03 != null && this.A03.A2Q()) {
            this.A00.AE9(this, this.A09);
        }
        if (this.A00 != null && this.A0D) {
            boolean z = this.A0E;
            if (A0J[2].length() == 29) {
                throw new RuntimeException();
            }
            A0J[2] = "DQYu3GBVfiN4Ml";
            if (z || !this.A0F) {
                this.A00.AE9(this, this.A08);
            }
        }
        this.A04.A0F().A4p(this.A00 != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7r != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public void A0C(int i, C3243lz c3243lz) {
        M0 m0 = new M0(this);
        this.A09 = new C6T(this.A04, this.A05, m0, this.A03, A08(0, 31, 110), 2, this.A0G);
        this.A0A = new C2170Lz(this);
        this.A0B = new C2636c2(this.A09, c3243lz.A04(), c3243lz.A09(), true, new WeakReference(this.A0A), this.A04);
        if (this.A03 != null) {
            this.A0B.A0W(this.A03.A1J());
            this.A0B.A0X(this.A03.A1K());
        }
        this.A09.setVisibility(0);
        this.A04.getResources();
        this.A09.setLayoutParams(new LinearLayout.LayoutParams(-1, i));
        this.A09.ALW();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7r != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    private void A0F(C3243lz c3243lz, JSONObject jSONObject, EnumC3361nw enumC3361nw) {
        this.A0E = false;
        final LP lpA00 = LP.A00(this.A04, jSONObject);
        this.A0C = lpA00.A7z();
        if (AbstractC2802ej.A06(this.A04, lpA00, this.A05)) {
            this.A04.A0F().A5b();
            this.A00.AFQ(this, C3359nt.A00(AdErrorType.NO_FILL));
            return;
        }
        this.A07 = new AbstractC1994Ey() { // from class: com.facebook.ads.redexgen.X.7s
            public static byte[] A02;
            public static String[] A03 = {"RkD1OJxt7Cm", "85G", "rOg3VWXB3SEY3xQpEJ0sm9sa", "k8A4i4hEDbRwTbJ7ZqirbVmRMdyhqYao", "w8o7PtZgo3USKQqv4zP9Jz4sqmraE2my", "KkDuTncCOt8", "W5AvxWS2W", "p0drNpcb1k1QxXuNf36gE6"};

            public static String A00(int i, int i2, int i3) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
                for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 74);
                }
                return new String(bArrCopyOfRange);
            }

            public static void A01() {
                A02 = new byte[]{-113, -68, -68, -71, -68, 106, -81, -62, -81, -83, -65, -66, -77, -72, -79, 106, -85, -83, -66, -77, -71, -72, -2, 14, 11, 19, 15, 1, 14, -5, 16, 21, 12, 1, -28, -30, -19, -19, -26, -13, -43, -6, -15, -26, 14, 14, 31, 10, 31, 36, 27, 16, 12, 8, 7, 10, -60, -67, -72, -64, -60, -76, -104, -77};
            }

            static {
                A01();
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC3707ta
            public final void ADv() {
                this.A00.A0E = true;
                if (this.A00.A0F) {
                    this.A00.A0A();
                }
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC1994Ey, com.facebook.ads.redexgen.X.InterfaceC3707ta
            public final void AEN(String str, Map<String, String> map) {
                String strA1V;
                this.A00.A04.A0F().A4q();
                Uri uriA00 = AbstractC3448pP.A00(str);
                map.put(A00(34, 10, 55), AdPlacementType.BANNER.name());
                map.put(A00(56, 8, 5), this.A00.A0H);
                if (this.A00.A03 == null) {
                    strA1V = null;
                } else {
                    C18227r c18227r = this.A00;
                    String[] strArr = A03;
                    if (strArr[0].length() != strArr[5].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A03;
                    strArr2[1] = "yKt";
                    strArr2[2] = "O3cmN93hsB9jwoMarcV7SE5e";
                    strA1V = c18227r.A03.A1V();
                }
                if (strA1V != null) {
                    map.put(A00(22, 12, 82), strA1V);
                }
                String strA1W = this.A00.A03 == null ? null : this.A00.A03.A1W();
                if (strA1W != null) {
                    map.put(A00(44, 8, 97), strA1W);
                }
                AbstractC2798ef adAction = C2799eg.A00(this.A00.A04, this.A00.A05, lpA00.A7z(), uriA00, map, this.A00.A03 == null ? null : this.A00.A03.A33());
                EnumC2795ec enumC2795ecA0G = EnumC2795ec.A08;
                if (adAction != null) {
                    try {
                        this.A00.A04.A0F().A4n();
                        enumC2795ecA0G = adAction.A0G(null);
                    } catch (Exception e) {
                        Log.e(C18227r.A0K, A00(0, 22, 0), e);
                    }
                }
                if (A00(52, 4, 92).equals(uriA00.getScheme()) && C2799eg.A04(uriA00.getAuthority()) && this.A00.A00 != null && enumC2795ecA0G != EnumC2795ec.A05) {
                    this.A00.A00.AE8(this.A00);
                }
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC3707ta
            public final void AFD() {
                this.A00.A04.A0F().A4r(this.A00.A02 != null);
                if (this.A00.A02 != null) {
                    this.A00.A02.A09();
                }
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC3707ta
            public final void AGD() {
                this.A00.A04.A0F().A4t();
                this.A00.A02.A0B();
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC3707ta
            public final void AHt() {
            }
        };
        this.A08 = new C1991Ev(this.A04, (WeakReference<InterfaceC3707ta>) new WeakReference(this.A07), c3243lz.A04(), A7z());
        this.A08.A0L(c3243lz.A07(), c3243lz.A08());
        AbstractC2808eq impressionHelper = new C2163Lr(this);
        this.A02 = new LN(this.A04, this.A05, this.A08, this.A08.getViewabilityChecker(), impressionHelper, enumC3361nw);
        this.A02.A0C(lpA00);
        this.A08.loadDataWithBaseURL(AbstractC3710td.A01(AdInternalSettings.getUrlPrefix()), lpA00.A04(), A08(31, 9, 97), A08(40, 5, 52), null);
        this.A0D = true;
        A0A();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7r != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    private void A0G(EnumC3361nw enumC3361nw, C3243lz c3243lz) {
        if (this.A03 == null || this.A05 == null) {
            return;
        }
        int iA03 = (int) (enumC3361nw.A03() * Resources.getSystem().getDisplayMetrics().density);
        int bannerHeight = (C3300mv.A2H(this.A04) && C3148kP.A0A(this.A03.A1x())) ? 1 : 0;
        if (bannerHeight == 0) {
            A0C(iA03, c3243lz);
        } else {
            new C3148kP(new C3183kz(this.A04), this.A03.A1x(), this.A03.A1c(), this.A03.A1r(), true, new M9(this, iA03, c3243lz, this)).A0B();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7r != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC2805en
    public final String A7z() {
        return this.A0C;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7r != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC2805en
    public final AdPlacementType A9N() {
        if (C3300mv.A19(this.A04) && this.A06 != null && this.A06 == EnumC3361nw.A08) {
            return AdPlacementType.MEDIUM_RECTANGLE;
        }
        return AdPlacementType.BANNER;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7r != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.X.MA
    public final void ABb(C7D c7d, InterfaceC3321nG interfaceC3321nG, EnumC3361nw enumC3361nw, InterfaceC2813ev interfaceC2813ev, JSONObject jSONObject, C3243lz c3243lz) {
        c7d.A0F().A4o();
        this.A04 = c7d;
        this.A05 = interfaceC3321nG;
        this.A00 = interfaceC2813ev;
        this.A06 = enumC3361nw;
        this.A0F = C3300mv.A1o(this.A04.getApplicationContext());
        this.A03 = C18147j.A00(jSONObject, this.A04);
        if (this.A03.A2Q()) {
            A0G(enumC3361nw, c3243lz);
        } else {
            A0F(c3243lz, jSONObject, enumC3361nw);
        }
        this.A01 = new C2814ew(this.A04, this.A0H, this, interfaceC2813ev);
        this.A01.A02();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7r != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC2805en
    public final boolean ALe() {
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7r != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC2805en
    public final void onDestroy() {
        this.A04.A0F().A4m(this.A08 != null);
        if (this.A08 != null) {
            this.A08.destroy();
            this.A08 = null;
            this.A07 = null;
        }
        if (this.A01 != null) {
            this.A01.A03();
        }
    }
}
