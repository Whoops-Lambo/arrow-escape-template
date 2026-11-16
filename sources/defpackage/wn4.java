package defpackage;

import com.google.android.gms.internal.ads.zzgbh;
import com.google.android.gms.internal.ads.zzgbj;
import com.google.android.gms.internal.ads.zzgil;
import com.google.android.gms.internal.ads.zzgof;
import java.io.File;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wn4 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn4 b;

    public /* synthetic */ wn4(xn4 xn4Var, int i) {
        this.a = i;
        this.b = xn4Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        xn4 xn4Var = this.b;
        switch (i) {
            case 0:
                zzgof zzgofVar = xn4Var.a;
                zzgil zzgilVarB = zzgofVar.b(1);
                if (zzgilVarB == null) {
                    zzgofVar.e.b(15315);
                    return null;
                }
                String strE = zzgilVarB.E().E();
                File fileA = zzgbj.a(strE, "pcam.jar", zzgofVar.c());
                fileA.getClass();
                if (!fileA.exists()) {
                    fileA = zzgbj.a(strE, "pcam", zzgofVar.c());
                    fileA.getClass();
                }
                File fileA2 = zzgbj.a(strE, "pcopt", zzgofVar.c());
                fileA2.getClass();
                File fileA3 = zzgbj.a(strE, "pcbc", zzgofVar.c());
                fileA3.getClass();
                return new zzgbh(zzgilVarB.E(), fileA, fileA3, fileA2);
            default:
                zzgil zzgilVarB2 = xn4Var.a.b(1);
                return zzgilVarB2 == null ? zzgil.L() : zzgilVarB2;
        }
    }
}
