package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class CY extends AbstractC3075jE implements InterfaceC3563rG {
    public C2847fT A00;
    public AbstractC2637c3 A01;
    public C2636c2 A02;
    public C2636c2 A03;
    public final int A04;
    public final SparseBooleanArray A05;
    public final C2055Hi A06;
    public final C17876i A07;

    public CY(C17876i c17876i, SparseBooleanArray sparseBooleanArray, C2636c2 c2636c2, int i, C2055Hi c2055Hi, C2847fT c2847fT) {
        super(c17876i);
        this.A06 = c2055Hi;
        this.A07 = c17876i;
        this.A05 = sparseBooleanArray;
        this.A02 = c2636c2;
        this.A04 = i;
        this.A00 = c2847fT;
    }

    private void A05(InterfaceC3321nG interfaceC3321nG, C3514qT c3514qT, String str, C3411ol c3411ol) {
        if (this.A05.get(c3411ol.A02())) {
            return;
        }
        if (this.A03 != null) {
            this.A03.A0V();
            this.A03 = null;
        }
        this.A01 = new C1918Ca(this, str, c3411ol, interfaceC3321nG, c3411ol.A04(), c3514qT);
        this.A03 = new C2636c2(this.A07, 10, new WeakReference(this.A01), this.A06);
        this.A03.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A07.setOnAssetsLoadedListener(new CZ(this, c3411ol));
    }

    public final void A0w(C3411ol c3411ol, InterfaceC3321nG interfaceC3321nG, C3183kz c3183kz, C3514qT c3514qT, String str, int i, int i2, int i3) {
        int leftMargin = c3411ol.A02();
        this.A07.setTag(-1593835536, Integer.valueOf(leftMargin));
        this.A07.setupNativeCtaExtension(c3411ol);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i, -2);
        int i4 = leftMargin == 0 ? i3 : i2;
        if (leftMargin < this.A04 - 1) {
            i3 = i2;
        }
        marginLayoutParams.setMargins(i4, 0, i3, 0);
        String strA08 = c3411ol.A03().A0I().A08();
        String strA09 = c3411ol.A03().A0I().A09();
        this.A07.setIsVideo(!TextUtils.isEmpty(strA09));
        if (this.A07.A1o()) {
            this.A07.setVideoPlaceholderUrl(strA08);
            this.A07.setVideoUrl(c3183kz.A0T(strA09));
        } else {
            this.A07.setImageUrl(strA08);
        }
        this.A07.setLayoutParams(marginLayoutParams);
        this.A07.setCTAInfo(c3411ol.A03().A0K(), c3411ol.A04());
        this.A07.A1p(c3411ol.A04());
        A05(interfaceC3321nG, c3514qT, str, c3411ol);
    }

    public final void A0x(C2636c2 c2636c2) {
        this.A02 = c2636c2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3563rG
    public final void AKX() {
        this.A07.A1j();
    }
}
