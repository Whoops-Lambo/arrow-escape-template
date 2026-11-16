package defpackage;

import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcp;
import com.google.android.gms.internal.measurement.zzez;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class r84 extends ie4 {
    public final /* synthetic */ int e;
    public final /* synthetic */ zzez f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r84(zzez zzezVar, Boolean bool) {
        super(zzezVar, true);
        this.e = 0;
        this.g = bool;
        Objects.requireNonNull(zzezVar);
        this.f = zzezVar;
    }

    @Override // defpackage.ie4
    public final void a() {
        switch (this.e) {
            case 0:
                ((zzcp) Preconditions.checkNotNull(this.f.g)).setMeasurementEnabled(((Boolean) this.g).booleanValue(), this.a);
                break;
            case 1:
                ((zzcp) Preconditions.checkNotNull(this.f.g)).retrieveAndUploadBatches(new r94(this, (yi4) this.g));
                break;
            case 2:
                ((zzcp) Preconditions.checkNotNull(this.f.g)).setSgtmDebugInfo((Intent) this.g);
                break;
            default:
                ((zzcp) Preconditions.checkNotNull(this.f.g)).registerOnMeasurementEventListener((te4) this.g);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r84(zzez zzezVar, Object obj, int i) {
        super(zzezVar, true);
        this.e = i;
        this.g = obj;
        this.f = zzezVar;
    }
}
