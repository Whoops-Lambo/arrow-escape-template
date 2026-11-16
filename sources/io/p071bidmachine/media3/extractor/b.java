package io.p071bidmachine.media3.extractor;

import android.util.Base64;
import androidx.media3.extractor.ts.TsExtractor;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.inmobi.media.core.config.models.AdConfig;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.d;
import defpackage.l63;
import defpackage.nj;
import defpackage.pv1;
import io.p071bidmachine.iab.mraid.w;
import io.p071bidmachine.media3.common.d0;
import io.p071bidmachine.media3.common.g0;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.p;
import io.p071bidmachine.media3.common.util.q;
import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.exoplayer.audio.i;
import io.p071bidmachine.media3.extractor.metadata.id3.h;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class b {
    public static final int[] a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final int[] c = {1, 2, 3, 6};
    public static final int[] d = {48000, 44100, 32000};
    public static final int[] e = {24000, 22050, 16000};
    public static final int[] f = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 384, 448, 512, 576, 640};
    public static final int[] h = {69, 87, 104, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, TsExtractor.TS_STREAM_TYPE_DTS_UHD, 174, 208, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final int[] i = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};
    public static final int[] j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] l = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] m = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] n = {5, 8, 10, 12};
    public static final int[] o = {6, 9, 12, 15};
    public static final int[] p = {2, 4, 6, 8};
    public static final int[] q = {9, 11, 13, 16};
    public static final int[] r = {5, 8, 10, 12};
    public static final String[] s = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] t = {44100, 48000, 32000};
    public static final int[] u = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] v = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] w = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] x = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] y = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static void g(int i2, q qVar) {
        qVar.C(7);
        byte[] bArr = qVar.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i2 >> 16) & 255);
        bArr[5] = (byte) ((i2 >> 8) & 255);
        bArr[6] = (byte) (i2 & 255);
    }

    public static p i(byte[] bArr) {
        byte[] bArr2;
        byte b2 = bArr[0];
        if (b2 == 127 || b2 == 100 || b2 == 64 || b2 == 113) {
            return new p(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b3 = bArrCopyOf[0];
        if (b3 == -2 || b3 == -1 || b3 == 37 || b3 == -14 || b3 == -24) {
            for (int i2 = 0; i2 < bArrCopyOf.length - 1; i2 += 2) {
                byte b4 = bArrCopyOf[i2];
                int i3 = i2 + 1;
                bArrCopyOf[i2] = bArrCopyOf[i3];
                bArrCopyOf[i3] = b4;
            }
        }
        p pVar = new p(bArrCopyOf, bArrCopyOf.length);
        if (bArrCopyOf[0] == 31) {
            p pVar2 = new p(bArrCopyOf, bArrCopyOf.length);
            while (pVar2.b() >= 16) {
                pVar2.t(2);
                int i4 = pVar2.i(14) & 16383;
                int iMin = Math.min(8 - pVar.d, 14);
                int i5 = pVar.d;
                int i6 = (8 - i5) - iMin;
                byte[] bArr3 = pVar.b;
                int i7 = pVar.c;
                byte b5 = (byte) (((65280 >> i5) | ((1 << i6) - 1)) & bArr3[i7]);
                bArr3[i7] = b5;
                int i8 = 14 - iMin;
                bArr3[i7] = (byte) (b5 | ((i4 >>> i8) << i6));
                int i9 = i7 + 1;
                while (true) {
                    bArr2 = pVar.b;
                    if (i8 > 8) {
                        bArr2[i9] = (byte) (i4 >>> (i8 - 8));
                        i8 -= 8;
                        i9++;
                    }
                }
                int i10 = 8 - i8;
                byte b6 = (byte) (bArr2[i9] & ((1 << i10) - 1));
                bArr2[i9] = b6;
                bArr2[i9] = (byte) (((i4 & ((1 << i8) - 1)) << i10) | b6);
                pVar.t(14);
                pVar.a();
            }
        }
        pVar.p(bArrCopyOf, bArrCopyOf.length);
        return pVar;
    }

    public static int k(p pVar) throws g0 {
        int i2 = pVar.i(4);
        if (i2 == 15) {
            if (pVar.b() >= 24) {
                return pVar.i(24);
            }
            throw g0.a("AAC header insufficient data", null);
        }
        if (i2 < 13) {
            return a[i2];
        }
        throw g0.a("AAC header wrong Sampling Frequency Index", null);
    }

    public static a m(p pVar, boolean z) {
        int i2 = pVar.i(5);
        if (i2 == 31) {
            i2 = pVar.i(6) + 32;
        }
        int iK = k(pVar);
        int i3 = pVar.i(4);
        String strK = pv1.k(i2, "mp4a.40.");
        if (i2 == 5 || i2 == 29) {
            iK = k(pVar);
            int i4 = pVar.i(5);
            if (i4 == 31) {
                i4 = pVar.i(6) + 32;
            }
            i2 = i4;
            if (i2 == 22) {
                i3 = pVar.i(4);
            }
        }
        if (z) {
            if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4 && i2 != 6 && i2 != 7 && i2 != 17) {
                switch (i2) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw g0.d("Unsupported audio object type: " + i2);
                }
            }
            if (pVar.h()) {
                a.A("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (pVar.h()) {
                pVar.t(14);
            }
            boolean zH = pVar.h();
            if (i3 == 0) {
                d.c();
                return null;
            }
            if (i2 == 6 || i2 == 20) {
                pVar.t(3);
            }
            if (zH) {
                if (i2 == 22) {
                    pVar.t(16);
                }
                if (i2 == 17 || i2 == 19 || i2 == 20 || i2 == 23) {
                    pVar.t(3);
                }
                pVar.t(1);
            }
            switch (i2) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int i5 = pVar.i(2);
                    if (i5 == 2 || i5 == 3) {
                        throw g0.d("Unsupported epConfig: " + i5);
                    }
                    break;
            }
        }
        int i6 = b[i3];
        if (i6 != -1) {
            return new a(iK, i6, strK);
        }
        throw g0.a(null, null);
    }

    public static void n(p pVar, i iVar) throws g0 {
        int i2 = pVar.i(5);
        pVar.t(2);
        if (pVar.h()) {
            pVar.t(5);
        }
        if (i2 >= 7 && i2 <= 10) {
            pVar.s();
        }
        if (pVar.h()) {
            int i3 = pVar.i(3);
            if (iVar.b == -1 && i2 >= 0 && i2 <= 15 && (i3 == 0 || i3 == 1)) {
                iVar.b = i2;
            }
            if (pVar.h()) {
                v(pVar);
            }
        }
    }

    public static void o(p pVar, i iVar) throws g0 {
        pVar.t(2);
        boolean zH = pVar.h();
        int i2 = pVar.i(8);
        for (int i3 = 0; i3 < i2; i3++) {
            pVar.t(2);
            if (pVar.h()) {
                pVar.t(5);
            }
            if (zH) {
                pVar.t(24);
            } else {
                if (pVar.h()) {
                    if (!pVar.h()) {
                        pVar.t(4);
                    }
                    iVar.c = pVar.i(6) + 1;
                }
                pVar.t(4);
            }
        }
        if (pVar.h()) {
            pVar.t(3);
            if (pVar.h()) {
                v(pVar);
            }
        }
    }

    public static int p(p pVar, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && pVar.h(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return pVar.i(iArr[i2]) + i4;
    }

    public static d0 r(n nVar, boolean z) {
        io.p071bidmachine.media3.exoplayer.analytics.d dVar = z ? null : h.b;
        q qVar = new q(10);
        d0 d0VarC = null;
        int i2 = 0;
        while (true) {
            try {
                nVar.peekFully(qVar.a, 0, 10);
                qVar.F(0);
                if (qVar.w() != 4801587) {
                    break;
                }
                qVar.G(3);
                int iS = qVar.s();
                int i3 = iS + 10;
                if (d0VarC == null) {
                    byte[] bArr = new byte[i3];
                    System.arraycopy(qVar.a, 0, bArr, 0, 10);
                    nVar.peekFully(bArr, 10, iS);
                    d0VarC = new h(dVar).C(i3, bArr);
                } else {
                    nVar.advancePeekPosition(iS);
                }
                i2 += i3;
            } catch (EOFException unused) {
            }
        }
        nVar.resetPeekPosition();
        nVar.advancePeekPosition(i2);
        if (d0VarC == null || d0VarC.a.length == 0) {
            return null;
        }
        return d0VarC;
    }

    public static io.p071bidmachine.media3.exoplayer.offline.b t(q qVar) {
        qVar.G(1);
        int iW = qVar.w();
        long j2 = ((long) qVar.b) + ((long) iW);
        int i2 = iW / 18;
        long[] jArrCopyOf = new long[i2];
        long[] jArrCopyOf2 = new long[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            long jN = qVar.n();
            if (jN == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i3);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i3);
                break;
            }
            jArrCopyOf[i3] = jN;
            jArrCopyOf2[i3] = qVar.n();
            qVar.G(2);
        }
        qVar.G((int) (j2 - ((long) qVar.b)));
        return new io.p071bidmachine.media3.exoplayer.offline.b(4, jArrCopyOf, jArrCopyOf2);
    }

    public static w u(q qVar, boolean z, boolean z2) throws g0 {
        if (z) {
            w(3, qVar, false);
        }
        qVar.r((int) qVar.k(), StandardCharsets.UTF_8);
        long jK = qVar.k();
        String[] strArr = new String[(int) jK];
        for (int i2 = 0; i2 < jK; i2++) {
            strArr[i2] = qVar.r((int) qVar.k(), StandardCharsets.UTF_8);
        }
        if (z2 && (qVar.t() & 1) == 0) {
            throw g0.a("framing bit expected to be set", null);
        }
        return new w(strArr);
    }

    public static void v(p pVar) throws g0 {
        int i2 = pVar.i(6);
        if (i2 < 2 || i2 > 42) {
            throw g0.d(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(i2)));
        }
        pVar.t(i2 * 8);
    }

    public static ArrayList a(byte[] bArr) {
        long j2 = (((long) (((bArr[11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED))) * 1000000000) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j2).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static boolean b(q qVar, r rVar, int i2, io.p071bidmachine.media3.common.q qVar2) {
        long jV = qVar.v();
        long j2 = jV >>> 16;
        if (j2 != i2) {
            return false;
        }
        boolean z = (j2 & 1) == 1;
        int i3 = (int) ((jV >> 12) & 15);
        int i4 = (int) ((jV >> 8) & 15);
        int i5 = (int) ((jV >> 4) & 15);
        int i6 = (int) ((jV >> 1) & 7);
        boolean z2 = (jV & 1) == 1;
        if (i5 <= 7) {
            if (i5 != rVar.g - 1) {
                return false;
            }
        } else if (i5 > 10 || rVar.g != 2) {
            return false;
        }
        if (!(i6 == 0 || i6 == rVar.i) || z2) {
            return false;
        }
        try {
            long jA = qVar.A();
            if (!z) {
                jA *= (long) rVar.b;
            }
            qVar2.a = jA;
            int iS = s(i3, qVar);
            if (iS == -1 || iS > rVar.b) {
                return false;
            }
            int i7 = rVar.e;
            if (i4 != 0) {
                if (i4 <= 11) {
                    if (i4 != rVar.f) {
                        return false;
                    }
                } else if (i4 != 12) {
                    if (i4 > 14) {
                        return false;
                    }
                    int iZ = qVar.z();
                    if (i4 == 14) {
                        iZ *= 10;
                    }
                    if (iZ != i7) {
                        return false;
                    }
                } else if (qVar.t() * 1000 != i7) {
                    return false;
                }
            }
            int iT = qVar.t();
            int i8 = qVar.b;
            byte[] bArr = qVar.a;
            int i9 = i8 - 1;
            int i10 = 0;
            for (int i11 = qVar.b; i11 < i9; i11++) {
                i10 = x.m[i10 ^ (bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)];
            }
            int i12 = x.a;
            return iT == i10;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static void c(boolean z, String str) throws g0 {
        if (!z) {
            throw g0.a(str, null);
        }
    }

    public static int f(int i2, int i3) {
        int i4 = i3 / 2;
        if (i2 < 0 || i2 >= 3 || i3 < 0 || i4 >= 19) {
            return -1;
        }
        int i5 = d[i2];
        if (i5 == 44100) {
            return ((i3 % 2) + h[i4]) * 2;
        }
        int i6 = g[i4];
        return i5 == 32000 ? i6 * 6 : i6 * 4;
    }

    public static int h(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if ((i2 & (-2097152)) != -2097152 || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i8 = t[i6];
        if (i3 == 2) {
            i8 /= 2;
        } else if (i3 == 0) {
            i8 /= 4;
        }
        int i9 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? u[i5 - 1] : v[i5 - 1]) * 12) / i8) + i9) * 4;
        }
        if (i3 == 3) {
            i7 = i4 == 2 ? w[i5 - 1] : x[i5 - 1];
        } else {
            i7 = y[i5 - 1];
        }
        if (i3 == 3) {
            return nj.f(i7, 144, i8, i9);
        }
        return nj.f(i4 == 1 ? 72 : 144, i7, i8, i9);
    }

    public static long j(byte b2, byte b3) {
        int i2;
        int i3;
        int i4 = b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i5 = b2 & 3;
        if (i5 != 0) {
            i2 = 2;
            if (i5 != 1 && i5 != 2) {
                i2 = b3 & 63;
            }
        } else {
            i2 = 1;
        }
        int i6 = i4 >> 3;
        int i7 = i6 & 3;
        if (i6 >= 16) {
            i3 = 2500 << i7;
        } else if (i6 >= 12) {
            i3 = 10000 << (i6 & 1);
        } else {
            i3 = i7 == 3 ? 60000 : 10000 << i7;
        }
        return ((long) i2) * ((long) i3);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    public static l63 l(p pVar) {
        int i2;
        int i3;
        int i4 = pVar.i(16);
        int i5 = pVar.i(16);
        if (i5 == 65535) {
            i5 = pVar.i(24);
            i2 = 7;
        } else {
            i2 = 4;
        }
        int i6 = i5 + i2;
        if (i4 == 44097) {
            i6 += 2;
        }
        if (pVar.i(2) == 3) {
            do {
                pVar.i(2);
            } while (pVar.h());
        }
        int i7 = pVar.i(10);
        if (pVar.h() && pVar.i(3) > 0) {
            pVar.t(2);
        }
        int i8 = pVar.h() ? 48000 : 44100;
        int i9 = pVar.i(4);
        int[] iArr = i;
        if (i8 == 44100 && i9 == 13) {
            i3 = iArr[i9];
        } else if (i8 != 48000 || i9 >= 14) {
            i3 = 0;
        } else {
            int i10 = iArr[i9];
            int i11 = i7 % 5;
            if (i11 == 1) {
                if (i9 != 3 || i9 == 8) {
                    i3 = i10 + 1;
                } else {
                    i3 = i10;
                }
            } else if (i11 != 2) {
                if (i11 == 3) {
                    if (i9 != 3) {
                    }
                    i3 = i10 + 1;
                } else if (i11 == 4 && (i9 == 3 || i9 == 8 || i9 == 11)) {
                    i3 = i10 + 1;
                } else {
                    i3 = i10;
                }
            } else if (i9 == 8 || i9 == 11) {
                i3 = i10 + 1;
            } else {
                i3 = i10;
            }
        }
        return new l63(i8, i6, i3);
    }

    public static d0 q(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = (String) list.get(i2);
            int i3 = x.a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                a.A("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(io.p071bidmachine.media3.extractor.metadata.flac.a.b(new q(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e2) {
                    a.B("VorbisUtil", "Failed to parse vorbis picture", e2);
                }
            } else {
                arrayList.add(new io.p071bidmachine.media3.extractor.metadata.vorbis.a(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new d0(arrayList);
    }

    public static void d(long j2, q qVar, e0[] e0VarArr) {
        int i2;
        int iG;
        boolean z;
        int iT;
        while (true) {
            boolean z2 = true;
            if (qVar.a() > 1) {
                int i3 = 0;
                while (true) {
                    if (qVar.a() == 0) {
                        i2 = -1;
                        break;
                    }
                    int iT2 = qVar.t();
                    i3 += iT2;
                    if (iT2 != 255) {
                        i2 = i3;
                        break;
                    }
                }
                int i4 = 0;
                do {
                    if (qVar.a() == 0) {
                        i4 = -1;
                        break;
                    } else {
                        iT = qVar.t();
                        i4 += iT;
                    }
                } while (iT == 255);
                int i5 = qVar.b + i4;
                if (i4 != -1 && i4 <= qVar.a()) {
                    if (i2 == 4 && i4 >= 8) {
                        int iT3 = qVar.t();
                        int iZ = qVar.z();
                        if (iZ == 49) {
                            iG = qVar.g();
                        } else {
                            iG = 0;
                        }
                        int iT4 = qVar.t();
                        if (iZ == 47) {
                            qVar.G(1);
                        }
                        if (iT3 == 181 && ((iZ == 49 || iZ == 47) && iT4 == 3)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (iZ == 49) {
                            if (iG != 1195456820) {
                                z2 = false;
                            }
                            z &= z2;
                        }
                        if (z) {
                            e(j2, qVar, e0VarArr);
                        }
                    }
                } else {
                    a.A("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i5 = qVar.c;
                }
                qVar.F(i5);
            } else {
                return;
            }
        }
    }

    public static void e(long j2, q qVar, e0[] e0VarArr) {
        boolean z;
        int iT = qVar.t();
        if ((iT & 64) != 0) {
            qVar.G(1);
            int i2 = (iT & 31) * 3;
            int i3 = qVar.b;
            for (e0 e0Var : e0VarArr) {
                qVar.F(i3);
                e0Var.d(qVar, i2, 0);
                if (j2 != -9223372036854775807L) {
                    z = true;
                } else {
                    z = false;
                }
                a.i(z);
                e0Var.b(j2, 1, i2, 0, null);
            }
        }
    }

    public static int s(int i2, q qVar) {
        switch (i2) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i2 - 2);
            case 6:
                return qVar.t() + 1;
            case 7:
                return qVar.z() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i2 - 8);
            default:
                return -1;
        }
    }

    public static boolean w(int i2, q qVar, boolean z) {
        if (qVar.a() < 7) {
            if (!z) {
                throw g0.a("too short header: " + qVar.a(), null);
            }
            return false;
        }
        if (qVar.t() != i2) {
            if (!z) {
                throw g0.a("expected header type " + Integer.toHexString(i2), null);
            }
            return false;
        }
        if (qVar.t() == 118 && qVar.t() == 111 && qVar.t() == 114 && qVar.t() == 98 && qVar.t() == 105 && qVar.t() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw g0.a("expected characters 'vorbis'", null);
    }
}
