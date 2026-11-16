package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class ma3 extends kh3 {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ma3(Object obj, int i) {
        this.g = i;
        this.h = obj;
    }

    @Override // defpackage.kh3
    public final void b() {
        switch (this.g) {
            case 0:
                pa3 pa3Var = (pa3) ((na3) this.h).b;
                pa3Var.b.b("unlinkToDeath", new Object[0]);
                pa3Var.n.asBinder().unlinkToDeath(pa3Var.k, 0);
                pa3Var.n = null;
                pa3Var.g = false;
                return;
            default:
                synchronized (((pa3) this.h).f) {
                    try {
                        if (((pa3) this.h).l.get() > 0 && ((pa3) this.h).l.decrementAndGet() > 0) {
                            ((pa3) this.h).b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        pa3 pa3Var2 = (pa3) this.h;
                        if (pa3Var2.n != null) {
                            pa3Var2.b.b("Unbind from service.", new Object[0]);
                            pa3 pa3Var3 = (pa3) this.h;
                            pa3Var3.a.unbindService(pa3Var3.m);
                            pa3 pa3Var4 = (pa3) this.h;
                            pa3Var4.g = false;
                            pa3Var4.n = null;
                            pa3Var4.m = null;
                        }
                        ((pa3) this.h).e();
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
