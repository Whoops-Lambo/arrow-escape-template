package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzagb {
    public static void b(long j, zzey zzeyVar, zzaia[] zzaiaVarArr) {
        int iK = zzeyVar.K();
        if ((iK & 64) != 0) {
            int i = iK & 31;
            zzeyVar.G(1);
            int i2 = zzeyVar.b;
            for (zzaia zzaiaVar : zzaiaVarArr) {
                int i3 = i * 3;
                zzeyVar.E(i2);
                zzaiaVar.b(i3, zzeyVar);
                zzgvz.f(j != -9223372036854775807L);
                zzaiaVar.e(j, 1, i3, 0, null);
            }
        }
    }

    public static void a(long j, zzey zzeyVar, zzaia[] zzaiaVarArr) {
        int i;
        int iB;
        boolean z;
        int iK;
        while (true) {
            boolean z2 = true;
            if (zzeyVar.B() > 1) {
                int i2 = 0;
                while (true) {
                    if (zzeyVar.B() == 0) {
                        i = -1;
                        break;
                    }
                    int iK2 = zzeyVar.K();
                    i2 += iK2;
                    if (iK2 != 255) {
                        i = i2;
                        break;
                    }
                }
                int i3 = 0;
                do {
                    if (zzeyVar.B() == 0) {
                        i3 = -1;
                        break;
                    } else {
                        iK = zzeyVar.K();
                        i3 += iK;
                    }
                } while (iK == 255);
                int i4 = zzeyVar.b + i3;
                if (i3 != -1 && i3 <= zzeyVar.B()) {
                    if (i == 4 && i3 >= 8) {
                        int iK3 = zzeyVar.K();
                        int iL = zzeyVar.L();
                        if (iL == 49) {
                            iB = zzeyVar.b();
                            iL = 49;
                        } else {
                            iB = 0;
                        }
                        int iK4 = zzeyVar.K();
                        if (iL == 47) {
                            zzeyVar.G(1);
                            iL = 47;
                        }
                        if (iK3 != 181 || ((iL != 49 && iL != 47) || iK4 != 3)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (iL == 49) {
                            if (iB != 1195456820) {
                                z2 = false;
                            }
                            z &= z2;
                        }
                        if (z) {
                            b(j, zzeyVar, zzaiaVarArr);
                        }
                    }
                } else {
                    zzeh.c("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i4 = zzeyVar.c;
                }
                zzeyVar.E(i4);
            } else {
                return;
            }
        }
    }
}
