package defpackage;

import com.google.android.gms.internal.measurement.zzah;
import com.google.android.gms.internal.measurement.zzai;
import com.google.android.gms.internal.measurement.zzao;
import com.google.android.gms.internal.measurement.zzg;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class k55 extends zzai {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k55(String str, int i) {
        super(str);
        this.c = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao b(zzg zzgVar, List list) {
        switch (this.c) {
            case 0:
            case 1:
                return this;
            default:
                return new zzah(Double.valueOf(0.0d));
        }
    }
}
