package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.Pair;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C3385oK {
    public static byte[] A08;
    public static final ThreadFactoryC3526qf A09;
    public static final Executor A0A;
    public static final AtomicReference<InterfaceC3389oO> A0B;
    public long A00;
    public long A01;
    public InterfaceC3384oJ A02;
    public Map<String, String> A03;
    public final C2916ga A04;
    public final C2055Hi A05;
    public final C3386oL A06;
    public final String A07;

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 80);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A08 = new byte[]{56, 63, 50, 56, 105, 63, 62, 57, 122, 105, 107, 119, 117, 78, 65, 68, 72, 67, 89, 82, 95, 72, 92, 88, 72, 94, 89, 82, 68, 73, 98, 88, 11, 121, 101, 17, 11, 100, 101, 10, 108, 99, 102, 102, 10, 88, 79, 73, 79, 67, 92, 79, 78, 20, 53, 122, 28, 51, 54, 54, 122, 63, 40, 40, 53, 40, 122, 57, 53, 62, 63, 122, 1, 127, 41, 7, 122, 127, 41, 15, 13, 6, 13, 26, 1, 11, 81, 90, 75, 72, 80, 77, 84, 40, 41, 0, 47, 42, 42, 14, 41, 41, 45, 41, 43, 54, 47, 48, 61, 60};
    }

    static {
        A0B();
        A09 = new ThreadFactoryC3526qf();
        A0A = Executors.newCachedThreadPool(A09);
        A0B = new AtomicReference<>();
    }

    public C3385oK(C2055Hi c2055Hi) {
        this(c2055Hi, AbstractC2917gb.A00(c2055Hi.A02()));
    }

    public C3385oK(C2055Hi c2055Hi, C2916ga c2916ga) {
        this.A01 = -1L;
        this.A00 = -1L;
        this.A05 = c2055Hi;
        this.A06 = C3386oL.A00();
        this.A07 = AbstractC3390oP.A01(c2055Hi);
        this.A04 = c2916ga;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public GJ A03(long j, C3382oH c3382oH) {
        return new GJ(this, c3382oH, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        if (this.A05 == null || !C2551af.A0A(this.A05)) {
            return;
        }
        C3224lg c3224lg = new C3224lg(A06(8, 5, 107));
        c3224lg.A05(1);
        this.A05.A08().ABz(A06(86, 7, 111), AbstractC3223lf.A1x, c3224lg);
    }

    private void A0C(int i, String str) {
        String strA06 = A06(37, 16, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
        String strA07 = A06(0, 8, 90);
        String strA08 = A06(93, 10, 22);
        AbstractC3370o5.A05(strA08, strA06, strA07);
        AbstractC3370o5.A04(strA08, String.format(Locale.US, A06(53, 26, 10), Integer.valueOf(i), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(C3359nt c3359nt) {
        if (this.A02 != null) {
            this.A02.AEr(c3359nt);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(C3359nt c3359nt) {
        ExecutorC3516qV.A00(new GH(this, c3359nt));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L(GG gg) {
        if (this.A02 != null) {
            this.A02.AHE(gg);
        } else {
            if (gg.A00() == null || gg.A00().A06() == null) {
                return;
            }
            C3425oz.A00(this.A05).A0D(gg.A00().A06().toString(), gg.A00().A0B());
        }
    }

    private void A0M(GG gg) {
        InterfaceC3198lG syncModule;
        ExecutorC3516qV.A00(new GI(this, gg));
        if (C3300mv.A2g(this.A05) && (syncModule = this.A05.A06()) != null) {
            syncModule.A7D();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N(String str, long j, C3382oH c3382oH) {
        String clientChallenge;
        try {
            try {
                C3388oN c3388oNA07 = this.A06.A07(this.A05, str, j);
                C3242ly c3242lyA00 = c3388oNA07.A00();
                if (c3242lyA00 != null) {
                    C3300mv.A0T(this.A05).A39(c3242lyA00.A0A());
                    if (C3300mv.A0w(this.A05) && c3242lyA00.A08() != null) {
                        AbstractC3252m9.A04(this.A05.A02(), c3242lyA00.A08());
                    }
                    if (C3300mv.A0x(this.A05) && c3242lyA00.A0C() != null) {
                        AbstractC3252m9.A05(this.A05.A02(), c3242lyA00.A0C());
                    }
                    this.A05.A08().ADG();
                    this.A04.A0N(c3242lyA00.A07());
                    AbstractC3381oG.A05(c3242lyA00.A05().A0B(), c3382oH);
                    C3540qt.A01(this.A05, A0A, c3242lyA00);
                    C3224lg c3224lg = new C3224lg(A06(30, 7, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) + C3483py.A02());
                    c3224lg.A06(1);
                    c3224lg.A0A(false);
                    this.A05.A08().AD0(A06(79, 7, 56), AbstractC3223lf.A1W, c3224lg);
                }
                switch (C3383oI.A00[c3388oNA07.A01().ordinal()]) {
                    case 1:
                        GG gg = (GG) c3388oNA07;
                        if (c3242lyA00 != null) {
                            if (c3242lyA00.A05().A0E()) {
                                AbstractC3381oG.A07(str, c3382oH);
                            }
                            if (this.A03 != null) {
                                clientChallenge = this.A03.get(A06(13, 17, 93));
                            } else {
                                clientChallenge = null;
                            }
                            if (!TextUtils.isEmpty(c3388oNA07.A02()) && !TextUtils.isEmpty(clientChallenge)) {
                                this.A05.A03().AK0(this.A05, clientChallenge, c3388oNA07.A02());
                            }
                        }
                        this.A05.A0F().A3u(C3513qS.A01(this.A01), C3513qS.A02(this.A01, this.A00));
                        A0M(gg);
                        break;
                    case 2:
                        GF gf = (GF) c3388oNA07;
                        String strA04 = gf.A04();
                        AdErrorType adErrorTypeAdErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(gf.A03(), AdErrorType.ERROR_MESSAGE);
                        A0C(gf.A03(), strA04);
                        if (strA04 == null) {
                            strA04 = str;
                        }
                        this.A05.A0F().A3t(C3513qS.A01(this.A01), adErrorTypeAdErrorTypeFromCode.getErrorCode(), strA04, adErrorTypeAdErrorTypeFromCode.isPublicError());
                        A0E(C3359nt.A01(adErrorTypeAdErrorTypeFromCode, strA04));
                        break;
                    default:
                        AdErrorType adErrorType = AdErrorType.UNKNOWN_RESPONSE;
                        this.A05.A0F().A3t(C3513qS.A01(this.A01), adErrorType.getErrorCode(), str, adErrorType.isPublicError());
                        A0E(C3359nt.A01(adErrorType, str));
                        break;
                }
            } catch (Exception e) {
                e = e;
                String message = e.getMessage();
                AdErrorType adErrorType2 = AdErrorType.PARSER_FAILURE;
                this.A05.A0F().A3t(C3513qS.A01(this.A01), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
                A0E(C3359nt.A01(adErrorType2, message));
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O(String str, long j, C3382oH c3382oH) {
        A0A.execute(new GK(this, str, j, c3382oH));
    }

    private boolean A0P(C3382oH c3382oH) {
        String string = c3382oH.A06().toString();
        if (C3425oz.A00(this.A05).A0F(string)) {
            return false;
        }
        int iA0A = C3425oz.A00(this.A05).A0A(string);
        int storedAdsCount = C3300mv.A0H(this.A05);
        int iA09 = C3425oz.A00(this.A05).A09(string);
        if (iA0A >= storedAdsCount || iA0A > iA09) {
            C3425oz c3425ozA00 = C3425oz.A00(this.A05);
            String type = c3382oH.A06().toString();
            Pair<String, String> pairA0B = c3425ozA00.A0B(type);
            if (pairA0B != null && pairA0B.second != null && pairA0B.first != null) {
                A0O(pairA0B.second.toString(), 0L, c3382oH);
                return true;
            }
        }
        return false;
    }

    public final void A0Q(C3382oH c3382oH) {
        this.A01 = System.currentTimeMillis();
        C3233lp.A0B(this.A05);
        A0B.get();
        if (0 != 0) {
            throw new NullPointerException(A06(103, 7, 9));
        }
        if (C3300mv.A00(this.A05) > 0 && A0P(c3382oH)) {
            return;
        }
        if (AbstractC3381oG.A08(c3382oH)) {
            ExecutorC3528qh.A06.execute(new GM(this));
            String strA02 = AbstractC3381oG.A02(c3382oH);
            if (strA02 != null) {
                this.A05.A0F().AM0();
                A0O(strA02, 0L, c3382oH);
                return;
            } else {
                AdErrorType error = AdErrorType.LOAD_TOO_FREQUENTLY;
                this.A05.A0F().A3t(C3513qS.A01(this.A01), error.getErrorCode(), error.getDefaultErrorMessage(), error.isPublicError());
                A0E(C3359nt.A01(error, null));
                return;
            }
        }
        A0A.execute(new GL(this, c3382oH));
    }

    public final void A0R(InterfaceC3384oJ interfaceC3384oJ) {
        this.A02 = interfaceC3384oJ;
    }
}
