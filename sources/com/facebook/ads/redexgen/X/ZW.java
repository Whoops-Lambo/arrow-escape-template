package com.facebook.ads.redexgen.X;

import android.util.Base64;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.flac.PictureFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.vorbis.VorbisComment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public abstract class ZW {
    public static byte[] A00;
    public static String[] A01 = {"CSNRKhbmsgdfQ7aSJvnwDgN2Z87LRzVR", "BGNWBKlJ4HuPsa2ZnSdmD0oh8EkwiDh8", "FsRU8HkAwVe7RCT94HEIDLk9huzVf", "JIDKT0Kle88LNybwjYJRV6JmiLTQ5sE4", "sKHcwWBr5rfr2dbZoykAG6aQt2aDb", "M", "i3aCrCY4btc3l2ekWM3kOdcVo1EcH", "WHExPvKTx7PFNdezHTj3QzMQhOYw1aTj"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static ZV A06(C2181Mk c2181Mk) throws L9 {
        A0C(1, c2181Mk, false);
        int iA0F = c2181Mk.A0F();
        int iA0I = c2181Mk.A0I();
        int iA0F2 = c2181Mk.A0F();
        int iA0E = c2181Mk.A0E();
        if (iA0E <= 0) {
            iA0E = -1;
        }
        int iA0E2 = c2181Mk.A0E();
        if (iA0E2 <= 0) {
            iA0E2 = -1;
            if (A01[5].length() == 16) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[1] = "ePPv72s43IVhlXZ7r99oDj0FnR0cec3p";
            strArr[0] = "TAVSpPlR4HHANZfnut3JDDWfCxBKXdg5";
        }
        int iA0E3 = c2181Mk.A0E();
        if (iA0E3 <= 0) {
            iA0E3 = -1;
        }
        int iA0I2 = c2181Mk.A0I();
        return new ZV(iA0F, iA0I, iA0F2, iA0E, iA0E2, iA0E3, (int) Math.pow(2.0d, iA0I2 & 15), (int) Math.pow(2.0d, (iA0I2 & 240) >> 4), (c2181Mk.A0I() & 1) > 0, Arrays.copyOf(c2181Mk.A0l(), c2181Mk.A0A()));
    }

    public static String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 66);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{11, 113, 86, 94, 91, 82, 83, 23, 67, 88, 23, 71, 86, 69, 68, 82, 23, 97, 88, 69, 85, 94, 68, 23, 84, 88, 90, 90, 82, 89, 67, 13, 23, 85, 114, 122, 127, 118, 119, 51, 103, 124, 51, 99, 114, 97, 96, 118, 51, 101, 124, 97, 113, 122, 96, 51, 99, 122, 112, 103, 102, 97, 118, 8, 0, 17, 4, 1, 4, 17, 4, 26, 7, 9, 10, 6, 14, 26, 21, 12, 6, 17, 16, 23, 0, 34, 27, 6, 22, 29, 7, 33, 0, 29, 24, 103, 122, 114, 103, 97, 118, 103, 102, 34, 97, 106, 99, 112, 99, 97, 118, 103, 112, 113, 34, 37, 116, 109, 112, 96, 107, 113, 37, 33, 60, 52, 33, 39, 48, 33, 32, 100, 39, 43, 32, 33, 100, 38, 43, 43, 47, 100, 48, 43, 100, 55, 48, 37, 54, 48, 100, 51, 45, 48, 44, 100, 31, 116, 60, 113, 114, 104, 100, 116, 60, 112, 119, 104, 100, 116, 60, 112, 118, 25, 100, 37, 48, 100, 62, 35, 43, 62, 56, 47, 62, 63, 123, 51, 62, 58, 63, 62, 41, 123, 47, 34, 43, 62, 123, 86, 92, 95, 95, 66, 16, 68, 73, 64, 85, 16, 87, 66, 85, 81, 68, 85, 66, 16, 68, 88, 81, 94, 16, 1, 16, 94, 95, 68, 16, 84, 85, 83, 95, 84, 81, 82, 92, 85, 10, 16, 117, 97, 114, 126, 122, 125, 116, 51, 113, 122, 103, 51, 114, 117, 103, 118, 97, 51, 126, 124, 119, 118, 96, 51, 125, 124, 103, 51, 96, 118, 103, 51, 114, 96, 51, 118, 107, 99, 118, 112, 103, 118, 119, 49, 37, 54, 58, 62, 57, 48, 119, 53, 62, 35, 119, 50, 47, 39, 50, 52, 35, 50, 51, 119, 35, 56, 119, 53, 50, 119, 36, 50, 35, 93, 94, 94, 90, 68, 65, 17, 69, 72, 65, 84, 17, 86, 67, 84, 80, 69, 84, 67, 17, 69, 89, 80, 95, 17, 3, 17, 95, 94, 69, 17, 85, 84, 82, 94, 85, 80, 83, 93, 84, 11, 17, 82, 94, 79, 79, 86, 81, 88, 31, 75, 70, 79, 90, 31, 80, 75, 87, 90, 77, 31, 75, 87, 94, 81, 31, 15, 31, 81, 80, 75, 31, 76, 74, 79, 79, 80, 77, 75, 90, 91, 5, 31, 106, 118, 123, 121, 127, 114, 117, 118, 126, 127, 104, 58, 117, 124, 58, 110, 115, 119, 127, 58, 126, 117, 119, 123, 115, 116, 58, 110, 104, 123, 116, 105, 124, 117, 104, 119, 105, 58, 116, 117, 110, 58, 96, 127, 104, 117, 127, 126, 58, 117, 111, 110, 2, 21, 3, 25, 20, 5, 21, 36, 9, 0, 21, 80, 23, 2, 21, 17, 4, 21, 2, 80, 4, 24, 17, 30, 80, 66, 80, 25, 3, 80, 30, 31, 4, 80, 20, 21, 19, 31, 20, 17, 18, 28, 21, 6, 29, 82, 0, 23, 1, 23, 0, 4, 23, 22, 82, 16, 27, 6, 1, 82, 31, 7, 1, 6, 82, 16, 23, 82, 8, 23, 0, 29, 82, 19, 20, 6, 23, 0, 82, 31, 19, 2, 2, 27, 28, 21, 82, 17, 29, 7, 2, 30, 27, 28, 21, 82, 1, 6, 23, 2, 1, 65, 90, 90, 21, 70, 93, 90, 71, 65, 21, 93, 80, 84, 81, 80, 71, 15, 21};
    }

    static {
        A08();
    }

    public static int A00(int i) {
        int val = 0;
        while (i > 0) {
            val++;
            i >>>= 1;
        }
        return val;
    }

    public static long A01(long j, long j2) {
        return (long) Math.floor(Math.pow(j, 1.0d / j2));
    }

    public static Metadata A02(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String[] strArrA1P = N1.A1P(str, A07(0, 1, 116));
            int length = strArrA1P.length;
            String strA07 = A07(85, 10, 54);
            if (length != 2) {
                MV.A07(strA07, A07(1, 32, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) + str);
            } else if (strArrA1P[0].equals(A07(63, 22, 7))) {
                try {
                    arrayList.add(PictureFrame.A00(new C2181Mk(Base64.decode(strArrA1P[1], 0))));
                } catch (RuntimeException e) {
                    int i2 = A01[4].length();
                    if (i2 != 29) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A01;
                    strArr[7] = "iTort3w6F8uQNOr7xrlLxkVs8SYtT5Z1";
                    strArr[3] = "SSTu6mrb48DcNiSCKnJ8tB3UoGhdW8fv";
                    MV.A0A(strA07, A07(33, 30, 81), e);
                }
            } else {
                arrayList.add(new VorbisComment(strArrA1P[0], strArrA1P[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static ZS A03(ZR zr) throws L9 {
        long jA01;
        if (zr.A02(24) == 5653314) {
            int iA02 = zr.A02(16);
            int lookupType = zr.A02(24);
            long[] jArr = new long[lookupType];
            boolean zA04 = zr.A04();
            if (!zA04) {
                boolean isSparse = zr.A04();
                for (int i = 0; i < entries; i++) {
                    if (isSparse) {
                        if (zr.A04()) {
                            int entries = zr.A02(5);
                            jArr[i] = entries + 1;
                        } else {
                            jArr[i] = 0;
                        }
                    } else {
                        int entries2 = zr.A02(5);
                        jArr[i] = entries2 + 1;
                    }
                }
            } else {
                int j = zr.A02(5) + 1;
                int num = 0;
                while (num < entries) {
                    int entries3 = lookupType - num;
                    int i2 = zr.A02(A00(entries3));
                    for (int i3 = 0; i3 < i2; i3++) {
                        int length = jArr.length;
                        int dimensions = A01[5].length();
                        if (dimensions == 16) {
                            throw new RuntimeException();
                        }
                        A01[5] = "yNl2PawFN0E4cLaf5Q4KGEYaz";
                        if (num >= length) {
                            break;
                        }
                        jArr[num] = j;
                        num++;
                    }
                    j++;
                }
            }
            int iA03 = zr.A02(4);
            if (iA03 <= 2) {
                if (iA03 == 1 || iA03 == 2) {
                    zr.A03(32);
                    zr.A03(32);
                    int iA04 = zr.A02(4) + 1;
                    zr.A03(1);
                    if (iA03 == 1) {
                        if (iA02 != 0) {
                            jA01 = A01(lookupType, iA02);
                        } else {
                            jA01 = 0;
                        }
                    } else {
                        jA01 = ((long) lookupType) * ((long) iA02);
                    }
                    int entries4 = (int) (((long) iA04) * jA01);
                    zr.A03(entries4);
                }
                return new ZS(iA02, lookupType, jArr, iA03, zA04);
            }
            throw L9.A01(A07(Sdk.SDKError.Reason.EVALUATE_JAVASCRIPT_FAILED_VALUE, 42, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE) + iA03, null);
        }
        throw L9.A01(A07(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, 55, 6) + zr.A01(), null);
    }

    public static ZT A04(C2181Mk c2181Mk) throws L9 {
        return A05(c2181Mk, true, true);
    }

    public static ZT A05(C2181Mk c2181Mk, boolean z, boolean z2) throws L9 {
        if (z) {
            A0C(3, c2181Mk, false);
        }
        int length = (int) c2181Mk.A0O();
        String strA0W = c2181Mk.A0W(length);
        int length2 = strA0W.length();
        int i = 7 + 4 + length2;
        long jA0O = c2181Mk.A0O();
        int length3 = (int) jA0O;
        String[] comments = new String[length3];
        int i2 = i + 4;
        int i3 = 0;
        while (commentListLen < jA0O) {
            long commentListLen = c2181Mk.A0O();
            int length4 = (int) commentListLen;
            comments[i3] = c2181Mk.A0W(length4);
            int length5 = comments[i3].length();
            i2 = i2 + 4 + length5;
            i3++;
        }
        if (z2) {
            int length6 = c2181Mk.A0I();
            if ((length6 & 1) == 0) {
                String vendor = A07(283, 30, 21);
                throw L9.A01(vendor, null);
            }
        }
        return new ZT(strA0W, comments, i2 + 1);
    }

    public static void A09(int i, ZR zr) throws L9 {
        int j;
        int iA02 = zr.A02(6) + 1;
        for (int i2 = 0; i2 < iA02; i2++) {
            int iA03 = zr.A02(16);
            if (iA03 != 0) {
                MV.A05(A07(85, 10, 54), A07(355, 41, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) + iA03);
            } else {
                if (zr.A04()) {
                    j = zr.A02(4) + 1;
                } else {
                    j = 1;
                }
                if (zr.A04()) {
                    int iA04 = zr.A02(8) + 1;
                    for (int i3 = 0; i3 < iA04; i3++) {
                        int mappingsCount = i - 1;
                        zr.A03(A00(mappingsCount));
                        int mappingsCount2 = i - 1;
                        zr.A03(A00(mappingsCount2));
                    }
                }
                int mappingsCount3 = zr.A02(2);
                if (mappingsCount3 == 0) {
                    if (j > 1) {
                        for (int mappingsCount4 = 0; mappingsCount4 < i; mappingsCount4++) {
                            zr.A03(4);
                        }
                    }
                    for (int i4 = 0; i4 < j; i4++) {
                        zr.A03(8);
                        zr.A03(8);
                        zr.A03(8);
                        String[] strArr = A01;
                        String str = strArr[1];
                        String str2 = strArr[0];
                        int iCharAt = str.charAt(20);
                        int mappingsCount5 = str2.charAt(20);
                        if (iCharAt != mappingsCount5) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A01;
                        strArr2[1] = "p1VKg473YIoEl67qOqhRDsbexTPOBoSx";
                        strArr2[0] = "wLMZnqvdTHQilTz4OPQyD0YtUnpClS8H";
                    }
                } else {
                    throw L9.A01(A07(491, 58, 48), null);
                }
            }
        }
    }

    public static void A0A(ZR zr) throws L9 {
        int iA02 = zr.A02(6) + 1;
        for (int floorNumberOfBooks = 0; floorNumberOfBooks < iA02; floorNumberOfBooks++) {
            int iA03 = zr.A02(16);
            switch (iA03) {
                case 0:
                    zr.A03(8);
                    zr.A03(16);
                    zr.A03(16);
                    zr.A03(6);
                    zr.A03(8);
                    int floorCount = zr.A02(4);
                    int floorCount2 = floorCount + 1;
                    for (int i = 0; i < floorCount2; i++) {
                        zr.A03(8);
                    }
                    break;
                case 1:
                    String[] strArr = A01;
                    String str = strArr[7];
                    String str2 = strArr[3];
                    int floorCount3 = str.charAt(12);
                    if (floorCount3 != str2.charAt(12)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A01;
                    strArr2[7] = "R9QSrAUJj5wzNqYOn0guqAltbWTaHU34";
                    strArr2[3] = "mkcGS6UH8ZuiN3MgqrVe1LrFKb74rQlB";
                    int floorCount4 = zr.A02(5);
                    int i2 = -1;
                    int[] iArr = new int[floorCount4];
                    for (int i3 = 0; i3 < floorCount4; i3++) {
                        iArr[i3] = zr.A02(4);
                        if (iArr[i3] > i2) {
                            i2 = iArr[i3];
                        }
                    }
                    int[] classDimensions = new int[i2 + 1];
                    for (int j = 0; j < classDimensions.length; j++) {
                        classDimensions[j] = zr.A02(3) + 1;
                        int iA04 = zr.A02(2);
                        if (iA04 > 0) {
                            zr.A03(8);
                        }
                        for (int i4 = 0; i4 < (1 << iA04); i4++) {
                            zr.A03(8);
                        }
                    }
                    zr.A03(2);
                    int iA05 = zr.A02(4);
                    int maximumClass = 0;
                    int i5 = 0;
                    for (int count = 0; count < floorCount4; count++) {
                        maximumClass += classDimensions[iArr[count]];
                        while (i5 < maximumClass) {
                            zr.A03(iA05);
                            i5++;
                        }
                    }
                    break;
                    break;
                default:
                    throw L9.A01(A07(199, 41, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE) + iA03, null);
            }
        }
    }

    public static void A0B(ZR zr) throws L9 {
        int iA02 = zr.A02(6) + 1;
        for (int i = 0; i < iA02; i++) {
            int residueCount = zr.A02(16);
            if (residueCount <= 2) {
                zr.A03(24);
                zr.A03(24);
                zr.A03(24);
                int iA03 = zr.A02(6) + 1;
                int residueCount2 = A01[5].length();
                if (residueCount2 == 16) {
                    throw new RuntimeException();
                }
                A01[4] = "4LakvCkGGTsKaO9zNFmvNb4OHtg8M";
                zr.A03(8);
                int[] iArr = new int[iA03];
                for (int i2 = 0; i2 < iA03; i2++) {
                    int classifications = 0;
                    int residueType = zr.A02(3);
                    if (zr.A04()) {
                        classifications = zr.A02(5);
                    }
                    int i3 = classifications * 8;
                    iArr[i2] = i3 + residueType;
                }
                for (int classifications2 = 0; classifications2 < iA03; classifications2++) {
                    for (int residueType2 = 0; residueType2 < 8; residueType2++) {
                        int i4 = iArr[classifications2];
                        if ((i4 & (1 << residueType2)) != 0) {
                            zr.A03(8);
                        }
                    }
                }
            } else {
                throw L9.A01(A07(448, 43, 50), null);
            }
        }
    }

    public static boolean A0C(int i, C2181Mk c2181Mk, boolean z) throws L9 {
        if (c2181Mk.A07() < 7) {
            if (z) {
                return false;
            }
            throw L9.A01(A07(549, 18, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) + c2181Mk.A07(), null);
        }
        if (c2181Mk.A0I() != i) {
            if (z) {
                return false;
            }
            throw L9.A01(A07(178, 21, 25) + Integer.toHexString(i), null);
        }
        if (c2181Mk.A0I() == 118 && c2181Mk.A0I() == 111 && c2181Mk.A0I() == 114 && c2181Mk.A0I() == 98 && c2181Mk.A0I() == 105) {
            int iA0I = c2181Mk.A0I();
            String[] strArr = A01;
            if (strArr[2].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A01[4] = "Td5hkq7Sy845zGsmk1htgwwInW642";
            if (iA0I == 115) {
                if (A01[4].length() != 29) {
                    throw new RuntimeException();
                }
                A01[5] = "qjbyChnn8";
                return true;
            }
        }
        if (z) {
            return false;
        }
        throw L9.A01(A07(95, 28, 64), null);
    }

    public static ZU[] A0D(C2181Mk c2181Mk, int i) throws L9 {
        A0C(5, c2181Mk, false);
        int iA0I = c2181Mk.A0I() + 1;
        ZR zr = new ZR(c2181Mk.A0l());
        int numberOfBooks = c2181Mk.A09();
        zr.A03(numberOfBooks * 8);
        for (int numberOfBooks2 = 0; numberOfBooks2 < iA0I; numberOfBooks2++) {
            A03(zr);
        }
        int numberOfBooks3 = zr.A02(6);
        int timeCount = numberOfBooks3 + 1;
        for (int i2 = 0; i2 < timeCount; i2++) {
            int numberOfBooks4 = zr.A02(16);
            if (numberOfBooks4 != 0) {
                throw L9.A01(A07(396, 52, 88), null);
            }
        }
        A0A(zr);
        A0B(zr);
        A09(i, zr);
        ZU[] zuArrA0E = A0E(zr);
        if (zr.A04()) {
            return zuArrA0E;
        }
        throw L9.A01(A07(240, 43, 81), null);
    }

    public static ZU[] A0E(ZR zr) {
        int iA02 = zr.A02(6) + 1;
        ZU[] zuArr = new ZU[iA02];
        for (int windowType = 0; windowType < iA02; windowType++) {
            boolean zA04 = zr.A04();
            int iA03 = zr.A02(16);
            int i = zr.A02(16);
            zuArr[windowType] = new ZU(zA04, iA03, i, zr.A02(8));
        }
        return zuArr;
    }
}
