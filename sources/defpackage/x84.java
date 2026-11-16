package defpackage;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcp;
import com.google.android.gms.internal.measurement.zzez;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class x84 extends ie4 {
    public final /* synthetic */ long e;
    public final /* synthetic */ zzez f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x84(zzez zzezVar, long j) {
        super(zzezVar, true);
        this.e = j;
        Objects.requireNonNull(zzezVar);
        this.f = zzezVar;
    }

    @Override // defpackage.ie4
    public final void a() {
        ((zzcp) Preconditions.checkNotNull(this.f.g)).setSessionTimeoutDuration(this.e);
    }
}
