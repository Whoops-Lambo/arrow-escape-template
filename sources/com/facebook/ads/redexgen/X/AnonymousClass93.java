package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.media3.common.PlaybackException;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.93, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class AnonymousClass93 extends VK implements InterfaceC2325Sk {
    public static byte[] A0N;
    public static String[] A0O = {"uMVMaQPfnslh4nnIXSeSACeU724L8uWm", "mLPKU5hu8JCj3mzugb6OIsu3W3FTLtXk", "2sE51WRPe0hhbu3tFkLAYKycp3vSWy9U", "IWmWJaflJ0eX35LZGEyePJ3TgxSjchUM", "n47nQMjeCZ", "jR5GUqCdTaTbsWeiDqt", "JbFN8FtVIDdO3BsbGSr1Yf3LiBkC6O75", "DVJz4Bqu2qCnCaC6HJWXyHx7FQQcy"};
    public float A00;
    public int A01;
    public int A02;
    public Surface A03;
    public SurfaceHolder A04;
    public TextureView A05;
    public VL A06;
    public VC A07;
    public VC A08;
    public O7 A09;
    public O7 A0A;
    public InterfaceC2373Uj A0B;
    public boolean A0C;
    public final Handler A0D;
    public final AnonymousClass95 A0E;
    public final SurfaceHolderCallbackC2319Se A0F;
    public final InterfaceC2316Sb A0G;
    public final CopyOnWriteArraySet<InterfaceC2267Qe> A0H;
    public final CopyOnWriteArraySet<LJ> A0I;
    public final CopyOnWriteArraySet<TS> A0J;
    public final CopyOnWriteArraySet<YC> A0K;
    public final CopyOnWriteArraySet<InterfaceC2318Sd> A0L;
    public final InterfaceC2321Sg[] A0M;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public AnonymousClass93(Context context, InterfaceC2252Pi interfaceC2252Pi, AbstractC2420Wi abstractC2420Wi, InterfaceC2242Ot interfaceC2242Ot, InterfaceC2430Ws interfaceC2430Ws, InterfaceC2309Ru interfaceC2309Ru, InterfaceC2435Wy<InterfaceC2166Lu, InterfaceC2316Sb> interfaceC2435Wy, InterfaceC2166Lu interfaceC2166Lu) {
        this.A0F = new SurfaceHolderCallbackC2319Se(this);
        this.A0L = new CopyOnWriteArraySet<>();
        this.A0J = new CopyOnWriteArraySet<>();
        this.A0K = new CopyOnWriteArraySet<>();
        this.A0H = new CopyOnWriteArraySet<>();
        Looper looperMyLooper = Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper();
        this.A0D = new Handler(looperMyLooper);
        this.A0M = interfaceC2252Pi.A67(this.A0D, this.A0F, this.A0F, this.A0F, this.A0F, interfaceC2309Ru);
        this.A00 = 1.0f;
        this.A01 = 0;
        this.A06 = VL.A07;
        this.A02 = 1;
        this.A0E = A06(this.A0M, abstractC2420Wi, interfaceC2242Ot, interfaceC2430Ws, interfaceC2166Lu);
        this.A0G = interfaceC2435Wy.A4c(interfaceC2166Lu);
        this.A0G.AKx(this.A0E, looperMyLooper);
        this.A0I = new CopyOnWriteArraySet<>();
    }

    public static String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0N, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) + PlaybackException.ERROR_CODE_SKIP_LIMIT_REACHED);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0E() {
        byte[] bArr = {3, 25, 29, 32, 28, 21, -11, 40, 31, 0, 28, 17, 41, 21, 34, -7, 27, 24, 12, 7, 9, 11, -6, 11, 30, 26, 27, 24, 11, -14, 15, 25, 26, 11, 20, 11, 24, -58, 7, 18, 24, 11, 7, 10, 31, -58, 27, 20, 25, 11, 26, -58, 21, 24, -58, 24, 11, 22, 18, 7, 9, 11, 10, -44};
        if (A0O[3].charAt(15) != 'Z') {
            throw new RuntimeException();
        }
        A0O[4] = "s";
        A0N = bArr;
    }

    static {
        A0E();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wy != com.google.common.base.Function<com.facebook.ads.androidx.media3.common.util.Clock, com.facebook.ads.androidx.media3.exoplayer.analytics.AnalyticsCollector> */
    public AnonymousClass93(Context context, InterfaceC2252Pi interfaceC2252Pi, AbstractC2420Wi abstractC2420Wi, InterfaceC2242Ot interfaceC2242Ot, InterfaceC2430Ws interfaceC2430Ws, InterfaceC2309Ru interfaceC2309Ru, InterfaceC2435Wy<InterfaceC2166Lu, InterfaceC2316Sb> interfaceC2435Wy) {
        this(context, interfaceC2252Pi, abstractC2420Wi, interfaceC2242Ot, interfaceC2430Ws, interfaceC2309Ru, interfaceC2435Wy, InterfaceC2166Lu.A00);
    }

    @Deprecated
    public AnonymousClass93(InterfaceC2252Pi interfaceC2252Pi, AbstractC2420Wi abstractC2420Wi, InterfaceC2242Ot interfaceC2242Ot, InterfaceC2430Ws interfaceC2430Ws, InterfaceC2309Ru interfaceC2309Ru) {
        this(null, interfaceC2252Pi, abstractC2420Wi, interfaceC2242Ot, interfaceC2430Ws, interfaceC2309Ru, new InterfaceC2435Wy() { // from class: com.facebook.ads.redexgen.X.Sj
            @Override // com.facebook.ads.redexgen.X.InterfaceC2435Wy
            public final Object A4c(Object obj) {
                return new InterfaceC2316Sb((InterfaceC2166Lu) obj) { // from class: com.facebook.ads.redexgen.X.91
                    public static String[] A09 = {"XIJMZpGz2dJN", "uXNrOY6Tg1Hz", "9HKEdM0Iuvoc8Jjs1PoUbO8kREjKabW6", "9pjlej0iwxjS", "4By8B1i4ZnuRAvJ8EtYDFGuvAdFcE", "IlNNYI8ReicxFDQ5KYTYnRCMl6w6doxP", "rLtqdfItlP0s2x2BIVj9HEpFslbTSVD0", "hVM3LW0e6CvXFK2YKs0EYNfFMTjbKdod"};
                    public LQ A00;
                    public MM A01;
                    public MS<InterfaceC2263Px> A02;
                    public boolean A03;
                    public final InterfaceC2166Lu A07;
                    public final UM A05 = new UM();
                    public final UK A06 = new UK();
                    public final Pz A08 = new Pz(this.A05);
                    public final SparseArray<Pv> A04 = new SparseArray<>();

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    @RequiresNonNull
                    private final Pv A03(Timeline timeline, int i, C2299Rk c2299Rk) {
                        C2299Rk c2299Rk2 = c2299Rk;
                        if (timeline.A0N()) {
                            c2299Rk2 = null;
                        }
                        long jA6s = this.A07.A6s();
                        boolean z = timeline.equals(this.A00.A8H()) && i == this.A00.A8C();
                        long jA04 = 0;
                        if (c2299Rk2 != null && c2299Rk2.A00()) {
                            jA04 = z && this.A00.A89() == c2299Rk2.A00 && this.A00.A8A() == c2299Rk2.A01 ? this.A00.A8F() : 0L;
                            String[] strArr = A09;
                            if (strArr[1].length() != strArr[0].length()) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A09;
                            strArr2[2] = "BvmtFOFZk37aydmEaqYHeOWtooKGdgT5";
                            strArr2[4] = "Ru4BLhJbDirpzxaLh0kYnsSKUiL12";
                        } else if (z) {
                            jA04 = this.A00.A84();
                        } else if (!timeline.A0N()) {
                            jA04 = timeline.A0K(i, this.A06).A04();
                        }
                        return new Pv(jA6s, timeline, i, c2299Rk2, jA04, this.A00.A8H(), this.A00.A8C(), this.A08.A06(), this.A00.A8F(), this.A00.A9w());
                    }

                    {
                        this.A07 = (InterfaceC2166Lu) AbstractC2159Ln.A01(interfaceC2166Lu);
                        this.A02 = new MS<>(N1.A0d(), interfaceC2166Lu, new MQ() { // from class: com.facebook.ads.redexgen.X.SY
                        });
                    }

                    private final Pv A00() {
                        return A04(this.A08.A06());
                    }

                    private Pv A01(int i, C2299Rk c2299Rk) {
                        AbstractC2159Ln.A01(this.A00);
                        boolean z = true;
                        if (c2299Rk != null) {
                            Timeline timelineA05 = this.A08.A05(c2299Rk);
                            String[] strArr = A09;
                            if (strArr[2].length() == strArr[4].length()) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A09;
                            strArr2[1] = "iy4IerdMnFVa";
                            strArr2[0] = "K3yk7TLFjcQp";
                            if (timelineA05 == null) {
                                z = false;
                            }
                            if (z) {
                                return A04(c2299Rk);
                            }
                            return A03(Timeline.A02, i, c2299Rk);
                        }
                        Timeline timelineA8H = this.A00.A8H();
                        if (i >= timelineA8H.A07()) {
                            z = false;
                        }
                        if (!z) {
                            timelineA8H = Timeline.A02;
                        }
                        String[] strArr3 = A09;
                        if (strArr3[2].length() == strArr3[4].length()) {
                            throw new RuntimeException();
                        }
                        A09[3] = "IesJoG5lz";
                        return A03(timelineA8H, i, null);
                    }

                    private Pv A02(UY uy) {
                        if (uy instanceof AnonymousClass96) {
                            AnonymousClass96 anonymousClass96 = (AnonymousClass96) uy;
                            if (anonymousClass96.A05 != null) {
                                return A04(new C2299Rk(anonymousClass96.A05));
                            }
                        }
                        return A00();
                    }

                    private Pv A04(C2299Rk c2299Rk) {
                        Timeline timelineA05;
                        AbstractC2159Ln.A01(this.A00);
                        if (c2299Rk == null) {
                            timelineA05 = null;
                        } else {
                            timelineA05 = this.A08.A05(c2299Rk);
                        }
                        if (c2299Rk == null || timelineA05 == null) {
                            int windowIndex = this.A00.A8C();
                            Timeline knownTimeline = this.A00.A8H();
                            if (!(windowIndex < knownTimeline.A07())) {
                                knownTimeline = Timeline.A02;
                            }
                            return A03(knownTimeline, windowIndex, null);
                        }
                        return A03(timelineA05, timelineA05.A0J(c2299Rk.A04, this.A05).A00, c2299Rk);
                    }

                    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.MP != com.facebook.ads.androidx.media3.common.util.ListenerSet$Event<com.facebook.ads.androidx.media3.exoplayer.analytics.AnalyticsListener> */
                    private final void A05(Pv pv, int i, MP<InterfaceC2263Px> mp) {
                        this.A04.put(i, pv);
                        this.A02.A0A(i, mp);
                    }

                    @Override // com.facebook.ads.redexgen.X.InterfaceC2316Sb
                    public final void ADV() {
                        if (!this.A03) {
                            final Pv pvA00 = A00();
                            this.A03 = true;
                            A05(pvA00, -1, new MP() { // from class: com.facebook.ads.redexgen.X.SW
                            });
                        }
                    }

                    @Override // com.facebook.ads.redexgen.X.LJ
                    public final void AEa(final C2346Tf c2346Tf) {
                        final Pv pvA00 = A00();
                        A05(pvA00, 27, new MP() { // from class: com.facebook.ads.redexgen.X.SU
                        });
                    }

                    @Override // com.facebook.ads.redexgen.X.LJ
                    public final void AEb(final List<C2348Th> list) {
                        final Pv pvA00 = A00();
                        A05(pvA00, 27, new MP() { // from class: com.facebook.ads.redexgen.X.SL
                        });
                    }

                    @Override // com.facebook.ads.redexgen.X.InterfaceC2385Uv
                    public final void AEm(int i, C2299Rk c2299Rk, final C2368Ue c2368Ue) {
                        final Pv pvA01 = A01(i, c2299Rk);
                        A05(pvA01, 1004, new MP() { // from class: com.facebook.ads.redexgen.X.SZ
                        });
                    }

                    @Override // com.facebook.ads.redexgen.X.InterfaceC2385Uv
                    public final void AFe(int i, C2299Rk c2299Rk, final Uc uc, final C2368Ue c2368Ue) {
                        final Pv pvA01 = A01(i, c2299Rk);
                        A05(pvA01, 1002, new MP() { // from class: com.facebook.ads.redexgen.X.SV
                        });
                    }

                    @Override // com.facebook.ads.redexgen.X.InterfaceC2385Uv
                    public final void AFg(@MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) int i, @MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) C2299Rk c2299Rk, final Uc uc, final C2368Ue c2368Ue, Object obj2, Object obj3) {
                        final Pv pvA01 = A01(i, c2299Rk);
                        A05(pvA01, 1001, new MP() { // from class: com.facebook.ads.redexgen.X.SN
                        });
                    }

                    @Override // com.facebook.ads.redexgen.X.InterfaceC2385Uv
                    public final void AFj(int i, C2299Rk c2299Rk, final Uc uc, final C2368Ue c2368Ue, final IOException iOException, final boolean z) {
                        final Pv pvA01 = A01(i, c2299Rk);
                        A05(pvA01, 1003, new MP() { // from class: com.facebook.ads.redexgen.X.Sa
                        });
                    }

                    @Override // com.facebook.ads.redexgen.X.LJ
                    public final void AGN(final UW uw) {
                        final Pv pvA00 = A00();
                        A05(pvA00, 12, new MP() { // from class: com.facebook.ads.redexgen.X.ST
                        });
                    }

                    @Override // com.facebook.ads.redexgen.X.LJ
                    public final void AGP(final UY uy) {
                        final Pv pvA02 = A02(uy);
                        A05(pvA02, 10, new MP() { // from class: com.facebook.ads.redexgen.X.SX
                        });
                    }

                    @Override // com.facebook.ads.redexgen.X.LJ
                    public final void AGR(final boolean z, final int i) {
                        final Pv pvA00 = A00();
                        A05(pvA00, -1, new MP() { // from class: com.facebook.ads.redexgen.X.SS
                        });
                    }

                    @Override // com.facebook.ads.redexgen.X.LJ
                    public final void AH0() {
                        final Pv pvA00 = A00();
                        A05(pvA00, -1, new MP() { // from class: com.facebook.ads.redexgen.X.SM
                        });
                    }

                    @Override // com.facebook.ads.redexgen.X.LJ
                    public final void AHI(Timeline timeline, final int i) {
                        this.A08.A07((LQ) AbstractC2159Ln.A01(this.A00));
                        final Pv pvA00 = A00();
                        A05(pvA00, 0, new MP() { // from class: com.facebook.ads.redexgen.X.SQ
                        });
                    }

                    @Override // com.facebook.ads.redexgen.X.LJ
                    public final void AHN(final C2363Tx c2363Tx) {
                        final Pv pvA00 = A00();
                        A05(pvA00, 2, new MP() { // from class: com.facebook.ads.redexgen.X.SO
                        });
                    }

                    @Override // com.facebook.ads.redexgen.X.InterfaceC2316Sb
                    public final void AKx(final LQ lq, Looper looper) {
                        AbstractC2159Ln.A08(this.A00 == null || this.A08.A03.isEmpty());
                        this.A00 = (LQ) AbstractC2159Ln.A01(lq);
                        this.A01 = this.A07.A5y(looper, null);
                        this.A02 = this.A02.A07(looper, new MQ() { // from class: com.facebook.ads.redexgen.X.SR
                        });
                    }
                };
            }
        });
    }

    private final AnonymousClass95 A06(InterfaceC2321Sg[] interfaceC2321SgArr, AbstractC2420Wi abstractC2420Wi, InterfaceC2242Ot interfaceC2242Ot, InterfaceC2430Ws interfaceC2430Ws, InterfaceC2166Lu interfaceC2166Lu) {
        return new AnonymousClass95(interfaceC2321SgArr, abstractC2420Wi, interfaceC2242Ot, interfaceC2430Ws, interfaceC2166Lu);
    }

    private void A0D() {
        if (this.A05 != null) {
            if (this.A05.getSurfaceTextureListener() != this.A0F) {
                Log.w(A07(0, 15, 69), A07(15, 49, 59));
            } else {
                this.A05.setSurfaceTextureListener(null);
            }
            this.A05 = null;
        }
        if (this.A04 != null) {
            this.A04.removeCallback(this.A0F);
            this.A04 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F(Surface surface, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC2321Sg interfaceC2321Sg : this.A0M) {
            if (interfaceC2321Sg.AA0() == 2) {
                arrayList.add(this.A0E.A0L(interfaceC2321Sg).A07(1).A08(surface).A06());
            }
        }
        Surface surface2 = this.A03;
        if (A0O[2].charAt(17) == '5') {
            throw new RuntimeException();
        }
        A0O[7] = "Ks";
        if (surface2 != null && this.A03 != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((PS) it.next()).A0C();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.A0C) {
                this.A03.release();
            }
        }
        this.A03 = surface;
        this.A0C = z;
    }

    @Override // com.facebook.ads.redexgen.X.VK
    public final void A0H(int i, long j) {
        this.A0G.ADV();
        this.A0E.A0H(i, j);
    }

    public final int A0I() {
        return this.A01;
    }

    public final VC A0J() {
        return this.A07;
    }

    public final VC A0K() {
        return this.A08;
    }

    public final void A0L() {
        this.A0E.A0M();
        A0D();
        if (this.A03 != null) {
            if (this.A0C) {
                Surface surface = this.A03;
                if (A0O[3].charAt(15) != 'Z') {
                    throw new RuntimeException();
                }
                A0O[0] = "UvN3cM6pmFJL36WdLmfoMTxOeTkBuHQ9";
                surface.release();
            }
            this.A03 = null;
        }
        if (this.A0B != null) {
            this.A0B.AJj(this.A0G);
            this.A0B = null;
        }
    }

    public final void A0M(float f) {
        float fA00 = N1.A00(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        if (this.A00 == fA00) {
            return;
        }
        this.A00 = fA00;
        for (InterfaceC2321Sg interfaceC2321Sg : this.A0M) {
            if (interfaceC2321Sg.AA0() == 1) {
                AnonymousClass95 anonymousClass95 = this.A0E;
                if (A0O[0].charAt(29) == 'i') {
                    throw new RuntimeException();
                }
                A0O[3] = "jr3unv9cijOSBrxZjY5KKoYSuFZh1wIm";
                anonymousClass95.A0L(interfaceC2321Sg).A07(2).A08(Float.valueOf(fA00)).A06();
            }
        }
    }

    public final void A0N(Surface surface) {
        A0D();
        A0F(surface, false);
    }

    public final void A0O(LJ lj) {
        this.A0E.A0O(lj);
        this.A0I.add(lj);
    }

    public final void A0P(InterfaceC2318Sd interfaceC2318Sd) {
        this.A0L.add(interfaceC2318Sd);
    }

    public final void A0Q(InterfaceC2373Uj interfaceC2373Uj) {
        A0R(interfaceC2373Uj, true, true);
    }

    public final void A0R(InterfaceC2373Uj interfaceC2373Uj, boolean z, boolean z2) {
        if (this.A0B != null) {
            this.A0B.AJj(this.A0G);
        }
        this.A0B = interfaceC2373Uj;
        interfaceC2373Uj.A4P(this.A0D, this.A0G);
        this.A0E.A0P(interfaceC2373Uj, z, z2);
    }

    public final void A0S(boolean z) {
        this.A0E.A0Q(z);
    }

    public final boolean A0T() {
        return this.A0E.A0R();
    }

    @Override // com.facebook.ads.redexgen.X.LQ
    public final long A7h() {
        return this.A0E.A7h();
    }

    @Override // com.facebook.ads.redexgen.X.LQ
    public final long A84() {
        return this.A0E.A84();
    }

    @Override // com.facebook.ads.redexgen.X.LQ
    public final int A89() {
        return this.A0E.A89();
    }

    @Override // com.facebook.ads.redexgen.X.LQ
    public final int A8A() {
        return this.A0E.A8A();
    }

    @Override // com.facebook.ads.redexgen.X.LQ
    public final int A8C() {
        return this.A0E.A8C();
    }

    @Override // com.facebook.ads.redexgen.X.LQ
    public final int A8D() {
        return this.A0E.A8D();
    }

    @Override // com.facebook.ads.redexgen.X.LQ
    public final long A8F() {
        return this.A0E.A8F();
    }

    @Override // com.facebook.ads.redexgen.X.LQ
    public final Timeline A8H() {
        return this.A0E.A8H();
    }

    @Override // com.facebook.ads.redexgen.X.LQ
    public final int A8I() {
        return this.A0E.A8I();
    }

    @Override // com.facebook.ads.redexgen.X.LQ
    public final long A8T() {
        return this.A0E.A8T();
    }

    @Override // com.facebook.ads.redexgen.X.LQ
    public final long A9w() {
        return this.A0E.A9w();
    }

    @Override // com.facebook.ads.redexgen.X.LQ
    public final boolean ABL() {
        return this.A0E.ABL();
    }

    @Override // com.facebook.ads.redexgen.X.LQ
    public final void ALZ(boolean z) {
        this.A0E.ALZ(z);
        if (this.A0B != null) {
            this.A0B.AJj(this.A0G);
            this.A0B = null;
            if (z) {
                this.A0B = null;
            }
        }
    }
}
