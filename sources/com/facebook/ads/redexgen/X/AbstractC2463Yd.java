package com.facebook.ads.redexgen.X;

import androidx.media3.extractor.ts.TsExtractor;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.androidx.media3.common.DrmInitData;
import com.inmobi.media.core.config.models.AdConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public abstract class AbstractC2463Yd {
    public static byte[] A00;
    public static String[] A01 = {"gWfa92piv5tZZ0UbViZnkD", "8BWlWUZHwy5zGo", "KOwBd1kGbsETwJOQr", "AjHDM0eUBZHm3mjlWcYFg", "OBBgCtWIEZkDrGCsZywbf0a3to7dIhbP", "7ThbdWcppwWq2UlElfMVB4JMD6", "kRYaGlULPZIUrEfdkh6Tyf7E4GahIHHj", "phVTJZlUn3P7Zs8mUd1"};
    public static final int[] A02;
    public static final int[] A03;
    public static final int[] A04;
    public static final int[] A05;
    public static final int[] A06;
    public static final int[] A07;

    public static String A0A(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A00 = new byte[]{41, 61, 44, 33, 39, 103, 41, 43, 123, 22, 2, 19, 30, 24, 88, 18, 22, 20, 68, 3, 23, 6, 11, 13, 77, 7, 3, 1, 81, 79, 8, 13, 1};
    }

    static {
        A0B();
        A03 = new int[]{1, 2, 3, 6};
        A05 = new int[]{48000, 44100, 32000};
        A06 = new int[]{24000, 22050, 16000};
        A04 = new int[]{2, 1, 2, 3, 3, 4, 4, 5};
        A02 = new int[]{32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 384, 448, 512, 576, 640};
        A07 = new int[]{69, 87, 104, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, TsExtractor.TS_STREAM_TYPE_DTS_UHD, 174, 208, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    }

    public static int A00(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int halfFrmsizecod = A05.length;
        if (i >= halfFrmsizecod || i2 < 0) {
            return -1;
        }
        int halfFrmsizecod2 = A07.length;
        if (i3 >= halfFrmsizecod2) {
            return -1;
        }
        int i4 = A05[i];
        if (A01[7].length() != 19) {
            throw new RuntimeException();
        }
        A01[7] = "5L7RX5JKrgrtk9KH87r";
        if (i4 == 44100) {
            int halfFrmsizecod3 = i2 % 2;
            return (A07[i3] + halfFrmsizecod3) * 2;
        }
        int sampleRate = A02[i3];
        if (i4 == 32000) {
            int halfFrmsizecod4 = sampleRate * 6;
            return halfFrmsizecod4;
        }
        int halfFrmsizecod5 = sampleRate * 4;
        return halfFrmsizecod5;
    }

    public static int A01(int i, int i2, int i3) {
        return (i * i2) / (i3 * 32);
    }

    public static int A02(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int startIndex = byteBuffer.limit();
        int i = startIndex - 10;
        for (int i2 = iPosition; i2 <= i; i2++) {
            int startIndex2 = i2 + 4;
            int endIndex = N1.A0F(byteBuffer, startIndex2) & (-2);
            if (endIndex == -126718022) {
                return i2 - iPosition;
            }
        }
        int endIndex2 = A01[7].length();
        if (endIndex2 != 19) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[3] = "eOMYxb0wLSmLQ0G7YxyDe";
        strArr[0] = "TTeIHa3Ep1TtA6CuQAEFem";
        return -1;
    }

    public static int A03(ByteBuffer byteBuffer) {
        boolean isEac3 = ((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10;
        if (isEac3) {
            byte b = byteBuffer.get(byteBuffer.position() + 4);
            if (A01[5].length() != 26) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "DXpfQrtLciruzIVFlvY53";
            strArr[0] = "RlE8CkfxogD2ABvML1zfIj";
            return A03[((b & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static int A04(ByteBuffer byteBuffer, int i) {
        boolean isMlp = (byteBuffer.get((byteBuffer.position() + i) + 7) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 187;
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + (isMlp ? 9 : 8)) >> 4) & 7);
    }

    public static int A05(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        boolean isEac3 = ((bArr[5] & 248) >> 3) > 10;
        if (isEac3) {
            int i = (bArr[2] & 7) << 8;
            int frmsiz = bArr[3];
            if (A01[7].length() != 19) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[6] = "BDIPGES5Iy70rckzqUVITbYsi7nZbnMv";
            strArr[4] = "ZUuqCTmivk9PrDw5xwTjy4JM4X7ycwvf";
            return (((frmsiz & 255) | i) + 1) * 2;
        }
        int fscod = (bArr[4] & 192) >> 6;
        return A00(fscod, bArr[4] & 63);
    }

    public static int A06(byte[] bArr) {
        if (bArr[4] != -8 || bArr[5] != 114 || bArr[6] != 111 || (bArr[7] & 254) != 186) {
            return 0;
        }
        int i = bArr[7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        String[] strArr = A01;
        if (strArr[3].length() != strArr[0].length()) {
            A01[1] = "5vldxXbgycDySC";
            boolean z = i == 187;
            if (A01[5].length() == 26) {
                A01[5] = "0QS0ZKZc8ux9skKjaYGZGoWgg7";
                byte b = bArr[z ? '\t' : '\b'];
                if (A01[2].length() == 16) {
                    throw new RuntimeException();
                }
                A01[1] = "e9o9TbY2rszMey";
                return 40 << ((b >> 4) & 7);
            }
        }
        throw new RuntimeException();
    }

    public static VC A07(C2181Mk c2181Mk, String str, String str2, DrmInitData drmInitData) {
        C2180Mj c2180Mj = new C2180Mj();
        c2180Mj.A0C(c2181Mk);
        int fscod = c2180Mj.A04(2);
        int constantBitrate = A05[fscod];
        c2180Mj.A09(8);
        int i = A04[c2180Mj.A04(3)];
        if (c2180Mj.A04(1) != 0) {
            i++;
        }
        int fscod2 = c2180Mj.A04(5);
        int halfFrmsizecod = A02[fscod2] * 1000;
        c2180Mj.A06();
        c2181Mk.A0f(c2180Mj.A02());
        return new C2126Ke().A0y(str).A11(A0A(0, 9, 52)).A0b(i).A0m(constantBitrate).A0u(drmInitData).A10(str2).A0a(halfFrmsizecod).A0j(halfFrmsizecod).A14();
    }

    public static VC A08(C2181Mk c2181Mk, String str, String str2, DrmInitData drmInitData) {
        C2180Mj c2180Mj = new C2180Mj();
        c2180Mj.A0C(c2181Mk);
        int fscod = c2180Mj.A04(13) * 1000;
        c2180Mj.A09(3);
        int peakBitrate = c2180Mj.A04(2);
        int sampleRate = A05[peakBitrate];
        c2180Mj.A09(10);
        int channelCount = A04[c2180Mj.A04(3)];
        if (c2180Mj.A04(1) != 0) {
            channelCount++;
        }
        c2180Mj.A09(3);
        int peakBitrate2 = A01[2].length();
        if (peakBitrate2 == 16) {
            throw new RuntimeException();
        }
        A01[2] = "kzS1gbjIKacu2hyxgl59K";
        int iA04 = c2180Mj.A04(4);
        c2180Mj.A09(1);
        if (iA04 > 0) {
            c2180Mj.A0A(6);
            if (c2180Mj.A04(1) != 0) {
                channelCount += 2;
            }
            c2180Mj.A09(1);
        }
        String strA0A = A0A(9, 10, 11);
        int peakBitrate3 = c2180Mj.A01();
        if (peakBitrate3 > 7) {
            c2180Mj.A09(7);
            if (c2180Mj.A04(1) != 0) {
                strA0A = A0A(19, 14, 30);
            }
        }
        c2180Mj.A06();
        c2181Mk.A0f(c2180Mj.A02());
        return new C2126Ke().A0y(str).A11(strA0A).A0b(channelCount).A0m(sampleRate).A0u(drmInitData).A10(str2).A0j(fscod).A14();
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0238 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x023a  */
    /* JADX WARN: Code duplicated, block: B:140:0x028d  */
    /* JADX WARN: Code duplicated, block: B:143:0x0295  */
    /* JADX WARN: Code duplicated, block: B:160:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:163:0x0306  */
    /* JADX WARN: Code duplicated, block: B:165:0x0309  */
    /* JADX WARN: Code duplicated, block: B:167:0x030f  */
    /* JADX WARN: Code duplicated, block: B:224:0x0312 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:58:0x0116  */
    /* JADX WARN: Code duplicated, block: B:68:0x0160  */
    public static C2462Yc A09(C2180Mj c2180Mj) {
        String strA0A;
        int iA01;
        int iA00;
        int i;
        int i2;
        int i3;
        int i4;
        int iA04;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int iA03 = c2180Mj.A03();
        c2180Mj.A09(40);
        boolean z = c2180Mj.A04(5) > 10;
        c2180Mj.A08(iA03);
        int i13 = -1;
        if (z) {
            c2180Mj.A09(16);
            switch (c2180Mj.A04(2)) {
                case 0:
                    i13 = 0;
                    break;
                case 1:
                    i13 = 1;
                    break;
                case 2:
                    i13 = 2;
                    break;
                default:
                    i13 = -1;
                    break;
            }
            c2180Mj.A09(3);
            iA00 = (c2180Mj.A04(11) + 1) * 2;
            int iA05 = c2180Mj.A04(2);
            if (iA05 == 3) {
                iA04 = 3;
                i2 = A06[c2180Mj.A04(2)];
                i5 = 6;
            } else {
                iA04 = c2180Mj.A04(2);
                i5 = A03[iA04];
                i2 = A05[iA05];
            }
            i3 = i5 * 256;
            iA01 = A01(iA00, i2, i5);
            int iA06 = c2180Mj.A04(3);
            boolean zA0H = c2180Mj.A0H();
            i4 = A04[iA06] + (zA0H ? 1 : 0);
            c2180Mj.A09(10);
            if (c2180Mj.A0H()) {
                c2180Mj.A09(8);
            }
            if (iA06 == 0) {
                c2180Mj.A09(5);
                if (c2180Mj.A0H()) {
                    c2180Mj.A09(8);
                }
            }
            if (i13 == 1 && c2180Mj.A0H()) {
                c2180Mj.A09(16);
            }
            if (c2180Mj.A0H()) {
                if (iA06 > 2) {
                    c2180Mj.A09(2);
                }
                if ((iA06 & 1) != 0 && iA06 > 2) {
                    i9 = 6;
                    if (A01[2].length() != 16) {
                        String[] strArr = A01;
                        strArr[3] = "hQrdftsyInnC0FGW7zAFQ";
                        strArr[0] = "vhmlqb0IOOCRRUvCvexDx7";
                        c2180Mj.A09(6);
                    }
                    throw new RuntimeException();
                }
                i9 = 6;
                if ((iA06 & 4) != 0) {
                    c2180Mj.A09(i9);
                }
                if (zA0H && c2180Mj.A0H()) {
                    c2180Mj.A09(5);
                }
                if (i13 == 0) {
                    boolean zA0H2 = c2180Mj.A0H();
                    String[] strArr2 = A01;
                    if (strArr2[6].charAt(12) == strArr2[4].charAt(12)) {
                        String[] strArr3 = A01;
                        strArr3[3] = "1gCrStzIkzuvI4aF0le7J";
                        strArr3[0] = "Cgb10VsBqJmebNMa7oD03s";
                        if (zA0H2) {
                            i10 = 6;
                            c2180Mj.A09(6);
                        } else {
                            i10 = 6;
                        }
                    } else if (zA0H2) {
                        i10 = 6;
                        c2180Mj.A09(6);
                    } else {
                        i10 = 6;
                    }
                    if (iA06 == 0 && c2180Mj.A0H()) {
                        c2180Mj.A09(i10);
                    }
                    boolean zA0H3 = c2180Mj.A0H();
                    if (A01[7].length() == 19) {
                        A01[7] = "01QpZ2YUOVRnDDZxQo4";
                        if (zA0H3) {
                            c2180Mj.A09(i10);
                        }
                        int iA07 = c2180Mj.A04(2);
                        if (iA07 == 1) {
                            c2180Mj.A09(5);
                        } else if (iA07 == 2) {
                            c2180Mj.A09(12);
                        } else if (iA07 == 3) {
                            int iA08 = c2180Mj.A04(5);
                            if (c2180Mj.A0H()) {
                                c2180Mj.A09(5);
                                if (c2180Mj.A0H()) {
                                    i11 = 4;
                                    c2180Mj.A09(4);
                                } else {
                                    i11 = 4;
                                }
                                boolean zA0H4 = c2180Mj.A0H();
                                String[] strArr4 = A01;
                                if (strArr4[6].charAt(12) == strArr4[4].charAt(12)) {
                                    String[] strArr5 = A01;
                                    strArr5[6] = "eYTZ9FAJC6g3r5QlXUdHIVgwGuo33fxX";
                                    strArr5[4] = "4WtQFZ4AOvjhrFiBGrnRSJrjKovPQlYh";
                                    if (zA0H4) {
                                        c2180Mj.A09(i11);
                                    }
                                    if (c2180Mj.A0H()) {
                                        c2180Mj.A09(i11);
                                    }
                                    if (c2180Mj.A0H()) {
                                        c2180Mj.A09(i11);
                                    }
                                    boolean zA0H5 = c2180Mj.A0H();
                                    if (A01[5].length() != 26) {
                                        throw new RuntimeException();
                                    }
                                    A01[7] = "cwN6x9xzqXnJ7GnDfdo";
                                    if (zA0H5) {
                                        c2180Mj.A09(i11);
                                    }
                                    if (c2180Mj.A0H()) {
                                        c2180Mj.A09(i11);
                                    }
                                    if (c2180Mj.A0H()) {
                                        c2180Mj.A09(i11);
                                    }
                                    if (c2180Mj.A0H()) {
                                        if (c2180Mj.A0H()) {
                                            c2180Mj.A09(i11);
                                        }
                                        if (c2180Mj.A0H()) {
                                            c2180Mj.A09(i11);
                                        }
                                    }
                                }
                            }
                            if (c2180Mj.A0H()) {
                                c2180Mj.A09(5);
                                if (c2180Mj.A0H()) {
                                    c2180Mj.A09(7);
                                    if (c2180Mj.A0H()) {
                                        c2180Mj.A09(8);
                                    }
                                }
                            }
                            c2180Mj.A09((iA08 + 2) * 8);
                            c2180Mj.A06();
                        }
                        if (iA06 < 2) {
                            if (c2180Mj.A0H()) {
                                c2180Mj.A09(14);
                            }
                            if (iA06 == 0 && c2180Mj.A0H()) {
                                c2180Mj.A09(14);
                            }
                        }
                        boolean zA0H6 = c2180Mj.A0H();
                        String[] strArr6 = A01;
                        if (strArr6[3].length() != strArr6[0].length()) {
                            A01[2] = "MvqqTd6CmuSu7hX9DU0QYIvgEbloyqWM";
                            if (zA0H6) {
                                if (iA04 == 0) {
                                    c2180Mj.A09(5);
                                } else {
                                    for (i12 = 0; i12 < i5; i12++) {
                                        if (c2180Mj.A0H()) {
                                            c2180Mj.A09(5);
                                        }
                                    }
                                }
                            }
                        } else if (zA0H6) {
                            if (iA04 == 0) {
                                c2180Mj.A09(5);
                            } else {
                                while (i12 < i5) {
                                    if (c2180Mj.A0H()) {
                                        c2180Mj.A09(5);
                                    }
                                }
                            }
                        }
                    }
                    throw new RuntimeException();
                }
            }
            if (c2180Mj.A0H()) {
                c2180Mj.A09(5);
                if (iA06 == 2) {
                    c2180Mj.A09(4);
                }
                if (iA06 >= 6) {
                    c2180Mj.A09(2);
                }
                if (c2180Mj.A0H()) {
                    i8 = 8;
                    c2180Mj.A09(8);
                } else {
                    i8 = 8;
                }
                if (iA06 == 0 && c2180Mj.A0H()) {
                    c2180Mj.A09(i8);
                }
                i6 = 3;
                if (iA05 < 3) {
                    c2180Mj.A07();
                }
            } else {
                i6 = 3;
            }
            if (i13 == 0 && iA04 != i6) {
                c2180Mj.A07();
            }
            if (A01[1].length() != 14) {
                A01[1] = "Z9618LWPgCMtBu";
                if (i13 == 2) {
                    if (iA04 != i6 || c2180Mj.A0H()) {
                        i7 = 6;
                        c2180Mj.A09(6);
                    } else {
                        i7 = 6;
                    }
                } else {
                    i7 = 6;
                }
            } else {
                A01[2] = "PiCuKe2A5ED2hDq";
                if (i13 != 2) {
                    i7 = 6;
                } else if (iA04 != i6) {
                    i7 = 6;
                    c2180Mj.A09(6);
                } else {
                    i7 = 6;
                    c2180Mj.A09(6);
                }
            }
            strA0A = A0A(9, 10, 11);
            if (c2180Mj.A0H() && c2180Mj.A04(i7) == 1 && c2180Mj.A04(8) == 1) {
                if (A01[2].length() != 16) {
                    A01[7] = "SwXJl1C3a17owwygpEy";
                    strA0A = A0A(19, 14, 30);
                } else {
                    strA0A = A0A(19, 14, 30);
                }
            }
            return new C2462Yc(strA0A, i13, i4, i2, iA00, i3, iA01);
        }
        strA0A = A0A(0, 9, 52);
        c2180Mj.A09(32);
        int iA09 = c2180Mj.A04(2);
        if (A01[1].length() != 14) {
            String[] strArr7 = A01;
            strArr7[6] = "TJf1TqBSk5yCr5Bsr6bjmSUuZ0GrTmB0";
            strArr7[4] = "CpaKJiVdHIrXrwpBXDl9ZQbkkWKOHOxl";
            if (iA09 == 3) {
                strA0A = null;
            }
        } else {
            String[] strArr8 = A01;
            strArr8[3] = "KewUe4EeMrj1h5Hh1BX7K";
            strArr8[0] = "5UtVxNksJXP3adt6hUPeix";
            if (iA09 == 3) {
                strA0A = null;
            }
        }
        int iA010 = c2180Mj.A04(6);
        iA01 = A02[iA010 / 2] * 1000;
        iA00 = A00(iA09, iA010);
        if (A01[5].length() == 26) {
            A01[2] = "";
            c2180Mj.A09(8);
            int iA011 = c2180Mj.A04(3);
            if ((iA011 & 1) != 0 && iA011 != 1) {
                i = 2;
                c2180Mj.A09(2);
            } else {
                i = 2;
            }
            int i14 = iA011 & 4;
            if (A01[7].length() == 19) {
                A01[2] = "kU8P9";
                if (i14 != 0) {
                    c2180Mj.A09(i);
                }
                if (iA011 == i) {
                    c2180Mj.A09(i);
                }
                i2 = iA09 < A05.length ? A05[iA09] : -1;
                i3 = 1536;
                i4 = A04[iA011] + (c2180Mj.A0H() ? 1 : 0);
                return new C2462Yc(strA0A, i13, i4, i2, iA00, i3, iA01);
            }
        }
        throw new RuntimeException();
    }
}
