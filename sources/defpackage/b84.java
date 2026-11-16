package defpackage;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzcp;
import com.google.android.gms.internal.measurement.zzez;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class b84 extends ie4 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ String f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ zzez h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b84(zzez zzezVar, String str, String str2) {
        super(zzezVar, true);
        this.f = str;
        this.g = str2;
        Objects.requireNonNull(zzezVar);
        this.h = zzezVar;
    }

    @Override // defpackage.ie4
    public final void a() {
        switch (this.e) {
            case 0:
                ((zzcp) Preconditions.checkNotNull(this.h.g)).setUserProperty(null, this.f, new ObjectWrapper(this.g), false, this.a);
                break;
            default:
                ((zzcp) Preconditions.checkNotNull(this.h.g)).logHealthData(5, this.f, new ObjectWrapper(this.g), new ObjectWrapper(null), new ObjectWrapper(null));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b84(zzez zzezVar, String str, Object obj) {
        super(zzezVar, false);
        this.f = str;
        this.g = obj;
        this.h = zzezVar;
    }
}
