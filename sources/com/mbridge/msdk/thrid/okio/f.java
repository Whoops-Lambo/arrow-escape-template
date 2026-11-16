package com.mbridge.msdk.thrid.okio;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C4664b4;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import defpackage.nj;
import defpackage.pv1;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class f implements Serializable, Comparable<f> {
    static final char[] d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final f e = a(new byte[0]);
    final byte[] a;
    transient int b;
    transient String c;

    public static f a(String str) {
        if (str == null) {
            defpackage.d.r("hex == null");
            return null;
        }
        if (str.length() % 2 != 0) {
            defpackage.d.r("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((a(str.charAt(i2)) << 4) + a(str.charAt(i2 + 1)));
        }
        return a(bArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            int i = fVar.i();
            byte[] bArr = this.a;
            if (i == bArr.length && fVar.a(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public f j() {
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b2 = bArr2[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArr2[i2] = (byte) (b2 + 32);
                    }
                }
                return new f(bArr2);
            }
            i++;
        }
    }

    public static f c(String str) {
        if (str == null) {
            defpackage.d.r("s == null");
            return null;
        }
        f fVar = new f(str.getBytes(u.a));
        fVar.c = str;
        return fVar;
    }

    public String d() {
        return b.a(this.a);
    }

    public String f() {
        byte[] bArr = this.a;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = d;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public f g() {
        return b(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
    }

    public f h() {
        return b("SHA-256");
    }

    public int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.a);
        this.b = iHashCode;
        return iHashCode;
    }

    public int i() {
        return this.a.length;
    }

    public byte[] k() {
        return (byte[]) this.a.clone();
    }

    public String l() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.a, u.a);
        this.c = str2;
        return str2;
    }

    public String toString() {
        if (this.a.length == 0) {
            return "[size=0]";
        }
        String strL = l();
        int iA = a(strL, 64);
        if (iA != -1) {
            String strReplace = strL.substring(0, iA).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (iA >= strL.length()) {
                return pv1.n("[text=", strReplace, C4664b4.j.e);
            }
            return "[size=" + this.a.length + " text=" + strReplace + "…]";
        }
        if (this.a.length <= 64) {
            return "[hex=" + f() + C4664b4.j.e;
        }
        return "[size=" + this.a.length + " hex=" + a(0, 64).f() + "…]";
    }

    public f(byte[] bArr) {
        this.a = bArr;
    }

    private f b(String str) {
        try {
            return a(MessageDigest.getInstance(str).digest(this.a));
        } catch (NoSuchAlgorithmException e2) {
            defpackage.d.p(e2);
            return null;
        }
    }

    public final boolean b(f fVar) {
        return a(0, fVar, 0, fVar.i());
    }

    public static f a(byte... bArr) {
        if (bArr != null) {
            return new f((byte[]) bArr.clone());
        }
        defpackage.d.r("data == null");
        return null;
    }

    private static int a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c >= 'A' && c <= 'F') {
            return c - '7';
        }
        defpackage.d.e(c, "Unexpected hex digit: ");
        return 0;
    }

    public f a(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.a;
            if (i2 > bArr.length) {
                defpackage.d.r(nj.l(this.a.length, ")", new StringBuilder("endIndex > length(")));
                return null;
            }
            int i3 = i2 - i;
            if (i3 >= 0) {
                if (i == 0 && i2 == bArr.length) {
                    return this;
                }
                byte[] bArr2 = new byte[i3];
                System.arraycopy(bArr, i, bArr2, 0, i3);
                return new f(bArr2);
            }
            defpackage.d.r("endIndex < beginIndex");
            return null;
        }
        defpackage.d.r("beginIndex < 0");
        return null;
    }

    public byte a(int i) {
        return this.a[i];
    }

    public void a(c cVar) {
        byte[] bArr = this.a;
        cVar.write(bArr, 0, bArr.length);
    }

    public boolean a(int i, f fVar, int i2, int i3) {
        return fVar.a(i2, this.a, i, i3);
    }

    public boolean a(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.a;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && u.a(bArr2, i, bArr, i2, i3);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(f fVar) {
        int i = i();
        int i2 = fVar.i();
        int iMin = Math.min(i, i2);
        for (int i3 = 0; i3 < iMin; i3++) {
            int iA = a(i3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int iA2 = fVar.a(i3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (iA != iA2) {
                return iA < iA2 ? -1 : 1;
            }
        }
        if (i == i2) {
            return 0;
        }
        return i < i2 ? -1 : 1;
    }

    public static int a(String str, int i) {
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
