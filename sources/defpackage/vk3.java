package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzifx;
import com.google.android.gms.internal.ads.zziho;
import com.google.android.gms.internal.ads.zzihu;
import com.google.android.gms.internal.ads.zzijl;
import com.google.android.gms.internal.p002firebaseauthapi.zzbf;
import com.inmobi.media.core.config.models.AdConfig;
import com.safedk.android.analytics.brandsafety.m;
import com.singular.sdk.internal.Constants;
import io.p071bidmachine.media3.extractor.ts.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class vk3 implements zzbf {
    public static final ls a;
    public static ls b;

    public static int B(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static int J(byte[] bArr, int i, f8 f8Var) throws zzihu {
        int iE = E(i, bArr.length, f8Var, bArr);
        int i2 = f8Var.a;
        if (i2 == 0) {
            f8Var.c = zzifx.b;
            return iE;
        }
        f8Var.c = zzifx.H(iE, i2, bArr);
        return iE + i2;
    }

    public static int q(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    static {
        Object obj = null;
        a = new ls(18, obj, obj, obj);
    }

    public static int C(byte[] bArr, int i, f8 f8Var) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return D(b2, i2, f8Var, bArr);
        }
        f8Var.a = b2;
        return i2;
    }

    public static int D(int i, int i2, f8 f8Var, byte[] bArr) {
        byte b2 = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b2 >= 0) {
            f8Var.a = i4 | (b2 << 7);
            return i3;
        }
        int i5 = i4 | ((b2 & 127) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i3];
        if (b3 >= 0) {
            f8Var.a = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & 127) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            f8Var.a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & 127) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            f8Var.a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                f8Var.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int F(byte[] bArr, int i, f8 f8Var) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            f8Var.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | (((long) (b2 & 127)) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            byte b3 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b3 & 127)) << i4;
            b2 = b3;
            i3 = i5;
        }
        f8Var.b = j2;
        return i3;
    }

    public static boolean G(String str) {
        return str == null || str.isEmpty();
    }

    public static int H(int i, byte[] bArr) {
        int i2 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i3 = bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i4 = bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        return ((bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static long I(int i, byte[] bArr) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public static int L(Object obj, jz4 jz4Var, byte[] bArr, int i, int i2, int i3, f8 f8Var) throws zzihu {
        int i4 = f8Var.d + 1;
        f8Var.d = i4;
        R(i4);
        int iW = ((z) jz4Var).w(obj, bArr, i, i2, i3, f8Var);
        f8Var.d--;
        f8Var.c = obj;
        return iW;
    }

    public static int M(int i, byte[] bArr, int i2, int i3, zziho zzihoVar, f8 f8Var) {
        wy4 wy4Var = (wy4) zzihoVar;
        int iC = C(bArr, i2, f8Var);
        wy4Var.zzi(f8Var.a);
        while (iC < i3) {
            int iC2 = C(bArr, iC, f8Var);
            if (i != f8Var.a) {
                break;
            }
            iC = C(bArr, iC2, f8Var);
            wy4Var.zzi(f8Var.a);
        }
        return iC;
    }

    public static int N(byte[] bArr, int i, zziho zzihoVar, f8 f8Var) throws zzihu {
        wy4 wy4Var = (wy4) zzihoVar;
        int iE = E(i, bArr.length, f8Var, bArr);
        int i2 = f8Var.a + iE;
        while (iE < i2) {
            iE = C(bArr, iE, f8Var);
            wy4Var.zzi(f8Var.a);
        }
        if (iE == i2) {
            return iE;
        }
        y.v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static int P(int i, byte[] bArr, int i2, int i3, zzijl zzijlVar, f8 f8Var) throws zzihu {
        if ((i >>> 3) == 0) {
            y.v("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iF = F(bArr, i2, f8Var);
            zzijlVar.d(i, Long.valueOf(f8Var.b));
            return iF;
        }
        if (i4 == 1) {
            zzijlVar.d(i, Long.valueOf(I(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iE = E(i2, bArr.length, f8Var, bArr);
            int i5 = f8Var.a;
            if (i5 == 0) {
                zzijlVar.d(i, zzifx.b);
            } else {
                zzijlVar.d(i, zzifx.H(iE, i5, bArr));
            }
            return iE + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                zzijlVar.d(i, Integer.valueOf(H(i2, bArr)));
                return i2 + 4;
            }
            y.v("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i6 = (i & (-8)) | 4;
        zzijl zzijlVarA = zzijl.a();
        int i7 = f8Var.d + 1;
        f8Var.d = i7;
        R(i7);
        int i8 = 0;
        while (i2 < i3) {
            int iC = C(bArr, i2, f8Var);
            int i9 = f8Var.a;
            if (i9 == i6) {
                i8 = i9;
                i2 = iC;
                break;
            }
            i2 = P(i9, bArr, iC, i3, zzijlVarA, f8Var);
            i8 = i9;
        }
        f8Var.d--;
        if (i2 > i3 || i8 != i6) {
            y.v("Failed to parse the message.");
            return 0;
        }
        zzijlVar.d(i, zzijlVarA);
        return i2;
    }

    public static int Q(int i, byte[] bArr, int i2, int i3, f8 f8Var) throws zzihu {
        if ((i >>> 3) == 0) {
            y.v("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return F(bArr, i2, f8Var);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return E(i2, bArr.length, f8Var, bArr) + f8Var.a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            y.v("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i5 = (i & (-8)) | 4;
        int i6 = f8Var.d + 1;
        f8Var.d = i6;
        R(i6);
        int i7 = 0;
        while (i2 < i3) {
            i2 = C(bArr, i2, f8Var);
            i7 = f8Var.a;
            if (i7 == i5) {
                break;
            }
            i2 = Q(i7, bArr, i2, i3, f8Var);
        }
        f8Var.d--;
        if (i2 <= i3 && i7 == i5) {
            return i2;
        }
        y.v("Failed to parse the message.");
        return 0;
    }

    public static void R(int i) throws zzihu {
        if (i < 100) {
            return;
        }
        y.v("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public static final void c(AutoCloseable autoCloseable, Throwable th) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable != null) {
            if (th != null) {
                try {
                    h50.v(autoCloseable);
                    return;
                } catch (Throwable th2) {
                    l7.a(th, th2);
                    return;
                }
            }
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (!(autoCloseable instanceof ExecutorService)) {
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                }
                if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                } else if (autoCloseable instanceof MediaDrm) {
                    ((MediaDrm) autoCloseable).release();
                    return;
                } else {
                    e32.a();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static final long d(long j) {
        long j2 = (j << 1) + 1;
        xe0.b.getClass();
        int i = ye0.a;
        return j2;
    }

    public static final long g(long j) {
        uf0 uf0Var = xe0.b;
        long j2 = j << 1;
        int i = ye0.a;
        return j2;
    }

    public static final Collection h(Collection collection) {
        if (collection == null || !collection.isEmpty()) {
            return collection;
        }
        return null;
    }

    public static final int n(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else {
            if (i3 >= 0) {
                d.r("Step is zero.");
                return 0;
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0199 A[LOOP:7: B:106:0x0197->B:107:0x0199, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:137:0x0221  */
    /* JADX WARN: Code duplicated, block: B:139:0x0225  */
    /* JADX WARN: Code duplicated, block: B:141:0x0229  */
    /* JADX WARN: Code duplicated, block: B:143:0x022d  */
    /* JADX WARN: Code duplicated, block: B:144:0x022f  */
    /* JADX WARN: Code duplicated, block: B:145:0x0232  */
    /* JADX WARN: Code duplicated, block: B:146:0x0235  */
    /* JADX WARN: Code duplicated, block: B:148:0x0238  */
    /* JADX WARN: Code duplicated, block: B:149:0x023a  */
    /* JADX WARN: Code duplicated, block: B:155:0x0249 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x024b  */
    /* JADX WARN: Code duplicated, block: B:159:0x0257 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x0259  */
    /* JADX WARN: Code duplicated, block: B:162:0x026c  */
    /* JADX WARN: Code duplicated, block: B:193:0x029a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x029a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x0213 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x0282 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x0253 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x027e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x027a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x0155 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0192 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0091  */
    /* JADX WARN: Code duplicated, block: B:77:0x0112  */
    /* JADX WARN: Code duplicated, block: B:81:0x011c  */
    /* JADX WARN: Code duplicated, block: B:87:0x012d  */
    /* JADX WARN: Code duplicated, block: B:89:0x013d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0145  */
    /* JADX WARN: Code duplicated, block: B:96:0x015c A[LOOP:5: B:95:0x015a->B:96:0x015c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x0172  */
    public static long o(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        int i5;
        int i6;
        int i7;
        long j2;
        char cCharAt;
        af0 af0Var;
        char cCharAt2;
        af0 af0Var2;
        long jA;
        int i8;
        int iMin;
        int i9;
        int i10;
        int i11;
        int iMin2;
        int i12;
        int i13;
        int i14;
        int i15;
        double d;
        long jQ;
        char cCharAt3;
        int i16;
        char cCharAt4;
        char cCharAt5;
        char cCharAt6;
        int i17;
        int i18;
        char cCharAt7;
        if (str.length() == 0) {
            d.r("The string is empty");
            return 0L;
        }
        char cCharAt8 = str.charAt(0);
        int i19 = 1;
        char c = '-';
        char c2 = '+';
        if (cCharAt8 != '+') {
            i2 = cCharAt8 != '-' ? 0 : 1;
            i = i2;
        } else {
            i = 0;
            i2 = 1;
        }
        if (str.length() <= i2) {
            d.r("No components");
            return 0L;
        }
        if (str.charAt(i2) != 'P') {
            d.r("");
            return 0L;
        }
        int i20 = i2 + 1;
        if (i20 == str.length()) {
            d.r("");
            return 0L;
        }
        int i21 = 0;
        af0 af0Var3 = null;
        long jH = 0;
        long j3 = 0;
        while (i20 < str.length()) {
            char cCharAt9 = str.charAt(i20);
            if (cCharAt9 != 'T') {
                dg1 dg1Var = dg1.c;
                int i22 = i19;
                char cCharAt10 = str.charAt(i20);
                if (cCharAt10 != c2) {
                    if (cCharAt10 != c) {
                        i3 = i20;
                    } else {
                        i3 = i20 + 1;
                        i4 = -1;
                    }
                    while (i3 < str.length() && str.charAt(i3) == '0') {
                        i3++;
                    }
                    j = 0;
                    while (true) {
                        if (i3 < str.length()) {
                            cCharAt6 = str.charAt(i3);
                            i5 = i20;
                            if ('0' > cCharAt6 && cCharAt6 < ':') {
                                i17 = cCharAt6 - '0';
                                i18 = i;
                                long j4 = dg1Var.a;
                                if (j > j4 || (j == j4 && i17 > dg1Var.b)) {
                                    i6 = i18;
                                    while (i3 < str.length() && '0' <= (cCharAt7 = str.charAt(i3)) && cCharAt7 < ':') {
                                        i3++;
                                    }
                                    if (i3 != str.length()) {
                                        if (i3 != i5 + ((cCharAt9 == '+' || cCharAt9 == '-') ? i22 : 0)) {
                                            j = 4611686018427387903L;
                                        }
                                    }
                                    d.r("");
                                    return 0L;
                                }
                                j = (j << 3) + (j << i22) + ((long) i17);
                                i3++;
                                i20 = i5;
                                dg1Var = dg1Var;
                                i = i18;
                            }
                            j2 = j;
                            cCharAt = str.charAt(i3);
                            af0Var = af0.SECONDS;
                            if (cCharAt == '.') {
                                i8 = i3 + 1;
                                iMin = Math.min(i3 + 7, str.length());
                                i10 = 0;
                                for (i9 = i8; i9 < iMin; i9++) {
                                    cCharAt5 = str.charAt(i9);
                                    if ('0' <= cCharAt5 || cCharAt5 >= ':') {
                                        for (i11 = 0; i11 < 6 - (i9 - i8); i11++) {
                                            i10 = (i10 << 1) + (i10 << 3);
                                        }
                                        iMin2 = Math.min(i9 + 9, str.length());
                                        i12 = i9;
                                        i13 = 0;
                                        while (true) {
                                            if (i12 < iMin2) {
                                                i16 = iMin2;
                                                cCharAt4 = str.charAt(i12);
                                                i14 = i12;
                                                if ('0' > cCharAt4 && cCharAt4 < ':') {
                                                    i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                                    i12 = i14 + 1;
                                                    iMin2 = i16;
                                                }
                                            } else {
                                                i14 = i12;
                                            }
                                        }
                                        for (i15 = 0; i15 < 9 - (i14 - i9); i15++) {
                                            i13 = (i13 << 1) + (i13 << 3);
                                        }
                                        i3 = i14;
                                        while (i3 < str.length() && '0' <= (cCharAt3 = str.charAt(i3)) && cCharAt3 < ':') {
                                            i3++;
                                        }
                                        if (i3 != i8 || i3 == str.length() || str.charAt(i3) != 'S') {
                                            d.r("");
                                            return 0L;
                                        }
                                        long j5 = (((long) i10) * 1000000000) + ((long) i13);
                                        long j6 = i4;
                                        double d2 = j5;
                                        switch (af0Var) {
                                            case NANOSECONDS:
                                                d = 1.0E-15d;
                                                jQ = rd1.q(d2 * d);
                                                break;
                                            case MICROSECONDS:
                                                d = 1.0E-12d;
                                                jQ = rd1.q(d2 * d);
                                                break;
                                            case MILLISECONDS:
                                                d = 1.0E-9d;
                                                jQ = rd1.q(d2 * d);
                                                break;
                                            case SECONDS:
                                                d = 1.0E-6d;
                                                jQ = rd1.q(d2 * d);
                                                break;
                                            case MINUTES:
                                                d = 6.0E-5d;
                                                jQ = rd1.q(d2 * d);
                                                break;
                                            case HOURS:
                                                d = 0.0036d;
                                                jQ = rd1.q(d2 * d);
                                                break;
                                            case DAYS:
                                                d = 0.0864d;
                                                jQ = rd1.q(d2 * d);
                                                break;
                                            default:
                                                wb0.d(af0Var, "Unknown unit: ");
                                                jQ = 0;
                                                break;
                                        }
                                        j3 = jQ * j6;
                                    } else {
                                        i10 = (cCharAt5 - '0') + (i10 << 3) + (i10 << 1);
                                    }
                                }
                                while (i11 < 6 - (i9 - i8)) {
                                    i10 = (i10 << 1) + (i10 << 3);
                                }
                                iMin2 = Math.min(i9 + 9, str.length());
                                i12 = i9;
                                i13 = 0;
                                while (true) {
                                    if (i12 < iMin2) {
                                        i16 = iMin2;
                                        cCharAt4 = str.charAt(i12);
                                        i14 = i12;
                                        if ('0' > cCharAt4) {
                                        }
                                    } else {
                                        i14 = i12;
                                    }
                                    i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                    i12 = i14 + 1;
                                    iMin2 = i16;
                                }
                                while (i15 < 9 - (i14 - i9)) {
                                    i13 = (i13 << 1) + (i13 << 3);
                                }
                                i3 = i14;
                                while (i3 < str.length()) {
                                    i3++;
                                }
                                if (i3 != i8) {
                                }
                                d.r("");
                                return 0L;
                            }
                            cCharAt2 = str.charAt(i3);
                            af0Var2 = af0.DAYS;
                            if (cCharAt2 == 'D') {
                                af0Var = af0Var2;
                            } else if (cCharAt2 == 'H') {
                                af0Var = af0.HOURS;
                            } else if (cCharAt2 == 'M') {
                                af0Var = af0.MINUTES;
                            } else if (cCharAt2 != 'S') {
                                af0Var = null;
                            }
                            if (af0Var == null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                            }
                            if (af0Var3 == null && af0Var3.compareTo(af0Var) <= 0) {
                                d.r("Unexpected order of duration components");
                                return 0L;
                            }
                            if (af0Var == af0Var2) {
                                if (i21 != 0) {
                                    d.r("");
                                    return 0L;
                                }
                                jH = eu.h(j2, af0Var) * ((long) i4);
                            } else {
                                if (i21 == 0) {
                                    d.r("");
                                    return 0L;
                                }
                                jA = a(jH, eu.h(j2, af0Var) * ((long) i4));
                                if (jA == 9223372036854759646L) {
                                    d.r("");
                                    return 0L;
                                }
                                jH = jA;
                            }
                            i20 = i3 + 1;
                            af0Var3 = af0Var;
                            i19 = i22;
                            i = i6;
                            c = '-';
                            c2 = '+';
                        } else {
                            i5 = i20;
                        }
                        i6 = i;
                        if (i3 == str.length()) {
                            if (cCharAt9 != '+' || cCharAt9 == '-') {
                                i7 = i22;
                            } else {
                                i7 = 0;
                            }
                            if (i3 == i5 + i7) {
                            }
                            j2 = j;
                            cCharAt = str.charAt(i3);
                            af0Var = af0.SECONDS;
                            if (cCharAt == '.') {
                                i8 = i3 + 1;
                                iMin = Math.min(i3 + 7, str.length());
                                i10 = 0;
                                while (i9 < iMin) {
                                    cCharAt5 = str.charAt(i9);
                                    if ('0' <= cCharAt5) {
                                    }
                                    while (i11 < 6 - (i9 - i8)) {
                                        i10 = (i10 << 1) + (i10 << 3);
                                    }
                                    iMin2 = Math.min(i9 + 9, str.length());
                                    i12 = i9;
                                    i13 = 0;
                                    while (true) {
                                        if (i12 < iMin2) {
                                            i16 = iMin2;
                                            cCharAt4 = str.charAt(i12);
                                            i14 = i12;
                                            if ('0' > cCharAt4) {
                                            }
                                        } else {
                                            i14 = i12;
                                        }
                                        i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                        i12 = i14 + 1;
                                        iMin2 = i16;
                                    }
                                    while (i15 < 9 - (i14 - i9)) {
                                        i13 = (i13 << 1) + (i13 << 3);
                                    }
                                    i3 = i14;
                                    while (i3 < str.length()) {
                                        i3++;
                                    }
                                    if (i3 != i8) {
                                    }
                                    d.r("");
                                    return 0L;
                                }
                                while (i11 < 6 - (i9 - i8)) {
                                    i10 = (i10 << 1) + (i10 << 3);
                                }
                                iMin2 = Math.min(i9 + 9, str.length());
                                i12 = i9;
                                i13 = 0;
                                while (true) {
                                    if (i12 < iMin2) {
                                        i16 = iMin2;
                                        cCharAt4 = str.charAt(i12);
                                        i14 = i12;
                                        if ('0' > cCharAt4) {
                                        }
                                    } else {
                                        i14 = i12;
                                    }
                                    i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                    i12 = i14 + 1;
                                    iMin2 = i16;
                                }
                                while (i15 < 9 - (i14 - i9)) {
                                    i13 = (i13 << 1) + (i13 << 3);
                                }
                                i3 = i14;
                                while (i3 < str.length()) {
                                    i3++;
                                }
                                if (i3 != i8) {
                                }
                                d.r("");
                                return 0L;
                            }
                            cCharAt2 = str.charAt(i3);
                            af0Var2 = af0.DAYS;
                            if (cCharAt2 == 'D') {
                                af0Var = af0Var2;
                            } else if (cCharAt2 == 'H') {
                                af0Var = af0.HOURS;
                            } else if (cCharAt2 == 'M') {
                                af0Var = af0.MINUTES;
                            } else if (cCharAt2 != 'S') {
                                af0Var = null;
                            }
                            if (af0Var == null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                            }
                            if (af0Var3 == null) {
                            }
                            if (af0Var == af0Var2) {
                                if (i21 != 0) {
                                    d.r("");
                                    return 0L;
                                }
                                jH = eu.h(j2, af0Var) * ((long) i4);
                            } else {
                                if (i21 == 0) {
                                    d.r("");
                                    return 0L;
                                }
                                jA = a(jH, eu.h(j2, af0Var) * ((long) i4));
                                if (jA == 9223372036854759646L) {
                                    d.r("");
                                    return 0L;
                                }
                                jH = jA;
                            }
                            i20 = i3 + 1;
                            af0Var3 = af0Var;
                            i19 = i22;
                            i = i6;
                            c = '-';
                            c2 = '+';
                        }
                        d.r("");
                        return 0L;
                    }
                }
                i3 = i20 + 1;
                i4 = i22;
                while (i3 < str.length()) {
                    i3++;
                }
                j = 0;
                while (true) {
                    if (i3 < str.length()) {
                        cCharAt6 = str.charAt(i3);
                        i5 = i20;
                        if ('0' > cCharAt6) {
                        }
                    } else {
                        i5 = i20;
                    }
                    i6 = i;
                    if (i3 == str.length()) {
                        if (cCharAt9 != '+') {
                            i7 = i22;
                        } else {
                            i7 = i22;
                        }
                        if (i3 == i5 + i7) {
                        }
                        j2 = j;
                        cCharAt = str.charAt(i3);
                        af0Var = af0.SECONDS;
                        if (cCharAt == '.') {
                            i8 = i3 + 1;
                            iMin = Math.min(i3 + 7, str.length());
                            i10 = 0;
                            while (i9 < iMin) {
                                cCharAt5 = str.charAt(i9);
                                if ('0' <= cCharAt5) {
                                }
                                while (i11 < 6 - (i9 - i8)) {
                                    i10 = (i10 << 1) + (i10 << 3);
                                }
                                iMin2 = Math.min(i9 + 9, str.length());
                                i12 = i9;
                                i13 = 0;
                                while (true) {
                                    if (i12 < iMin2) {
                                        i16 = iMin2;
                                        cCharAt4 = str.charAt(i12);
                                        i14 = i12;
                                        if ('0' > cCharAt4) {
                                        }
                                    } else {
                                        i14 = i12;
                                    }
                                    i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                    i12 = i14 + 1;
                                    iMin2 = i16;
                                }
                                while (i15 < 9 - (i14 - i9)) {
                                    i13 = (i13 << 1) + (i13 << 3);
                                }
                                i3 = i14;
                                while (i3 < str.length()) {
                                    i3++;
                                }
                                if (i3 != i8) {
                                }
                                d.r("");
                                return 0L;
                            }
                            while (i11 < 6 - (i9 - i8)) {
                                i10 = (i10 << 1) + (i10 << 3);
                            }
                            iMin2 = Math.min(i9 + 9, str.length());
                            i12 = i9;
                            i13 = 0;
                            while (true) {
                                if (i12 < iMin2) {
                                    i16 = iMin2;
                                    cCharAt4 = str.charAt(i12);
                                    i14 = i12;
                                    if ('0' > cCharAt4) {
                                    }
                                } else {
                                    i14 = i12;
                                }
                                i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                i12 = i14 + 1;
                                iMin2 = i16;
                            }
                            while (i15 < 9 - (i14 - i9)) {
                                i13 = (i13 << 1) + (i13 << 3);
                            }
                            i3 = i14;
                            while (i3 < str.length()) {
                                i3++;
                            }
                            if (i3 != i8) {
                            }
                            d.r("");
                            return 0L;
                        }
                        cCharAt2 = str.charAt(i3);
                        af0Var2 = af0.DAYS;
                        if (cCharAt2 == 'D') {
                            af0Var = af0Var2;
                        } else if (cCharAt2 == 'H') {
                            af0Var = af0.HOURS;
                        } else if (cCharAt2 == 'M') {
                            af0Var = af0.MINUTES;
                        } else if (cCharAt2 != 'S') {
                            af0Var = null;
                        }
                        if (af0Var == null) {
                            throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                        }
                        if (af0Var3 == null) {
                        }
                        if (af0Var == af0Var2) {
                            if (i21 != 0) {
                                d.r("");
                                return 0L;
                            }
                            jH = eu.h(j2, af0Var) * ((long) i4);
                        } else {
                            if (i21 == 0) {
                                d.r("");
                                return 0L;
                            }
                            jA = a(jH, eu.h(j2, af0Var) * ((long) i4));
                            if (jA == 9223372036854759646L) {
                                d.r("");
                                return 0L;
                            }
                            jH = jA;
                        }
                        i20 = i3 + 1;
                        af0Var3 = af0Var;
                        i19 = i22;
                        i = i6;
                        c = '-';
                        c2 = '+';
                    }
                    d.r("");
                    return 0L;
                    j = (j << 3) + (j << i22) + ((long) i17);
                    i3++;
                    i20 = i5;
                    dg1Var = dg1Var;
                    i = i18;
                }
            } else {
                if (i21 != 0 || (i20 = i20 + 1) == str.length()) {
                    d.r("");
                    return 0L;
                }
                i21 = i19;
            }
        }
        int i23 = i;
        long jH2 = xe0.h(x(jH, af0.MILLISECONDS), x(j3, af0.NANOSECONDS));
        return (i23 == 0 || xe0.d(jH2, xe0.e)) ? jH2 : xe0.l(jH2);
    }

    public static int r(Object obj) {
        return q(obj == null ? 0 : obj.hashCode());
    }

    public static final long t(int i, af0 af0Var) {
        if (af0Var.compareTo(af0.SECONDS) > 0) {
            return x(i, af0Var);
        }
        return g(TimeUnit.NANOSECONDS.convert(i, af0Var.a));
    }

    public static final long x(long j, af0 af0Var) {
        TimeUnit timeUnit = af0Var.a;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jConvert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-jConvert) <= j && j <= jConvert) {
            return g(timeUnit2.convert(j, timeUnit));
        }
        if (af0Var.compareTo(af0.MILLISECONDS) < 0) {
            return d(tb5.i(TimeUnit.MILLISECONDS.convert(j, timeUnit), -4611686018427387903L, 4611686018427387903L));
        }
        long jSignum = Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        return d(eu.h(Math.abs(j), af0Var) * jSignum);
    }

    public static final double z(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    public static int E(int i, int i2, f8 f8Var, byte[] bArr) throws zzihu {
        int iC = C(bArr, i, f8Var);
        int i3 = f8Var.a;
        if (i3 >= 0) {
            if (i3 <= i2 - iC) {
                return iC;
            }
            y.v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        y.v("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return 0;
    }

    public static int K(Object obj, jz4 jz4Var, byte[] bArr, int i, int i2, f8 f8Var) throws zzihu {
        int iE = E(i, i2, f8Var, bArr);
        int i3 = f8Var.a;
        int i4 = f8Var.d + 1;
        f8Var.d = i4;
        R(i4);
        int i5 = i3 + iE;
        jz4Var.c(obj, bArr, iE, i5, f8Var);
        f8Var.d--;
        f8Var.c = obj;
        return i5;
    }

    public static int O(jz4 jz4Var, int i, byte[] bArr, int i2, int i3, zziho zzihoVar, f8 f8Var) throws zzihu {
        Object objZza = jz4Var.zza();
        jz4 jz4Var2 = jz4Var;
        byte[] bArr2 = bArr;
        int i4 = i3;
        f8 f8Var2 = f8Var;
        int iK = K(objZza, jz4Var2, bArr2, i2, i4, f8Var2);
        jz4Var2.a(objZza);
        f8Var2.c = objZza;
        zzihoVar.add(objZza);
        while (iK < i4) {
            f8 f8Var3 = f8Var2;
            int i5 = i4;
            int iC = C(bArr2, iK, f8Var3);
            if (i != f8Var3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            jz4 jz4Var3 = jz4Var2;
            Object objZza2 = jz4Var3.zza();
            iK = K(objZza2, jz4Var3, bArr3, iC, i5, f8Var3);
            jz4Var2 = jz4Var3;
            bArr2 = bArr3;
            i4 = i5;
            f8Var2 = f8Var3;
            jz4Var2.a(objZza2);
            f8Var2.c = objZza2;
            zzihoVar.add(objZza2);
        }
        return iK;
    }

    public static final void b(bk2 bk2Var, bk2 bk2Var2) {
        bk2Var.getClass();
        bk2Var2.getClass();
        for (Map.Entry entry : bk2Var2.d()) {
            bk2Var.f((String) entry.getKey(), (List) entry.getValue());
        }
    }

    public static final ArrayList i(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            CharSequence charSequence = (CharSequence) it.next();
            if (!dk2.Z(charSequence)) {
                arrayList.add(charSequence);
            }
        }
        return arrayList;
    }

    public static final Class j(KClass kClass) {
        kClass.getClass();
        Class clsA = ((tr) kClass).a();
        clsA.getClass();
        return clsA;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class k(KClass kClass) {
        kClass.getClass();
        Class clsA = ((tr) kClass).a();
        if (clsA.isPrimitive()) {
            String name = clsA.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals(m.w)) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals(Constants.LONG)) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsA;
    }

    public static final long a(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            if (j2 != 4611686018427387903L && j2 != -4611686018427387903L) {
                return tb5.i(j + j2, -4611686018427387903L, 4611686018427387903L);
            }
            return j2;
        }
        if ((-4611686018427387903L < j2 && j2 < 4611686018427387903L) || (j2 ^ j) >= 0) {
            return j;
        }
        return 9223372036854759646L;
    }

    public static final long f(long j) {
        if (-4611686018426L <= j && j < 4611686018427L) {
            return g(j * 1000000);
        }
        return d(tb5.i(j, -4611686018427387903L, 4611686018427387903L));
    }
}
