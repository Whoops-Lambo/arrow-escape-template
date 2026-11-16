package defpackage;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcp;
import com.google.android.gms.internal.measurement.zzez;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class m84 extends ie4 {
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ zzez g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m84(zzez zzezVar, String str, int i) {
        super(zzezVar, true);
        this.e = i;
        switch (i) {
            case 1:
                this.f = str;
                Objects.requireNonNull(zzezVar);
                this.g = zzezVar;
                super(zzezVar, true);
                break;
            case 2:
                this.f = str;
                Objects.requireNonNull(zzezVar);
                this.g = zzezVar;
                super(zzezVar, true);
                break;
            default:
                this.f = str;
                Objects.requireNonNull(zzezVar);
                this.g = zzezVar;
                break;
        }
    }

    @Override // defpackage.ie4
    public final void a() {
        switch (this.e) {
            case 0:
                ((zzcp) Preconditions.checkNotNull(this.g.g)).setUserId(this.f, this.a);
                break;
            case 1:
                ((zzcp) Preconditions.checkNotNull(this.g.g)).beginAdUnitExposure(this.f, this.b);
                break;
            default:
                ((zzcp) Preconditions.checkNotNull(this.g.g)).endAdUnitExposure(this.f, this.b);
                break;
        }
    }
}
