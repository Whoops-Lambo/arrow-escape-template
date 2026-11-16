package defpackage;

import com.google.android.gms.internal.ads.zzgim;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rl4 implements Callable {
    public final /* synthetic */ sl4 a;
    public final /* synthetic */ int b;

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        int i = this.b - 1;
        sl4 sl4Var = this.a;
        if (i == 1) {
            return (zzgim) sl4Var.a.zzb();
        }
        if (i == 2) {
            return (zzgim) sl4Var.b.zzb();
        }
        if (i == 3) {
            return (zzgim) sl4Var.c.zzb();
        }
        if (i == 4) {
            return (zzgim) sl4Var.d.zzb();
        }
        e32.a();
        return null;
    }

    public /* synthetic */ rl4(sl4 sl4Var, int i) {
        this.a = sl4Var;
        this.b = i;
    }
}
