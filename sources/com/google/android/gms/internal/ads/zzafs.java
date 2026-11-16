package com.google.android.gms.internal.ads;

import com.singular.sdk.internal.UserDetailsUtils;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzafs {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;

    /* JADX WARN: Code duplicated, block: B:82:0x020f A[Catch: RuntimeException -> 0x0258, TryCatch #0 {RuntimeException -> 0x0258, blocks: (B:3:0x0008, B:6:0x001b, B:8:0x0039, B:14:0x005f, B:18:0x0083, B:20:0x00c9, B:22:0x00d7, B:24:0x00e4, B:26:0x010c, B:28:0x0112, B:30:0x0123, B:32:0x012c, B:34:0x0134, B:36:0x0145, B:38:0x0152, B:40:0x0163, B:42:0x0169, B:44:0x017a, B:46:0x0180, B:48:0x0191, B:50:0x019b, B:52:0x01a6, B:53:0x01a9, B:54:0x01ad, B:56:0x01c3, B:58:0x01c9, B:60:0x01d2, B:61:0x01d5, B:66:0x01e2, B:68:0x01e8, B:70:0x01ed, B:71:0x01f0, B:74:0x01fb, B:77:0x0202, B:80:0x0209, B:82:0x020f, B:84:0x021d, B:96:0x0243, B:100:0x024e, B:95:0x023f, B:64:0x01dc), top: B:105:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x021d A[Catch: RuntimeException -> 0x0258, TryCatch #0 {RuntimeException -> 0x0258, blocks: (B:3:0x0008, B:6:0x001b, B:8:0x0039, B:14:0x005f, B:18:0x0083, B:20:0x00c9, B:22:0x00d7, B:24:0x00e4, B:26:0x010c, B:28:0x0112, B:30:0x0123, B:32:0x012c, B:34:0x0134, B:36:0x0145, B:38:0x0152, B:40:0x0163, B:42:0x0169, B:44:0x017a, B:46:0x0180, B:48:0x0191, B:50:0x019b, B:52:0x01a6, B:53:0x01a9, B:54:0x01ad, B:56:0x01c3, B:58:0x01c9, B:60:0x01d2, B:61:0x01d5, B:66:0x01e2, B:68:0x01e8, B:70:0x01ed, B:71:0x01f0, B:74:0x01fb, B:77:0x0202, B:80:0x0209, B:82:0x020f, B:84:0x021d, B:96:0x0243, B:100:0x024e, B:95:0x023f, B:64:0x01dc), top: B:105:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x023e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0249  */
    /* JADX WARN: Code duplicated, block: B:99:0x024c  */
    public static zzafs a(byte[] bArr) throws zzat {
        int i;
        int i2;
        int iH;
        int i3;
        int iH2;
        int i4;
        try {
            zzet zzetVar = new zzet(bArr, bArr.length);
            zzetVar.e();
            int iH3 = zzetVar.h(7);
            if (iH3 != 1) {
                StringBuilder sb = new StringBuilder(String.valueOf(iH3).length() + 26);
                sb.append("Unsupported av1C version: ");
                sb.append(iH3);
                zzeh.c("Av1Config", sb.toString());
                return null;
            }
            int iH4 = zzetVar.h(3);
            int iH5 = zzetVar.h(5);
            boolean zG = zzetVar.g();
            boolean zG2 = zzetVar.g();
            boolean zG3 = zzetVar.g();
            if (zG2) {
                i = true != zG3 ? 10 : 12;
            } else {
                i = 8;
            }
            zzetVar.f(13);
            Object[] objArr = {Integer.valueOf(iH5)};
            String str = zzfq.a;
            Locale locale = Locale.US;
            String str2 = String.format(locale, "%02d", objArr);
            String str3 = true != zG ? "M" : "H";
            String str4 = String.format(locale, "%02d", Integer.valueOf(i));
            StringBuilder sb2 = new StringBuilder(String.valueOf(iH4).length() + 6 + str2.length() + 2 + str4.length());
            sb2.append("av01.");
            sb2.append(iH4);
            sb2.append(UserDetailsUtils.UserDetailsLiterals.DOT);
            sb2.append(str2);
            sb2.append(str3);
            sb2.append(UserDetailsUtils.UserDetailsLiterals.DOT);
            sb2.append(str4);
            String string = sb2.toString();
            if (zzetVar.b() <= 0) {
                return new zzafs(i, -1, string, -1, -1);
            }
            int i5 = 7;
            zzetVar.e();
            int iH6 = zzetVar.h(4);
            if (iH6 != 1) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(iH6).length() + 22);
                sb3.append("Unsupported obu_type: ");
                sb3.append(iH6);
                zzeh.b("Av1Config", sb3.toString());
                return new zzafs(i, -1, string, -1, -1);
            }
            if (zzetVar.g()) {
                zzeh.b("Av1Config", "Unsupported obu_extension_flag");
                return new zzafs(i, -1, string, -1, -1);
            }
            boolean zG4 = zzetVar.g();
            zzetVar.e();
            if (zG4 && zzetVar.h(8) > 127) {
                zzeh.b("Av1Config", "Excessive obu_size");
                return new zzafs(i, -1, string, -1, -1);
            }
            int iH7 = zzetVar.h(3);
            zzetVar.e();
            if (zzetVar.g()) {
                zzeh.b("Av1Config", "Unsupported reduced_still_picture_header");
                return new zzafs(i, -1, string, -1, -1);
            }
            if (zzetVar.g()) {
                zzeh.b("Av1Config", "Unsupported timing_info_present_flag");
                return new zzafs(i, -1, string, -1, -1);
            }
            if (zzetVar.g()) {
                zzeh.b("Av1Config", "Unsupported initial_display_delay_present_flag");
                return new zzafs(i, -1, string, -1, -1);
            }
            int iH8 = zzetVar.h(5);
            boolean z = false;
            int i6 = 0;
            while (i6 <= iH8) {
                zzetVar.f(12);
                if (zzetVar.h(5) > i5) {
                    zzetVar.e();
                }
                i6++;
                i5 = 7;
            }
            int iH9 = zzetVar.h(4);
            int iH10 = zzetVar.h(4);
            zzetVar.f(iH9 + 1);
            zzetVar.f(iH10 + 1);
            if (zzetVar.g()) {
                i2 = 7;
                zzetVar.f(7);
            } else {
                i2 = 7;
            }
            zzetVar.f(i2);
            boolean zG5 = zzetVar.g();
            if (zG5) {
                zzetVar.f(2);
            }
            if (zzetVar.g() || zzetVar.h(1) > 0) {
                if (!zzetVar.g()) {
                    zzetVar.f(1);
                }
            }
            if (zG5) {
                zzetVar.f(3);
            }
            zzetVar.f(3);
            boolean zG6 = zzetVar.g();
            if (iH7 != 2) {
                if (iH7 == 1) {
                }
                if (!zzetVar.g()) {
                    return new zzafs(i, -1, string, -1, -1);
                }
                int iH11 = zzetVar.h(8);
                iH = zzetVar.h(8);
                int iH12 = zzetVar.h(8);
                if (z && iH11 == 1) {
                    if (iH == 13) {
                        if (iH12 == 0) {
                            i3 = 13;
                            iH11 = 1;
                            iH2 = 1;
                        } else {
                            i3 = 13;
                        }
                        int iB = zzi.b(iH11);
                        if (iH2 == 1) {
                            i4 = 1;
                        } else {
                            i4 = 2;
                        }
                        return new zzafs(i, iB, string, i4, zzi.c(i3));
                    }
                    i3 = iH;
                    iH11 = 1;
                } else {
                    i3 = iH;
                }
                iH2 = zzetVar.h(1);
                int iB2 = zzi.b(iH11);
                if (iH2 == 1) {
                    i4 = 1;
                } else {
                    i4 = 2;
                }
                return new zzafs(i, iB2, string, i4, zzi.c(i3));
            }
            if (zG6) {
                zzetVar.e();
            }
            if (zzetVar.g()) {
                z = true;
            }
            if (!zzetVar.g()) {
                return new zzafs(i, -1, string, -1, -1);
            }
            int iH13 = zzetVar.h(8);
            iH = zzetVar.h(8);
            int iH14 = zzetVar.h(8);
            if (z) {
                i3 = iH;
                iH2 = zzetVar.h(1);
            } else {
                i3 = iH;
                iH2 = zzetVar.h(1);
            }
            int iB3 = zzi.b(iH13);
            if (iH2 == 1) {
                i4 = 1;
            } else {
                i4 = 2;
            }
            return new zzafs(i, iB3, string, i4, zzi.c(i3));
        } catch (RuntimeException e) {
            throw zzat.b("Error parsing AV1 config", e);
        }
    }

    public zzafs(int i, int i2, String str, int i3, int i4) {
        this.a = i;
        this.e = str;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }
}
