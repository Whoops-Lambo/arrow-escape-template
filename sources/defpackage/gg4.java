package defpackage;

import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzbf;
import com.google.android.gms.internal.ads.zzea;
import com.google.android.gms.internal.ads.zzfh;
import com.google.android.gms.internal.ads.zzfi;
import com.google.android.gms.internal.ads.zzfq;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class gg4 {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public long e;
    public boolean f;
    public long g;
    public final /* synthetic */ zzfh h;

    public final void a() {
        zzfh zzfhVar = this.h;
        z15 z15Var = zzfhVar.a;
        zzea zzeaVar = zzfhVar.e;
        if (!z15Var.a()) {
            if (this.f) {
                zzeaVar.b(2);
            }
            this.f = false;
            return;
        }
        zzbf zzbfVarZzq = z15Var.zzq();
        Object objF = zzbfVarZzq.g() ? null : zzbfVarZzq.f(z15Var.q());
        int iW = z15Var.w();
        int iX = z15Var.x();
        long jS = z15Var.s();
        if (objF != null && iW == -1) {
            zzbfVarZzq.o(objF, zzfhVar.d);
            jS -= zzfq.t(0L);
            iW = -1;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.f;
        int i = this.a;
        if (z && Objects.equals(objF, this.b) && iW == this.c && iX == this.d && jS == this.e) {
            if (jElapsedRealtime - this.g >= i) {
                zzfhVar.c.g(new zzfi(2, i));
                return;
            }
            return;
        }
        this.f = true;
        this.g = jElapsedRealtime;
        this.b = objF;
        this.c = iW;
        this.d = iX;
        this.e = jS;
        zzeaVar.b(2);
        zzeaVar.zzi(2, i);
    }

    public gg4(zzfh zzfhVar, int i) {
        this.h = zzfhVar;
        this.a = i;
    }
}
