package com.bytedance.sdk.component.ahm.kgy.ahm;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C4664b4;
import defpackage.d;
import defpackage.nj;
import defpackage.pv1;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class uq implements Serializable, Comparable<uq> {
    transient int ct;
    transient String noq;
    final byte[] uq;
    static final char[] kgy = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final Charset ahm = Charset.forName("UTF-8");
    public static final uq rz = kgy(new byte[0]);

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uq) {
            uq uqVar = (uq) obj;
            int iRz = uqVar.rz();
            byte[] bArr = this.uq;
            if (iRz == bArr.length && uqVar.kgy(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public String ahm() {
        byte[] bArr = this.uq;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = kgy;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public int hashCode() {
        int i = this.ct;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.uq);
        this.ct = iHashCode;
        return iHashCode;
    }

    public uq kgy(int i, int i2) {
        if (i < 0) {
            d.r("beginIndex < 0");
            return null;
        }
        byte[] bArr = this.uq;
        if (i2 > bArr.length) {
            d.r(nj.l(this.uq.length, ")", new StringBuilder("endIndex > length(")));
            return null;
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            d.r("endIndex < beginIndex");
            return null;
        }
        if (i == 0 && i2 == bArr.length) {
            return this;
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, i3);
        return new uq(bArr2);
    }

    public int rz() {
        return this.uq.length;
    }

    public String toString() {
        if (this.uq.length == 0) {
            return "[size=0]";
        }
        String strKgy = kgy();
        int iKgy = kgy(strKgy, 64);
        if (iKgy != -1) {
            String strReplace = strKgy.substring(0, iKgy).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (iKgy >= strKgy.length()) {
                return pv1.n("[text=", strReplace, C4664b4.j.e);
            }
            return "[size=" + this.uq.length + " text=" + strReplace + "…]";
        }
        if (this.uq.length <= 64) {
            return "[hex=" + ahm() + C4664b4.j.e;
        }
        return "[size=" + this.uq.length + " hex=" + kgy(0, 64).ahm() + "…]";
    }

    public byte[] uq() {
        return (byte[]) this.uq.clone();
    }

    public uq(byte[] bArr) {
        this.uq = bArr;
    }

    public String kgy() {
        String str = this.noq;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.uq, ahm);
        this.noq = str2;
        return str2;
    }

    public static uq kgy(byte... bArr) {
        if (bArr != null) {
            return new uq((byte[]) bArr.clone());
        }
        d.r("data == null");
        return null;
    }

    public byte kgy(int i) {
        return this.uq[i];
    }

    public boolean kgy(int i, uq uqVar, int i2, int i3) {
        return uqVar.kgy(i2, this.uq, i, i3);
    }

    public boolean kgy(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.uq;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && gf.kgy(bArr2, i, bArr, i2, i3);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
    public int compareTo(uq uqVar) {
        int iRz = rz();
        int iRz2 = uqVar.rz();
        int iMin = Math.min(iRz, iRz2);
        for (int i = 0; i < iMin; i++) {
            int iKgy = kgy(i) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int iKgy2 = uqVar.kgy(i) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (iKgy != iKgy2) {
                return iKgy < iKgy2 ? -1 : 1;
            }
        }
        if (iRz == iRz2) {
            return 0;
        }
        return iRz < iRz2 ? -1 : 1;
    }

    public static int kgy(String str, int i) {
        int length = str.length();
        int iCharCount = 0;
        int i2 = 0;
        while (iCharCount < length) {
            if (i2 == i) {
                return iCharCount;
            }
            int iCodePointAt = str.codePointAt(iCharCount);
            if ((Character.isISOControl(iCodePointAt) && iCodePointAt != 10 && iCodePointAt != 13) || iCodePointAt == 65533) {
                return -1;
            }
            i2++;
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.length();
    }
}
