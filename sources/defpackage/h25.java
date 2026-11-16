package defpackage;

import com.google.android.gms.measurement.internal.zzlu;
import com.google.android.gms.measurement.internal.zzmb;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class h25 implements Runnable {
    public final /* synthetic */ zzlu a;
    public final /* synthetic */ zzlu b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ zzmb e;

    @Override // java.lang.Runnable
    public final void run() {
        this.e.z(this.a, this.b, this.c, this.d, null);
    }

    public h25(zzmb zzmbVar, zzlu zzluVar, zzlu zzluVar2, long j, boolean z) {
        this.a = zzluVar;
        this.b = zzluVar2;
        this.c = j;
        this.d = z;
        this.e = zzmbVar;
    }
}
