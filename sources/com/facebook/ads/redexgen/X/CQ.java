package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class CQ extends AbstractC3075jE implements InterfaceC3563rG {
    public static String[] A0B = {"av2tITPhYKbVn20ukUfJR25ELbcgjHbj", "MLeLe181lhP7dC21QqjxU1VDKV9lNkzJ", "XUmY4VBJ2tlJWKlPJ7YkBdCsKtcC", "bK6oHsXedskfaWsjnVeS6YyvP0sRA20b", "BhCeFQN4dHt9z3MLE3p7bnIzhrf86Cw8", "mLW9T0fP2Q5Hob07hRXsv0QUH1fN4", "pNzPXZ5fcby2PvmlRsfUzns43oHDF5Mi", "3YktW7BrcDIc4Xw2f2zdWv5xFETbHIAE"};
    public C2847fT A00;
    public AbstractC2637c3 A01;
    public C2636c2 A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final SparseBooleanArray A07;
    public final C2055Hi A08;
    public final C6V A09;
    public final C2636c2 A0A;

    public CQ(C6V c6v, SparseBooleanArray sparseBooleanArray, C2636c2 c2636c2, int i, int i2, int i3, int i4, C2055Hi c2055Hi, C2847fT c2847fT) {
        super(c6v);
        this.A08 = c2055Hi;
        this.A09 = c6v;
        this.A07 = sparseBooleanArray;
        this.A0A = c2636c2;
        this.A03 = i;
        this.A04 = i2;
        this.A05 = i3;
        this.A06 = i4;
        this.A00 = c2847fT;
    }

    private void A05(InterfaceC3321nG interfaceC3321nG, C3514qT c3514qT, String str, C3411ol c3411ol) {
        if (this.A07.get(c3411ol.A02())) {
            return;
        }
        if (this.A02 != null) {
            this.A02.A0V();
            if (A0B[4].charAt(16) != 'E') {
                throw new RuntimeException();
            }
            A0B[4] = "iteeE4SnfkkyQnEAEqI0za4snrHpWaXy";
            this.A02 = null;
        }
        this.A01 = new CS(this, str, c3411ol, interfaceC3321nG, c3411ol.A04(), c3514qT);
        this.A02 = new C2636c2(this.A09, 10, new WeakReference(this.A01), this.A08);
        this.A02.A0Y(false);
        this.A02.A0W(100);
        this.A02.A0X(100);
        this.A09.setOnAssetsLoadedListener(new CR(this, c3411ol));
    }

    public final ViewOnClickListenerC1981El A0w() {
        return this.A09.getCtaButton();
    }

    public final void A0x(C3411ol c3411ol, InterfaceC3321nG interfaceC3321nG, C3183kz c3183kz, C3514qT c3514qT, String str) {
        int iA02 = c3411ol.A02();
        this.A09.setTag(-1593835536, Integer.valueOf(iA02));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.A03, -2);
        int rightMargin = iA02 == 0 ? this.A04 : this.A05;
        int position = this.A06;
        marginLayoutParams.setMargins(rightMargin, 0, iA02 >= position + (-1) ? this.A04 : this.A05, 0);
        String imageUrl = c3411ol.A03().A0I().A08();
        String strA09 = c3411ol.A03().A0I().A09();
        this.A09.setIsVideo(!TextUtils.isEmpty(strA09));
        if (this.A09.A1o()) {
            if (imageUrl != null) {
                this.A09.setVideoPlaceholderUrl(imageUrl);
            }
            if (strA09 != null) {
                this.A09.setVideoUrl(c3183kz.A0T(strA09));
            }
        } else if (imageUrl != null) {
            this.A09.setImageUrl(imageUrl);
        }
        this.A09.setLayoutParams(marginLayoutParams);
        this.A09.setAdTitleAndDescription(c3411ol.A03().A0J().A0H(), c3411ol.A03().A0J().A04());
        this.A09.setCTAInfo(c3411ol.A03().A0K(), c3411ol.A04());
        this.A09.A1r(c3411ol.A04());
        A05(interfaceC3321nG, c3514qT, str, c3411ol);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3563rG
    public final void AKX() {
        this.A09.A1j();
    }
}
