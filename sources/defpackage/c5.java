package defpackage;

import co.ab180.airbridge.Airbridge;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class c5 extends zk1 {
    public final String d;
    public final a33 e;

    public c5(a33 a33Var) {
        super("AirBridge", a33Var, null);
        this.d = "AirBridge";
        this.e = a33Var;
    }

    @Override // defpackage.zk1
    public final a33 c() {
        return this.e;
    }

    @Override // defpackage.zk1
    public final String d() {
        return this.d;
    }

    @Override // defpackage.zk1
    public final boolean a(boolean z, y33 y33Var) {
        y33Var.getClass();
        try {
            Class.forName("co.ab180.airbridge.Airbridge");
            if (z) {
                Airbridge.startTracking();
                return true;
            }
            Airbridge.stopTracking();
            return true;
        } catch (Throwable th) {
            f(th);
            return false;
        }
    }
}
