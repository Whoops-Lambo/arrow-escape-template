package defpackage;

import com.google.android.gms.measurement.internal.zzmb;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class j25 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzmb b;

    public j25(zzmb zzmbVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(zzmbVar);
                this.b = zzmbVar;
                break;
            default:
                Objects.requireNonNull(zzmbVar);
                this.b = zzmbVar;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zzmb zzmbVar = this.b;
        switch (i) {
            case 0:
                zzmbVar.e = zzmbVar.j;
                break;
            default:
                zzmbVar.j = null;
                break;
        }
    }
}
