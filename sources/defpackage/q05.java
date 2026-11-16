package defpackage;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.internal.measurement.zzadf;
import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.gms.internal.measurement.zzpl;
import com.google.android.gms.internal.measurement.zzpm;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class q05 implements ListenerHolder.Notifier {
    public final /* synthetic */ byte[] a;

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void notifyListener(Object obj) {
        zzpm zzpmVar = (zzpm) obj;
        try {
            byte[] bArr = this.a;
            zzadf zzadfVar = zzadf.b;
            int i = em3.a;
            zzpmVar.a(zzpl.A(bArr, zzadf.c));
        } catch (zzaeh unused) {
            zzpmVar.getClass();
        }
    }

    public q05(v05 v05Var, byte[] bArr) {
        this.a = bArr;
        Objects.requireNonNull(v05Var);
    }
}
