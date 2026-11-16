package com.google.android.gms.internal.p002firebaseauthapi;

import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbd {
    public static final char[] a = "0123456789abcdef".toCharArray();

    public abstract int d();

    public abstract boolean f(zzbd zzbdVar);

    public abstract int g();

    public abstract byte[] h();

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbd)) {
            return false;
        }
        zzbd zzbdVar = (zzbd) obj;
        return g() == zzbdVar.g() && f(zzbdVar);
    }

    public final int hashCode() {
        if (g() >= 32) {
            return d();
        }
        byte[] bArrI = i();
        int i = bArrI[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        for (int i2 = 1; i2 < bArrI.length; i2++) {
            i |= (bArrI[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << (i2 << 3);
        }
        return i;
    }

    public byte[] i() {
        return h();
    }

    public final String toString() {
        byte[] bArrI = i();
        StringBuilder sb = new StringBuilder(bArrI.length * 2);
        for (byte b : bArrI) {
            char[] cArr = a;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
