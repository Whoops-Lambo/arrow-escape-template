package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import defpackage.at4;
import defpackage.zs4;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzhcr {
    public static int a(long j) {
        int i = (int) j;
        zzgvz.d(j, ((long) i) == j, "Out of range: %s");
        return i;
    }

    public static int c(byte[] bArr) {
        int length = bArr.length;
        if (length >= 4) {
            return (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (bArr[0] << 24) | ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        }
        defpackage.d.r(zzgwq.a("array too small: %s < %s", Integer.valueOf(length), 4));
        return 0;
    }

    public static List e(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.EMPTY_LIST : new zs4(0, length, iArr);
    }

    public static int[] d(AbstractCollection abstractCollection) {
        if (abstractCollection instanceof zs4) {
            zs4 zs4Var = (zs4) abstractCollection;
            return Arrays.copyOfRange(zs4Var.a, zs4Var.b, zs4Var.c);
        }
        Object[] array = abstractCollection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static int b(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    public static Integer f(String str) {
        byte b;
        Long lValueOf;
        byte b2;
        str.getClass();
        if (str.isEmpty()) {
            lValueOf = null;
            break;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        if (cCharAt == '-') {
            i = 1;
        }
        if (i == str.length()) {
            lValueOf = null;
            break;
        }
        int i2 = i + 1;
        char cCharAt2 = str.charAt(i);
        if (cCharAt2 < 128) {
            b = at4.a[cCharAt2];
        } else {
            byte[] bArr = at4.a;
            b = -1;
        }
        if (b < 0 || b >= 10) {
            lValueOf = null;
            break;
        }
        long j = -b;
        while (true) {
            if (i2 < str.length()) {
                int i3 = i2 + 1;
                char cCharAt3 = str.charAt(i2);
                if (cCharAt3 < 128) {
                    b2 = at4.a[cCharAt3];
                } else {
                    byte[] bArr2 = at4.a;
                    b2 = -1;
                }
                if (b2 >= 0 && b2 < 10 && j >= -922337203685477580L) {
                    long j2 = j * 10;
                    long j3 = b2;
                    if (j2 >= Long.MIN_VALUE + j3) {
                        j = j2 - j3;
                        i2 = i3;
                    }
                }
            } else {
                if (cCharAt == '-') {
                    lValueOf = Long.valueOf(j);
                    break;
                }
                if (j != Long.MIN_VALUE) {
                    lValueOf = Long.valueOf(-j);
                    break;
                }
                break;
            }
            lValueOf = null;
            break;
        }
        if (lValueOf == null || lValueOf.longValue() != lValueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(lValueOf.intValue());
    }
}
