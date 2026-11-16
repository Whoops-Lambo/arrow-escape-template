package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.vungle.ads.internal.protos.Sdk;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C2539aT {
    public static byte[] A07;
    public static String[] A08 = {"iMGBqiSHm2uYyOurEO", "JHkNge3qKUrOixxb", "Efd0ZU7p6XsOViiGEn9FTnCEMV0phXsZ", "Qqux8MYyckh5CceEy", "ksejtLtP", "6qwv67", "yXEFufBpuo", "JuPO8KFa"};
    public static final String A09;
    public static final Set<String> A0A;
    public C3192lA A00;
    public InterfaceC2630bw A01;
    public InterfaceC2541aV A02;
    public Map<String, String> A03;
    public Map<String, String> A04;
    public final Handler A05;
    public volatile boolean A06;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 90);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A07 = new byte[]{48, 0, 3, 57, 33, 22, 22, 11, 22, 68, 11, 20, 1, 10, 13, 10, 3, 68, 17, 22, 8, 94, 68, 122, 117, 122, 119, 116, 124, 44, 55, 46, 46};
    }

    static {
        A05();
        A09 = C2539aT.class.getSimpleName();
        A0A = new HashSet();
        A0A.add(A01(0, 1, 73));
        A0A.add(A01(29, 4, 24));
    }

    public C2539aT(C3192lA c3192lA) {
        this(c3192lA, null, null);
    }

    public C2539aT(C3192lA c3192lA, Map<String, String> extraData) {
        this(c3192lA, extraData, null);
    }

    public C2539aT(C3192lA c3192lA, Map<String, String> extraData, Map<String, String> postData) {
        this.A05 = new Handler(Looper.getMainLooper());
        this.A06 = false;
        this.A00 = c3192lA;
        this.A03 = extraData != null ? new HashMap(extraData) : null;
        this.A04 = postData != null ? new HashMap(postData) : null;
    }

    private C2537aR A00(String... strArr) {
        String str = strArr[0];
        if (TextUtils.isEmpty(str) || A0A.contains(str)) {
            return null;
        }
        String strA02 = A02(str);
        if (this.A03 != null && !this.A03.isEmpty()) {
            for (Map.Entry<String, String> entry : this.A03.entrySet()) {
                String key = entry.getKey();
                String url = A08[3];
                if (url.length() != 17) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[1] = "LHazEi1oxcVYNJUw";
                strArr2[5] = "KdBpo3";
                String url2 = entry.getValue();
                strA02 = A03(strA02, key, url2);
            }
        }
        int i = 1;
        while (true) {
            int attempt = i + 1;
            if (i > 2) {
                return null;
            }
            if (A07(strA02)) {
                return new C2537aR(this.A01);
            }
            i = attempt;
        }
    }

    private String A02(String str) {
        try {
            return A03(str, A01(23, 6, 65), AbstractC3489q4.A01(this.A00.A04().A7W()));
        } catch (Exception unused) {
            return str;
        }
    }

    private String A03(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return str;
        }
        String strA01 = A01(3, 1, 92);
        if (str.contains(strA01)) {
            strA01 = A01(1, 1, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        }
        StringBuilder sbAppend = new StringBuilder().append(str).append(strA01).append(str2);
        String prepend = A01(2, 1, 100);
        StringBuilder sbAppend2 = sbAppend.append(prepend);
        String prepend2 = URLEncoder.encode(str3);
        return sbAppend2.append(prepend2).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A04, reason: merged with bridge method [inline-methods] */
    public void A08() {
        if (this.A02 != null) {
            this.A02.AIN();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A06, reason: merged with bridge method [inline-methods] */
    public void A0A(C2537aR c2537aR) {
        if (this.A02 != null) {
            this.A02.AIP(c2537aR);
        }
    }

    private boolean A07(String str) {
        InterfaceC2630bw interfaceC2630bwAI9;
        InterfaceC2626bs interfaceC2626bsA00 = C2551af.A00(this.A00);
        try {
            if (this.A04 == null || this.A04.size() == 0) {
                interfaceC2630bwAI9 = interfaceC2626bsA00.AI9(str, new C2571az());
            } else {
                C2571az params = new C2571az();
                params.A05(this.A04);
                interfaceC2630bwAI9 = interfaceC2626bsA00.AIA(str, params.A08());
            }
            this.A01 = interfaceC2630bwAI9;
        } catch (Exception e) {
            Log.e(A09, A01(4, 19, 62) + str, e);
        }
        return this.A01 != null && this.A01.A9p() == 200;
    }

    public final void A09(InterfaceC2541aV interfaceC2541aV) {
        this.A02 = interfaceC2541aV;
    }

    public final void A0B(Executor executor, final String... strArr) {
        executor.execute(new Runnable() { // from class: com.facebook.ads.redexgen.X.aZ
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A0D(strArr);
            }
        });
    }

    public final void A0C(String... strArr) {
        A0B(ExecutorC3528qh.A06, strArr);
    }

    public final /* synthetic */ void A0D(String[] strArr) {
        final C2537aR c2537aRA00 = A00(strArr);
        if (!this.A06) {
            this.A05.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.ae
                @Override // java.lang.Runnable
                public final void run() {
                    this.A00.A0A(c2537aRA00);
                }
            });
        } else {
            this.A05.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.ad
                @Override // java.lang.Runnable
                public final void run() {
                    this.A00.A08();
                }
            });
        }
    }
}
