package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ps, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C3477ps {
    public static String[] A05 = {"W6VRHda5gtLUaPITsfC2cAClSG72uAjU", "InoKloHDgq0CcxOKOjQiUbO9bflNgMc6", "vgOlHPB", "HwmPNB85GvgAoMoeYjamrZVzdR67lGy5", "97hqk2lgYZuMaDxZXyhsH", "HXsRqxuQhTkLhvYebPxTHkiqTIKIJvDr", "Ck564rSLCSvbweXx55nzkdwgcjUocV6X", ""};
    public boolean A00 = false;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final LA A02;
    public final C2055Hi A03;
    public final InterfaceC3475pq A04;

    public C3477ps(C2055Hi c2055Hi, LA la, InterfaceC3475pq interfaceC3475pq) {
        this.A03 = c2055Hi;
        this.A04 = interfaceC3475pq;
        this.A02 = la;
    }

    public static C3477ps A00(C2055Hi c2055Hi, LA la, InterfaceC3475pq interfaceC3475pq) {
        Object objA0I = c2055Hi.A0I();
        if (objA0I == null) {
            objA0I = new C3477ps(c2055Hi, la, interfaceC3475pq);
            c2055Hi.A0P(objA0I);
        }
        C3477ps c3477ps = (C3477ps) objA0I;
        if (A05[7].length() == 7) {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[1] = "ORnMxFNfeMb5MzGsY9WSDmc8ng0pMJPu";
        strArr[4] = "9RL1elpbdMmSftIqEAaOH";
        return c3477ps;
    }

    public static boolean A01(C2055Hi c2055Hi) {
        if (C3300mv.A1g(c2055Hi)) {
            boolean zA0J = C3444pK.A0J(c2055Hi);
            if (A05[7].length() == 7) {
                throw new RuntimeException();
            }
            A05[5] = "ksJFyNHjKkO0Jin5EGXZGwAyRPDGXujW";
            if (zA0J) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    public final C3476pr A02(LA la) {
        boolean z;
        if (C3300mv.A1m(this.A03)) {
            z = la.A2O() && A01(this.A03);
            return new C3476pr(z, z);
        }
        boolean zA2O = la.A2O();
        if (zA2O) {
            boolean shouldCreativeBeClickable = A01(this.A03);
            z = shouldCreativeBeClickable;
        }
        return new C3476pr(zA2O, z);
    }

    public final void A03() {
        this.A00 = false;
        this.A01.removeCallbacksAndMessages(null);
    }
}
