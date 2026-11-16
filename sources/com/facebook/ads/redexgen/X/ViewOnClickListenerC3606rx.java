package com.facebook.ads.redexgen.X;

import android.view.View;
import androidx.media3.common.PlaybackException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.rx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class ViewOnClickListenerC3606rx implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ FI A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) + PlaybackException.ERROR_CODE_SETUP_REQUIRED);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-27, -38, -25, -37, -28, -25, -30, -72, -23, -42, -72, -31, -34, -40, -32};
    }

    public ViewOnClickListenerC3606rx(FI fi) {
        this.A00 = fi;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3408oi.A02(this)) {
            return;
        }
        try {
            this.A00.A06.A5C(A00(0, 15, 9));
        } catch (Throwable th) {
            AbstractC3408oi.A00(th, this);
        }
    }
}
