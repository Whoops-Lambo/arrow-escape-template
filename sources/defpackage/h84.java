package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcm;
import com.google.android.gms.internal.measurement.zzcp;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzez;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class h84 extends ie4 {
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ zzez h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h84(zzez zzezVar, zzdd zzddVar, String str, String str2) {
        super(zzezVar, true);
        this.e = 2;
        this.i = zzddVar;
        this.f = str;
        this.g = str2;
        Objects.requireNonNull(zzezVar);
        this.h = zzezVar;
    }

    @Override // defpackage.ie4
    public final void a() {
        switch (this.e) {
            case 0:
                ((zzcp) Preconditions.checkNotNull(this.h.g)).clearConditionalUserProperty(this.f, this.g, (Bundle) this.i);
                break;
            case 1:
                ((zzcp) Preconditions.checkNotNull(this.h.g)).getConditionalUserProperties(this.f, this.g, (zzcm) this.i);
                break;
            default:
                ((zzcp) Preconditions.checkNotNull(this.h.g)).setCurrentScreenByScionActivityInfo((zzdd) this.i, this.f, this.g, this.a);
                break;
        }
    }

    @Override // defpackage.ie4
    public void c() {
        switch (this.e) {
            case 1:
                ((zzcm) this.i).zzb(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h84(zzez zzezVar, String str, String str2, Object obj, int i) {
        super(zzezVar, true);
        this.e = i;
        this.f = str;
        this.g = str2;
        this.i = obj;
        this.h = zzezVar;
    }
}
