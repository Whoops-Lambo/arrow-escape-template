package defpackage;

import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzbd;
import com.google.android.gms.internal.ads.zzbf;
import com.google.android.gms.internal.ads.zzea;
import com.google.android.gms.internal.ads.zzfh;
import com.google.android.gms.internal.ads.zzfi;
import com.google.android.gms.internal.ads.zzfq;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class mg4 {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public boolean e;
    public long f;
    public final /* synthetic */ zzfh g;

    public final void a() {
        long jR;
        zzfh zzfhVar = this.g;
        z15 z15Var = zzfhVar.a;
        zzbd zzbdVar = zzfhVar.d;
        zzea zzeaVar = zzfhVar.e;
        zzbf zzbfVarZzq = z15Var.zzq();
        Object objF = zzbfVarZzq.g() ? null : zzbfVarZzq.f(z15Var.q());
        int iW = z15Var.w();
        int iX = z15Var.x();
        long jS = z15Var.s();
        if (objF == null || iW != -1) {
            jR = iW != -1 ? z15Var.r() : -9223372036854775807L;
        } else {
            zzbfVarZzq.o(objF, zzbdVar);
            jS -= zzfq.t(0L);
            jR = zzfq.t(zzbdVar.d);
            iW = -1;
        }
        boolean zA = z15Var.a();
        if (!zA || jR == -9223372036854775807L || jS < jR) {
            zzeaVar.b(3);
            if (zA && jR != -9223372036854775807L) {
                z15Var.o();
                zzeaVar.zzi(3, (int) Math.ceil((jR - jS) / z15Var.V.o.a));
            }
            this.e = false;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.e;
        int i = this.a;
        if (z && Objects.equals(objF, this.b) && iW == this.c && iX == this.d) {
            if (jElapsedRealtime - this.f >= i) {
                zzfhVar.c.g(new zzfi(3, i));
                return;
            }
            return;
        }
        this.e = true;
        this.f = jElapsedRealtime;
        this.b = objF;
        this.c = iW;
        this.d = iX;
        zzeaVar.b(3);
        zzeaVar.zzi(3, i);
    }

    public mg4(zzfh zzfhVar, int i) {
        this.g = zzfhVar;
        this.a = i;
    }
}
