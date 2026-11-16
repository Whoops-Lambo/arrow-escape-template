package defpackage;

import com.google.android.gms.internal.games_v2.zzbq;
import com.google.android.gms.internal.games_v2.zzip;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class fy3 implements zzip {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzbq b;

    public /* synthetic */ fy3(zzbq zzbqVar, int i) {
        this.a = i;
        this.b = zzbqVar;
    }

    @Override // com.google.android.gms.internal.games_v2.zzip
    public final /* synthetic */ Task zza() {
        int i = this.a;
        zzbq zzbqVar = this.b;
        switch (i) {
            case 0:
                zzbqVar.c(1);
                return zzbq.g(zzbqVar.a, (TaskCompletionSource) zzbqVar.d.get());
            default:
                zzbqVar.c(0);
                return zzbq.g(zzbqVar.a, (TaskCompletionSource) zzbqVar.d.get());
        }
    }
}
