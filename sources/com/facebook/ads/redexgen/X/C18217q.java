package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C18217q implements MA {
    public static byte[] A09;
    public static String[] A0A = {"vQVR1W3KlFe1E6rykCQCN1hDjMfDn8rI", "tljelZM2jTB3b2QbbMIwKIvWUquFoQXI", "0RiyIUNkcV4TWqJ0V4znzZ5bg2a", "MB6YWUDNpiHBLRzyVZhANt93gTO", "D0Irbp5yZSl4LI2XNM8ietwCF", "tPTjxG3CTnyfKgiqByKdCe9GOtIwdNY0", "nGMCZLoa7jZxlH5O5MEheqiCaj61zw57", "8ntFVXYpP614IfxmD9rZT4cXa3R1zF25"};
    public InterfaceC2813ev A01;
    public C2814ew A02;
    public LM A03;
    public LK A04;
    public C7D A05;
    public InterfaceC3577rU A06;
    public C3578rV A07;
    public final String A08 = UUID.randomUUID().toString();
    public long A00 = -1;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 94);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A09 = new byte[]{43, 60, 40, 32, 31, 36, 48, 40, 26, 45, 32, 30, 47, 28, 41, 34, 39, 32};
    }

    static {
        A04();
    }

    private void A05(C7D c7d, LK lk, C3183kz c3183kz, InterfaceC2813ev interfaceC2813ev, C3578rV c3578rV) {
        String strA7z = lk.A7z();
        if (!TextUtils.isEmpty(strA7z)) {
            c3183kz.A0e(new C3329nO(strA7z, c7d.A0A()));
        }
        if (lk.A0I() != null) {
            C3181kx c3181kx = new C3181kx(lk.A0I().getUrl(), lk.A0I().getHeight(), lk.A0I().getWidth(), lk.A0b(), A03(2, 16, 93));
            c3181kx.A01 = new l5(false, -1, -1);
            c3183kz.A0W();
            c3183kz.A0c(c3181kx);
        }
        if (lk.A0H() != null) {
            c3183kz.A0c(new C3181kx(lk.A0H().getUrl(), lk.A0H().getHeight(), lk.A0H().getWidth(), lk.A0b(), A03(2, 16, 93)));
        }
        String strA0e = lk.A0e();
        if (strA0e != null && !TextUtils.isEmpty(strA0e)) {
            c3183kz.A0b(new C3179kv(strA0e, lk.A0b(), A03(2, 16, 93), lk.A0D()));
        }
        LA laA0F = lk.A0F();
        String strA03 = A03(2, 16, 93);
        if (laA0F != null) {
            AbstractC2871fr.A00(lk.A0F(), c3183kz, strA03);
        }
        C2156Lk c2156Lk = new C2156Lk(this, c3578rV, interfaceC2813ev, c7d);
        String clientToken = lk.A0b();
        c3183kz.A0X(c2156Lk, new C3176ks(clientToken, strA03));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2805en
    public final String A7z() {
        if (this.A04 == null) {
            return null;
        }
        return this.A04.A7z();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2805en
    public final AdPlacementType A9N() {
        return AdPlacementType.MEDIUM_RECTANGLE;
    }

    @Override // com.facebook.ads.redexgen.X.MA
    public final void ABb(C7D c7d, InterfaceC3321nG interfaceC3321nG, EnumC3361nw enumC3361nw, InterfaceC2813ev interfaceC2813ev, JSONObject jSONObject, C3243lz c3243lz) {
        c7d.A0F().A4o();
        this.A05 = c7d;
        this.A01 = interfaceC2813ev;
        C3183kz c3183kz = new C3183kz(c7d);
        this.A00 = System.currentTimeMillis();
        LK lkA00 = AbstractC2822f4.A00(c7d, jSONObject, AbstractC3489q4.A02(jSONObject, A03(0, 2, 106)));
        this.A04 = lkA00;
        if (!AbstractC2802ej.A06(c7d, lkA00, interfaceC3321nG)) {
            InterfaceC3577rU adViewListener = new C2158Lm(this, c7d);
            this.A06 = adViewListener;
            C3578rV c3578rV = new C3578rV(c7d, interfaceC3321nG, c3183kz, new WeakReference(adViewListener), c3243lz.A04(), c3243lz.A07(), c3243lz.A08(), c3243lz.A09(), lkA00, this.A08);
            this.A07 = c3578rV;
            this.A03 = new LM(c7d, new C2157Ll(this, c7d, interfaceC2813ev), c3578rV.getViewabilityChecker(), interfaceC3321nG, lkA00);
            A05(c7d, lkA00, c3183kz, interfaceC2813ev, c3578rV);
            this.A02 = new C2814ew(c7d, this.A08, this, interfaceC2813ev);
            this.A02.A02();
            return;
        }
        c7d.A0F().A5b();
        interfaceC2813ev.AFQ(this, C3359nt.A00(AdErrorType.NO_FILL));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2805en
    public final boolean ALe() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2805en
    public final void onDestroy() {
        if (this.A05 != null) {
            this.A05.A0F().A4m(this.A07 != null);
        }
        if (this.A07 != null) {
            this.A07.A0I();
            this.A07 = null;
            this.A06 = null;
        }
        if (this.A02 != null) {
            C2814ew c2814ew = this.A02;
            String[] strArr = A0A;
            if (strArr[6].charAt(15) == strArr[1].charAt(15)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[7] = "OGRbKfmI1Ptis6ekzQBSmcc2x9iZCAib";
            strArr2[5] = "LImDBlZwACBxOLNi0gm0BXbkK8Ewnu8z";
            c2814ew.A03();
        }
    }
}
