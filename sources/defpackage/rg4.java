package defpackage;

import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzea;
import com.google.android.gms.internal.ads.zzfh;
import com.google.android.gms.internal.ads.zzfi;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class rg4 {
    public final int a;
    public int b;
    public boolean c;
    public long d;
    public final /* synthetic */ zzfh e;

    public final void a() {
        zzfh zzfhVar = this.e;
        z15 z15Var = zzfhVar.a;
        zzea zzeaVar = zzfhVar.e;
        int iZzi = z15Var.zzi();
        z15 z15Var2 = zzfhVar.a;
        if (!z15Var2.zzk() || z15Var2.zzh() == 1 || z15Var2.zzh() == 4 || iZzi == 0 || iZzi == 1) {
            if (this.c) {
                zzeaVar.b(4);
            }
            this.c = false;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.c;
        int i = this.a;
        if (z && this.b == iZzi) {
            if (jElapsedRealtime - this.d >= i) {
                zzfhVar.c.g(new zzfi(4, i));
            }
        } else {
            this.c = true;
            this.d = jElapsedRealtime;
            this.b = iZzi;
            zzeaVar.b(4);
            zzeaVar.zzi(4, i);
        }
    }

    public rg4(zzfh zzfhVar, int i) {
        this.e = zzfhVar;
        this.a = i;
    }
}
