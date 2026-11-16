package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import android.os.Build;
import com.safedk.android.analytics.brandsafety.b;
import java.util.Arrays;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class CallableC3256mD implements Callable<Boolean> {
    public static byte[] A04;
    public static String[] A05 = {"CoyLTTqL9oN", "BQ7yf8H5Dy6", "lyn", "mKjKy3YozjHGjndyHmGPrtRgt1Zkpmof", "kCMvlxHItYqHUu0uJG5AXtsVRpKoPm5F", "PZWzUgGQe3CdPYsrWXqgA6txhpTzavVR", "1z7bJiu6sIQ4w4e4OAYhOvPnvUYdbbgv", "yc5QaeADf08N4Bq6BgqF"};
    public final /* synthetic */ SharedPreferences A00;
    public final /* synthetic */ C3192lA A01;
    public final /* synthetic */ C3234lq A02;
    public final /* synthetic */ String A03;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 127);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{24, 61, 51, 46, 61, 45, 17, 29, 31, 92, 19, 28, 22, 0, 29, 27, 22, 92, 4, 23, 28, 22, 27, 28, 21, 100, 116, 102, 119, 110, 112, 96, 127, 116, 112, 114, 112, 123, 112, 103, 124, 118};
    }

    static {
        A02();
    }

    public CallableC3256mD(C3192lA c3192lA, C3234lq c3234lq, SharedPreferences sharedPreferences, String str) {
        this.A01 = c3192lA;
        this.A02 = c3234lq;
        this.A00 = sharedPreferences;
        this.A03 = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x0034  */
    /* JADX WARN: Code duplicated, block: B:6:0x0017  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Boolean call() throws Exception {
        String strA0B;
        String checksumApiFingerprint;
        String strA01 = null;
        if (Build.VERSION.SDK_INT < 31) {
            String strA02 = A01(0, 1, 52);
            String checksumApiFingerprint2 = Build.VERSION.CODENAME;
            if (strA02.equals(checksumApiFingerprint2)) {
                if (C3300mv.A2r(this.A01)) {
                    strA0B = this.A02.A0B();
                    checksumApiFingerprint = A01(6, 19, 13);
                    if (checksumApiFingerprint.equals(strA0B)) {
                        C3192lA c3192lA = this.A01;
                        String checksumApiFingerprint3 = this.A01.getPackageName();
                        strA01 = C3485q0.A01(c3192lA, checksumApiFingerprint3);
                    }
                }
            }
        } else if (C3300mv.A2r(this.A01)) {
            strA0B = this.A02.A0B();
            checksumApiFingerprint = A01(6, 19, 13);
            if (checksumApiFingerprint.equals(strA0B)) {
                C3192lA c3192lA2 = this.A01;
                String checksumApiFingerprint4 = this.A01.getPackageName();
                strA01 = C3485q0.A01(c3192lA2, checksumApiFingerprint4);
            }
        }
        String checksumApiFingerprint5 = A05[7];
        if (checksumApiFingerprint5.length() != 20) {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[0] = "qQmXUpBlhYC";
        strArr[1] = "2roBSgd9zyy";
        if (strA01 == null) {
            C3192lA c3192lA3 = this.A01;
            String checksumApiFingerprint6 = this.A01.getPackageName();
            C3257mE.A00 = C3427p1.A02(c3192lA3, checksumApiFingerprint6);
        } else {
            if (C3300mv.A1k(this.A01)) {
                C3192lA c3192lA4 = this.A01;
                String checksumApiFingerprint7 = this.A01.getPackageName();
                String strA03 = C3427p1.A02(c3192lA4, checksumApiFingerprint7);
                String checksumApiFingerprint8 = A01(1, 5, 33);
                C3224lg c3224lg = new C3224lg(checksumApiFingerprint8);
                c3224lg.A05(1);
                c3224lg.A06(1);
                c3224lg.A0A(false);
                JSONObject jSONObject = new JSONObject();
                String checksumApiFingerprint9 = A01(25, 5, b.v);
                jSONObject.put(checksumApiFingerprint9, strA01);
                String checksumApiFingerprint10 = A01(30, 5, 108);
                jSONObject.put(checksumApiFingerprint10, strA03);
                c3224lg.A07(jSONObject);
                InterfaceC3222le interfaceC3222leA08 = this.A01.A08();
                int i = AbstractC3223lf.A1I;
                String checksumApiFingerprint11 = A01(35, 7, 106);
                interfaceC3222leA08.AC0(checksumApiFingerprint11, i, c3224lg);
            }
            C3257mE.A00 = strA01;
        }
        SharedPreferences.Editor editorEdit = this.A00.edit();
        String str = this.A03;
        String checksumApiFingerprint12 = C3257mE.A00;
        editorEdit.putString(str, checksumApiFingerprint12).apply();
        C3257mE.A05.set(2);
        return true;
    }
}
