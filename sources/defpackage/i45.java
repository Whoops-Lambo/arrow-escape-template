package defpackage;

import com.google.android.gms.internal.measurement.i;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class i45 extends i {
    public volatile boolean e;
    public final boolean f;

    @Override // com.google.android.gms.internal.measurement.i
    public final /* synthetic */ Object a() {
        return Boolean.valueOf(this.f);
    }

    @Override // com.google.android.gms.internal.measurement.i
    public final /* synthetic */ Object c(Object obj) {
        return (Boolean) obj;
    }

    @Override // com.google.android.gms.internal.measurement.i
    public final /* synthetic */ Object d() {
        return Boolean.valueOf(this.e);
    }

    @Override // com.google.android.gms.internal.measurement.i
    public final /* synthetic */ void e(Object obj) {
        this.e = ((Boolean) obj).booleanValue();
    }

    public i45(String str, xr1 xr1Var, boolean z) {
        super(str, xr1Var);
        this.f = z;
    }

    @Override // com.google.android.gms.internal.measurement.i
    public final /* synthetic */ Object b(String str) {
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }
}
