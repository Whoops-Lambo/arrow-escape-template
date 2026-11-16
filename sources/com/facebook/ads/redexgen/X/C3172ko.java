package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ko, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C3172ko {
    public static boolean A04;
    public static byte[] A05;
    public static final String A06;
    public final C3173kp A00;
    public final C3174kq A01;
    public final C2054Hh A02;
    public final InterfaceC2518a7 A03;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{46, 56, 19, 41, 52, 56, 62, 45, 63};
    }

    static {
        A01();
        A06 = C3172ko.class.getSimpleName();
    }

    public C3172ko(C2054Hh c2054Hh, AH ah, C3173kp c3173kp, C3174kq c3174kq) {
        this.A02 = c2054Hh;
        this.A03 = ah.A63(EnumC2504Zt.A06);
        this.A00 = c3173kp;
        this.A01 = c3174kq;
        this.A03.A4R(new C2063Hq(this));
        A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A02() {
        if (AbstractC3408oi.A02(this)) {
            return;
        }
        try {
            if (!this.A03.ABM()) {
                this.A02.A05().AB6();
                return;
            }
            String btExtras = this.A03.A8J().optString(A00(0, 9, 62));
            if (!TextUtils.isEmpty(btExtras)) {
                this.A00.A04(this.A02, btExtras);
                if (!A04 || C3300mv.A0h(this.A02)) {
                    A04 = true;
                    this.A01.A07();
                }
            }
        } catch (Throwable th) {
            AbstractC3408oi.A00(th, this);
        }
    }
}
