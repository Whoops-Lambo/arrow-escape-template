package io.p071bidmachine;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class a2 implements SessionManager.Observer {
    public final /* synthetic */ b2 a;

    @Override // io.bidmachine.SessionManager.Observer
    public final void onSessionEvent(SessionManager.Status status) {
        if (status != SessionManager.Status.START) {
            return;
        }
        this.a.c();
    }

    public a2(b2 b2Var) {
        this.a = b2Var;
    }
}
