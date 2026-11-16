package com.google.android.gms.internal.fido;

import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzft {
    public static final char[] a = "0123456789abcdef".toCharArray();

    public abstract int d();

    public abstract int f();

    public abstract boolean g(zzft zzftVar);

    public byte[] h() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzft)) {
            return false;
        }
        zzft zzftVar = (zzft) obj;
        return f() == zzftVar.f() && g(zzftVar);
    }

    public final int hashCode() {
        if (f() >= 32) {
            return d();
        }
        byte[] bArrH = h();
        int i = bArrH[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        for (int i2 = 1; i2 < bArrH.length; i2++) {
            i |= (bArrH[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << (i2 * 8);
        }
        return i;
    }

    public final String toString() {
        byte[] bArrH = h();
        int length = bArrH.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : bArrH) {
            char[] cArr = a;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
