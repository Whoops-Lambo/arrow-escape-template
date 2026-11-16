package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.zzasy;
import com.google.android.gms.internal.ads.zzbfi;
import com.google.android.gms.internal.ads.zzbfj;
import com.google.android.gms.internal.ads.zzbfk;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class ov3 implements ServiceConnection {
    public final tc4 a;
    public final /* synthetic */ qv3 b;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzbfk zzbfiVar;
        zzasy.a("Install Referrer service connected.");
        int i = zzbfj.a;
        if (iBinder == null) {
            zzbfiVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            zzbfiVar = iInterfaceQueryLocalInterface instanceof zzbfk ? (zzbfk) iInterfaceQueryLocalInterface : new zzbfi(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        }
        qv3 qv3Var = this.b;
        qv3Var.d = zzbfiVar;
        qv3Var.a = 2;
        this.a.f(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzasy.b("Install Referrer service disconnected.");
        qv3 qv3Var = this.b;
        qv3Var.d = null;
        qv3Var.a = 0;
    }

    public /* synthetic */ ov3(qv3 qv3Var, tc4 tc4Var) {
        Objects.requireNonNull(qv3Var);
        this.b = qv3Var;
        this.a = tc4Var;
    }
}
