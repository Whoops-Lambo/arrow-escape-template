package com.facebook.ads.redexgen.X;

import android.database.sqlite.SQLiteDatabase;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public abstract class AbstractC3205lN {
    public static byte[] A01;
    public static String[] A02 = {"HVKZvR5UTjStDLOL9o4rPessbKuh0O7V", "lcBs6IulTDBXs0xMNwr7074HBb5CT680", "pp9", "08Pk9qbigTz1ItVQ0hAeiWjKqsV0Kke0", "IZPR1WSW", "qkmVdqnPN26Te8aFuQlNVKOt05q5LyYY", "adXBxD3OrJvPB32QQ8w", "pvdflY6bA4nr3ZgRZtp7kAtC3Qj6GBkc"};
    public final C3201lJ A00;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 59);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A01 = new byte[]{121, -127, 123, -104, 123, -102, -86, -48, -36, -39, -41, -86, -44, 11, -4, -7, 6, -7, -44, -108, -118, 126, -126, -111, -124, -128, -109, -124, 95, -109, -128, -127, -117, -124, 95, -95, -81, -84, -83, 125, -79, -98, -97, -87, -94, 125, -90, -93, 125, -94, -75, -90, -80, -79, -80, 125, -8, -22, -15, -22, -24, -7, -59};
    }

    public abstract String A08();

    public abstract C3199lH[] A0C();

    static {
        A06();
    }

    public AbstractC3205lN(C3201lJ c3201lJ) {
        this.A00 = c3201lJ;
    }

    private String A02() {
        C3199lH[] c3199lHArrA0C = A0C();
        if (c3199lHArrA0C.length < 1) {
            if (A02[4].length() != 8) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[0] = "NTtbWHu0RetWI6yxki67w6X3knWPKgwD";
            strArr[1] = "wg0AU135P1OwlpIQrYrtBV6UQnwqkPhP";
            return null;
        }
        String result = A03(0, 0, 31);
        for (int i = 0; i < c3199lHArrA0C.length - 1; i++) {
            result = result + c3199lHArrA0C[i].A02() + A03(20, 2, 35);
        }
        return result + c3199lHArrA0C[c3199lHArrA0C.length - 1].A02();
    }

    public static String A04(String str, C3199lH[] c3199lHArr) {
        StringBuilder sb = new StringBuilder(A03(56, 7, 106));
        for (int i = 0; i < c3199lHArr.length - 1; i++) {
            sb.append(c3199lHArr[i].A01);
            int i2 = A02[2].length();
            if (i2 != 3) {
                throw new RuntimeException();
            }
            A02[4] = "CXWyM2Ol";
            sb.append(A03(20, 2, 35));
        }
        sb.append(c3199lHArr[c3199lHArr.length - 1].A01);
        sb.append(A03(6, 6, 79));
        sb.append(str);
        return sb.toString();
    }

    public static String A05(String str, C3199lH[] c3199lHArr, C3199lH c3199lH) {
        return A04(str, c3199lHArr) + A03(12, 7, Sdk.SDKError.Reason.TPAT_ERROR_VALUE) + c3199lH.A01 + A03(2, 4, 32);
    }

    public final SQLiteDatabase A07() {
        return this.A00.A0E();
    }

    public final void A09(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(A03(22, 13, 4) + A08() + A03(0, 2, 30) + A02() + A03(19, 1, 48));
    }

    public final void A0A(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(A03(35, 21, 34) + A08());
    }

    public final boolean A0B() {
        return A07().delete(A08(), null, null) > 0;
    }
}
