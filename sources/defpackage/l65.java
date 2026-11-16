package defpackage;

import com.google.android.gms.internal.ads.zzbe;
import com.google.android.gms.internal.ads.zzbf;
import com.google.android.gms.internal.ads.zznv;
import com.google.android.gms.internal.ads.zzqc;
import com.google.android.gms.internal.ads.zzxt;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class l65 {
    public final String a;
    public int b;
    public long c;
    public final zzxt d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ zzqc g;

    public final boolean a(zzbf zzbfVar, zzbf zzbfVar2) {
        zzxt zzxtVar;
        int i = this.b;
        if (i < zzbfVar.a()) {
            zzqc zzqcVar = this.g;
            zzbe zzbeVar = zzqcVar.a;
            zzbfVar.b(i, zzbeVar, 0L);
            int i2 = zzbeVar.k;
            while (true) {
                if (i2 > zzbeVar.l) {
                    i = -1;
                    break;
                }
                int iE = zzbfVar2.e(zzbfVar.f(i2));
                if (iE != -1) {
                    i = zzbfVar2.d(iE, zzqcVar.b, false).c;
                    break;
                }
                i2++;
            }
        } else if (i >= zzbfVar2.a()) {
            i = -1;
            break;
        }
        this.b = i;
        return i != -1 && ((zzxtVar = this.d) == null || zzbfVar2.e(zzxtVar.a) != -1);
    }

    public final boolean b(zznv zznvVar) {
        zzxt zzxtVar = zznvVar.d;
        if (zzxtVar == null) {
            return this.b != zznvVar.c;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        long j2 = zzxtVar.d;
        if (j2 > j) {
            return true;
        }
        zzxt zzxtVar2 = this.d;
        if (zzxtVar2 == null) {
            return false;
        }
        zzbf zzbfVar = zznvVar.b;
        int iE = zzbfVar.e(zzxtVar.a);
        int iE2 = zzbfVar.e(zzxtVar2.a);
        long j3 = zzxtVar2.d;
        int i = zzxtVar2.b;
        if (j2 < j3 || iE < iE2) {
            return false;
        }
        if (iE > iE2) {
            return true;
        }
        if (!zzxtVar.b()) {
            int i2 = zzxtVar.e;
            return i2 == -1 || i2 > i;
        }
        int i3 = zzxtVar.b;
        int i4 = zzxtVar.c;
        if (i3 <= i) {
            return i3 == i && i4 > zzxtVar2.c;
        }
        return true;
    }

    public l65(zzqc zzqcVar, String str, int i, zzxt zzxtVar) {
        long j;
        this.g = zzqcVar;
        this.a = str;
        this.b = i;
        if (zzxtVar == null) {
            j = -1;
        } else {
            j = zzxtVar.d;
        }
        this.c = j;
        if (zzxtVar != null && zzxtVar.b()) {
            this.d = zzxtVar;
        }
    }
}
