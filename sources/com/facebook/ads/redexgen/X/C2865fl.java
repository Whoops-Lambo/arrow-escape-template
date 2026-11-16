package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C2865fl {
    public static byte[] A05;
    public static String[] A06 = {"jJreqFAWfQsm2UlBXjWleQZy51A8w9r3", "B5vxrqY9e1pfFDILbPSJEQZe5Zep9JAF", "7hwRhDIA2xM98ucsNVPICP0872", "8yYdfjKxcW1uK5E8nS4F9bT", "cwoTvwLLOWGZrFwonmn2qn9xu", "wuc4L", "VoE60CbUCih", "1JGxuEjawtyxaKItdz1AQ1lnM"};
    public C3183kz A00;
    public EnumC3719tm A01 = EnumC3719tm.A06;
    public ArrayList<C2342Tb> A02 = new ArrayList<>();
    public final AbstractC2831fD A03;
    public final InterfaceC2864fk A04;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 96);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{-97, -39, -27, -34, -35, -81, -44, -38, -53, -40, -44, -57, -46, -122, -85, -40, -40, -43, -40, -122, -104, -106, -106, -100, -122, -35, -49, -38, -50, -43, -37, -38, -122, -57, -122, -36, -57, -46, -49, -54, -122, -89, -54, -81, -44, -52, -43, -108, 31, 34, 29, 34, 31, 50, 31, 29, 32, 51, 44, 34, 42, 35, -45, -30, -37, -59, -54, -61, -53, -48, -63, -46, -61, -44, -61, -49, -43, -42, -37, -44, -36, -31, -40, -41, -76, -41, -73, -44, -25, -44, -75, -24, -31, -41, -33, -40, -38, -33, -27, -42, -29, -28, -27, -38, -27, -38, -46, -35, 15, 8, 3, 11, 15, -1, -29, -2};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final void A0J(C2055Hi c2055Hi, EnumSet<CacheFlag> enumSet) {
        if (A0E() == EnumC3392oR.A05) {
            C2145Kz c2145Kz = (C2145Kz) this.A03;
            LA laA2y = c2145Kz.A2y();
            if (A0C(c2055Hi, laA2y) || laA2y == null) {
                return;
            }
            this.A04.AIm();
            A0A(c2055Hi, enumSet, c2145Kz, laA2y, 0, this.A04);
            return;
        }
        if (A0C(c2055Hi, (LA) this.A03)) {
            return;
        }
        this.A04.AIm();
        if (A0E() == EnumC3392oR.A0D) {
            A08(c2055Hi, (C18137i) this.A03);
        } else {
            A09(c2055Hi, enumSet, (C18137i) this.A03, -1, this.A04);
        }
    }

    static {
        A06();
    }

    public C2865fl(C2055Hi c2055Hi, C2879fz c2879fz, InterfaceC2864fk interfaceC2864fk, String str) {
        JSONObject dataObject = c2879fz.A03();
        this.A03 = A01(c2055Hi, c2879fz, str, dataObject);
        this.A04 = interfaceC2864fk;
    }

    private AdError A00(C2055Hi c2055Hi, LA la) {
        if (la == null || la.A39().isEmpty()) {
            c2055Hi.A08().ABz(A04(62, 3, 18), AbstractC3223lf.A0Z, new C3224lg(A04(5, 43, 6)));
            return AdError.internalError(2006);
        }
        return null;
    }

    public static AbstractC2831fD A01(C2055Hi c2055Hi, C2879fz c2879fz, String str, JSONObject jSONObject) {
        AbstractC2831fD abstractC2831fDA00 = null;
        if (jSONObject.has(A04(65, 12, 2))) {
            try {
                abstractC2831fDA00 = C2145Kz.A01(jSONObject, c2055Hi, true);
                abstractC2831fDA00.A27(true);
                abstractC2831fDA00.A23(A04(96, 12, 17));
            } catch (JSONException unused) {
            }
        }
        if (abstractC2831fDA00 == null) {
            abstractC2831fDA00 = C18137i.A00(jSONObject, c2055Hi);
        }
        abstractC2831fDA00.A22(str);
        C3243lz c3243lzA01 = c2879fz.A01();
        if (c3243lzA01 != null) {
            abstractC2831fDA00.A1y(c3243lzA01.A06());
        }
        return abstractC2831fDA00;
    }

    private C3183kz A03(C2055Hi c2055Hi) {
        return this.A00 != null ? this.A00 : new C3183kz(c2055Hi);
    }

    private void A08(C2055Hi c2055Hi, C18137i c18137i) {
        C2855fb playableData = c18137i.A32().A0I().A07();
        A0B(playableData != null ? playableData.A0I() : EnumC3719tm.A06);
        KY ky = new KY(this);
        C3183kz c3183kz = new C3183kz(c2055Hi);
        boolean z = C3300mv.A2H(c2055Hi) && C3148kP.A0A(c18137i.A1x());
        if (z) {
            C3148kP unifiedAssetsLoader = new C3148kP(c3183kz, c18137i.A1x(), c18137i.A1c(), c18137i.A1r(), z, new KX(this));
            c3183kz.A0e(new C3329nO(c18137i.A37(), c2055Hi.A0A()));
            unifiedAssetsLoader.A0B();
            return;
        }
        AbstractC2876fw.A02(c2055Hi, c18137i, true, ky);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0096  */
    private void A09(C2055Hi c2055Hi, EnumSet<CacheFlag> enumSet, LA la, int i, InterfaceC2864fk interfaceC2864fk) {
        Iterator<C3375oA> it;
        boolean isDSL = la.A2Q();
        C3183kz c3183kzA03 = A03(c2055Hi);
        c3183kzA03.A0e(new C3329nO(la.A37(), c2055Hi.A0A()));
        boolean z = C3300mv.A2H(c2055Hi) && C3148kP.A0A(la.A1x());
        if (A06[3].length() == 32) {
            throw new RuntimeException();
        }
        A06[5] = "QkQhg";
        if (z) {
            new C3148kP(c3183kzA03, la.A1x(), la.A1c(), la.A1r(), z, new C2136Ko(this, c2055Hi, isDSL, la, interfaceC2864fk)).A0B();
            return;
        }
        String strA04 = A04(96, 12, 17);
        String[] strArr = A06;
        if (strArr[1].charAt(24) != strArr[0].charAt(24)) {
            String[] strArr2 = A06;
            strArr2[1] = "jVhVjw8PHVLop7GyU0UYPYiA56KfUjA6";
            strArr2[0] = "lzrrt2iICm45JkiVqVLOf6p257fg56KP";
            if (isDSL) {
                C3179kv c3179kv = new C3179kv(la.A1Y(), la.A1r(), strA04);
                c3179kv.A04 = true;
                c3179kv.A03 = A04(0, 5, 17);
                c3183kzA03.A0Y(c3179kv);
            }
        } else {
            String[] strArr3 = A06;
            strArr3[7] = "mMtIDEEqjJJ695eeXDndb9bWh";
            strArr3[4] = "Ebj8lqyUqzLrB8iZ5jF9tO70n";
            if (isDSL) {
                C3179kv c3179kv2 = new C3179kv(la.A1Y(), la.A1r(), strA04);
                c3179kv2.A04 = true;
                c3179kv2.A03 = A04(0, 5, 17);
                c3183kzA03.A0Y(c3179kv2);
            }
        }
        c3183kzA03.A0d(new C3181kx(la.A35().A01(), C3426p0.A04, C3426p0.A04, la.A1r(), A04(96, 12, 17)));
        boolean isUnifiedAssetsLoaderEnabled = enumSet.contains(CacheFlag.VIDEO);
        int i2 = 0;
        boolean zA33 = C3300mv.A33(c2055Hi, C2673cd.A03());
        for (C2832fE c2832fE : la.A39()) {
            String strA08 = c2832fE.A0I().A08();
            if (strA08 != null) {
                C3181kx c3181kx = new C3181kx(strA08, AbstractC2872fs.A00(c2832fE.A0I()), AbstractC2872fs.A01(c2832fE.A0I()), la.A1r(), A04(96, 12, 17));
                if (i2 == 0) {
                    c3183kzA03.A0c(c3181kx);
                } else {
                    c3183kzA03.A0d(c3181kx);
                }
            }
            Iterator<String> it2 = c2832fE.A0L().A03().iterator();
            while (it2.hasNext()) {
                c3183kzA03.A0d(new C3181kx(it2.next(), -1, -1, la.A1r(), A04(96, 12, 17)));
            }
            if (isUnifiedAssetsLoaderEnabled && !TextUtils.isEmpty(c2832fE.A0I().A09())) {
                C3179kv c3179kv3 = new C3179kv(c2832fE.A0I().A09(), la.A1r(), A04(96, 12, 17), c2832fE.A0I().A06());
                c3179kv3.A04 = false;
                if (i2 == 0) {
                    if (isDSL && !zA33) {
                        c3183kzA03.A0Y(c3179kv3);
                    } else {
                        c3183kzA03.A0b(c3179kv3);
                    }
                } else if (isDSL && !zA33) {
                    c3183kzA03.A0Z(c3179kv3);
                } else {
                    c3183kzA03.A0a(c3179kv3);
                }
            }
            i2++;
        }
        Iterator<C3049io> it3 = la.A1w().iterator();
        while (it3.hasNext()) {
            c3183kzA03.A0d(new C3181kx(it3.next().A02(), -1, -1, la.A1r(), A04(96, 12, 17)));
        }
        List<C3375oA> listA1v = la.A1v();
        if (A06[5].length() != 5) {
            it = listA1v.iterator();
        } else {
            String[] strArr4 = A06;
            strArr4[1] = "1nyfEMUepOevYMJugZMvnGL65TcEtQKO";
            strArr4[0] = "8oN0yixDNSHwX0PkZXBy1Qxe5JRM3g8f";
            it = listA1v.iterator();
        }
        while (it.hasNext()) {
            c3183kzA03.A0d(new C3181kx(it.next().A02(), -1, -1, la.A1r(), A04(96, 12, 17)));
        }
        if (la.A2D() && !TextUtils.isEmpty(la.A1d())) {
            c3183kzA03.A0d(new C3181kx(la.A1d(), C2019Fy.A0A, C2019Fy.A0A, la.A1r(), A04(96, 12, 17)));
        }
        AbstractC2871fr.A00(la, c3183kzA03, strA04);
        c3183kzA03.A0X(new C2129Kh(this, c2055Hi, isDSL, la, interfaceC2864fk), new C3176ks(la.A1r(), strA04, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A(C2055Hi c2055Hi, EnumSet<CacheFlag> enumSet, C2145Kz c2145Kz, LA la, int i, InterfaceC2864fk interfaceC2864fk) {
        A09(c2055Hi, enumSet, la, i, new C2140Ks(this, c2055Hi, la, c2145Kz, i, interfaceC2864fk, enumSet));
    }

    private void A0B(EnumC3719tm enumC3719tm) {
        this.A01 = enumC3719tm;
    }

    private boolean A0C(C2055Hi c2055Hi, LA la) {
        AdError adErrorA00 = A00(c2055Hi, la);
        if (adErrorA00 != null) {
            InterfaceC2864fk interfaceC2864fk = this.A04;
            String[] strArr = A06;
            if (strArr[1].charAt(24) != strArr[0].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[1] = "Dm6wm58uJ8qXwjtNx8Vtzbsb5Jkw9mit";
            strArr2[0] = "fLwuuFNg4tiwPdo6hP9t6x3v5l5Hcavg";
            interfaceC2864fk.ADk(adErrorA00);
            return true;
        }
        return false;
    }

    public final AbstractC2831fD A0D() {
        return this.A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a8, code lost:
    
        if (r3 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b4, code lost:
    
        if (r3 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b9, code lost:
    
        return com.facebook.ads.redexgen.X.EnumC3392oR.A0D;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.X.EnumC3392oR A0E() {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C2865fl.A0E():com.facebook.ads.redexgen.X.oR");
    }

    public final EnumC3719tm A0F() {
        return this.A01;
    }

    public final String A0G() {
        if (this.A03.A2L()) {
            return ((C2145Kz) this.A03).A32();
        }
        return ((LA) this.A03).A37();
    }

    public final void A0H() {
        this.A04.ALr();
    }

    public final void A0I(Intent intent, RewardData rewardData, String str) {
        String stringExtra;
        String stringExtra2;
        this.A03.A20(rewardData);
        this.A03.A24(str);
        EnumC3392oR enumC3392oRA0E = A0E();
        EnumC3392oR enumC3392oR = EnumC3392oR.A0B;
        String strA04 = A04(108, 8, 58);
        if (enumC3392oRA0E == enumC3392oR && this.A03.A2k() && (stringExtra2 = intent.getStringExtra(strA04)) != null) {
            AbstractC3108jl.A02(stringExtra2, (LA) this.A03);
            return;
        }
        if (A0D().A2L()) {
            if (this.A03.A2l() && (stringExtra = intent.getStringExtra(strA04)) != null) {
                AbstractC3109jm.A02(stringExtra, (C2145Kz) this.A03);
                return;
            }
            intent.putExtra(A04(77, 19, 19), this.A03);
        }
        intent.putExtra(A04(48, 14, 94), this.A03);
    }

    public final boolean A0K() {
        return this.A03.A2B();
    }

    public final boolean A0L(LA la) {
        return !TextUtils.isEmpty(la.A32().A0I().A09());
    }
}
