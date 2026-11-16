package com.facebook.ads.redexgen.X;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.safedk.android.analytics.brandsafety.b;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public abstract class AbstractC2669cZ {
    public static byte[] A00;
    public static String[] A01 = {"6v8", "zfSWx4kkvk7NKb6j574Qzh1ehqPWVXBJ", "k4tsh8ZEDzU1cAoHIV4wBG3pfE", "EGfAZ1IUkUQXFUopLFyyffsKFyGyd3TR", "JSrjBw9biKLFoWVgPhKYCLwUb3hRV", "1G7ywv1e7SgdprbBT1Nw64mInQ", "TlcbJaqckiCcOnwKaYHSEeNhQa", "0TBtFdiJG1pVX1lkXK7keDqrS7O"};
    public static final Pattern A02;
    public static final Map<String, Integer> A03;
    public static final Map<String, Integer> A04;
    public static final Pattern A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A06(List<C2657cN> list, String str, C2665cV c2665cV) {
        List<C2666cW> listA0E = A0E(list, str, c2665cV);
        for (int i = 0; i < listA0E.size(); i++) {
            C2657cN c2657cN = listA0E.get(i).A01;
            if (c2657cN.A07() != -1) {
                return c2657cN.A07();
            }
        }
        return -1;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static SpannedString A07(String str, String str2, List<C2657cN> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        int iA05 = 0;
        ArrayList arrayList = new ArrayList();
        while (true) {
            int length = str2.length();
            if (A01[0].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[4] = "jvq9fpfdkdShx4hcabElbHLV0ky6f";
            strArr[5] = "mRcPmReQvAuypAq1aKLIoos46B";
            if (iA05 >= length) {
                while (!arrayDeque.isEmpty()) {
                    A0K(str, (C2665cV) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                A0K(str, C2665cV.A00(), Collections.emptyList(), spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char cCharAt = str2.charAt(iA05);
            switch (cCharAt) {
                case '&':
                    int iIndexOf = str2.indexOf(59, iA05 + 1);
                    int iIndexOf2 = str2.indexOf(32, iA05 + 1);
                    if (iIndexOf == -1) {
                        iIndexOf = iIndexOf2;
                    } else if (iIndexOf2 != -1) {
                        iIndexOf = Math.min(iIndexOf, iIndexOf2);
                    }
                    if (iIndexOf == -1) {
                        spannableStringBuilder.append(cCharAt);
                        iA05++;
                    } else {
                        A0J(str2.substring(iA05 + 1, iIndexOf), spannableStringBuilder);
                        if (iIndexOf == iIndexOf2) {
                            spannableStringBuilder.append((CharSequence) A0C(1, 1, 74));
                        }
                        iA05 = iIndexOf + 1;
                    }
                    break;
                case '<':
                    if (iA05 + 1 < str2.length()) {
                        int i = iA05;
                        char cCharAt2 = str2.charAt(i + 1);
                        if (A01[0].length() != 3) {
                            throw new RuntimeException();
                        }
                        A01[0] = "DjA";
                        boolean z = cCharAt2 == '/';
                        iA05 = A05(str2, i + 1);
                        boolean z2 = str2.charAt(iA05 + (-2)) == '/';
                        String strSubstring = str2.substring((z ? 2 : 1) + i, z2 ? iA05 - 2 : iA05 - 1);
                        if (!strSubstring.trim().isEmpty()) {
                            String strA0D = A0D(strSubstring);
                            if (A0O(strA0D)) {
                                if (z) {
                                    while (!arrayDeque.isEmpty()) {
                                        C2665cV c2665cV = (C2665cV) arrayDeque.pop();
                                        A0K(str, c2665cV, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new C2664cU(c2665cV, spannableStringBuilder.length()));
                                        }
                                        if (c2665cV.A01.equals(strA0D)) {
                                        }
                                        break;
                                    }
                                } else if (!z2) {
                                    arrayDeque.push(C2665cV.A01(strSubstring, spannableStringBuilder.length()));
                                }
                            }
                        }
                    } else {
                        iA05++;
                    }
                    break;
                default:
                    spannableStringBuilder.append(cCharAt);
                    iA05++;
                    break;
            }
        }
    }

    public static String A0C(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0F() {
        A00 = new byte[]{111, 29, 9, 111, 27, 20, 108, 120, 110, 125, 111, 27, 20, 108, 110, 63, 40, 52, 22, 49, 41, 62, 51, 54, 59, 127, 120, 41, 58, 45, 43, 54, 60, 62, 51, 120, 127, 41, 62, 51, 42, 58, 101, 127, 70, 97, 121, 110, 99, 102, 107, 47, 110, 99, 102, 104, 97, 98, 106, 97, 123, 47, 121, 110, 99, 122, 106, 53, 47, 78, 105, 113, 102, 107, 110, 99, 39, 102, 105, 100, 111, 104, 117, 39, 113, 102, 107, 114, 98, 61, 39, 73, 113, 115, 106, 106, 115, 116, 125, 58, 120, 123, 126, 58, 121, 111, 127, 58, 105, 127, 110, 110, 115, 116, 125, 32, 58, 88, 96, 98, 123, 123, 98, 101, 108, 43, 104, 126, 110, 43, 124, 98, 127, 99, 43, 105, 106, 111, 43, 99, 110, 106, 111, 110, 121, 49, 43, 37, 30, 27, 30, 31, 7, 30, 80, 19, 5, 21, 80, 3, 21, 4, 4, 25, 30, 23, 80, 71, 117, 114, 102, 100, 100, 83, 101, 117, 64, 113, 98, 99, 117, 98, 55, 76, 48, 66, 49, 34, 84, 32, 47, 87, 85, 32, 15, 87, 81, 81, 66, 32, 15, 87, 84, 32, 47, 87, 85, 84, 82, 86, 85, 67, 88, 27, 22, 19, 29, 20, 41, 37, 56, 65, 40, 45, 21, 40, 38, 43, 41, 33, 72, 77, 117, 72, 70, 95, 79, 122, 127, 71, 123, 97, 121, 118, 2, 7, 63, 12, 9, 13, 5, 124, 121, 65, 115, 127, 121, 123, 112, 106, 127, 61, 56, 0, 45, 58, 59, 47, 42, 18, 58, 37, 36, 57, 40, 120, 125, 69, 99, 127, 118, 118, 117, 109, 75, 69, 72, 74, 66, 3, 13, 20, 4, 109, 7, 1, 10, 16, 1, 22, 90, 64, 88, 87, 78, 69, 79, 57, 42, 50, 62, 48, 57, 56, 37, 62, 57, 48, 119, 34, 57, 36, 34, 39, 39, 56, 37, 35, 50, 51, 119, 50, 57, 35, 62, 35, 46, 109, 119, 112, 113, 115, 126, 113, 120, 89, 80, 83, 65, 90, 95, 91, 83, 67, 70, 65, 74, 47, 42, 45, 38, 110, 47, 38, 37, 55, 66, 71, 64, 75, 3, 92, 71, 73, 70, 90, 50, 44, 92, 68, 3, 15, 9, 11, 0, 26, 15, 54, 50, 63, 63, 55, 62, 96, 108, 125, 126, 56, 39, 59, 33, 60, 33, 39, 38, 72, 95, 94, 3, 24, 22, 25, 5, 93, 67, 61, 59, 68, 67, 84, 79, 7, 29, 14, 17, 37, 34, 55, 36, 34, 13, 125, 118, 101, 114, 116, 105, 99, 97, 108, 119, 104, 105, 116, 101, 12, 16, 25, 25, 26, 2};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0H(SpannableStringBuilder spannableStringBuilder, String str, C2665cV c2665cV, List<C2664cU> list, List<C2657cN> list2) {
        int iA06 = A06(list2, str, c2665cV);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, C2664cU.A02);
        int length = 0;
        int i = c2665cV.A00;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (A0C(TTAdConstant.VIDEO_COVER_URL_CODE, 2, 56).equals(((C2664cU) arrayList.get(i2)).A01.A01)) {
                C2664cU c2664cU = (C2664cU) arrayList.get(i2);
                int iA00 = A00(A06(list2, str, c2664cU.A01), iA06, 1);
                int i3 = c2664cU.A01.A00 - length;
                int i4 = c2664cU.A00 - length;
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i3, i4);
                spannableStringBuilder.delete(i3, i4);
                spannableStringBuilder.setSpan(new C2344Td(charSequenceSubSequence.toString(), iA00), i, i3, 33);
                length += charSequenceSubSequence.length();
                i = i3;
            }
        }
    }

    static {
        A0F();
        A02 = Pattern.compile(A0C(187, 26, 11));
        A05 = Pattern.compile(A0C(3, 12, 48));
        HashMap map = new HashMap();
        map.put(A0C(440, 5, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put(A0C(349, 4, 65), Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put(A0C(300, 4, 78), Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put(A0C(405, 3, 77), Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put(A0C(445, 6, 2), Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put(A0C(380, 7, 25), Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put(A0C(289, 4, 22), Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put(A0C(284, 5, 94), Integer.valueOf(Color.rgb(0, 0, 0)));
        Map<String, Integer> defaultColors = Collections.unmodifiableMap(map);
        A04 = defaultColors;
        HashMap map2 = new HashMap();
        map2.put(A0C(267, 8, 58), Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put(A0C(244, 7, 23), Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put(A0C(237, 7, 111), Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put(A0C(261, 6, 40), Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put(A0C(275, 9, 109), Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put(A0C(251, 10, 105), Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put(A0C(230, 7, 93), Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put(A0C(Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, 8, 61), Integer.valueOf(Color.rgb(0, 0, 0)));
        Map<String, Integer> defaultBackgroundColors = Collections.unmodifiableMap(map2);
        A03 = defaultBackgroundColors;
    }

    public static int A00(int i, int i2, int i3) {
        if (i != -1) {
            return i;
        }
        if (i2 != -1) {
            return i2;
        }
        if (i3 != -1) {
            return i3;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0097 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0098 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0099 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    /* JADX WARN: Code duplicated, block: B:6:0x000e  */
    public static int A01(String str) {
        byte b;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals(A0C(294, 6, 19))) {
                    b = 1;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        return 0;
                    case 1:
                    case 2:
                        return 1;
                    case 3:
                        return 2;
                    default:
                        MV.A07(A0C(167, 15, 103), A0C(69, 22, 112) + str);
                        return Integer.MIN_VALUE;
                }
            case -1074341483:
                if (str.equals(A0C(387, 6, 44))) {
                    b = 2;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        return 0;
                    case 1:
                    case 2:
                        return 1;
                    case 3:
                        return 2;
                    default:
                        MV.A07(A0C(167, 15, 103), A0C(69, 22, 112) + str);
                        return Integer.MIN_VALUE;
                }
            case 100571:
                String[] strArr = A01;
                if (strArr[4].length() != strArr[5].length()) {
                    A01[7] = "6VNoPoGqGwpjt6lHxiUXUHsY4OH";
                    if (str.equals(A0C(Sdk.SDKError.Reason.AD_EXPIRED_VALUE, 3, 92))) {
                        b = 3;
                    } else {
                        b = -1;
                    }
                    switch (b) {
                        case 0:
                            return 0;
                        case 1:
                        case 2:
                            return 1;
                        case 3:
                            return 2;
                        default:
                            MV.A07(A0C(167, 15, 103), A0C(69, 22, 112) + str);
                            return Integer.MIN_VALUE;
                    }
                }
                throw new RuntimeException();
            case 109757538:
                if (str.equals(A0C(425, 5, 33))) {
                    b = 0;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        return 0;
                    case 1:
                    case 2:
                        return 1;
                    case 3:
                        return 2;
                    default:
                        MV.A07(A0C(167, 15, 103), A0C(69, 22, 112) + str);
                        return Integer.MIN_VALUE;
                }
            default:
                b = -1;
                switch (b) {
                    case 0:
                        return 0;
                    case 1:
                    case 2:
                        return 1;
                    case 3:
                        return 2;
                    default:
                        MV.A07(A0C(167, 15, 103), A0C(69, 22, 112) + str);
                        return Integer.MIN_VALUE;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x00ba A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x00bb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x00bc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    /* JADX WARN: Code duplicated, block: B:6:0x000e  */
    public static int A02(String str) {
        byte b;
        switch (str.hashCode()) {
            case -1842484672:
                if (str.equals(A0C(357, 9, 52))) {
                    b = 0;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                    case 1:
                        return 0;
                    case 2:
                    case 3:
                        return 1;
                    case 4:
                    case 5:
                        return 2;
                    default:
                        MV.A07(A0C(167, 15, 103), A0C(69, 22, 112) + str);
                        return Integer.MIN_VALUE;
                }
            case -1364013995:
                if (str.equals(A0C(294, 6, 19))) {
                    b = 2;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                    case 1:
                        return 0;
                    case 2:
                    case 3:
                        return 1;
                    case 4:
                    case 5:
                        return 2;
                    default:
                        MV.A07(A0C(167, 15, 103), A0C(69, 22, 112) + str);
                        return Integer.MIN_VALUE;
                }
            case -1276788989:
                if (str.equals(A0C(366, 10, 89))) {
                    b = 4;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                    case 1:
                        return 0;
                    case 2:
                    case 3:
                        return 1;
                    case 4:
                    case 5:
                        return 2;
                    default:
                        MV.A07(A0C(167, 15, 103), A0C(69, 22, 112) + str);
                        return Integer.MIN_VALUE;
                }
            case -1074341483:
                if (A01[3].charAt(28) != 'r') {
                    A01[3] = "Rh1bbJpmpscE5oNeyjoq3yTjfxZ2Y1Hy";
                    if (str.equals(A0C(387, 6, 44))) {
                        b = 3;
                    } else {
                        b = -1;
                    }
                    switch (b) {
                        case 0:
                        case 1:
                            return 0;
                        case 2:
                        case 3:
                            return 1;
                        case 4:
                        case 5:
                            return 2;
                        default:
                            MV.A07(A0C(167, 15, 103), A0C(69, 22, 112) + str);
                            return Integer.MIN_VALUE;
                    }
                }
                throw new RuntimeException();
            case 100571:
                if (str.equals(A0C(Sdk.SDKError.Reason.AD_EXPIRED_VALUE, 3, 92))) {
                    b = 5;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                    case 1:
                        return 0;
                    case 2:
                    case 3:
                        return 1;
                    case 4:
                    case 5:
                        return 2;
                    default:
                        MV.A07(A0C(167, 15, 103), A0C(69, 22, 112) + str);
                        return Integer.MIN_VALUE;
                }
            case 109757538:
                if (str.equals(A0C(425, 5, 33))) {
                    b = 1;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                    case 1:
                        return 0;
                    case 2:
                    case 3:
                        return 1;
                    case 4:
                    case 5:
                        return 2;
                    default:
                        MV.A07(A0C(167, 15, 103), A0C(69, 22, 112) + str);
                        return Integer.MIN_VALUE;
                }
            default:
                b = -1;
                switch (b) {
                    case 0:
                    case 1:
                        return 0;
                    case 2:
                    case 3:
                        return 1;
                    case 4:
                    case 5:
                        return 2;
                    default:
                        MV.A07(A0C(167, 15, 103), A0C(69, 22, 112) + str);
                        return Integer.MIN_VALUE;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x000c  */
    public static int A03(String str) {
        byte b;
        switch (str.hashCode()) {
            case -1364013995:
                if (!str.equals(A0C(294, 6, 19))) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case -1074341483:
                if (!str.equals(A0C(387, 6, 44))) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 100571:
                if (!str.equals(A0C(Sdk.SDKError.Reason.AD_EXPIRED_VALUE, 3, 92))) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 3317767:
                if (!str.equals(A0C(345, 4, 66))) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 108511772:
                if (!str.equals(A0C(408, 5, 6))) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case 109757538:
                if (!str.equals(A0C(425, 5, 33))) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return 1;
            case 1:
                return 4;
            case 2:
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 5;
            default:
                MV.A07(A0C(167, 15, 103), A0C(44, 25, b.v) + str);
                return 2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0008  */
    public static int A04(String str) {
        byte b;
        switch (str.hashCode()) {
            case 3462:
                if (!str.equals(A0C(376, 2, 41))) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 3642:
                if (!str.equals(A0C(TTAdConstant.VIDEO_INFO_CODE, 2, 88))) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                MV.A07(A0C(167, 15, 103), A0C(18, 26, 40) + str);
                return Integer.MIN_VALUE;
        }
    }

    public static int A05(String str, int i) {
        int iIndexOf = str.indexOf(62, i);
        if (iIndexOf == -1) {
            int index = str.length();
            return index;
        }
        int index2 = iIndexOf + 1;
        return index2;
    }

    public static C2149Ld A08(String str) {
        C2668cY builder = new C2668cY();
        A0L(str, builder);
        return builder.A07();
    }

    public static C2348Th A09(CharSequence charSequence) {
        C2668cY infoBuilder = new C2668cY();
        infoBuilder.A0A = charSequence;
        return infoBuilder.A07().A0H();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        if (r6 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        r0 = r4.trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        return A0B(r0, r5, r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (r6 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.X.C2661cR A0A(com.facebook.ads.redexgen.X.C2181Mk r7, java.util.List<com.facebook.ads.redexgen.X.C2657cN> r8) {
        /*
            java.lang.String r4 = r7.A0T()
            r3 = 0
            if (r4 != 0) goto L8
            return r3
        L8:
            java.util.regex.Pattern r0 = com.facebook.ads.redexgen.X.AbstractC2669cZ.A02
            java.util.regex.Matcher r5 = r0.matcher(r4)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.AbstractC2669cZ.A01
            r0 = 3
            r1 = r1[r0]
            r0 = 28
            char r1 = r1.charAt(r0)
            r0 = 114(0x72, float:1.6E-43)
            if (r1 == r0) goto L6f
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AbstractC2669cZ.A01
            java.lang.String r1 = "91CWGHq3LpltnZbfESWEUBhgmk9qe"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "OnICX6gWtgZDHYEEYRRI64echh"
            r0 = 5
            r2[r0] = r1
            boolean r0 = r5.matches()
            if (r0 == 0) goto L34
            com.facebook.ads.redexgen.X.cR r0 = A0B(r3, r5, r7, r8)
            return r0
        L34:
            java.lang.String r1 = r7.A0T()
            if (r1 != 0) goto L3b
            return r3
        L3b:
            java.util.regex.Pattern r0 = com.facebook.ads.redexgen.X.AbstractC2669cZ.A02
            java.util.regex.Matcher r5 = r0.matcher(r1)
            boolean r6 = r5.matches()
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.AbstractC2669cZ.A01
            r0 = 3
            r1 = r1[r0]
            r0 = 28
            char r1 = r1.charAt(r0)
            r0 = 114(0x72, float:1.6E-43)
            if (r1 == r0) goto L6b
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AbstractC2669cZ.A01
            java.lang.String r1 = "tfXkp8rmVMvKE5TvQHTEpsM5Gm"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "bHzMLfZhwx7svyeGK9WfnLq261"
            r0 = 2
            r2[r0] = r1
            if (r6 == 0) goto L6e
        L62:
            java.lang.String r0 = r4.trim()
            com.facebook.ads.redexgen.X.cR r0 = A0B(r0, r5, r7, r8)
            return r0
        L6b:
            if (r6 == 0) goto L6e
            goto L62
        L6e:
            return r3
        L6f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC2669cZ.A0A(com.facebook.ads.redexgen.X.Mk, java.util.List):com.facebook.ads.redexgen.X.cR");
    }

    public static C2661cR A0B(String str, Matcher matcher, C2181Mk c2181Mk, List<C2657cN> list) {
        C2668cY c2668cY = new C2668cY();
        try {
            c2668cY.A09 = AbstractC2670ca.A01((String) AbstractC2159Ln.A01(matcher.group(1)));
            c2668cY.A08 = AbstractC2670ca.A01((String) AbstractC2159Ln.A01(matcher.group(2)));
            A0L((String) AbstractC2159Ln.A01(matcher.group(3)), c2668cY);
            StringBuilder sb = new StringBuilder();
            String strA0T = c2181Mk.A0T();
            while (!TextUtils.isEmpty(strA0T)) {
                if (sb.length() > 0) {
                    sb.append(A0C(0, 1, 18));
                }
                sb.append(strA0T.trim());
                strA0T = c2181Mk.A0T();
            }
            c2668cY.A0A = A07(str, sb.toString(), list);
            return c2668cY.A08();
        } catch (NumberFormatException unused) {
            MV.A07(A0C(167, 15, 103), A0C(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, 30, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE) + matcher.group());
            return null;
        }
    }

    public static String A0D(String str) {
        String strTrim = str.trim();
        AbstractC2159Ln.A07(!strTrim.isEmpty());
        return N1.A1P(strTrim, A0C(182, 5, 27))[0];
    }

    public static List<C2666cW> A0E(List<C2657cN> list, String str, C2665cV c2665cV) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C2657cN c2657cN = list.get(i);
            int i2 = c2657cN.A09(str, c2665cV.A01, c2665cV.A03, c2665cV.A02);
            if (i2 > 0) {
                arrayList.add(new C2666cW(i2, c2657cN));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static void A0G(SpannableStringBuilder spannableStringBuilder, C2657cN c2657cN, int i, int i2) {
        if (c2657cN == null) {
            return;
        }
        if (c2657cN.A08() != -1) {
            AbstractC2154Li.A00(spannableStringBuilder, new StyleSpan(c2657cN.A08()), i, i2, 33);
        }
        boolean zA0S = c2657cN.A0S();
        if (A01[0].length() != 3) {
            throw new RuntimeException();
        }
        A01[3] = "Ea2yhfvTbSmnQ3AL9wscme0mkBlQAAQb";
        if (zA0S) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (c2657cN.A0T()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (c2657cN.A0R()) {
            AbstractC2154Li.A00(spannableStringBuilder, new ForegroundColorSpan(c2657cN.A05()), i, i2, 33);
        }
        if (c2657cN.A0Q()) {
            AbstractC2154Li.A00(spannableStringBuilder, new BackgroundColorSpan(c2657cN.A04()), i, i2, 33);
        }
        if (c2657cN.A0K() != null) {
            AbstractC2154Li.A00(spannableStringBuilder, new TypefaceSpan(c2657cN.A0K()), i, i2, 33);
        }
        switch (c2657cN.A06()) {
            case 1:
                AbstractC2154Li.A00(spannableStringBuilder, new AbsoluteSizeSpan((int) c2657cN.A03(), true), i, i2, 33);
                break;
            case 2:
                AbstractC2154Li.A00(spannableStringBuilder, new RelativeSizeSpan(c2657cN.A03()), i, i2, 33);
                break;
            case 3:
                AbstractC2154Li.A00(spannableStringBuilder, new RelativeSizeSpan(c2657cN.A03() / 100.0f), i, i2, 33);
                break;
        }
        if (c2657cN.A0P()) {
            spannableStringBuilder.setSpan(new C2345Te(), i, i2, 33);
        }
    }

    public static void A0I(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i, int i2) {
        for (String className : set) {
            if (A04.containsKey(className)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(A04.get(className).intValue()), i, i2, 33);
            } else if (A03.containsKey(className)) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(A03.get(className).intValue()), i, i2, 33);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:10:0x0055  */
    /* JADX WARN: Code duplicated, block: B:11:0x0060  */
    /* JADX WARN: Code duplicated, block: B:12:0x0066  */
    /* JADX WARN: Code duplicated, block: B:13:0x006c  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:35:0x0107  */
    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    /* JADX WARN: Code duplicated, block: B:6:0x000b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0041  */
    public static void A0J(String str, SpannableStringBuilder spannableStringBuilder) {
        byte b;
        String[] strArr;
        switch (str.hashCode()) {
            case 3309:
                String[] strArr2 = A01;
                if (strArr2[4].length() != strArr2[5].length()) {
                    String[] strArr3 = A01;
                    strArr3[6] = "GyrUgWYUHRVnM8l23XJQu5UGp1";
                    strArr3[2] = "NiXpxqomIEZVEieKHTFkMNs61I";
                    if (str.equals(A0C(307, 2, 41))) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                } else {
                    A01[1] = "gYg0TbBGZj44BoLjOyPjmRv7LvSL93bP";
                    if (str.equals(A0C(307, 2, 17))) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                }
                switch (b) {
                    case 0:
                        spannableStringBuilder.append('<');
                        return;
                    case 1:
                        spannableStringBuilder.append('>');
                        return;
                    case 2:
                        spannableStringBuilder.append(' ');
                        return;
                    case 3:
                        strArr = A01;
                        if (strArr[4].length() == strArr[5].length()) {
                            throw new RuntimeException();
                        }
                        A01[1] = "PWkqGnWkxZ1sWbRjRe0mw063p817mvNo";
                        spannableStringBuilder.append('&');
                        return;
                    default:
                        MV.A07(A0C(167, 15, 103), A0C(Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE, 31, 32) + str + A0C(16, 2, 100));
                        return;
                }
            case 3464:
                if (str.equals(A0C(378, 2, 71))) {
                    b = 0;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        spannableStringBuilder.append('<');
                        return;
                    case 1:
                        spannableStringBuilder.append('>');
                        return;
                    case 2:
                        spannableStringBuilder.append(' ');
                        return;
                    case 3:
                        strArr = A01;
                        if (strArr[4].length() == strArr[5].length()) {
                            throw new RuntimeException();
                        }
                        A01[1] = "PWkqGnWkxZ1sWbRjRe0mw063p817mvNo";
                        spannableStringBuilder.append('&');
                        return;
                    default:
                        MV.A07(A0C(167, 15, 103), A0C(Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE, 31, 32) + str + A0C(16, 2, 100));
                        return;
                }
            case 96708:
                if (A01[1].charAt(15) != 'j') {
                    throw new RuntimeException();
                }
                A01[3] = "6WzuZpwu0TX1H2KVN9ho2pT5H3xGspev";
                if (str.equals(A0C(Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, 3, 63))) {
                    b = 3;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        spannableStringBuilder.append('<');
                        return;
                    case 1:
                        spannableStringBuilder.append('>');
                        return;
                    case 2:
                        spannableStringBuilder.append(' ');
                        return;
                    case 3:
                        strArr = A01;
                        if (strArr[4].length() == strArr[5].length()) {
                            throw new RuntimeException();
                        }
                        A01[1] = "PWkqGnWkxZ1sWbRjRe0mw063p817mvNo";
                        spannableStringBuilder.append('&');
                        return;
                    default:
                        MV.A07(A0C(167, 15, 103), A0C(Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE, 31, 32) + str + A0C(16, 2, 100));
                        return;
                }
            case 3374865:
                if (str.equals(A0C(393, 4, Sdk.SDKError.Reason.TPAT_ERROR_VALUE))) {
                    b = 2;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        spannableStringBuilder.append('<');
                        return;
                    case 1:
                        spannableStringBuilder.append('>');
                        return;
                    case 2:
                        spannableStringBuilder.append(' ');
                        return;
                    case 3:
                        strArr = A01;
                        if (strArr[4].length() == strArr[5].length()) {
                            throw new RuntimeException();
                        }
                        A01[1] = "PWkqGnWkxZ1sWbRjRe0mw063p817mvNo";
                        spannableStringBuilder.append('&');
                        return;
                    default:
                        MV.A07(A0C(167, 15, 103), A0C(Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE, 31, 32) + str + A0C(16, 2, 100));
                        return;
                }
            default:
                b = -1;
                switch (b) {
                    case 0:
                        spannableStringBuilder.append('<');
                        return;
                    case 1:
                        spannableStringBuilder.append('>');
                        return;
                    case 2:
                        spannableStringBuilder.append(' ');
                        return;
                    case 3:
                        strArr = A01;
                        if (strArr[4].length() == strArr[5].length()) {
                            throw new RuntimeException();
                        }
                        A01[1] = "PWkqGnWkxZ1sWbRjRe0mw063p817mvNo";
                        spannableStringBuilder.append('&');
                        return;
                    default:
                        MV.A07(A0C(167, 15, 103), A0C(Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE, 31, 32) + str + A0C(16, 2, 100));
                        return;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0011  */
    public static void A0K(String str, C2665cV c2665cV, List<C2664cU> list, SpannableStringBuilder spannableStringBuilder, List<C2657cN> list2) {
        int start;
        int i = c2665cV.A00;
        int i2 = spannableStringBuilder.length();
        String str2 = c2665cV.A01;
        int start2 = str2.hashCode();
        switch (start2) {
            case 0:
                if (str2.equals(A0C(0, 0, 3))) {
                    start = 7;
                } else {
                    start = -1;
                }
                break;
            case 98:
                if (str2.equals(A0C(Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, 1, 84))) {
                    start = 0;
                } else {
                    start = -1;
                }
                break;
            case 99:
                if (str2.equals(A0C(293, 1, Sdk.SDKError.Reason.TPAT_ERROR_VALUE))) {
                    start = 4;
                } else {
                    start = -1;
                }
                break;
            case 105:
                if (str2.equals(A0C(Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE, 1, 44))) {
                    start = 1;
                } else {
                    start = -1;
                }
                break;
            case ASSET_FAILED_STATUS_CODE_VALUE:
                if (str2.equals(A0C(430, 1, 15))) {
                    start = 3;
                } else {
                    start = -1;
                }
                break;
            case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                if (str2.equals(A0C(431, 1, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE))) {
                    start = 6;
                } else {
                    start = -1;
                }
                break;
            case 3314158:
                if (str2.equals(A0C(341, 4, 104))) {
                    start = 5;
                } else {
                    start = -1;
                }
                break;
            case 3511770:
                if (str2.equals(A0C(TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 4, 65))) {
                    start = 2;
                } else {
                    start = -1;
                }
                break;
            default:
                start = -1;
                break;
        }
        switch (start) {
            case 0:
                spannableStringBuilder.setSpan(new StyleSpan(1), i, i2, 33);
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
                break;
            case 2:
                A0H(spannableStringBuilder, str, c2665cV, list, list2);
                break;
            case 3:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
                break;
            case 4:
                A0I(spannableStringBuilder, c2665cV.A03, i, i2);
                break;
            case 5:
            case 6:
            case 7:
                break;
            default:
                return;
        }
        List<C2666cW> listA0E = A0E(list2, str, c2665cV);
        for (int end = 0; end < start; end++) {
            A0G(spannableStringBuilder, listA0E.get(end).A01, i, i2);
        }
    }

    public static void A0L(String str, C2668cY c2668cY) {
        String name = A0C(167, 15, 103);
        Matcher matcher = A05.matcher(str);
        while (matcher.find()) {
            String str2 = (String) AbstractC2159Ln.A01(matcher.group(1));
            String str3 = (String) AbstractC2159Ln.A01(matcher.group(2));
            try {
                if (A0C(353, 4, 88).equals(str2)) {
                    A0M(str3, c2668cY);
                } else if (A0C(Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 5, 13).equals(str2)) {
                    c2668cY.A06 = A03(str3);
                } else if (A0C(397, 8, 63).equals(str2)) {
                    A0N(str3, c2668cY);
                } else if (A0C(421, 4, 3).equals(str2)) {
                    c2668cY.A02 = AbstractC2670ca.A00(str3);
                } else if (A0C(432, 8, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE).equals(str2)) {
                    c2668cY.A07 = A04(str3);
                } else {
                    MV.A07(name, A0C(147, 20, 7) + str2 + A0C(15, 1, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE) + str3);
                }
            } catch (NumberFormatException unused) {
                MV.A07(name, A0C(91, 26, 109) + matcher.group());
            }
        }
    }

    public static void A0M(String str, C2668cY c2668cY) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            int commaIndex = iIndexOf + 1;
            c2668cY.A03 = A01(str.substring(commaIndex));
            str = str.substring(0, iIndexOf);
        }
        if (A01[7].length() != 27) {
            throw new RuntimeException();
        }
        A01[3] = "uQN84nlA75y04Oqx4R9Gb8Wkkyggth9o";
        if (str.endsWith(A0C(2, 1, 91))) {
            c2668cY.A00 = AbstractC2670ca.A00(str);
            c2668cY.A04 = 0;
        } else {
            int commaIndex2 = Integer.parseInt(str);
            c2668cY.A00 = commaIndex2;
            c2668cY.A04 = 1;
        }
    }

    public static void A0N(String str, C2668cY c2668cY) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            int commaIndex = iIndexOf + 1;
            int iA02 = A02(str.substring(commaIndex));
            if (A01[1].charAt(15) != 'j') {
                throw new RuntimeException();
            }
            A01[1] = "kcnRMJamAmHiFzajDDSuDUVQ6UORDZwH";
            c2668cY.A05 = iA02;
            str = str.substring(0, iIndexOf);
        }
        c2668cY.A01 = AbstractC2670ca.A00(str);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:6:0x000d A[RETURN] */
    public static boolean A0O(String str) {
        byte b;
        switch (str.hashCode()) {
            case 98:
                if (A01[1].charAt(15) != 'j') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[6] = "gYEzXRCSaP0btoiuoQChE5deOS";
                strArr[2] = "ZzpTgQFLhTliv71J3BKznVcuUA";
                if (str.equals(A0C(Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, 1, 84))) {
                    b = 0;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    default:
                        return false;
                }
            case 99:
                if (str.equals(A0C(293, 1, Sdk.SDKError.Reason.TPAT_ERROR_VALUE))) {
                    b = 1;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    default:
                        return false;
                }
            case 105:
                if (str.equals(A0C(Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE, 1, 44))) {
                    b = 2;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    default:
                        return false;
                }
            case ASSET_FAILED_STATUS_CODE_VALUE:
                if (str.equals(A0C(430, 1, 15))) {
                    b = 6;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    default:
                        return false;
                }
            case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                if (str.equals(A0C(431, 1, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE))) {
                    b = 7;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    default:
                        return false;
                }
            case 3650:
                if (str.equals(A0C(TTAdConstant.VIDEO_COVER_URL_CODE, 2, 56))) {
                    b = 5;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    default:
                        return false;
                }
            case 3314158:
                if (str.equals(A0C(341, 4, 104))) {
                    b = 3;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    default:
                        return false;
                }
            case 3511770:
                if (str.equals(A0C(TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 4, 65))) {
                    b = 4;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    default:
                        return false;
                }
        }
        b = -1;
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }
}
