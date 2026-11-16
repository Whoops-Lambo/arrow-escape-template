package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C2059Hm implements InterfaceC2730dY {
    public static byte[] A01;
    public static String[] A02 = {"aROWSCJTZ7USEA9NykDAgKPqU9Hz2yMC", "Zqbs868sBagHNlYScp55lXssWh10RIQa", "mbYc5GC1jhCg", "AuzesFDqytnerPl8cSxQvwaSTNgSXgGN", "J34OJh55Zf7CVcps1JZJSO0d6JwePACZ", "sgVYwbqUus7", "7dh0o4NaZc6u8WRc1KGfxvMUmypAWeMQ", "ZE0swazaf"};
    public final /* synthetic */ C2054Hh A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = bArrCopyOfRange[i4];
            if (A02[3].charAt(2) == 'x') {
                throw new RuntimeException();
            }
            A02[0] = "5v5qZEzKm5dZGLy7lyhruzHwv9U4ulwR";
            bArrCopyOfRange[i4] = (byte) ((b ^ i3) ^ 108);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{5, 1, 13, 11, 9};
    }

    static {
        A01();
    }

    public C2059Hm(C2054Hh c2054Hh) {
        this.A00 = c2054Hh;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2730dY
    public final void ABp(Throwable th) {
        this.A00.A08().ABz(A00(0, 5, 0), AbstractC3223lf.A1e, new C3224lg(th));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2730dY
    public final void AC6(Throwable th) {
        this.A00.A08().ABz(A00(0, 5, 0), AbstractC3223lf.A1g, new C3224lg(th));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2730dY
    public final void AIh(String str, int i, String str2, Long l, Long l2, C2715dJ c2715dJ) {
        C3186l2.A05(this.A00, c2715dJ.A06, c2715dJ.A08, c2715dJ.A09, c2715dJ.A07, c2715dJ.A03, i, str2, l, l2, null);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2730dY
    public final void AIi(String str, boolean z, C2715dJ c2715dJ) {
        C3186l2.A04(this.A00, new C3185l1(c2715dJ.A06, c2715dJ.A08, c2715dJ.A07, c2715dJ.A03, str), z);
    }
}
