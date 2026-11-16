package defpackage;

import com.google.android.gms.internal.measurement.i;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class k45 extends i {
    public volatile double e;

    @Override // com.google.android.gms.internal.measurement.i
    public final /* synthetic */ Object a() {
        return Double.valueOf(-3.0d);
    }

    @Override // com.google.android.gms.internal.measurement.i
    public final /* synthetic */ Object c(Object obj) {
        return (Double) obj;
    }

    @Override // com.google.android.gms.internal.measurement.i
    public final /* synthetic */ Object d() {
        return Double.valueOf(this.e);
    }

    @Override // com.google.android.gms.internal.measurement.i
    public final /* synthetic */ void e(Object obj) {
        this.e = ((Double) obj).doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.i
    public final /* synthetic */ Object b(String str) {
        return Double.valueOf(Double.parseDouble(str));
    }
}
