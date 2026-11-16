package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import io.p071bidmachine.media3.extractor.ts.y;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class nm implements Comparable {
    public static final nm c = new nm(new byte[0]);
    public static final char[] d;
    public final byte[] a;
    public int b;

    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        charArray.getClass();
        d = charArray;
    }

    public final byte a(int i) {
        byte[] bArr = this.a;
        if (i >= 0 && i < bArr.length) {
            return bArr[i];
        }
        y.p(h50.l(jc1.s(i, "index (", ") is out of byte string bounds: [0.."), bArr.length, ')'));
        return (byte) 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        nm nmVar = (nm) obj;
        nmVar.getClass();
        byte[] bArr = nmVar.a;
        if (nmVar == this) {
            return 0;
        }
        byte[] bArr2 = this.a;
        int iMin = Math.min(bArr2.length, bArr.length);
        for (int i = 0; i < iMin; i++) {
            int iH = s71.h(bArr2[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            if (iH != 0) {
                return iH;
            }
        }
        return s71.h(bArr2.length, bArr.length);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || nm.class != obj.getClass()) {
            return false;
        }
        nm nmVar = (nm) obj;
        byte[] bArr = nmVar.a;
        int length = bArr.length;
        byte[] bArr2 = this.a;
        if (length != bArr2.length) {
            return false;
        }
        int i2 = nmVar.b;
        if (i2 == 0 || (i = this.b) == 0 || i2 == i) {
            return Arrays.equals(bArr2, bArr);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.a);
        this.b = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        byte[] bArr = this.a;
        if (bArr.length == 0) {
            return "ByteString(size=0)";
        }
        String strValueOf = String.valueOf(bArr.length);
        StringBuilder sb = new StringBuilder((bArr.length * 2) + strValueOf.length() + 22);
        sb.append("ByteString(size=");
        sb.append(strValueOf);
        sb.append(" hex=");
        for (byte b : bArr) {
            char[] cArr = d;
            sb.append(cArr[(b >>> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nm(byte[] bArr, int i, int i2) {
        this(n8.U(i, i2, bArr));
        bArr.getClass();
    }

    public nm(byte[] bArr) {
        this.a = bArr;
    }
}
