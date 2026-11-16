package defpackage;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcp;
import com.google.android.gms.internal.measurement.zzez;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class v84 extends ie4 {
    public final /* synthetic */ zzez e;

    @Override // defpackage.ie4
    public final void a() {
        zzez zzezVar = this.e;
        long j = zzezVar.h;
        zzcp zzcpVar = zzezVar.g;
        if (j >= 170) {
            ((zzcp) Preconditions.checkNotNull(zzcpVar)).resetAnalyticsDataWithElapsedTime(this.a, this.b);
        } else {
            ((zzcp) Preconditions.checkNotNull(zzcpVar)).resetAnalyticsData(this.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v84(zzez zzezVar) {
        super(zzezVar, true);
        Objects.requireNonNull(zzezVar);
        this.e = zzezVar;
    }
}
