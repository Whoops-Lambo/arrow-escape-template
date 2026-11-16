package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.internal.ads.zzguy;
import io.p071bidmachine.media3.exoplayer.audio.e;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class na3 implements ServiceConnection {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ na3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                pa3 pa3Var = (pa3) obj;
                pa3Var.b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                pa3Var.a().post(new la3(this, iBinder));
                break;
            case 1:
                if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
                    Log.i("ServiceConnMgrImpl", "onServiceConnected: ".concat(String.valueOf(componentName)));
                }
                ((gz3) obj).c(new ku4(8, this, iBinder));
                break;
            default:
                e eVar = (e) obj;
                ((zzguy) eVar.d).a("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
                eVar.d(new yi4(2, this, iBinder));
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                pa3 pa3Var = (pa3) obj;
                pa3Var.b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                pa3Var.a().post(new ma3(this, 0));
                break;
            case 1:
                if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
                    Log.i("ServiceConnMgrImpl", "onServiceDisconnected: ".concat(String.valueOf(componentName)));
                }
                ((gz3) obj).c(new l24(this, 27));
                break;
            default:
                e eVar = (e) obj;
                ((zzguy) eVar.d).a("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
                eVar.d(new bd4(this, 26));
                break;
        }
    }
}
