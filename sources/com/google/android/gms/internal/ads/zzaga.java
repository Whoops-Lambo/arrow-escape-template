package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class zzaga {
    public final zzafu a;
    public final zzafz b;
    public zzafw c;
    public final int d;

    public final void a(long j) {
        zzafw zzafwVar = this.c;
        if (zzafwVar == null || zzafwVar.a != j) {
            zzafu zzafuVar = this.a;
            this.c = new zzafw(j, zzafuVar.a.a(j), zzafuVar.c, zzafuVar.d, zzafuVar.e, zzafuVar.f);
        }
    }

    public final int b(zzagp zzagpVar, zzaho zzahoVar) {
        while (true) {
            zzafw zzafwVar = this.c;
            zzafwVar.getClass();
            long j = zzafwVar.f;
            long j2 = zzafwVar.g;
            long j3 = zzafwVar.h;
            long j4 = j2 - j;
            long j5 = this.d;
            zzafz zzafzVar = this.b;
            if (j4 <= j5) {
                this.c = null;
                zzafzVar.zzb();
                return c(zzagpVar, j, zzahoVar);
            }
            long jZzn = j3 - zzagpVar.zzn();
            if (jZzn < 0 || jZzn > 262144) {
                return c(zzagpVar, j3, zzahoVar);
            }
            zzagpVar.zzf((int) jZzn);
            zzagpVar.zzl();
            zzafy zzafyVarG = zzafzVar.g(zzagpVar, zzafwVar.b);
            int i = zzafyVarG.a;
            long j6 = zzafyVarG.b;
            long j7 = zzafyVarG.c;
            if (i == -3) {
                this.c = null;
                zzafzVar.zzb();
                return c(zzagpVar, j3, zzahoVar);
            }
            if (i == -2) {
                zzafwVar.d = j6;
                zzafwVar.f = j7;
                zzafwVar.h = zzafw.a(zzafwVar.b, j6, zzafwVar.e, j7, zzafwVar.g, zzafwVar.c);
            } else {
                if (i != -1) {
                    long jZzn2 = j7 - zzagpVar.zzn();
                    if (jZzn2 >= 0 && jZzn2 <= 262144) {
                        zzagpVar.zzf((int) jZzn2);
                    }
                    this.c = null;
                    zzafzVar.zzb();
                    return c(zzagpVar, j7, zzahoVar);
                }
                zzafwVar.e = j6;
                zzafwVar.g = j7;
                zzafwVar.h = zzafw.a(zzafwVar.b, zzafwVar.d, j6, zzafwVar.f, j7, zzafwVar.c);
            }
        }
    }

    public zzaga(zzafx zzafxVar, zzafz zzafzVar, long j, long j2, long j3, long j4, long j5, int i) {
        this.b = zzafzVar;
        this.d = i;
        this.a = new zzafu(zzafxVar, j, j2, j3, j4, j5);
    }

    public static final int c(zzagp zzagpVar, long j, zzaho zzahoVar) {
        if (j == zzagpVar.zzn()) {
            return 0;
        }
        zzahoVar.a = j;
        return 1;
    }
}
