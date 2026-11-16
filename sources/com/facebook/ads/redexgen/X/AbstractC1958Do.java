package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.widget.RelativeLayout;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Do, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public abstract class AbstractC1958Do extends RelativeLayout implements InterfaceC3475pq {
    public static byte[] A0G;
    public static String[] A0H = {"GLI61c", "Gbf2n", "7bd7TV7pMbRIF38Nborxv5epDmSsEj2C", "cQLaEEMMEiimfofb8zDJfbgqVtv3fmi7", "aVi4o9E6lLTFPv8kc2NfhQTkHmvWHalD", "NCa69VsR", "Lfh54ChHEBOQerOMfcW", "6zIvkyWJ8mnF"};
    public static final int A0I;
    public String A00;
    public boolean A01;
    public boolean A02;
    public final AbstractC2637c3 A03;
    public final boolean A04;
    public final boolean A05;
    public final int A06;
    public final int A07;
    public final LA A08;
    public final C2055Hi A09;
    public final InterfaceC3321nG A0A;
    public final C3477ps A0B;
    public final C3514qT A0C;
    public final InterfaceC3556r9 A0D;
    public final InterfaceC3612s3 A0E;
    public final C2636c2 A0F;

    public static String A1W(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 111);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A1X() {
        byte[] bArr = {124, 51, 58, 124, 85, 112, 52};
        String[] strArr = A0H;
        if (strArr[3].charAt(23) == strArr[2].charAt(23)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0H;
        strArr2[3] = "h3qn7WLUBJgp6gvgJ4ymnM7ynHZRVVWd";
        strArr2[2] = "JzPss5ZdN0xJNYiAE3LRHVWltNu3eEAA";
        A0G = bArr;
    }

    public abstract EnumC2795ec A1a(String str);

    public abstract void A1g();

    public abstract void A1h();

    public abstract void A1j(boolean z);

    public abstract void A1k(boolean z);

    public abstract boolean A1o();

    public abstract boolean A1p();

    public abstract boolean A1q();

    public abstract C3694tN getFullScreenAdStyle();

    static {
        A1X();
        A0I = (int) (AbstractC3482px.A02 * 80.0f);
    }

    public AbstractC1958Do(C2055Hi c2055Hi, InterfaceC3612s3 interfaceC3612s3, InterfaceC3321nG interfaceC3321nG, LA la, int i, boolean z, boolean z2, InterfaceC3556r9 interfaceC3556r9, int i2) {
        super(c2055Hi);
        this.A0C = new C3514qT();
        this.A02 = false;
        this.A01 = true;
        this.A00 = A1W(0, 0, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
        this.A03 = new C1959Dp(this);
        this.A07 = i;
        this.A06 = i2;
        this.A09 = c2055Hi;
        this.A05 = z;
        this.A04 = z2;
        this.A0D = interfaceC3556r9;
        this.A0E = interfaceC3612s3;
        this.A08 = la;
        this.A0A = interfaceC3321nG;
        this.A0F = new C2636c2(this, 1, new WeakReference(this.A03), c2055Hi);
        this.A0F.A0W(la.A1J());
        this.A0F.A0X(la.A1K());
        this.A0B = C3477ps.A00(this.A09, this.A08, this);
        if (this.A08.A2M()) {
            this.A00 = A1V(this.A07, i2);
        }
    }

    public static String A1V(int i, int i2) {
        return A1W(4, 3, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) + (i + 1) + A1W(0, 4, 51) + i2;
    }

    public void A1b() {
        this.A0B.A03();
    }

    public void A1c() {
    }

    public void A1d() {
    }

    public void A1e() {
    }

    public final void A1f() {
        if (!this.A02) {
            this.A0F.A0U();
            this.A02 = true;
        }
    }

    public void A1i(boolean z) {
    }

    public boolean A1l() {
        return false;
    }

    public boolean A1m() {
        return false;
    }

    public boolean A1n() {
        return false;
    }

    public boolean A1r(int i, int i2, Intent intent) {
        return false;
    }

    public LA getAdDataBundle() {
        return this.A08;
    }

    public C2636c2 getAdViewabilityChecker() {
        return this.A0F;
    }

    public int getCurrentPlayCount() {
        return 0;
    }

    public C3514qT getTouchDataRecorder() {
        return this.A0C;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
}
