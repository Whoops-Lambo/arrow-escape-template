package defpackage;

import android.net.Uri;
import com.google.android.gms.internal.measurement.zzsg;
import com.google.android.gms.internal.measurement.zztf;
import com.google.android.gms.internal.measurement.zztg;
import com.google.android.gms.internal.measurement.zzui;
import com.google.android.gms.internal.measurement.zzvy;
import com.google.android.gms.internal.measurement.zzwy;
import com.google.android.gms.internal.measurement.zzxa;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class l95 implements zztg, v8 {
    public final /* synthetic */ int a;
    public final zzui b;

    public /* synthetic */ l95(zzui zzuiVar, int i) {
        this.a = i;
        this.b = zzuiVar;
    }

    @Override // defpackage.v8
    public ListenableFuture call() {
        int i = this.a;
        zzui zzuiVar = this.b;
        switch (i) {
            case 1:
                try {
                    return rs0.d(zzuiVar.b((Uri) rs0.b(zzuiVar.b)));
                } catch (IOException e) {
                    l95 l95Var = new l95(zzuiVar, 0);
                    os1 os1Var = zzuiVar.f;
                    if (!os1Var.f()) {
                        return rs0.c(e);
                    }
                    if ((e instanceof zzsg) || (e.getCause() instanceof zzsg)) {
                        return rs0.c(e);
                    }
                    c1 c1VarA = ((zztf) os1Var.d()).a(e, l95Var);
                    q95 q95Var = new q95(zzuiVar, 1);
                    int i2 = zzxa.a;
                    return rs0.g(c1VarA, new zzwy(zzvy.a(), q95Var), zzuiVar.d);
                }
            default:
                zzuiVar.getClass();
                q95 q95Var2 = new q95(zzuiVar, 3);
                int i3 = zzxa.a;
                return rs0.e(rs0.g(zzuiVar.b, new zzwy(zzvy.a(), q95Var2), zzuiVar.d));
        }
    }
}
