package com.facebook.ads.redexgen.X;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.ApicFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.BinaryFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.ChapterFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.ChapterTocFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.CommentFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.GeobFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.MlltFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.PrivFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.TextInformationFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.UrlLinkFrame;
import com.inmobi.media.core.config.models.AdConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8V, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C8V extends AbstractC2255Pn {
    public static byte[] A01;
    public static String[] A02 = {"", "cj5A7A3gSiMrjq6AfdRtUzMbAEmYo4f3", "rN0JSnT6BKYEo3a1vAa71uiPZpT3Npi4", "TFfDjeYUbSMox1u3Lh", "USqEMSAtWn6GCJW8", "LWCCD3Qy9N2tqhYZ51Cp6k4Ti82bug", "tGTUqJzeCARhQZlaOnJcj6ftdoc", "hcOUpEd5Vf6AXCwQ9vkWGhfgcjokDV"};
    public static final InterfaceC2511a0 A03;
    public final InterfaceC2511a0 A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static ApicFrame A04(C2181Mk c2181Mk, int i, int i2) {
        int iA02;
        String strA01;
        int iA0I = c2181Mk.A0I();
        Charset charsetA0M = A0M(iA0I);
        byte[] bArr = new byte[i - 1];
        c2181Mk.A0k(bArr, 0, i - 1);
        String strA0J = A0J(TTAdConstant.AD_ID_IS_NULL_CODE, 6, 32);
        if (i2 == 2) {
            iA02 = 2;
            strA01 = strA0J + XC.A01(new String(bArr, 0, 3, XA.A00));
            if (A0J(TTAdConstant.TARGET_URL_NOT_CONTAINS_TTCLID_CODE, 9, 76).equals(strA01)) {
                strA01 = A0J(408, 10, 56);
            }
        } else {
            iA02 = A02(bArr, 0);
            strA01 = XC.A01(new String(bArr, 0, iA02, XA.A00));
            if (strA01.indexOf(47) == -1) {
                strA01 = strA0J + strA01;
            }
        }
        int i3 = bArr[iA02 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i4 = iA02 + 2;
        int iA03 = A03(bArr, i4, iA0I);
        return new ApicFrame(strA01, new String(bArr, i4, iA03 - i4, charsetA0M), i3, A0Q(bArr, A00(iA0I) + iA03, bArr.length));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static ChapterFrame A06(C2181Mk c2181Mk, int i, int i2, boolean z, int i3, InterfaceC2511a0 interfaceC2511a0) {
        int iA09 = c2181Mk.A09();
        int iA02 = A02(c2181Mk.A0l(), iA09);
        String str = new String(c2181Mk.A0l(), iA09, iA02 - iA09, XA.A00);
        c2181Mk.A0f(iA02 + 1);
        int iA0C = c2181Mk.A0C();
        int iA0C2 = c2181Mk.A0C();
        long jA0Q = c2181Mk.A0Q();
        if (jA0Q == 4294967295L) {
            jA0Q = -1;
        }
        long jA0Q2 = c2181Mk.A0Q();
        String[] strArr = A02;
        if (strArr[4].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[4] = "16GLdZTfXwhLC42l";
        strArr2[6] = "GYTFmdJXXk2kcTCmyq6sFxfgRhF";
        if (jA0Q2 == 4294967295L) {
            jA0Q2 = -1;
        }
        ArrayList arrayList = new ArrayList();
        int i4 = iA09 + i;
        while (c2181Mk.A09() < i4) {
            Id3Frame id3FrameA0B = A0B(i2, c2181Mk, z, i3, interfaceC2511a0);
            if (id3FrameA0B != null) {
                arrayList.add(id3FrameA0B);
            }
        }
        return new ChapterFrame(str, iA0C, iA0C2, jA0Q, jA0Q2, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static GeobFrame A09(C2181Mk c2181Mk, int i) {
        int iA0I = c2181Mk.A0I();
        Charset charsetA0M = A0M(iA0I);
        byte[] bArr = new byte[i - 1];
        c2181Mk.A0k(bArr, 0, i - 1);
        int iA02 = A02(bArr, 0);
        String str = new String(bArr, 0, iA02, XA.A00);
        int i2 = iA02 + 1;
        int iA03 = A03(bArr, i2, iA0I);
        String strA0L = A0L(bArr, i2, iA03, charsetA0M);
        int iA00 = A00(iA0I) + iA03;
        int iA04 = A03(bArr, iA00, iA0I);
        return new GeobFrame(str, strA0L, A0L(bArr, iA00, iA04, charsetA0M), A0Q(bArr, A00(iA0I) + iA04, bArr.length));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static MlltFrame A0C(C2181Mk c2181Mk, int i) {
        int iA0M = c2181Mk.A0M();
        int iA0K = c2181Mk.A0K();
        int iA0K2 = c2181Mk.A0K();
        int iA0I = c2181Mk.A0I();
        int iA0I2 = c2181Mk.A0I();
        C2180Mj c2180Mj = new C2180Mj();
        c2180Mj.A0C(c2181Mk);
        int i2 = ((i - 10) * 8) / (iA0I + iA0I2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iA04 = c2180Mj.A04(iA0I);
            int iA05 = c2180Mj.A04(iA0I2);
            iArr[i3] = iA04;
            iArr2[i3] = iA05;
        }
        return new MlltFrame(iA0M, iA0K, iA0K2, iArr, iArr2);
    }

    public static String A0J(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ Sdk.SDKError.Reason.TPAT_ERROR_VALUE);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0N() {
        A01 = new byte[]{61, 40, 46, 64, 110, 40, 110, 40, 110, 40, 21, 83, 21, 83, 21, 83, 21, 83, 49, 61, 123, 111, 124, 112, 120, 78, 116, 103, 120, 32, 3, 38, 51, 38, 103, 51, 40, 40, 103, 52, 47, 40, 53, 51, 103, 51, 40, 103, 37, 34, 103, 38, 41, 103, 14, 3, 116, 103, 51, 38, 32, 102, 65, 73, 76, 69, 68, 0, 84, 79, 0, 68, 69, 67, 79, 68, 69, 0, 70, 82, 65, 77, 69, 26, 0, 73, 68, 29, 59, 28, 20, 17, 24, 25, 93, 9, 18, 93, 11, 28, 17, 20, 25, 28, 9, 24, 93, 52, 57, 78, 93, 9, 28, 26, 93, 10, 20, 9, 21, 93, 16, 28, 23, 18, 15, 43, 24, 15, 14, 20, 18, 19, 64, 74, 126, 109, 97, 105, 44, 127, 101, 118, 105, 44, 105, 116, 111, 105, 105, 104, 127, 44, 126, 105, 97, 109, 101, 98, 101, 98, 107, 44, 120, 109, 107, 44, 104, 109, 120, 109, 71, 106, 61, 74, 107, 109, 97, 106, 107, 124, 15, 55, 53, 44, 44, 57, 56, 124, 21, 24, 111, 124, 40, 61, 59, 124, 43, 53, 40, 52, 124, 49, 61, 54, 51, 46, 10, 57, 46, 47, 53, 51, 50, 97, 110, 124, 61, 50, 56, 124, 41, 50, 56, 57, 58, 53, 50, 57, 56, 124, 63, 51, 49, 44, 46, 57, 47, 47, 53, 51, 50, 124, 47, 63, 52, 57, 49, 57, 107, 83, 81, 72, 72, 93, 92, 24, 113, 124, 11, 24, 76, 89, 95, 24, 79, 81, 76, 80, 24, 77, 86, 75, 77, 72, 72, 87, 74, 76, 93, 92, 24, 85, 89, 82, 87, 74, 110, 93, 74, 75, 81, 87, 86, 5, 65, 121, 123, 98, 98, 123, 124, 117, 50, 103, 124, 97, 103, 98, 98, 125, 96, 102, 119, 118, 50, 113, 125, 127, 98, 96, 119, 97, 97, 119, 118, 50, 125, 96, 50, 119, 124, 113, 96, 107, 98, 102, 119, 118, 50, 116, 96, 115, 127, 119, 50, 62, 62, 62, 23, 44, 39, 58, 50, 39, 33, 54, 39, 38, 98, 36, 43, 48, 49, 54, 98, 54, 42, 48, 39, 39, 98, 32, 59, 54, 39, 49, 98, 45, 36, 98, 11, 6, 113, 98, 54, 35, 37, 98, 42, 39, 35, 38, 39, 48, 120, 98, 114, 58, 35, 44, 44, 44, 48, 52, 56, 62, 60, 118, 40, 44, 32, 38, 36, 110, 43, 49, 36, 38, 92, 88, 84, 82, 80, 26, 95, 69, 82};
    }

    static {
        A0N();
        A03 = new InterfaceC2511a0() { // from class: com.facebook.ads.redexgen.X.Pc
            @Override // com.facebook.ads.redexgen.X.InterfaceC2511a0
            public final boolean A6z(int i, int i2, int i3, int i4, int i5) {
                return C8V.A0O(i, i2, i3, i4, i5);
            }
        };
    }

    public C8V() {
        this(null);
    }

    public C8V(InterfaceC2511a0 interfaceC2511a0) {
        this.A00 = interfaceC2511a0;
    }

    public static int A00(int i) {
        if (i == 0 || i == 3) {
            return 1;
        }
        return 2;
    }

    public static int A01(C2181Mk c2181Mk, int i) {
        byte[] bArrA0l = c2181Mk.A0l();
        int iA09 = c2181Mk.A09();
        int relativePosition = iA09;
        while (startPosition < iA09 + i) {
            int startPosition = bArrA0l[relativePosition];
            if ((startPosition & 255) == 255 && bArrA0l[relativePosition + 1] == 0) {
                int i2 = relativePosition + 2;
                int startPosition2 = relativePosition + 1;
                System.arraycopy(bArrA0l, i2, bArrA0l, startPosition2, (i - (relativePosition - iA09)) - 2);
                i--;
            }
            relativePosition++;
        }
        return i;
    }

    public static int A02(byte[] bArr, int i) {
        while (i < i) {
            int i2 = bArr[i];
            if (i2 == 0) {
                return i;
            }
            i++;
        }
        int i3 = bArr.length;
        return i3;
    }

    public static int A03(byte[] bArr, int i, int i2) {
        int iA02 = A02(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iA02;
        }
        while (iA02 < terminationPos - 1) {
            int terminationPos = iA02 - i;
            if (terminationPos % 2 == 0) {
                int terminationPos2 = iA02 + 1;
                if (bArr[terminationPos2] == 0) {
                    return iA02;
                }
            }
            int terminationPos3 = iA02 + 1;
            iA02 = A02(bArr, terminationPos3);
        }
        int terminationPos4 = bArr.length;
        return terminationPos4;
    }

    public static BinaryFrame A05(C2181Mk c2181Mk, int i, String str) {
        byte[] bArr = new byte[i];
        c2181Mk.A0k(bArr, 0, i);
        return new BinaryFrame(str, bArr);
    }

    public static ChapterTocFrame A07(C2181Mk c2181Mk, int i, int i2, boolean z, int elementIdEndIndex, InterfaceC2511a0 interfaceC2511a0) {
        int iA09 = c2181Mk.A09();
        int iA02 = A02(c2181Mk.A0l(), iA09);
        String str = new String(c2181Mk.A0l(), iA09, iA02 - iA09, XA.A00);
        c2181Mk.A0f(iA02 + 1);
        int framePosition = c2181Mk.A0I();
        boolean z2 = (framePosition & 2) != 0;
        boolean z3 = (framePosition & 1) != 0;
        int iA0I = c2181Mk.A0I();
        String[] strArr = new String[iA0I];
        for (int i3 = 0; i3 < iA0I; i3++) {
            int startIndex = c2181Mk.A09();
            int iA03 = A02(c2181Mk.A0l(), startIndex);
            int elementIdEndIndex2 = iA03 - startIndex;
            strArr[i3] = new String(c2181Mk.A0l(), startIndex, elementIdEndIndex2, XA.A00);
            c2181Mk.A0f(iA03 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i4 = iA09 + i;
        while (c2181Mk.A09() < i4) {
            Id3Frame id3FrameA0B = A0B(i2, c2181Mk, z, elementIdEndIndex, interfaceC2511a0);
            if (id3FrameA0B != null) {
                arrayList.add(id3FrameA0B);
            }
        }
        return new ChapterTocFrame(str, z2, z3, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static CommentFrame A08(C2181Mk c2181Mk, int i) {
        if (i < 4) {
            return null;
        }
        int textStartIndex = c2181Mk.A0I();
        Charset charsetA0M = A0M(textStartIndex);
        byte[] bArr = new byte[3];
        c2181Mk.A0k(bArr, 0, 3);
        String description = new String(bArr, 0, 3);
        int encoding = i - 4;
        byte[] data = new byte[encoding];
        int encoding2 = i - 4;
        c2181Mk.A0k(data, 0, encoding2);
        int encoding3 = A03(data, 0, textStartIndex);
        String language = new String(data, 0, encoding3, charsetA0M);
        int iA00 = A00(textStartIndex) + encoding3;
        int encoding4 = A03(data, iA00, textStartIndex);
        return new CommentFrame(description, language, A0L(data, iA00, encoding4, charsetA0M));
    }

    public static C2512a1 A0A(C2181Mk c2181Mk) {
        int iA07 = c2181Mk.A07();
        String strA0J = A0J(170, 10, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
        if (iA07 < 10) {
            MV.A07(strA0J, A0J(30, 31, 62));
            return null;
        }
        int iA0K = c2181Mk.A0K();
        boolean z = false;
        if (iA0K != 4801587) {
            MV.A07(strA0J, A0J(348, 50, 59) + String.format(A0J(0, 4, 97), Integer.valueOf(iA0K)));
            return null;
        }
        int iA0I = c2181Mk.A0I();
        c2181Mk.A0g(1);
        int framesSize = c2181Mk.A0I();
        int extendedHeaderSize = c2181Mk.A0H();
        if (iA0I == 2) {
            int id = framesSize & 64;
            int id2 = id != 0 ? 1 : 0;
            if (id2 != 0) {
                MV.A07(strA0J, A0J(180, 68, 37));
                return null;
            }
        } else if (iA0I == 3) {
            int i = framesSize & 64;
            if (A02[3].length() == 3) {
                throw new RuntimeException();
            }
            A02[0] = "pllyyO0jSkbVxRBNu1SFBoHx8r2sOd";
            int id3 = i != 0 ? 1 : 0;
            if (id3 != 0) {
                int id4 = c2181Mk.A0C();
                c2181Mk.A0g(id4);
                extendedHeaderSize -= id4 + 4;
            }
        } else if (iA0I == 4) {
            int id5 = framesSize & 64;
            int id6 = id5 != 0 ? 1 : 0;
            if (id6 != 0) {
                int majorVersion = c2181Mk.A0H();
                int id7 = majorVersion - 4;
                c2181Mk.A0g(id7);
                extendedHeaderSize -= majorVersion;
            }
            int id8 = framesSize & 16;
            int id9 = id8 != 0 ? 1 : 0;
            if (id9 != 0) {
                extendedHeaderSize -= 10;
            }
        } else {
            MV.A07(strA0J, A0J(248, 46, 65) + iA0I);
            return null;
        }
        if (iA0I < 4) {
            int id10 = framesSize & 128;
            if (id10 != 0) {
                z = true;
            }
        }
        return new C2512a1(iA0I, z, extendedHeaderSize);
    }

    /* JADX WARN: Code duplicated, block: B:154:0x0238  */
    /* JADX WARN: Code duplicated, block: B:168:0x0272  */
    /* JADX WARN: Code duplicated, block: B:169:0x0274  */
    /* JADX WARN: Code duplicated, block: B:171:0x0282  */
    /* JADX WARN: Code duplicated, block: B:173:0x0290  */
    /* JADX WARN: Code duplicated, block: B:174:0x0292  */
    /* JADX WARN: Code duplicated, block: B:177:0x0297 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:180:0x029f A[Catch: all -> 0x02e1, TryCatch #0 {all -> 0x02e1, blocks: (B:92:0x013f, B:182:0x02a9, B:94:0x0147, B:101:0x015d, B:103:0x0165, B:133:0x01e1, B:134:0x01e7, B:140:0x01f7, B:147:0x0209, B:161:0x024e, B:167:0x0265, B:179:0x029a, B:180:0x029f), top: B:188:0x0135 }] */
    public static Id3Frame A0B(int frameId3, C2181Mk c2181Mk, boolean z, int i, InterfaceC2511a0 interfaceC2511a0) {
        int iA0I;
        int iA0K;
        int iA0M;
        Id3Frame id3FrameA05;
        int frameId2 = c2181Mk.A0I();
        int frameId1 = c2181Mk.A0I();
        int frameId0 = c2181Mk.A0I();
        if (frameId3 >= 3) {
            iA0I = c2181Mk.A0I();
        } else {
            iA0I = 0;
        }
        if (frameId3 == 4) {
            int frameSize = c2181Mk.A0L();
            if (!z) {
                iA0K = (frameSize & 255) | (((frameSize >> 8) & 255) << 7) | (((frameSize >> 16) & 255) << 14) | (((frameSize >> 24) & 255) << 21);
            } else {
                iA0K = frameSize;
            }
        } else if (frameId3 == 3) {
            iA0K = c2181Mk.A0L();
        } else {
            iA0K = c2181Mk.A0K();
        }
        if (frameId3 >= 3) {
            iA0M = c2181Mk.A0M();
        } else {
            iA0M = 0;
        }
        int frameSize2 = A02[0].length();
        if (frameSize2 != 19) {
            A02[3] = "xkx3apvo31jkPgr5AN31ZqqPcB15x4w";
            if (frameId2 == 0 && frameId1 == 0 && frameId0 == 0 && iA0I == 0 && iA0K == 0 && iA0M == 0) {
                int frameSize3 = c2181Mk.A0A();
                c2181Mk.A0f(frameSize3);
                return null;
            }
            int flags = c2181Mk.A09() + iA0K;
            int nextFramePosition = c2181Mk.A0A();
            String strA0J = A0J(170, 10, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
            if (flags > nextFramePosition) {
                MV.A07(strA0J, A0J(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 37, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE));
                c2181Mk.A0f(c2181Mk.A0A());
                return null;
            }
            if (interfaceC2511a0 != null && !interfaceC2511a0.A6z(frameId3, frameId2, frameId1, frameId0, iA0I)) {
                c2181Mk.A0f(flags);
                return null;
            }
            int frameSize4 = 0;
            boolean hasGroupIdentifier = false;
            boolean hasDataLength = false;
            int i2 = 0;
            boolean z2 = false;
            if (frameId3 == 3) {
                i2 = (iA0M & 128) != 0 ? 1 : 0;
                hasGroupIdentifier = (iA0M & 64) != 0;
                z2 = (iA0M & 32) != 0;
                frameSize4 = i2;
            } else if (frameId3 == 4) {
                z2 = (iA0M & 64) != 0;
                frameSize4 = (iA0M & 8) != 0 ? 1 : 0;
                hasGroupIdentifier = (iA0M & 4) != 0;
                hasDataLength = (iA0M & 2) != 0;
                i2 = (iA0M & 1) != 0 ? 1 : 0;
            }
            if (frameSize4 != 0 || hasGroupIdentifier) {
                MV.A07(strA0J, A0J(294, 50, 107));
                c2181Mk.A0f(flags);
                return null;
            }
            if (z2) {
                iA0K--;
                c2181Mk.A0g(1);
            }
            if (i2 != 0) {
                iA0K -= 4;
                c2181Mk.A0g(4);
            }
            if (hasDataLength) {
                iA0K = A01(c2181Mk, iA0K);
            }
            try {
                if (frameId2 == 84 && frameId1 == 88 && frameId0 == 88 && (frameId3 == 2 || iA0I == 88)) {
                    id3FrameA05 = A0E(c2181Mk, iA0K);
                } else if (frameId2 == 84) {
                    id3FrameA05 = A0F(c2181Mk, iA0K, A0K(frameId3, frameId2, frameId1, frameId0, iA0I));
                } else if (frameId2 == 87 && frameId1 == 88 && frameId0 == 88 && (frameId3 == 2 || iA0I == 88)) {
                    id3FrameA05 = A0G(c2181Mk, iA0K);
                } else if (frameId2 == 87) {
                    id3FrameA05 = A0H(c2181Mk, iA0K, A0K(frameId3, frameId2, frameId1, frameId0, iA0I));
                } else {
                    if (frameId2 == 80) {
                        String[] strArr = A02;
                        if (strArr[7].length() == strArr[5].length()) {
                            String[] strArr2 = A02;
                            strArr2[1] = "3Rmled7pOU2MIFm80fDikiUgpbd3LEyL";
                            strArr2[2] = "hew1IOjEcjVUCeARNBOOJbNfjgwkGxJB";
                            if (frameId1 == 82 && frameId0 == 73 && iA0I == 86) {
                                id3FrameA05 = A0D(c2181Mk, iA0K);
                            }
                        }
                    }
                    if (frameId2 == 71 && frameId1 == 69 && frameId0 == 79 && (iA0I == 66 || frameId3 == 2)) {
                        id3FrameA05 = A09(c2181Mk, iA0K);
                    } else {
                        String[] strArr3 = A02;
                        String str = strArr3[1];
                        String str2 = strArr3[2];
                        int frameSize5 = str.charAt(15);
                        if (frameSize5 != str2.charAt(15)) {
                            A02[0] = "hLiqWaU2VKQGxb7qu5NekskVW";
                            if (frameId3 != 2 ? !(frameId2 != 65 || frameId1 != 80 || frameId0 != 73 || iA0I != 67) : !(frameId2 != 80 || frameId1 != 73 || frameId0 != 67)) {
                                id3FrameA05 = A04(c2181Mk, iA0K, frameId3);
                            } else if (frameId2 == 67 && frameId1 == 79 && frameId0 == 77 && (iA0I == 77 || frameId3 == 2)) {
                                id3FrameA05 = A08(c2181Mk, iA0K);
                            } else if (frameId2 == 67) {
                                String[] strArr4 = A02;
                                if (strArr4[1].charAt(15) != strArr4[2].charAt(15)) {
                                    A02[3] = "WRLDsLsRIWfesP2br";
                                    if (frameId1 == 72) {
                                        if (frameId0 != 65 && iA0I == 80) {
                                            id3FrameA05 = A06(c2181Mk, iA0K, frameId3, z, i, interfaceC2511a0);
                                        }
                                    }
                                } else {
                                    String[] strArr5 = A02;
                                    strArr5[1] = "TqjjqncCc8SNUp0iowWlF0GQKU84swFz";
                                    strArr5[2] = "FaXpscmVu9s0bcRjOAQpdBtEjkIewf4R";
                                    if (frameId1 == 72) {
                                        if (frameId0 != 65) {
                                        }
                                    }
                                }
                                if (frameId2 != 67 && frameId1 == 84 && frameId0 == 79 && iA0I == 67) {
                                    id3FrameA05 = A07(c2181Mk, iA0K, frameId3, z, i, interfaceC2511a0);
                                } else if (frameId2 != 77) {
                                    id3FrameA05 = A05(c2181Mk, iA0K, A0K(frameId3, frameId2, frameId1, frameId0, iA0I));
                                } else {
                                    if (A02[3].length() != 3) {
                                        String[] strArr6 = A02;
                                        strArr6[7] = "9iw4en5w9JOYJKcMErTHNJTWSACkJY";
                                        strArr6[5] = "3VadItTRNagJu0YfKnz18yFaBCd9zL";
                                        if (frameId1 == 76) {
                                            if (frameId0 != 76 && iA0I == 84) {
                                                id3FrameA05 = A0C(c2181Mk, iA0K);
                                            }
                                        }
                                    } else if (frameId1 == 76) {
                                        if (frameId0 != 76) {
                                        }
                                    }
                                    id3FrameA05 = A05(c2181Mk, iA0K, A0K(frameId3, frameId2, frameId1, frameId0, iA0I));
                                }
                            } else if (frameId2 != 67) {
                                if (frameId2 != 77) {
                                    id3FrameA05 = A05(c2181Mk, iA0K, A0K(frameId3, frameId2, frameId1, frameId0, iA0I));
                                } else {
                                    if (A02[3].length() != 3) {
                                        String[] strArr7 = A02;
                                        strArr7[7] = "9iw4en5w9JOYJKcMErTHNJTWSACkJY";
                                        strArr7[5] = "3VadItTRNagJu0YfKnz18yFaBCd9zL";
                                        if (frameId1 == 76) {
                                            if (frameId0 != 76) {
                                            }
                                        }
                                    } else if (frameId1 == 76) {
                                        if (frameId0 != 76) {
                                        }
                                    }
                                    id3FrameA05 = A05(c2181Mk, iA0K, A0K(frameId3, frameId2, frameId1, frameId0, iA0I));
                                }
                            } else if (frameId2 != 77) {
                                id3FrameA05 = A05(c2181Mk, iA0K, A0K(frameId3, frameId2, frameId1, frameId0, iA0I));
                            } else {
                                if (A02[3].length() != 3) {
                                    String[] strArr8 = A02;
                                    strArr8[7] = "9iw4en5w9JOYJKcMErTHNJTWSACkJY";
                                    strArr8[5] = "3VadItTRNagJu0YfKnz18yFaBCd9zL";
                                    if (frameId1 == 76) {
                                        if (frameId0 != 76) {
                                        }
                                    }
                                } else if (frameId1 == 76) {
                                    if (frameId0 != 76) {
                                    }
                                }
                                id3FrameA05 = A05(c2181Mk, iA0K, A0K(frameId3, frameId2, frameId1, frameId0, iA0I));
                            }
                        }
                    }
                }
                if (id3FrameA05 == null) {
                    MV.A07(strA0J, A0J(61, 27, 89) + A0K(frameId3, frameId2, frameId1, frameId0, iA0I) + A0J(18, 12, 100) + iA0K);
                }
                c2181Mk.A0f(flags);
                return id3FrameA05;
            } catch (Throwable th) {
                c2181Mk.A0f(flags);
                throw th;
            }
        }
        throw new RuntimeException();
    }

    public static PrivFrame A0D(C2181Mk c2181Mk, int i) {
        byte[] bArr = new byte[i];
        c2181Mk.A0k(bArr, 0, i);
        int iA02 = A02(bArr, 0);
        return new PrivFrame(new String(bArr, 0, iA02, XA.A00), A0Q(bArr, iA02 + 1, bArr.length));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9l != com.google.common.collect.ImmutableList<java.lang.String> */
    public static TextInformationFrame A0E(C2181Mk c2181Mk, int i) {
        if (i < 1) {
            return null;
        }
        int iA0I = c2181Mk.A0I();
        int encoding = i - 1;
        byte[] bArr = new byte[encoding];
        int encoding2 = i - 1;
        c2181Mk.A0k(bArr, 0, encoding2);
        int iA03 = A03(bArr, 0, iA0I);
        String str = new String(bArr, 0, iA03, A0M(iA0I));
        int encoding3 = A00(iA0I);
        return new TextInformationFrame(A0J(344, 4, 31), str, A0I(bArr, iA0I, encoding3 + iA03));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9l != com.google.common.collect.ImmutableList<java.lang.String> */
    public static TextInformationFrame A0F(C2181Mk c2181Mk, int i, String str) {
        if (i < 1) {
            return null;
        }
        int iA0I = c2181Mk.A0I();
        int encoding = i - 1;
        byte[] data = new byte[encoding];
        c2181Mk.A0k(data, 0, i - 1);
        return new TextInformationFrame(str, null, A0I(data, iA0I, 0));
    }

    public static UrlLinkFrame A0G(C2181Mk c2181Mk, int i) {
        if (i < 1) {
            String[] strArr = A02;
            if (strArr[7].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[4] = "SPxeGoZSNSgTbWym";
            strArr2[6] = "33lkerVVGiVeq1xCyMDroZS8rCI";
            return null;
        }
        int iA0I = c2181Mk.A0I();
        int encoding = i - 1;
        byte[] bArr = new byte[encoding];
        int encoding2 = i - 1;
        c2181Mk.A0k(bArr, 0, encoding2);
        int iA03 = A03(bArr, 0, iA0I);
        String str = new String(bArr, 0, iA03, A0M(iA0I));
        int descriptionEndIndex = A00(iA0I) + iA03;
        String description = A0L(bArr, descriptionEndIndex, A02(bArr, descriptionEndIndex), XA.A00);
        return new UrlLinkFrame(A0J(398, 4, 13), str, description);
    }

    public static UrlLinkFrame A0H(C2181Mk c2181Mk, int i, String str) {
        byte[] bArr = new byte[i];
        c2181Mk.A0k(bArr, 0, i);
        return new UrlLinkFrame(str, null, new String(bArr, 0, A02(bArr, 0), XA.A00));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4e != com.google.common.collect.ImmutableList$Builder<java.lang.String> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9l != com.google.common.collect.ImmutableList<java.lang.String> */
    public static AbstractC18519l<String> A0I(byte[] bArr, int i, int i2) {
        int length = bArr.length;
        String strA0J = A0J(0, 0, 96);
        if (i2 >= length) {
            return AbstractC18519l.A04(strA0J);
        }
        C17314e c17314eA01 = AbstractC18519l.A01();
        int valueEndIndex = A03(bArr, i2, i);
        while (i2 < valueEndIndex) {
            int valueStartIndex = valueEndIndex - i2;
            c17314eA01.A04(new String(bArr, i2, valueStartIndex, A0M(i)));
            i2 = valueEndIndex + A00(i);
            valueEndIndex = A03(bArr, i2, i);
        }
        AbstractC18519l<String> abstractC18519lA05 = c17314eA01.A05();
        return abstractC18519lA05.isEmpty() ? AbstractC18519l.A04(strA0J) : abstractC18519lA05;
    }

    public static String A0K(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, A0J(4, 6, 50), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, A0J(10, 8, 73), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static String A0L(byte[] bArr, int i, int i2, Charset charset) {
        if (i2 <= i || i2 > bArr.length) {
            String strA0J = A0J(0, 0, 96);
            String[] strArr = A02;
            if (strArr[4].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[4] = "Ajw25UA1JzSG5nck";
            strArr2[6] = "CW3KTU3u5THrbhQ2QNxXB8tc6gb";
            return strA0J;
        }
        return new String(bArr, i, i2 - i, charset);
    }

    public static Charset A0M(int i) {
        switch (i) {
            case 1:
                return XA.A02;
            case 2:
                return XA.A03;
            case 3:
                return XA.A05;
            default:
                return XA.A00;
        }
    }

    public static /* synthetic */ boolean A0O(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    public static boolean A0P(C2181Mk c2181Mk, int i, int i2, boolean z) throws Throwable {
        int iA0C;
        long jA0Q;
        int iA0M;
        int iA09 = c2181Mk.A09();
        while (true) {
            try {
                if (c2181Mk.A07() < i2) {
                    c2181Mk.A0f(iA09);
                    return true;
                }
                if (i >= 3) {
                    try {
                        iA0C = c2181Mk.A0C();
                        jA0Q = c2181Mk.A0Q();
                        iA0M = c2181Mk.A0M();
                    } catch (Throwable th) {
                        th = th;
                        c2181Mk.A0f(iA09);
                        throw th;
                    }
                } else {
                    iA0C = c2181Mk.A0K();
                    jA0Q = c2181Mk.A0K();
                    iA0M = 0;
                }
                if (iA0C == 0 && jA0Q == 0 && iA0M == 0) {
                    c2181Mk.A0f(iA09);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jA0Q) != 0) {
                        c2181Mk.A0f(iA09);
                        return false;
                    }
                    jA0Q = (((jA0Q >> 24) & 255) << 21) | (jA0Q & 255) | (((jA0Q >> 8) & 255) << 7) | (((jA0Q >> 16) & 255) << 14);
                }
                boolean z2 = false;
                boolean z3 = false;
                if (i == 4) {
                    z2 = (iA0M & 64) != 0;
                    z3 = (iA0M & 1) != 0;
                } else if (i == 3) {
                    int minimumFrameSize = iA0M & 32;
                    z2 = minimumFrameSize != 0;
                    int minimumFrameSize2 = iA0M & 128;
                    z3 = minimumFrameSize2 != 0;
                }
                int minimumFrameSize3 = 0;
                if (z2) {
                    minimumFrameSize3 = 0 + 1;
                }
                if (z3) {
                    minimumFrameSize3 += 4;
                }
                if (jA0Q < minimumFrameSize3) {
                    c2181Mk.A0f(iA09);
                    return false;
                }
                int minimumFrameSize4 = c2181Mk.A07();
                if (minimumFrameSize4 >= jA0Q) {
                    int minimumFrameSize5 = (int) jA0Q;
                    c2181Mk.A0g(minimumFrameSize5);
                } else {
                    c2181Mk.A0f(iA09);
                    return false;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public static byte[] A0Q(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return N1.A07;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2255Pn
    public final Metadata A0R(C18338e c18338e, ByteBuffer byteBuffer) {
        return A0S(byteBuffer.array(), byteBuffer.limit());
    }

    public final Metadata A0S(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        C2181Mk c2181Mk = new C2181Mk(bArr, i);
        C2512a1 c2512a1A0A = A0A(c2181Mk);
        if (c2512a1A0A == null) {
            return null;
        }
        int startPosition = c2181Mk.A09();
        int frameHeaderSize = c2512a1A0A.A01 == 2 ? 6 : 10;
        int iA01 = c2512a1A0A.A00;
        if (c2512a1A0A.A02) {
            iA01 = A01(c2181Mk, c2512a1A0A.A00);
        }
        c2181Mk.A0e(startPosition + iA01);
        boolean z = false;
        if (!A0P(c2181Mk, c2512a1A0A.A01, frameHeaderSize, false)) {
            if (c2512a1A0A.A01 == 4 && A0P(c2181Mk, 4, frameHeaderSize, true)) {
                z = true;
            } else {
                MV.A07(A0J(170, 10, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), A0J(88, 45, 4) + c2512a1A0A.A01);
                return null;
            }
        }
        while (c2181Mk.A07() >= frameHeaderSize) {
            Id3Frame id3FrameA0B = A0B(c2512a1A0A.A01, c2181Mk, z, frameHeaderSize, this.A00);
            if (id3FrameA0B != null) {
                arrayList.add(id3FrameA0B);
            }
        }
        return new Metadata(arrayList);
    }
}
