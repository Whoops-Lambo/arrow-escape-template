package defpackage;

import com.google.android.gms.internal.measurement.k;
import com.google.android.gms.internal.measurement.l;
import com.google.android.gms.internal.measurement.m;
import com.google.android.gms.internal.measurement.zzyf;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class sb5 extends zzyf {
    public final /* synthetic */ int b;

    public /* synthetic */ sb5(int i) {
        this.b = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzyf
    public final /* synthetic */ Object a() {
        switch (this.b) {
            case 0:
                return new k();
            case 1:
                return new l();
            case 2:
                return new nc5();
            default:
                return new m();
        }
    }
}
