package defpackage;

import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class fw0 {
    public static final char[] a = "0123456789abcdef".toCharArray();

    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof fw0) {
            byte[] bArr = ((ew0) this).b;
            int length = bArr.length * 8;
            byte[] bArr2 = ((ew0) ((fw0) obj)).b;
            if (length == bArr2.length * 8) {
                if (bArr.length != bArr2.length) {
                    z = false;
                } else {
                    z = true;
                    for (int i = 0; i < bArr.length; i++) {
                        z &= bArr[i] == bArr2[i];
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = ((ew0) this).b;
        if (bArr.length * 8 < 32) {
            int i = bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            for (int i2 = 1; i2 < bArr.length; i2++) {
                i |= (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << (i2 * 8);
            }
            return i;
        }
        boolean z = bArr.length >= 4;
        int length = bArr.length;
        if (z) {
            return ((bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        }
        e32.i(eu.x("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
        return 0;
    }

    public final String toString() {
        byte[] bArr = ((ew0) this).b;
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            char[] cArr = a;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
