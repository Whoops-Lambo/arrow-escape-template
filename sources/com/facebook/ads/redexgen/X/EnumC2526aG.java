package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A03' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public abstract class EnumC2526aG {
    public static byte[] A00;
    public static String[] A01 = {"nA8fLeyOwVmNwvq6aIqKxCaagHA5eYr", "8Z3ODqLNUnEAqB2P3Amw9Ur1PSsugik5", "YRmdf", "zIg3Ob9eurpeZ06C2uEHUxbrUPW1iO5", "DwODnBhAs5I9lGAPLwBjllp42Gjp41Mv", "6IL6kP5nz", "IHg6IZuYXxuMxytmBHiV", "YXmTZGEBqQ8NuPQvZDB03"};
    public static final /* synthetic */ EnumC2526aG[] A02;
    public static final EnumC2526aG A03;
    public static final EnumC2526aG A04;
    public static final EnumC2526aG A05;
    public static final EnumC2526aG A06;
    public static final EnumC2526aG A07;
    public static final EnumC2526aG A08;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 4);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-82, -33, -33, -50, -26, 110, -101, -101, -104, -111, -115, -102, -103, -60, -54, -73, -63, -70, 127, -92, -86, 101, 120, -128, 123, 121, -118, 123, -100, -102, -111, -106, -113, -99, -74, -77, -74, -73, -65, -74, 104, -68, -63, -72, -83, 104, -73, -82, 104, -78, -69, -73, -74, 104, -73, -86, -78, -83, -85, -68, 104, -77, -83, -63};
    }

    public abstract boolean A05(JSONArray jSONArray, int i);

    public abstract boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i);

    public abstract boolean A07(JSONObject jSONObject, String str);

    public abstract boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str);

    static {
        A03();
        final String strA02 = A02(0, 5, 105);
        final int i = 0;
        A03 = new EnumC2526aG(strA02, i) { // from class: com.facebook.ads.redexgen.X.AQ
            @Override // com.facebook.ads.redexgen.X.EnumC2526aG
            public final boolean A05(JSONArray jSONArray, int i2) {
                return jSONArray.optJSONArray(i2) != null;
            }

            @Override // com.facebook.ads.redexgen.X.EnumC2526aG
            public final boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i2) {
                return AbstractC2525aF.A00(jSONArray.optJSONArray(i2), jSONArray2.optJSONArray(i2));
            }

            @Override // com.facebook.ads.redexgen.X.EnumC2526aG
            public final boolean A07(JSONObject jSONObject, String str) {
                return jSONObject.optJSONArray(str) != null;
            }

            @Override // com.facebook.ads.redexgen.X.EnumC2526aG
            public final boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return AbstractC2525aF.A00(jSONObject.optJSONArray(str), jSONObject2.optJSONArray(str));
            }
        };
        final String strA03 = A02(5, 7, 40);
        final int i2 = 1;
        A04 = new EnumC2526aG(strA03, i2) { // from class: com.facebook.ads.redexgen.X.AP
            @Override // com.facebook.ads.redexgen.X.EnumC2526aG
            public final boolean A05(JSONArray jSONArray, int i3) {
                return jSONArray.optBoolean(i3, true) == jSONArray.optBoolean(i3, false);
            }

            @Override // com.facebook.ads.redexgen.X.EnumC2526aG
            public final boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i3) {
                return jSONArray.optBoolean(i3) == jSONArray2.optBoolean(i3);
            }

            @Override // com.facebook.ads.redexgen.X.EnumC2526aG
            public final boolean A07(JSONObject jSONObject, String str) {
                return jSONObject.optBoolean(str, true) == jSONObject.optBoolean(str, false);
            }

            @Override // com.facebook.ads.redexgen.X.EnumC2526aG
            public final boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optBoolean(str) == jSONObject2.optBoolean(str);
            }
        };
        final String strA04 = A02(12, 6, 81);
        final int i3 = 2;
        A05 = new EnumC2526aG(strA04, i3) { // from class: com.facebook.ads.redexgen.X.AO
            @Override // com.facebook.ads.redexgen.X.EnumC2526aG
            public final boolean A05(JSONArray jSONArray, int i4) {
                return jSONArray.optInt(i4, 0) == jSONArray.optInt(i4, 1) && jSONArray.optDouble(i4, 0.0d) == jSONArray.optDouble(i4, 1.0d) && ((double) jSONArray.optInt(i4, 0)) != jSONArray.optDouble(i4, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.X.EnumC2526aG
            public final boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i4) {
                return jSONArray.optDouble(i4) == jSONArray2.optDouble(i4);
            }

            @Override // com.facebook.ads.redexgen.X.EnumC2526aG
            public final boolean A07(JSONObject jSONObject, String str) {
                return jSONObject.optInt(str, 0) == jSONObject.optInt(str, 1) && jSONObject.optDouble(str, 0.0d) == jSONObject.optDouble(str, 1.0d) && ((double) jSONObject.optInt(str, 0)) != jSONObject.optDouble(str, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.X.EnumC2526aG
            public final boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optDouble(str) == jSONObject2.optDouble(str);
            }
        };
        final String strA05 = A02(18, 3, 50);
        final int i4 = 3;
        A06 = new EnumC2526aG(strA05, i4) { // from class: com.facebook.ads.redexgen.X.AN
            @Override // com.facebook.ads.redexgen.X.EnumC2526aG
            public final boolean A05(JSONArray jSONArray, int i5) {
                return jSONArray.optInt(i5, 0) == jSONArray.optInt(i5, 1) && jSONArray.optDouble(i5, 0.0d) == jSONArray.optDouble(i5, 1.0d) && ((double) jSONArray.optInt(i5, 0)) == jSONArray.optDouble(i5, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.X.EnumC2526aG
            public final boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i5) {
                return jSONArray.optInt(i5) == jSONArray2.optInt(i5);
            }

            @Override // com.facebook.ads.redexgen.X.EnumC2526aG
            public final boolean A07(JSONObject jSONObject, String str) {
                return jSONObject.optInt(str, 0) == jSONObject.optInt(str, 1) && jSONObject.optDouble(str, 0.0d) == jSONObject.optDouble(str, 1.0d) && ((double) jSONObject.optInt(str, 0)) == jSONObject.optDouble(str, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.X.EnumC2526aG
            public final boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optInt(str) == jSONObject2.optInt(str);
            }
        };
        final String strA06 = A02(21, 6, 18);
        final int i5 = 4;
        A07 = new EnumC2526aG(strA06, i5) { // from class: com.facebook.ads.redexgen.X.AM
            @Override // com.facebook.ads.redexgen.X.EnumC2526aG
            public final boolean A05(JSONArray jSONArray, int i6) {
                return jSONArray.optJSONObject(i6) != null;
            }

            @Override // com.facebook.ads.redexgen.X.EnumC2526aG
            public final boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i6) {
                return AbstractC2525aF.A02(jSONArray.optJSONObject(i6), jSONArray2.optJSONObject(i6));
            }

            @Override // com.facebook.ads.redexgen.X.EnumC2526aG
            public final boolean A07(JSONObject jSONObject, String str) {
                return jSONObject.optJSONObject(str) != null;
            }

            @Override // com.facebook.ads.redexgen.X.EnumC2526aG
            public final boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return AbstractC2525aF.A02(jSONObject.optJSONObject(str), jSONObject2.optJSONObject(str));
            }
        };
        final String strA07 = A02(27, 6, 36);
        final int i6 = 5;
        A08 = new EnumC2526aG(strA07, i6) { // from class: com.facebook.ads.redexgen.X.AL
            public static String[] A00 = {"S6TW", "ny0MdAR97Gu4SNk", "rkwOTbdxOjHEIpaOa1nUtCd8O93QoN1B", "7xY9", "Da3ipdmgSz1ZoqY39uGKYfQBSyYvvrF9", "e6UsaV3hJoeCkvN", "D0UcWRe35eYk963s7qzWCf", "Sc8AnvcCfF8gONKc99Y6P5M4Z9BtNzTY"};

            @Override // com.facebook.ads.redexgen.X.EnumC2526aG
            public final boolean A05(JSONArray jSONArray, int i7) {
                return jSONArray.optString(i7) != null;
            }

            @Override // com.facebook.ads.redexgen.X.EnumC2526aG
            public final boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i7) {
                String str2 = jSONArray.optString(i7);
                String str1 = jSONArray2.optString(i7);
                if (str2 == null || str1 == null) {
                    return str2 == null && str1 == null;
                }
                boolean zEquals = str2.equals(str1);
                String[] strArr = A00;
                if (strArr[0].length() != strArr[3].length()) {
                    throw new RuntimeException();
                }
                A00[4] = "zMNaG7kHpiNMjlyvqGoXFZjAcBEumgMR";
                return zEquals;
            }

            @Override // com.facebook.ads.redexgen.X.EnumC2526aG
            public final boolean A07(JSONObject jSONObject, String str) {
                return jSONObject.optString(str) != null;
            }

            @Override // com.facebook.ads.redexgen.X.EnumC2526aG
            public final boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                String str2 = jSONObject.optString(str);
                String str1 = jSONObject2.optString(str);
                if (str2 == null || str1 == null) {
                    return str2 == null && str1 == null;
                }
                return str2.equals(str1);
            }
        };
        A02 = A04();
    }

    public EnumC2526aG(String str, int i) {
        super(str, i);
    }

    public static EnumC2526aG A00(JSONArray jSONArray, int i) {
        for (EnumC2526aG type : values()) {
            if (A01[1].charAt(14) != '2') {
                throw new RuntimeException();
            }
            A01[4] = "PUsgFaltT51mxPXWqnHKjq6lqfkoVDea";
            if (type.A05(jSONArray, i)) {
                return type;
            }
        }
        throw new AssertionError(A02(33, 31, 68));
    }

    public static EnumC2526aG A01(JSONObject jSONObject, String str) {
        for (EnumC2526aG enumC2526aG : values()) {
            boolean zA07 = enumC2526aG.A07(jSONObject, str);
            if (A01[5].length() != 9) {
                throw new RuntimeException();
            }
            A01[6] = "GmRRmI3tzaTgoS0GQtjO0";
            if (zA07) {
                return enumC2526aG;
            }
        }
        throw new AssertionError(A02(33, 31, 68));
    }

    public static /* synthetic */ EnumC2526aG[] A04() {
        return new EnumC2526aG[]{A03, A04, A05, A06, A07, A08};
    }

    public static EnumC2526aG valueOf(String str) {
        return (EnumC2526aG) Enum.valueOf(EnumC2526aG.class, str);
    }

    public static EnumC2526aG[] values() {
        return (EnumC2526aG[]) A02.clone();
    }
}
