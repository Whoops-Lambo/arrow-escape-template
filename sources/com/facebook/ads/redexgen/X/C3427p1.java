package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C3427p1 {
    public static byte[] A05;
    public static String[] A06 = {"urwRhK0CK5UGRnO4iaICZFZb7qAlGy", "mzilr1wfe", "SZ9FDPGAkZBACw9tkVUtj7pHN9rS5abx", "dtKk7mnbAbd37arB17jMrf2UHdnm8GOF", "aS5", "gZFI9Tloea", "2aa2EaIeNK", "B3GaWiA9eOHa"};
    public static final Object A07;
    public static final Map<String, String> A08;
    public static final AtomicBoolean A09;
    public final SharedPreferences A00;
    public final C3192lA A01;
    public final C3234lq A02;
    public final String A03;
    public final String A04;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 40);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        String[] strArr = A06;
        if (strArr[3].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        A06[1] = "McQY2w52D3qLTV4IvOql";
        A05 = new byte[]{116, 114, 117, 99, 8, 92, 121, 119, 106, 121, 105, 80, 92, 94, 29, 82, 93, 87, 65, 92, 90, 87, 29, 69, 86, 93, 87, 90, 93, 84, 71, 87, 69, 84, 77, 82, 66, 93, 86, 82, 6, 4, 15, 4, 19, 8, 2};
    }

    static {
        A04();
        A08 = new HashMap();
        A07 = new Object();
        A09 = new AtomicBoolean();
    }

    public C3427p1(C3192lA c3192lA, String str) {
        this.A01 = c3192lA;
        this.A03 = str;
        this.A02 = new C3234lq(this.A01, str);
        this.A00 = AbstractC3394oU.A00(this.A01);
        this.A04 = A01(1, 4, 27) + str + A01(0, 1, 103) + this.A02.A06();
    }

    private final String A00() {
        return this.A00.getString(this.A04, null);
    }

    public static String A02(C3192lA c3192lA, String str) {
        try {
            PackageManager packageManager = c3192lA.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return C3485q0.A03(packageManager.getApplicationInfo(str, 0).sourceDir);
        } catch (Exception e) {
            if (A09.compareAndSet(false, true)) {
                c3192lA.A08().ABz(A01(40, 7, 73), AbstractC3223lf.A1P, new C3224lg(e));
            }
            return null;
        }
    }

    public static String A03(String str) {
        String str2;
        synchronized (A07) {
            str2 = A08.get(str);
        }
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0035  */
    /* JADX WARN: Code duplicated, block: B:6:0x0017  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public final void A05() throws JSONException {
        String strA01;
        String checksumApiFingerprint;
        String strA02 = null;
        if (Build.VERSION.SDK_INT < 31) {
            String strA03 = A01(5, 1, 39);
            String checksumApiFingerprint2 = Build.VERSION.CODENAME;
            if (strA03.equals(checksumApiFingerprint2)) {
                if (C3300mv.A2r(this.A01)) {
                    strA01 = A01(11, 19, 27);
                    checksumApiFingerprint = this.A02.A0B();
                    if (strA01.equals(checksumApiFingerprint)) {
                        C3192lA c3192lA = this.A01;
                        String checksumApiFingerprint3 = this.A03;
                        strA02 = C3485q0.A01(c3192lA, checksumApiFingerprint3);
                    }
                }
            }
        } else if (C3300mv.A2r(this.A01)) {
            strA01 = A01(11, 19, 27);
            checksumApiFingerprint = this.A02.A0B();
            if (strA01.equals(checksumApiFingerprint)) {
                C3192lA c3192lA2 = this.A01;
                String checksumApiFingerprint4 = this.A03;
                strA02 = C3485q0.A01(c3192lA2, checksumApiFingerprint4);
            }
        }
        if (strA02 == null) {
            C3192lA c3192lA3 = this.A01;
            String checksumApiFingerprint5 = this.A03;
            strA02 = A02(c3192lA3, checksumApiFingerprint5);
        } else if (C3300mv.A1k(this.A01)) {
            C3192lA c3192lA4 = this.A01;
            String checksumApiFingerprint6 = this.A03;
            String strA04 = A02(c3192lA4, checksumApiFingerprint6);
            String checksumApiFingerprint7 = A01(6, 5, 50);
            C3224lg c3224lg = new C3224lg(checksumApiFingerprint7);
            c3224lg.A05(1);
            c3224lg.A06(1);
            c3224lg.A0A(false);
            JSONObject checksumsJson = new JSONObject();
            String checksumApiFingerprint8 = A01(30, 5, 12);
            checksumsJson.put(checksumApiFingerprint8, strA02);
            String checksumApiFingerprint9 = A01(35, 5, 25);
            checksumsJson.put(checksumApiFingerprint9, strA04);
            c3224lg.A07(checksumsJson);
            InterfaceC3222le interfaceC3222leA08 = this.A01.A08();
            String legacyMd5 = A01(40, 7, 73);
            interfaceC3222leA08.AC0(legacyMd5, AbstractC3223lf.A1I, c3224lg);
        }
        synchronized (A07) {
            Map<String, String> map = A08;
            String checksumApiFingerprint10 = this.A03;
            map.put(checksumApiFingerprint10, strA02);
        }
        SharedPreferences.Editor editorEdit = this.A00.edit();
        String checksumApiFingerprint11 = this.A04;
        editorEdit.putString(checksumApiFingerprint11, strA02).apply();
    }

    public final void A06() {
        String strA00 = A00();
        synchronized (A07) {
            Map<String, String> map = A08;
            String storedFingerprint = this.A03;
            map.put(storedFingerprint, strA00);
        }
    }
}
