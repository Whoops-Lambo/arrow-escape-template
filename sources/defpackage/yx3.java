package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class yx3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gz3 b;

    public /* synthetic */ yx3(gz3 gz3Var, int i) {
        this.a = i;
        this.b = gz3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        gz3 gz3Var = this.b;
        switch (i) {
            case 0:
                if (gz3Var.k != null) {
                    if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
                        Log.i("ServiceConnMgrImpl", "Unbind from service.");
                    }
                    Context context = gz3Var.b;
                    na3 na3Var = gz3Var.j;
                    na3Var.getClass();
                    context.unbindService(na3Var);
                    gz3Var.f = false;
                    gz3Var.k = null;
                    gz3Var.j = null;
                    ArrayList arrayList = gz3Var.d;
                    synchronized (arrayList) {
                        arrayList.clear();
                        break;
                    }
                    Log.i("ServiceConnMgrImpl", "notifyOnDisconnected in unbind()");
                    gz3Var.b();
                    return;
                }
                return;
            default:
                if (gz3Var.k != null) {
                    gz3Var.k = null;
                    Log.i("ServiceConnMgrImpl", "notifyOnDisconnected in reportBinderDeath()");
                    gz3Var.b();
                    return;
                }
                return;
        }
    }
}
