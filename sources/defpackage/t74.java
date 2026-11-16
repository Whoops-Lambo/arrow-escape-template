package defpackage;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbjr;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class t74 extends IHsdpPrewarmServiceCallback.Stub {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ v74 c;

    public t74(v74 v74Var, String str, long j) {
        this.a = str;
        this.b = j;
        this.c = v74Var;
    }

    @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback
    public final void onError(Bundle bundle) {
        if (((Boolean) zzba.zzc().a(zzbjr.Re)).booleanValue()) {
            this.c.a(this.b, bundle, this.a, "0");
        }
    }

    @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback
    public final void onPrewarmCompleted(Bundle bundle) {
        if (((Boolean) zzba.zzc().a(zzbjr.Re)).booleanValue()) {
            this.c.a(this.b, bundle, this.a, "1");
        }
    }
}
