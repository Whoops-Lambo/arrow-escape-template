package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class la3 extends kh3 {
    public final /* synthetic */ IBinder g;
    public final /* synthetic */ na3 h;

    public la3(na3 na3Var, IBinder iBinder) {
        this.h = na3Var;
        this.g = iBinder;
    }

    @Override // defpackage.kh3
    public final void b() {
        pa3 pa3Var = (pa3) this.h.b;
        pa3Var.n = (IInterface) pa3Var.i.a(this.g);
        eh3 eh3Var = pa3Var.b;
        int i = 0;
        eh3Var.b("linkToDeath", new Object[0]);
        try {
            pa3Var.n.asBinder().linkToDeath(pa3Var.k, 0);
        } catch (RemoteException e) {
            eh3Var.a(e, "linkToDeath failed", new Object[0]);
        }
        pa3Var.g = false;
        ArrayList arrayList = pa3Var.d;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Runnable) obj).run();
        }
        pa3Var.d.clear();
    }
}
