package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C2118Jw implements InterfaceC2887g7 {
    public static byte[] A09;
    public static String[] A0A = {"gd6Snq8TqC5qGLc", "5Vo8FrFWo5Fl4YG5W1yHT6ZfMsOXSACT", "HYpFHiAeuVvng5d4eXQK0awgijL0SEef", "zgL9OdntC9Jt", "c4pha1QVXZPHNWU", "oPtBq8V8zceab2K03f0YSkruz1vfGvQp", "tGZii7gSURWSZ1CI0FSKqsks", "YmWpveYB3lCv"};
    public static final String A0B;
    public long A01;
    public RewardedVideoAd A02;
    public AbstractC2831fD A03;
    public C18057a A04;
    public final C2055Hi A06;
    public final S2SRewardedVideoAdExtendedListener A07;
    public final C2100Jc A08;
    public boolean A05 = false;
    public long A00 = -1;

    public static String A09(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 93);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A09 = new byte[]{120, 87, 25, 88, 93, 25, 85, 86, 88, 93, 25, 80, 74, 25, 88, 85, 75, 92, 88, 93, 64, 25, 80, 87, 25, 73, 75, 86, 94, 75, 92, 74, 74, 23, 25, 96, 86, 76, 25, 74, 81, 86, 76, 85, 93, 25, 78, 88, 80, 77, 25, 95, 86, 75, 25, 88, 93, 117, 86, 88, 93, 92, 93, 17, 16, 25, 77, 86, 25, 91, 92, 25, 90, 88, 85, 85, 92, 93, 47, 24, 24, 5, 24, 74, 6, 5, 11, 14, 3, 4, 13, 74, 24, 15, 29, 11, 24, 14, 15, 14, 74, 28, 3, 14, 15, 5, 74, 11, 14, 92, 77, 84};
        if (A0A[6].length() != 24) {
            throw new RuntimeException();
        }
        String[] strArr = A0A;
        strArr[4] = "OGOVhUIoezz1oHK";
        strArr[0] = "xl2MkcRK0CWEWUY";
    }

    static {
        A0A();
        A0B = C2118Jw.class.getSimpleName();
    }

    public C2118Jw(C2100Jc c2100Jc, InterfaceC2906gQ interfaceC2906gQ, String str) {
        this.A08 = c2100Jc;
        this.A06 = c2100Jc.A0B;
        this.A07 = new JZ(str, interfaceC2906gQ, this, c2100Jc);
    }

    private void A0C(String str, AdExperienceType adExperienceType, boolean z) {
        String strA02;
        if (!this.A05 && this.A04 != null) {
            Log.w(A0B, A09(0, 78, 100));
        }
        A0D(false);
        this.A05 = false;
        C2878fy c2878fy = new C2878fy(this.A08.A0D, EnumC3362nx.A06, AdPlacementType.REWARDED_VIDEO, EnumC3361nw.A07, 1, this.A08.A0C);
        c2878fy.A08(z);
        if (C3300mv.A2j(this.A06) && (strA02 = C3449pQ.A02(this.A06, this.A08.A06)) != null) {
            C2100Jc c2100Jc = this.A08;
            String[] strArr = A0A;
            String extraHints = strArr[2];
            if (extraHints.charAt(28) != strArr[1].charAt(28)) {
                throw new RuntimeException();
            }
            A0A[6] = "NRWBzlFLQPOGySbiiYXSLDN6";
            c2100Jc.A06 = strA02;
        }
        c2878fy.A06(this.A08.A06);
        c2878fy.A07(this.A08.A07);
        this.A04 = new C18057a(this.A08.A0B, c2878fy);
        this.A04.A0R(new C2120Jy(this));
        this.A04.A0W(str, adExperienceType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(boolean z) {
        if (this.A04 != null) {
            this.A04.A0R(new C2119Jx(this));
            this.A04.A0X(z);
            this.A04.A0J();
            this.A04 = null;
        }
    }

    public final long A0F() {
        if (this.A04 != null) {
            return this.A04.A0F();
        }
        return -1L;
    }

    public final C2100Jc A0G() {
        return this.A08;
    }

    public final C2055Hi A0H() {
        return this.A06;
    }

    public final void A0I(RewardData rewardData) {
        this.A08.A03 = rewardData;
        if (this.A05 && this.A04 != null) {
            this.A04.A0Z(rewardData);
        }
    }

    public final void A0J(String str, AdExperienceType adExperienceType, boolean z) {
        this.A00 = System.currentTimeMillis();
        try {
            A0C(str, adExperienceType, z);
        } catch (Exception e) {
            Log.e(A0B, A09(78, 31, 55), e);
            this.A08.A0B.A08().ABz(A09(109, 3, 96), AbstractC3223lf.A0b, new C3224lg(e));
            AdError adErrorInternalError = AdError.internalError(2004);
            this.A08.A0B.A0F().A3j(C3513qS.A01(this.A00), adErrorInternalError.getErrorCode(), adErrorInternalError.getErrorMessage());
            this.A07.onError(this.A08.A7K(), adErrorInternalError);
        }
    }

    public final boolean A0K() {
        return this.A04 == null || this.A04.A0Y();
    }

    public final boolean A0L() {
        return this.A05;
    }

    public final boolean A0M(int i, long j) {
        if (!this.A05) {
            this.A07.onError(this.A08.A7K(), AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
            return false;
        }
        if (this.A04 != null) {
            this.A01 = System.currentTimeMillis();
            this.A04.A08.A02(i);
            this.A04.A08.A03(j);
            this.A04.A0L();
            this.A05 = false;
            return true;
        }
        this.A05 = false;
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2887g7
    public final void destroy() {
        A0D(true);
    }
}
