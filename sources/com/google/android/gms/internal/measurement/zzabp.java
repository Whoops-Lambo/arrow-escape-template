package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class zzabp extends zzabn {
    public static final String a;

    @Override // com.google.android.gms.internal.measurement.zzabn
    public final void b(int i, int i2, String str, StringBuilder sb) {
        int i3 = i;
        while (i < i2) {
            int i4 = i + 1;
            if (str.charAt(i) == '%') {
                if (i4 == i2) {
                    break;
                }
                char cCharAt = str.charAt(i4);
                if (cCharAt == '%') {
                    sb.append((CharSequence) str, i3, i4);
                } else if (cCharAt == 'n') {
                    sb.append((CharSequence) str, i3, i);
                    sb.append(a);
                }
                i3 = i + 2;
                i = i3;
            }
            i = i4;
        }
        if (i3 < i2) {
            sb.append((CharSequence) str, i3, i2);
        }
    }

    public abstract int c(zzyy zzyyVar, int i, String str, int i2, int i3, int i4);

    static {
        String property;
        try {
            property = System.getProperty("line.separator");
            if (!property.matches("\\n|\\r(?:\\n)?")) {
                property = "\n";
            }
        } catch (SecurityException unused) {
        }
        a = property;
    }

    @Override // com.google.android.gms.internal.measurement.zzabn
    public final void a(zzyy zzyyVar) {
        int i;
        char cCharAt;
        int i2;
        int i3;
        int i4;
        int i5;
        String str = zzyyVar.a.b;
        int iD = d(0, str);
        int i6 = -1;
        int i7 = 0;
        while (iD >= 0) {
            int i8 = iD + 1;
            int i9 = 0;
            int i10 = i8;
            while (true) {
                if (i10 >= str.length()) {
                    throw zzabo.c("unterminated parameter", str, iD);
                }
                i = i10 + 1;
                cCharAt = str.charAt(i10);
                char c = (char) (cCharAt - '0');
                if (c < '\n') {
                    i9 = (i9 * 10) + c;
                    if (i9 >= 1000000) {
                        throw zzabo.a("index too large", str, iD, i);
                    }
                    i10 = i;
                }
            }
            if (cCharAt == '$') {
                if (i10 - i8 == 0) {
                    throw zzabo.a("missing index", str, iD, i);
                }
                if (str.charAt(i8) == '0') {
                    throw zzabo.a("index has leading zero", str, iD, i);
                }
                int i11 = i9 - 1;
                if (i == str.length()) {
                    throw zzabo.c("unterminated parameter", str, iD);
                }
                str.charAt(i);
                i5 = i7;
                i4 = i10 + 2;
                i2 = i;
                i3 = i11;
            } else if (cCharAt != '<') {
                int i12 = i7 + 1;
                i2 = i8;
                i3 = i7;
                i4 = i;
                i5 = i12;
            } else {
                if (i6 == -1) {
                    throw zzabo.a("invalid relative parameter", str, iD, i);
                }
                if (i == str.length()) {
                    throw zzabo.c("unterminated parameter", str, iD);
                }
                str.charAt(i);
                i5 = i7;
                i4 = i10 + 2;
                i2 = i;
                i3 = i6;
            }
            int i13 = i4 - 1;
            while (true) {
                if (i13 >= str.length()) {
                    throw zzabo.c("unterminated parameter", str, iD);
                }
                if (((char) ((str.charAt(i13) & (-33)) - 65)) < 26) {
                    break;
                } else {
                    i13++;
                }
            }
            zzabp zzabpVar = this;
            iD = d(zzabpVar.c(zzyyVar, i3, str, iD, i2, i13), str);
            this = zzabpVar;
            i6 = i3;
            i7 = i5;
        }
    }

    public static int d(int i, String str) {
        while (i < str.length()) {
            int i2 = i + 1;
            if (str.charAt(i) != '%') {
                i = i2;
            } else if (i2 < str.length()) {
                char cCharAt = str.charAt(i2);
                if (cCharAt != '%' && cCharAt != 'n') {
                    return i;
                }
                i += 2;
            } else {
                throw zzabo.c("trailing unquoted '%' character", str, i);
            }
        }
        return -1;
    }
}
