package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.ads.zzguy;
import io.p071bidmachine.media3.exoplayer.audio.e;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mh3 implements IBinder.DeathRecipient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mh3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                pa3 pa3Var = (pa3) obj;
                int i2 = 0;
                pa3Var.b.b("reportBinderDeath", new Object[0]);
                if (pa3Var.j.get() != null) {
                    m93.b();
                    return;
                }
                pa3Var.b.b("%s : Binder has died.", pa3Var.c);
                ArrayList arrayList = pa3Var.d;
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    ((kh3) obj2).a(new RemoteException(String.valueOf(pa3Var.c).concat(" : Binder has died.")));
                }
                pa3Var.d.clear();
                synchronized (pa3Var.f) {
                    pa3Var.e();
                    break;
                }
                return;
            case 1:
                gz3 gz3Var = (gz3) obj;
                if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
                    Log.i("ServiceConnMgrImpl", "Binder has died: ".concat(gz3Var.c));
                }
                ArrayList arrayList2 = gz3Var.d;
                synchronized (arrayList2) {
                    arrayList2.clear();
                    break;
                }
                gz3Var.c(new yx3(gz3Var, 1));
                return;
            default:
                e eVar = (e) obj;
                ((zzguy) eVar.d).a("%s : Binder has died.", (String) eVar.e);
                ArrayList arrayList3 = (ArrayList) eVar.f;
                synchronized (arrayList3) {
                    arrayList3.clear();
                    break;
                }
                return;
        }
    }
}
