package defpackage;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzagu;
import com.google.android.gms.internal.p002firebaseauthapi.zzamd;
import com.usercentrics.sdk.ui.color.UsercentricsShadedColor;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class u12 implements zzagu {
    public static final tx a;
    public static final tx b;
    public static final tx c;
    public static final tx d;
    public static final tx e;
    public static final ag0 f = new ag0(false);
    public static final ag0 g = new ag0(true);
    public static int h = 50;
    public static int i = 10;
    public static int j = 10;
    public static int k = 10;
    public static za3 l = null;
    public static boolean m = false;
    public static int n = 1;
    public static int o = 8192;
    public static boolean p = false;
    public static boolean q = true;
    public static final /* synthetic */ int r = 0;

    public static final Object e(c91 c91Var, fy fyVar) {
        c91Var.cancel(null);
        Object objJoin = c91Var.join(fyVar);
        return objJoin == dz.a ? objJoin : az2.a;
    }

    public static final byte[] n(ih2 ih2Var, int i2) throws EOFException {
        if (i2 == -1) {
            for (long j2 = 2147483647L; ih2Var.getBuffer().c < 2147483647L && ih2Var.request(j2); j2 *= 2) {
            }
            if (ih2Var.getBuffer().c >= 2147483647L) {
                d.g(ih2Var.getBuffer().c, "Can't create an array of size ");
                return null;
            }
            i2 = (int) ih2Var.getBuffer().c;
        } else {
            ih2Var.require(i2);
        }
        byte[] bArr = new byte[i2];
        bk buffer = ih2Var.getBuffer();
        buffer.getClass();
        long j3 = i2;
        s71.e(j3, 0L, j3);
        int i3 = 0;
        while (i3 < i2) {
            int iB = buffer.b(i3, i2, bArr);
            if (iB == -1) {
                throw new EOFException(jc1.n("Source exhausted before reading ", i2, " bytes. Only ", iB, " bytes were read."));
            }
            i3 += iB;
        }
        return bArr;
    }

    public abstract void y(xt4 xt4Var, Set set);

    public abstract int z(xt4 xt4Var);

    static {
        int i2 = 8;
        a = new tx("COMPLETING_ALREADY", i2);
        b = new tx("COMPLETING_WAITING_CHILDREN", i2);
        c = new tx("COMPLETING_RETRY", i2);
        d = new tx("TOO_LATE_TO_CANCEL", i2);
        e = new tx("SEALED", i2);
    }

    public static boolean A(int i2, int i3, byte[] bArr) {
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return true;
        }
        while (i2 < i3) {
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 < 0) {
                if (b2 < -32) {
                    if (i4 < i3 && b2 >= -62) {
                        i2 += 2;
                        if (bArr[i4] > -65) {
                        }
                    }
                    return false;
                }
                if (b2 < -16) {
                    if (i4 >= i3 - 1) {
                        return false;
                    }
                    int i5 = i2 + 2;
                    byte b3 = bArr[i4];
                    if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                        i2 += 3;
                        if (bArr[i5] > -65) {
                        }
                    }
                    return false;
                }
                if (i4 >= i3 - 2) {
                    return false;
                }
                int i6 = i2 + 2;
                byte b4 = bArr[i4];
                if (b4 <= -65) {
                    if ((((b4 + 112) + (b2 << 28)) >> 30) == 0) {
                        int i7 = i2 + 3;
                        if (bArr[i6] <= -65) {
                            i2 += 4;
                            if (bArr[i7] > -65) {
                            }
                        }
                    }
                }
                return false;
            }
            i2 = i4;
        }
        return true;
    }

    public static e91 a() {
        return new e91(null);
    }

    public static void c(ArrayList arrayList, List list, int i2, wr0 wr0Var, zr0 zr0Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Character ch = (Character) zr0Var.invoke(obj, Integer.valueOf(i2));
            ch.getClass();
            Object arrayList2 = linkedHashMap.get(ch);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(ch, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            char cCharValue = ((Character) entry.getKey()).charValue();
            List list2 = (List) entry.getValue();
            int i3 = i2 + 1;
            ArrayList arrayList3 = new ArrayList();
            List list3 = list2;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : list3) {
                if (((Number) wr0Var.invoke(obj2)).intValue() > i3) {
                    arrayList4.add(obj2);
                }
            }
            c(arrayList3, arrayList4, i3, wr0Var, zr0Var);
            arrayList3.trimToSize();
            ArrayList arrayList5 = new ArrayList();
            for (Object obj3 : list3) {
                if (((Number) wr0Var.invoke(obj3)).intValue() == i3) {
                    arrayList5.add(obj3);
                }
            }
            arrayList.add(new r8(cCharValue, arrayList5, arrayList3));
        }
    }

    public static void f(sy syVar) {
        l92 children;
        c91 c91Var = (c91) syVar.get(nl0.i);
        if (c91Var == null || (children = c91Var.getChildren()) == null) {
            return;
        }
        Iterator it = children.iterator();
        while (it.hasNext()) {
            ((c91) it.next()).cancel(null);
        }
    }

    public static final void h(sy syVar) {
        c91 c91Var = (c91) syVar.get(nl0.i);
        if (c91Var != null && !c91Var.isActive()) {
            throw c91Var.getCancellationException();
        }
    }

    public static final c91 j(sy syVar) {
        c91 c91Var = (c91) syVar.get(nl0.i);
        if (c91Var != null) {
            return c91Var;
        }
        wb0.d(syVar, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static final ad0 k(c91 c91Var, boolean z, f91 f91Var) {
        if (c91Var instanceof o91) {
            return ((o91) c91Var).J(z, f91Var);
        }
        return c91Var.invokeOnCompletion(f91Var.i(), z, new k4(1, f91Var, f91.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 3));
    }

    public static final boolean l(sy syVar) {
        c91 c91Var = (c91) syVar.get(nl0.i);
        if (c91Var != null) {
            return c91Var.isActive();
        }
        return true;
    }

    public static String q(ku kuVar, double d2) {
        double d3 = (((d2 * 2.0d) - 1.0d) + 1.0d) / 2.0d;
        double d4 = 255.0d * (1.0d - d3);
        double dFloor = Math.floor((((double) kuVar.a) * d3) + d4);
        double dFloor2 = Math.floor((((double) kuVar.c) * d3) + d4);
        int i2 = (int) dFloor;
        int iFloor = (int) Math.floor((((double) kuVar.b) * d3) + d4);
        ju juVar = ku.Companion;
        return pv1.o("#", ju.a(juVar, i2), ju.a(juVar, (int) dFloor2), ju.a(juVar, iFloor));
    }

    public static final yx2 r(String str) {
        int i2;
        ns1.d(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char cCharAt = str.charAt(0);
        if (s71.h(cCharAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i2 = 0;
        }
        int i4 = 119304647;
        while (i2 < length) {
            int iDigit = Character.digit((int) str.charAt(i2), 10);
            if (iDigit < 0) {
                return null;
            }
            int i5 = i3 ^ Integer.MIN_VALUE;
            if (Integer.compare(i5, i4 ^ Integer.MIN_VALUE) > 0) {
                if (i4 != 119304647 || Integer.compare(i5, -1717986919) > 0) {
                    return null;
                }
                i4 = 429496729;
            }
            int i6 = i3 * 10;
            int i7 = iDigit + i6;
            if (Integer.compare(i7 ^ Integer.MIN_VALUE, i6 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i2++;
            i3 = i7;
        }
        return new yx2(i3);
    }

    public static final dy2 s(String str) {
        str.getClass();
        int i2 = 10;
        ns1.d(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char cCharAt = str.charAt(0);
        if (s71.h(cCharAt, 48) < 0) {
            i3 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long j2 = 0;
        long j3 = 512409557603043100L;
        while (i3 < length) {
            int iDigit = Character.digit((int) str.charAt(i3), i2);
            if (iDigit < 0) {
                return null;
            }
            long j4 = j2 ^ Long.MIN_VALUE;
            int i4 = length;
            if (Long.compare(j4, j3 ^ Long.MIN_VALUE) > 0) {
                if (j3 != 512409557603043100L || Long.compare(j4, -7378697629483820647L) > 0) {
                    return null;
                }
                j3 = 1844674407370955161L;
            }
            long j5 = j2 * 10;
            long j6 = (((long) iDigit) & 4294967295L) + j5;
            if (Long.compare(j6 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i3++;
            j2 = j6;
            length = i4;
            i2 = 10;
        }
        return new dy2(j2);
    }

    public static final Object t(Object obj) {
        v51 v51Var;
        w51 w51Var = obj instanceof w51 ? (w51) obj : null;
        return (w51Var == null || (v51Var = w51Var.a) == null) ? obj : v51Var;
    }

    public static String x(int i2, int i3, byte[] bArr) {
        if (i3 == 0) {
            return "";
        }
        if ((i2 | i3 | ((bArr.length - i2) - i3)) < 0) {
            vq2.o("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)});
            return null;
        }
        int i4 = i2 + i3;
        char[] cArr = new char[i3];
        int i5 = 0;
        while (i2 < i4) {
            byte b2 = bArr[i2];
            if (b2 < 0) {
                break;
            }
            i2++;
            cArr[i5] = (char) b2;
            i5++;
        }
        while (i2 < i4) {
            int i6 = i2 + 1;
            byte b3 = bArr[i2];
            if (b3 >= 0) {
                int i7 = i5 + 1;
                cArr[i5] = (char) b3;
                while (i6 < i4) {
                    byte b4 = bArr[i6];
                    if (b4 < 0) {
                        break;
                    }
                    i6++;
                    cArr[i7] = (char) b4;
                    i7++;
                }
                i5 = i7;
                i2 = i6;
            } else if (b3 < -32) {
                if (i6 >= i4) {
                    throw zzamd.h();
                }
                i2 += 2;
                byte b5 = bArr[i6];
                int i8 = i5 + 1;
                if (b3 < -62 || kc2.A(b5)) {
                    throw zzamd.h();
                }
                cArr[i5] = (char) ((b5 & 63) | ((b3 & 31) << 6));
                i5 = i8;
            } else {
                if (b3 >= -16) {
                    if (i6 >= i4 - 2) {
                        throw zzamd.h();
                    }
                    byte b6 = bArr[i6];
                    int i9 = i2 + 3;
                    byte b7 = bArr[i2 + 2];
                    i2 += 4;
                    byte b8 = bArr[i9];
                    int i10 = i5 + 1;
                    if (!kc2.A(b6)) {
                        if ((((b6 + 112) + (b3 << 28)) >> 30) == 0 && !kc2.A(b7) && !kc2.A(b8)) {
                            int i11 = ((b6 & 63) << 12) | ((b3 & 7) << 18) | ((b7 & 63) << 6) | (b8 & 63);
                            cArr[i5] = (char) ((i11 >>> 10) + 55232);
                            cArr[i10] = (char) ((i11 & 1023) + 56320);
                            i5 += 2;
                        }
                    }
                    throw zzamd.h();
                }
                if (i6 >= i4 - 1) {
                    throw zzamd.h();
                }
                int i12 = i2 + 2;
                byte b9 = bArr[i6];
                i2 += 3;
                byte b10 = bArr[i12];
                int i13 = i5 + 1;
                if (kc2.A(b9) || ((b3 == -32 && b9 < -96) || ((b3 == -19 && b9 >= -96) || kc2.A(b10)))) {
                    throw zzamd.h();
                }
                cArr[i5] = (char) (((b9 & 63) << 6) | ((b3 & 15) << 12) | (b10 & 63));
                i5 = i13;
            }
        }
        return new String(cArr, 0, i5);
    }

    public static xl1 b(List list, wr0 wr0Var, zr0 zr0Var) {
        Object next;
        list.getClass();
        List list2 = list;
        Iterator it = list2.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                Comparable comparable = (Comparable) wr0Var.invoke(next);
                do {
                    Object next2 = it.next();
                    Comparable comparable2 = (Comparable) wr0Var.invoke(next2);
                    if (comparable.compareTo(comparable2) < 0) {
                        next = next2;
                        comparable = comparable2;
                    }
                } while (it.hasNext());
            }
        }
        if (next != null) {
            ((Number) wr0Var.invoke(next)).intValue();
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (((Number) wr0Var.invoke(it2.next())).intValue() == 0) {
                        d.r("There should be no empty entries");
                        return null;
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            c(arrayList, list, 0, wr0Var, zr0Var);
            arrayList.trimToSize();
            new r8((char) 0, gg0.a, arrayList);
            return new xl1(9);
        }
        vq2.s("Unable to build char tree from an empty list");
        return null;
    }

    public static final void d(String str, Throwable th, c91 c91Var) {
        c91Var.cancel(j7.I(str, th));
    }

    public static final byte[] g(CharsetEncoder charsetEncoder, CharSequence charSequence, int i2, int i3) throws CharacterCodingException {
        charsetEncoder.getClass();
        charSequence.getClass();
        if (charSequence instanceof String) {
            if (i2 == 0) {
                String str = (String) charSequence;
                if (i3 == str.length()) {
                    byte[] bytes = str.getBytes(charsetEncoder.charset());
                    bytes.getClass();
                    return bytes;
                }
            }
            byte[] bytes2 = ((String) charSequence).substring(i2, i3).getBytes(charsetEncoder.charset());
            bytes2.getClass();
            return bytes2;
        }
        ByteBuffer byteBufferEncode = charsetEncoder.encode(CharBuffer.wrap(charSequence, i2, i3));
        byte[] bArr = null;
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            byte[] bArrArray = byteBufferEncode.array();
            if (bArrArray.length == byteBufferEncode.remaining()) {
                bArr = bArrArray;
            }
        }
        if (bArr == null) {
            byte[] bArr2 = new byte[byteBufferEncode.remaining()];
            byteBufferEncode.get(bArr2);
            return bArr2;
        }
        return bArr;
    }

    public static UsercentricsShadedColor i(String str) {
        str.getClass();
        ju juVar = ku.Companion;
        juVar.getClass();
        ku kuVarB = ju.b(str);
        return new UsercentricsShadedColor(pv1.o("#", ju.a(juVar, kuVarB.a), ju.a(juVar, kuVarB.c), ju.a(juVar, kuVarB.b)), q(kuVarB, 0.8d), q(kuVarB, 0.16d), q(kuVarB, 0.02d));
    }

    public static final byte[] m(ih2 ih2Var, int i2) {
        ih2Var.getClass();
        long j2 = i2;
        if (j2 >= 0) {
            return n(ih2Var, i2);
        }
        ak1.n(pv1.m(j2, "byteCount (", ") < 0"));
        return null;
    }

    public static Executor p(Executor executor, rq0 rq0Var) {
        executor.getClass();
        if (executor == gc0.a) {
            return executor;
        }
        return new ho1(executor, rq0Var, 0);
    }

    public static int u(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 2048) {
                i3 += (127 - cCharAt) >>> 31;
                i2++;
            } else {
                try {
                    int length2 = str.length();
                    int i4 = 0;
                    while (i2 < length2) {
                        char cCharAt2 = str.charAt(i2);
                        if (cCharAt2 < 2048) {
                            i4 += (127 - cCharAt2) >>> 31;
                        } else {
                            i4 += 2;
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                                if (Character.codePointAt(str, i2) >= 65536) {
                                    i2++;
                                } else {
                                    throw new ut3(i2, length2);
                                }
                            }
                        }
                        i2++;
                    }
                    i3 += i4;
                    break;
                } catch (ut3 unused) {
                    return str.getBytes(StandardCharsets.UTF_8).length;
                }
            }
        }
        if (i3 >= length) {
            return i3;
        }
        d.r(jc1.l(((long) i3) + 4294967296L, "UTF-8 length does not fit in int: "));
        return 0;
    }

    public static int v(String str, byte[] bArr, int i2, int i3) {
        int i4;
        int length;
        int i5;
        char cCharAt;
        int length2 = str.length();
        int i6 = i2 + i3;
        int i7 = 0;
        while (i7 < length2 && (i5 = i7 + i2) < i6 && (cCharAt = str.charAt(i7)) < 128) {
            bArr[i5] = (byte) cCharAt;
            i7++;
        }
        if (i7 == length2) {
            return i2 + length2;
        }
        int i8 = i2 + i7;
        while (i7 < length2) {
            char cCharAt2 = str.charAt(i7);
            if (cCharAt2 < 128 && i8 < i6) {
                bArr[i8] = (byte) cCharAt2;
                i8++;
            } else if (cCharAt2 < 2048 && i8 <= i6 - 2) {
                int i9 = i8 + 1;
                bArr[i8] = (byte) ((cCharAt2 >>> 6) | 960);
                i8 += 2;
                bArr[i9] = (byte) ((cCharAt2 & '?') | 128);
            } else if ((cCharAt2 < 55296 || 57343 < cCharAt2) && i8 <= i6 - 3) {
                bArr[i8] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i10 = i8 + 2;
                bArr[i8 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i8 += 3;
                bArr[i10] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if (i8 <= i6 - 4) {
                    i7++;
                    if (i7 != str.length()) {
                        char cCharAt3 = str.charAt(i7);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i8 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i11 = i8 + 3;
                            bArr[i8 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i8 += 4;
                            bArr[i11] = (byte) ((codePoint & 63) | 128);
                        }
                    }
                    byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                    if (bytes.length - i2 <= i3) {
                        System.arraycopy(bytes, 0, bArr, i2, bytes.length);
                        length = bytes.length;
                    } else {
                        d.l("Not enough space in output buffer to encode UTF-8 string");
                        return 0;
                    }
                } else if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i4 = i7 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i4)))) {
                    byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
                    if (bytes2.length - i2 <= i3) {
                        System.arraycopy(bytes2, 0, bArr, i2, bytes2.length);
                        length = bytes2.length;
                    } else {
                        d.l("Not enough space in output buffer to encode UTF-8 string");
                        return 0;
                    }
                } else {
                    d.l("Not enough space in output buffer to encode UTF-8 string");
                    return 0;
                }
                return i2 + length;
            }
            i7++;
        }
        return i8;
    }

    public static final Bundle w(String str, String str2, boolean z, boolean z2) {
        str.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_SERVER_CLIENT_ID", str);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_NONCE", str2);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FILTER_BY_AUTHORIZED_ACCOUNTS", z);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_LINKED_SERVICE_ID", null);
        bundle.putStringArrayList("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN_DEPOSITION_SCOPES", null);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_REQUEST_VERIFIED_PHONE_NUMBER", false);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_AUTO_SELECT_ENABLED", z2);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_HOSTED_DOMAIN_FILTER", null);
        return bundle;
    }
}
