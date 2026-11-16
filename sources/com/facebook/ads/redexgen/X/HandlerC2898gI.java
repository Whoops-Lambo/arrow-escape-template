package com.facebook.ads.redexgen.X;

import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class HandlerC2898gI extends Handler {
    public static byte[] A0D;
    public static String[] A0E = {"7XGwSkVk3T00tnH9cVPKelrEGcawiCjw", "CQOuonMXQSYezZedNwAjlRkGSLi3aOjj", "mesEj11OvP9", "VZOpRMX1bgsh5uSD6zrhQF9CMqqU", "qOEuTvvHdf1ojQl77Cm2nWjluxHjpHjj", "MJ8oyn1cMPaioU5SW8VDhXvuoMQhG6hY", "cRCjMWliQ8bJ7V8UELoizUhtI", "6BrNpk2twP0gV2txjXjpJVsF16rKzLtO"};
    public int A00;
    public int A01;
    public Messenger A02;
    public InterfaceC3493q8 A03;
    public boolean A04;
    public boolean A05;
    public final ServiceConnection A06;
    public final Handler A07;
    public final Messenger A08;
    public final InterfaceC2737df A09;
    public final C2054Hh A0A;
    public final AbstractRunnableC3416oq A0B;
    public final AbstractRunnableC3416oq A0C;

    public static String A0A(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A0D = new byte[]{-121, -102, -104, -102, -98, -85, -102, -103, 85, -99, -106, -93, -103, -88, -99, -106, -96, -102, 85, -101, -106, -98, -95, -102, -103, 97, 85, -104, -92, -103, -102, 111, 85, -46, -45, -47, -34, -49, -64, -62, -54, -64, -58, -60, -34, -64, -53, -47, -60, -64, -61, -40, -34, -60, -41, -56, -46, -45, -46, -34, -54, -60, -40, -116, -115, -117, -104, -119, 122, 124, -124, 122, -128, 126, -104, -126, -121, -116, -115, 122, -123, -123, 126, 125, -104, -124, 126, -110, -30, -29, -31, -18, -33, -48, -46, -38, -48, -42, -44, -18, -38, -44, -24};
        if (A0E[7].length() != 32) {
            throw new RuntimeException();
        }
        A0E[2] = "iPGKfbxDLhp";
    }

    static {
        A0B();
    }

    public HandlerC2898gI(C2054Hh c2054Hh) {
        super(Looper.getMainLooper());
        this.A07 = new Handler(Looper.getMainLooper());
        this.A0B = new C2104Jg(this);
        this.A06 = new ServiceConnectionC2897gH(this);
        this.A0A = c2054Hh;
        this.A08 = new Messenger(this);
        InterfaceC2741dj funnelModule = c2054Hh.A00(c2054Hh);
        if (funnelModule != null) {
            this.A09 = funnelModule.ADC();
        } else {
            this.A09 = new C2194Mx();
        }
        this.A0C = new C2103Jf(this);
    }

    public static /* synthetic */ int A01(HandlerC2898gI handlerC2898gI) {
        int i = handlerC2898gI.A00;
        handlerC2898gI.A00 = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(Messenger messenger) {
        Message messageObtain = Message.obtain((Handler) null, 1);
        messageObtain.replyTo = this.A08;
        messageObtain.setData(AbstractC2907gR.A00(this.A0A));
        try {
            messenger.send(messageObtain);
        } catch (RemoteException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F(boolean z) {
        this.A04 = z;
        C2894gE c2894gEA01 = C2896gG.A01(this.A0A, z, this.A06);
        this.A09.AJb(c2894gEA01.A00, c2894gEA01.A01, this.A00);
        this.A05 = c2894gEA01.A00 == 0;
        if (this.A05) {
            this.A09.AJY(this.A00);
            if (this.A02 == null) {
                this.A07.removeCallbacks(this.A0C);
                this.A07.postDelayed(this.A0C, AbstractC3303my.A01(this.A0A));
                return;
            }
            return;
        }
        this.A09.AJa(this.A00);
        boolean zA0B = AbstractC3303my.A0B(this.A0A);
        String[] strArr = A0E;
        if (strArr[3].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[0] = "FxD7YzO4CyP1D0jV5Ld9721uIeTHQPLi";
        strArr2[4] = "onRm7tgfjCImirzUHi1hG1EU2Jl8lJWl";
        if (A0I(zA0B)) {
            return;
        }
        AbstractC3250m7.A05(this.A0A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0I(boolean z) {
        if (!z || this.A02 != null || this.A01 >= AbstractC3303my.A02(this.A0A)) {
            return false;
        }
        this.A01++;
        this.A07.postDelayed(this.A0B, AbstractC3303my.A03(this.A0A));
        return true;
    }

    public final void A0J() {
        if (this.A05) {
            this.A05 = false;
            this.A0A.unbindService(this.A06);
            this.A02 = null;
        }
    }

    public final void A0K(String str, InterfaceC3493q8 interfaceC3493q8, int i) {
        if (this.A05) {
            this.A09.AJe(i);
            this.A03 = interfaceC3493q8;
            Message messageObtain = Message.obtain((Handler) null, i);
            messageObtain.replyTo = this.A08;
            if (str != null) {
                Bundle bundle = new Bundle();
                bundle.putString(A0A(88, 15, 126), str);
                messageObtain.setData(bundle);
            }
            try {
                if (this.A02 != null) {
                    this.A02.send(messageObtain);
                    return;
                }
                return;
            } catch (RemoteException e) {
                this.A09.AJf(e.toString());
                return;
            }
        }
        InterfaceC2737df interfaceC2737df = this.A09;
        if (A0E[7].length() != 32) {
            throw new RuntimeException();
        }
        A0E[2] = "GMBTsYwMPeX";
        interfaceC2737df.AJg();
    }

    public final void A0L(boolean z) {
        this.A07.removeCallbacks(this.A0B);
        this.A07.removeCallbacks(this.A0C);
        this.A01 = 0;
        this.A00 = 0;
        A0F(z);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        if (AbstractC3408oi.A02(this)) {
            return;
        }
        try {
            if (message.what == 2) {
                C2896gG.A04(this.A0A, message);
                this.A09.AJX(this.A00);
                return;
            }
            if (message.what == 20 || message.what == 40 || message.what == 30) {
                this.A09.AJc(message.what, this.A00);
                if (message.what == 20) {
                    AbstractC3303my.A09(this.A0A);
                }
                String str = A0A(0, 33, 36) + message.what;
                AbstractC3250m7.A05(this.A0A);
                return;
            }
            if (message.what == 4) {
                this.A09.AJd();
                Bundle data = message.getData();
                if (this.A03 != null) {
                    boolean z = data.getBoolean(A0A(33, 30, 110), false);
                    String strA0A = A0A(88, 15, 126);
                    if (z) {
                        this.A03.AGA(data.getString(strA0A));
                    } else if (data.getBoolean(A0A(63, 25, 40), false)) {
                        this.A03.AGB(data.getString(strA0A));
                    }
                }
            }
        } catch (Throwable th) {
            AbstractC3408oi.A00(th, this);
        }
    }
}
