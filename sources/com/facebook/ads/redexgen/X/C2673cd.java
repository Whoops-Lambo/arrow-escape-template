package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.view.Surface;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C2673cd {
    public static byte[] A02;
    public static String[] A03 = {"WzijvlAd9RP1HJzMxCKzeYHnMs2QP54v", "kfrqpsiELz0FvZTPYg", "hAwPDz", "OryCsPOoCbEZ1Kjw18", "JoqBI6chV", "rfkFyJ13DXugB3RLj6H", "rQvj", "kthZXjW83"};
    public final AnonymousClass93 A00;
    public final C2284Qv A01 = new C2284Qv();

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 10);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-114, -104, -116, -114, -49, -51, -31, -33, -47, -114, -116, -90, -116, -114, -96, -86, -98, -96, -16, -29, -20, -30, -29, -16, -29, -16, -57, -20, -30, -29, -10, -96, -98, -72, -98, -96, -114, -23, 111, 114, -127, -68, 99, -82, -90, -76, -76, -94, -88, -90, 99, 97, 123, 97, 99, -119, 48, -126, -121, 126, 115, 48, 46, 72, 46, 48};
    }

    static {
        A02();
    }

    public C2673cd(C2055Hi c2055Hi) {
        WY trackSelectionFactory = new RT(this.A01);
        C18368h c18368h = new C18368h(trackSelectionFactory);
        InterfaceC2242Ot loadControl = new C2339Sy();
        this.A00 = OQ.A00(new C2330Sp(c2055Hi), c18368h, loadControl, this.A01);
    }

    public static String A01(UY uy) {
        boolean z = uy instanceof AnonymousClass96;
        String strA00 = A00(36, 2, 98);
        String strA01 = A00(0, 14, 98);
        if (z) {
            AnonymousClass96 anonymousClass96 = (AnonymousClass96) uy;
            return A00(55, 11, 4) + anonymousClass96.A03 + A00(14, 22, 116) + anonymousClass96.A02 + strA01 + anonymousClass96.getCause() + strA00;
        }
        return A00(41, 14, 55) + uy.getMessage() + strA01 + uy.getCause() + strA00;
    }

    public static boolean A03() {
        if (A03[0].charAt(3) == 'z') {
            throw new RuntimeException();
        }
        A03[6] = "p35x";
        return true;
    }

    public final int A04() {
        return this.A00.A0I();
    }

    public final int A05() {
        return this.A00.A00();
    }

    public final long A06() {
        return this.A00.A8F();
    }

    public final long A07() {
        return this.A00.A8T();
    }

    public final C2675cf A08() {
        VC vf = this.A00.A0K();
        if (vf == null) {
            return null;
        }
        return new C2675cf(vf.A0L, vf.A0A);
    }

    public final void A09() {
        this.A00.A0L();
    }

    public final void A0A() {
        this.A00.A02();
    }

    public final void A0B() {
        this.A00.A01();
    }

    public final void A0C(float f) {
        this.A00.A0M(f);
    }

    public final void A0D(long j) {
        this.A00.A04(j);
    }

    public final void A0E(Surface surface) {
        this.A00.A0N(surface);
    }

    public final void A0F(C2054Hh c2054Hh, Uri uri) {
        if (C3300mv.A32(c2054Hh, A03())) {
            C2659cP cacheManager = C2659cP.A06(c2054Hh);
            NN cachedDataSourceFactory = cacheManager.A0H(c2054Hh);
            this.A00.A0Q(new C18388o(cachedDataSourceFactory).A04(uri));
            return;
        }
        InterfaceC2373Uj mediaSource = new C18388o(new TD(c2054Hh, N1.A0j(c2054Hh, A00(38, 3, 4)), this.A01)).A04(uri);
        this.A00.A0Q(mediaSource);
    }

    public final void A0G(InterfaceC2676cg interfaceC2676cg) {
        this.A00.A0O(new C1870Ae(this, interfaceC2676cg));
    }

    public final void A0H(final InterfaceC2674ce interfaceC2674ce) {
        this.A00.A0P(new InterfaceC2318Sd() { // from class: com.facebook.ads.redexgen.X.4w
            @Override // com.facebook.ads.redexgen.X.NA
            public final void AHk(int i, int i2, int i3, float f) {
                interfaceC2674ce.AHk(i, i2, i3, f);
            }
        });
    }

    public final void A0I(boolean z) {
        this.A00.A0S(z);
    }

    public final boolean A0J() {
        return this.A00.A0T();
    }

    public final boolean A0K() {
        return this.A00.A0J() != null;
    }
}
