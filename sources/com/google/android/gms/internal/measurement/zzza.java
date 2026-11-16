package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzza {
    public static final long d;
    public static final zzza e;
    public final int a;
    public final int b;
    public final int c;

    static {
        long jCharAt = 0;
        for (int i = 0; i < 7; i++) {
            jCharAt |= (((long) i) + 1) << ((int) (((long) (" #(+,-0".charAt(i) - ' ')) * 3));
        }
        d = jCharAt;
        e = new zzza(0, -1, -1);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzza) {
            zzza zzzaVar = (zzza) obj;
            if (zzzaVar.a == this.a && zzzaVar.b == this.b && zzzaVar.c == this.c) {
                return true;
            }
        }
        return false;
    }

    public static int e(int i, int i2, String str) {
        if (i == i2) {
            throw zzabo.b("missing precision", str, i - 1);
        }
        int i3 = 0;
        for (int i4 = i; i4 < i2; i4++) {
            char cCharAt = (char) (str.charAt(i4) - '0');
            if (cCharAt >= '\n') {
                throw zzabo.b("invalid precision character", str, i4);
            }
            i3 = (i3 * 10) + cCharAt;
            if (i3 > 999999) {
                throw zzabo.a("precision too large", str, i, i2);
            }
        }
        if (i3 != 0) {
            return i3;
        }
        if (i2 == i + 1) {
            return 0;
        }
        throw zzabo.a("invalid precision", str, i, i2);
    }

    public final boolean a() {
        return this == e;
    }

    public final boolean c() {
        return (this.a & 128) != 0;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public zzza(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean b(int i, boolean z) {
        int i2;
        if (!a()) {
            int i3 = ~i;
            int i4 = this.a;
            if ((i3 & i4) == 0) {
                if ((z || this.c == -1) && (i4 & 9) != 9 && (i2 = i4 & 96) != 96) {
                    if (i2 != 0 && this.b == -1) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void d(StringBuilder sb) {
        if (!a()) {
            int i = 0;
            while (true) {
                int i2 = this.a & (-129);
                int i3 = 1 << i;
                if (i3 > i2) {
                    break;
                }
                if ((i2 & i3) != 0) {
                    sb.append(" #(+,-0".charAt(i));
                }
                i++;
            }
            int i4 = this.b;
            if (i4 != -1) {
                sb.append(i4);
            }
            int i5 = this.c;
            if (i5 != -1) {
                sb.append('.');
                sb.append(i5);
            }
        }
    }
}
