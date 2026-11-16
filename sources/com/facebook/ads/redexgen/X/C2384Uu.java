package com.facebook.ads.redexgen.X;

import android.os.Handler;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C2384Uu {
    public static String[] A04 = {"0vX", "6NY9hrINV0Z5FlYuF4FI3UvdvbDoQp5r", "EDbrjiPnPeOJCpHUSCdz4kDKdyaM7EAX", "SRvChzoAelcCw1", "1EOpazjw38zi", "4Y8ngmqa57FSPe", "1cMpp1AjuI7QRMLTBGOGdi01Kt1oNo6X", "RzlHtD1JWpQymBpZHQSfPfdlRM"};
    public final int A00;
    public final C2299Rk A01;
    public final long A02;
    public final CopyOnWriteArrayList<C2383Ut> A03;

    public C2384Uu() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public C2384Uu(CopyOnWriteArrayList<C2383Ut> copyOnWriteArrayList, int i, C2299Rk c2299Rk, long j) {
        this.A03 = copyOnWriteArrayList;
        this.A00 = i;
        this.A01 = c2299Rk;
        this.A02 = j;
    }

    private long A00(long j) {
        long jA0P = N1.A0P(j);
        if (jA0P == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long mediaTimeMs = this.A02;
        return mediaTimeMs + jA0P;
    }

    @MetaExoPlayerCustomization
    private final void A01(final Uc uc, final C2368Ue c2368Ue, final int i) {
        for (C2383Ut c2383Ut : this.A03) {
            final InterfaceC2385Uv interfaceC2385Uv = c2383Ut.A01;
            N1.A1B(c2383Ut.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.Uq
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final C2384Uu A02(int i, C2299Rk c2299Rk, long j) {
        return new C2384Uu(this.A03, i, c2299Rk, j);
    }

    public final void A03(int i, VC vc, int i2, Object obj, long j) {
        A0C(new C2368Ue(1, i, vc, i2, obj, A00(j), -9223372036854775807L));
    }

    public final void A04(Handler handler, InterfaceC2385Uv interfaceC2385Uv) {
        AbstractC2159Ln.A01(handler);
        AbstractC2159Ln.A01(interfaceC2385Uv);
        this.A03.add(new C2383Ut(handler, interfaceC2385Uv));
    }

    public final void A05(Uc uc, int i, int i2, VC vc, int i3, Object obj, long j, long j2) {
        A09(uc, new C2368Ue(i, i2, vc, i3, obj, A00(j), A00(j2)));
    }

    @MetaExoPlayerCustomization
    public final void A06(Uc uc, int i, int i2, VC vc, int i3, Object obj, long j, long j2, int i4) {
        A01(uc, new C2368Ue(i, i2, vc, i3, obj, A00(j), A00(j2)), i4);
    }

    public final void A07(Uc uc, int i, int i2, VC vc, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        A0A(uc, new C2368Ue(i, i2, vc, i3, obj, A00(j), A00(j2)), iOException, z);
    }

    public final void A08(@MetaExoPlayerCustomization Uc uc, @MetaExoPlayerCustomization int i, int i2, VC vc, int i3, Object obj, long j, long j2, Object obj2, Object obj3) {
        A0B(uc, new C2368Ue(i, i2, vc, i3, obj, A00(j), A00(j2)), obj2, obj3);
    }

    public final void A09(final Uc uc, final C2368Ue c2368Ue) {
        for (C2383Ut c2383Ut : this.A03) {
            final InterfaceC2385Uv listener = c2383Ut.A01;
            N1.A1B(c2383Ut.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.Ur
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0E(listener, uc, c2368Ue);
                }
            });
        }
    }

    public final void A0A(final Uc uc, final C2368Ue c2368Ue, final IOException iOException, final boolean z) {
        Iterator<C2383Ut> it = this.A03.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A04[7].length() == 31) {
                throw new RuntimeException();
            }
            A04[2] = "oz6jN72mrVEJ84jwVsa80JdmUq2TtNhX";
            if (zHasNext) {
                C2383Ut next = it.next();
                final InterfaceC2385Uv interfaceC2385Uv = next.A01;
                N1.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.Um
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.A02.A0F(interfaceC2385Uv, uc, c2368Ue, iOException, z);
                    }
                });
            } else {
                return;
            }
        }
    }

    public final void A0B(@MetaExoPlayerCustomization final Uc uc, @MetaExoPlayerCustomization final C2368Ue c2368Ue, final Object obj, final Object obj2) {
        for (C2383Ut c2383Ut : this.A03) {
            final InterfaceC2385Uv interfaceC2385Uv = c2383Ut.A01;
            N1.A1B(c2383Ut.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.Un
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0G(interfaceC2385Uv, uc, c2368Ue, obj, obj2);
                }
            });
        }
    }

    public final void A0C(final C2368Ue c2368Ue) {
        Iterator<C2383Ut> it = this.A03.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A04[4].length() == 10) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[5] = "BPCliZ27Ak36vG";
            strArr[3] = "8XLyG4rB5BmC3z";
            if (zHasNext) {
                C2383Ut next = it.next();
                final InterfaceC2385Uv listener = next.A01;
                N1.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.Uo
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.A01.A0H(listener, c2368Ue);
                    }
                });
            } else {
                return;
            }
        }
    }

    public final void A0D(InterfaceC2385Uv interfaceC2385Uv) {
        for (C2383Ut listenerAndHandler : this.A03) {
            if (listenerAndHandler.A01 == interfaceC2385Uv) {
                this.A03.remove(listenerAndHandler);
            }
        }
    }

    public final /* synthetic */ void A0E(InterfaceC2385Uv interfaceC2385Uv, Uc uc, C2368Ue c2368Ue) {
        interfaceC2385Uv.AFe(this.A00, this.A01, uc, c2368Ue);
    }

    public final /* synthetic */ void A0F(InterfaceC2385Uv interfaceC2385Uv, Uc uc, C2368Ue c2368Ue, IOException iOException, boolean z) {
        interfaceC2385Uv.AFj(this.A00, this.A01, uc, c2368Ue, iOException, z);
    }

    public final /* synthetic */ void A0G(InterfaceC2385Uv interfaceC2385Uv, Uc uc, C2368Ue c2368Ue, Object obj, Object obj2) {
        interfaceC2385Uv.AFg(this.A00, this.A01, uc, c2368Ue, obj, obj2);
    }

    public final /* synthetic */ void A0H(InterfaceC2385Uv interfaceC2385Uv, C2368Ue c2368Ue) {
        interfaceC2385Uv.AEm(this.A00, this.A01, c2368Ue);
    }
}
