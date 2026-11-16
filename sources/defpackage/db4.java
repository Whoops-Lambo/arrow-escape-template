package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcm;
import com.google.android.gms.internal.measurement.zzcp;
import com.google.android.gms.internal.measurement.zzez;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class db4 extends ie4 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ zzez i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db4(zzez zzezVar, String str, String str2, boolean z, zzcm zzcmVar) {
        super(zzezVar, true);
        this.f = str;
        this.g = str2;
        this.h = z;
        this.j = zzcmVar;
        this.i = zzezVar;
    }

    @Override // defpackage.ie4
    public final void a() {
        switch (this.e) {
            case 0:
                ((zzcp) Preconditions.checkNotNull(this.i.g)).getUserProperties(this.f, this.g, this.h, (zzcm) this.j);
                break;
            default:
                ((zzcp) Preconditions.checkNotNull(this.i.g)).logEventWithElapsedTime(this.f, this.g, (Bundle) this.j, this.h, true, this.a, this.b);
                break;
        }
    }

    @Override // defpackage.ie4
    public void c() {
        switch (this.e) {
            case 0:
                ((zzcm) this.j).zzb(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db4(zzez zzezVar, String str, String str2, Bundle bundle, boolean z) {
        super(zzezVar, true);
        this.f = str;
        this.g = str2;
        this.j = bundle;
        this.h = z;
        this.i = zzezVar;
    }
}
