package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.nj;
import defpackage.pv1;
import defpackage.q63;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzi {
    public static final zzi h;
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    public final int e;
    public final int f;
    public int g;

    public static boolean a(zzi zziVar) {
        if (zziVar == null) {
            return true;
        }
        int i = zziVar.a;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i2 = zziVar.b;
        if (i2 != -1 && i2 != 2) {
            return false;
        }
        int i3 = zziVar.c;
        if ((i3 != -1 && i3 != 3) || zziVar.d != null) {
            return false;
        }
        int i4 = zziVar.f;
        if (i4 != -1 && i4 != 8) {
            return false;
        }
        int i5 = zziVar.e;
        return i5 == -1 || i5 == 8;
    }

    public static int b(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int c(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public static String e(int i) {
        if (i == -1) {
            return "Unset color space";
        }
        if (i == 6) {
            return "BT2020";
        }
        if (i != 1) {
            return i != 2 ? pv1.l(i, "Undefined color space ", new StringBuilder(String.valueOf(i).length() + 22)) : "BT601";
        }
        return "BT709";
    }

    public static String f(int i) {
        if (i == -1) {
            return "Unset color transfer";
        }
        if (i == 10) {
            return "Gamma 2.2";
        }
        if (i == 1) {
            return "Linear";
        }
        if (i == 2) {
            return "sRGB";
        }
        if (i == 3) {
            return "SDR SMPTE 170M";
        }
        if (i != 6) {
            return i != 7 ? pv1.l(i, "Undefined color transfer ", new StringBuilder(String.valueOf(i).length() + 25)) : "HLG";
        }
        return "ST2084 PQ";
    }

    public static String g(int i) {
        if (i == -1) {
            return "Unset color range";
        }
        if (i != 1) {
            return i != 2 ? pv1.l(i, "Undefined color range ", new StringBuilder(String.valueOf(i).length() + 22)) : "Limited range";
        }
        return "Full range";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzi.class == obj.getClass()) {
            zzi zziVar = (zzi) obj;
            if (this.a == zziVar.a && this.b == zziVar.b && this.c == zziVar.c && Arrays.equals(this.d, zziVar.d) && this.e == zziVar.e && this.f == zziVar.f) {
                return true;
            }
        }
        return false;
    }

    static {
        zzh zzhVar = new zzh();
        zzhVar.a = 1;
        zzhVar.b = 2;
        zzhVar.c = 3;
        h = zzhVar.a();
        zzh zzhVar2 = new zzh();
        zzhVar2.a = 1;
        zzhVar2.b = 1;
        zzhVar2.c = 2;
        zzhVar2.a();
        String str = zzfq.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public final boolean d() {
        return (this.a == -1 || this.b == -1 || this.c == -1) ? false : true;
    }

    public final int hashCode() {
        int i = this.g;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((Arrays.hashCode(this.d) + ((((((this.a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.b) * 31) + this.c) * 31)) * 31) + this.e) * 31) + this.f;
        this.g = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String strE = e(this.a);
        String strG = g(this.b);
        String strF = f(this.c);
        int i = this.e;
        String strL = i != -1 ? nj.l(i, "bit Luma", new StringBuilder(String.valueOf(i).length() + 8)) : "NA";
        int i2 = this.f;
        String strL2 = i2 != -1 ? nj.l(i2, "bit Chroma", new StringBuilder(String.valueOf(i2).length() + 10)) : "NA";
        boolean z = this.d != null;
        StringBuilder sb = new StringBuilder(q63.a(q63.a(q63.a(q63.a(strE.length() + 12, 2, strG) + strF.length() + 2, 2, String.valueOf(z)), 2, strL), 1, strL2));
        sb.append("ColorInfo(");
        sb.append(strE);
        sb.append(", ");
        sb.append(strG);
        sb.append(", ");
        sb.append(strF);
        sb.append(", ");
        sb.append(z);
        q63.y(sb, ", ", strL, ", ", strL2);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ zzi(int i, int i2, int i3, byte[] bArr, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = bArr;
        this.e = i4;
        this.f = i5;
    }
}
