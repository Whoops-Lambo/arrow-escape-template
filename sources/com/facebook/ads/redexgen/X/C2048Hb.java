package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C2048Hb implements InterfaceC3209lR {
    public static byte[] A04;
    public static String[] A05 = {"D3PJ2GNcgNGI4MtKfCaHjqEOfdHoPcVQ", "EJL0aGmI3i0Imoz4UWgpTxwTxGm9WRxT", "tfWCUNw0WGkvc5ldnWfg2BDK3aY0ceq2", "VYnzwe", "FWw4Dif8pFGferaZg4Cc6MDYh6zRU5", "BYQArfMrHiqwTG3fAjpcYjBOCFZN2nO4", "ZJiZak5asVL", "k4pPkd4ODWsyAa7ylPFb6IMORyuDH4"};
    public Context A00;
    public final InterfaceC3208lQ A02;
    public final AtomicBoolean A03 = new AtomicBoolean(false);
    public C3206lO A01 = A00();

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{107, 127, 96, 112, 124, 106, 123, 123, 102, 97, 104, 124, 112, 100, 106, 118};
    }

    static {
        A03();
    }

    public C2048Hb(Context context, InterfaceC3208lQ interfaceC3208lQ) {
        this.A00 = context;
        this.A02 = interfaceC3208lQ;
    }

    private C3206lO A00() {
        return C3206lO.A00(AbstractC3394oU.A00(this.A00).getString(A01(0, 16, 81), null));
    }

    private void A02() {
        this.A02.ADM(new C2049Hc(this));
    }

    public final void A04(String[] strArr, Integer num, Integer num2) {
        C3206lO c3206lO = new C3206lO(strArr, num, num2);
        C3206lO newSettings = this.A01;
        if (c3206lO.equals(newSettings)) {
            return;
        }
        this.A01 = c3206lO;
        this.A03.set(true);
        SharedPreferences sharedPreferencesA00 = AbstractC3394oU.A00(this.A00);
        if (A05[2].charAt(16) != 'n') {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[7] = "txsFPtaRD11LyA3dzoyK5U0Vbdrctz";
        strArr2[4] = "NLpqiEYsaOJ6LGl2A1qehjxsg53G43";
        SharedPreferences.Editor editorEdit = sharedPreferencesA00.edit();
        C3206lO newSettings2 = this.A01;
        editorEdit.putString(A01(0, 16, 81), newSettings2.A07()).apply();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3209lR
    public final C3206lO A8L() {
        A02();
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3209lR
    public final boolean ABP() {
        A02();
        if (this.A01 == null) {
            return false;
        }
        Set<String> setA0Y = C3300mv.A0Y(this.A00);
        String identifier = this.A01.A07();
        Iterator<String> it = setA0Y.iterator();
        while (it.hasNext()) {
            if (identifier.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3209lR
    public final boolean ALE() {
        A02();
        return this.A03.getAndSet(false);
    }
}
