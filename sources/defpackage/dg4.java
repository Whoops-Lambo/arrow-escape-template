package defpackage;

import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzbf;
import com.google.android.gms.internal.ads.zzea;
import com.google.android.gms.internal.ads.zzfh;
import com.google.android.gms.internal.ads.zzfi;
import com.google.android.gms.internal.ads.zzfq;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class dg4 {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public long e;
    public long f;
    public boolean g;
    public long h;
    public final /* synthetic */ zzfh i;

    public final void a() {
        int i;
        zzfh zzfhVar = this.i;
        z15 z15Var = zzfhVar.a;
        zzea zzeaVar = zzfhVar.e;
        if (z15Var.zzh() != 2 || !z15Var.zzk() || z15Var.zzi() != 0) {
            if (this.g) {
                zzeaVar.b(1);
            }
            this.g = false;
            return;
        }
        zzbf zzbfVarZzq = z15Var.zzq();
        Object objF = zzbfVarZzq.g() ? null : zzbfVarZzq.f(z15Var.q());
        int iW = z15Var.w();
        int iX = z15Var.x();
        long jT = z15Var.t();
        long jMax = Math.max(0L, z15Var.u() - Math.max(0L, jT - z15Var.s()));
        if (objF != null && iW == -1) {
            zzbfVarZzq.o(objF, zzfhVar.d);
            jT -= zzfq.t(0L);
            iW = -1;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.g;
        int i2 = this.a;
        if (z && Objects.equals(objF, this.b) && iW == this.c && iX == this.d) {
            i = iW;
            if (jT == this.e && jMax == this.f) {
                if (jElapsedRealtime - this.h >= i2) {
                    zzfhVar.c.g(new zzfi(1, i2));
                    return;
                }
                return;
            }
        } else {
            i = iW;
        }
        this.g = true;
        this.h = jElapsedRealtime;
        this.b = objF;
        this.c = i;
        this.d = iX;
        this.e = jT;
        this.f = jMax;
        zzeaVar.b(1);
        zzeaVar.zzi(1, i2);
    }

    public dg4(zzfh zzfhVar, int i) {
        this.i = zzfhVar;
        this.a = i;
    }
}
