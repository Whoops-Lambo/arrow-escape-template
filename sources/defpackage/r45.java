package defpackage;

import com.google.android.gms.internal.measurement.i;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class r45 extends i {
    public volatile long e;
    public final long f;

    @Override // com.google.android.gms.internal.measurement.i
    public final /* synthetic */ Object a() {
        return Long.valueOf(this.f);
    }

    @Override // com.google.android.gms.internal.measurement.i
    public final /* synthetic */ Object c(Object obj) {
        return (Long) obj;
    }

    @Override // com.google.android.gms.internal.measurement.i
    public final /* synthetic */ Object d() {
        return Long.valueOf(this.e);
    }

    @Override // com.google.android.gms.internal.measurement.i
    public final /* synthetic */ void e(Object obj) {
        this.e = ((Long) obj).longValue();
    }

    public r45(String str, xr1 xr1Var, long j) {
        super(str, xr1Var);
        this.f = j;
    }

    @Override // com.google.android.gms.internal.measurement.i
    public final /* synthetic */ Object b(String str) {
        return Long.valueOf(Long.parseLong(str));
    }
}
