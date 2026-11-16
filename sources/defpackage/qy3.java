package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.ads.zzbim;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class qy3 implements BaseGmsClient.BaseOnConnectionFailedListener {
    public final /* synthetic */ ny3 a;
    public final /* synthetic */ zzbim b;

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.b.c) {
            this.a.zzd(new RuntimeException("Connection failed."));
        }
    }

    public qy3(zzbim zzbimVar, ny3 ny3Var) {
        this.a = ny3Var;
        this.b = zzbimVar;
    }
}
