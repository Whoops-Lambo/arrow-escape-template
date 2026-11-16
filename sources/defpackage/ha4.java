package defpackage;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcm;
import com.google.android.gms.internal.measurement.zzcp;
import com.google.android.gms.internal.measurement.zzez;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class ha4 extends ie4 {
    public final /* synthetic */ int e;
    public final /* synthetic */ zzcm f;
    public final /* synthetic */ zzez g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha4(zzez zzezVar, zzcm zzcmVar, int i) {
        super(zzezVar, true);
        this.e = i;
        switch (i) {
            case 1:
                this.f = zzcmVar;
                Objects.requireNonNull(zzezVar);
                this.g = zzezVar;
                super(zzezVar, true);
                break;
            case 2:
                this.f = zzcmVar;
                Objects.requireNonNull(zzezVar);
                this.g = zzezVar;
                super(zzezVar, true);
                break;
            default:
                this.f = zzcmVar;
                Objects.requireNonNull(zzezVar);
                this.g = zzezVar;
                break;
        }
    }

    @Override // defpackage.ie4
    public final void a() {
        switch (this.e) {
            case 0:
                ((zzcp) Preconditions.checkNotNull(this.g.g)).getGmpAppId(this.f);
                break;
            case 1:
                ((zzcp) Preconditions.checkNotNull(this.g.g)).getCachedAppInstanceId(this.f);
                break;
            case 2:
                ((zzcp) Preconditions.checkNotNull(this.g.g)).generateEventId(this.f);
                break;
            case 3:
                ((zzcp) Preconditions.checkNotNull(this.g.g)).getCurrentScreenName(this.f);
                break;
            case 4:
                ((zzcp) Preconditions.checkNotNull(this.g.g)).getCurrentScreenClass(this.f);
                break;
            case 5:
                ((zzcp) Preconditions.checkNotNull(this.g.g)).getAppInstanceId(this.f);
                break;
            default:
                ((zzcp) Preconditions.checkNotNull(this.g.g)).getSessionId(this.f);
                break;
        }
    }

    @Override // defpackage.ie4
    public final void c() {
        int i = this.e;
        zzcm zzcmVar = this.f;
        switch (i) {
            case 0:
                zzcmVar.zzb(null);
                break;
            case 1:
                zzcmVar.zzb(null);
                break;
            case 2:
                zzcmVar.zzb(null);
                break;
            case 3:
                zzcmVar.zzb(null);
                break;
            case 4:
                zzcmVar.zzb(null);
                break;
            case 5:
                zzcmVar.zzb(null);
                break;
            default:
                zzcmVar.zzb(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ha4(zzez zzezVar, zzcm zzcmVar, int i, boolean z) {
        super(zzezVar, true);
        this.e = i;
        this.f = zzcmVar;
        this.g = zzezVar;
    }
}
