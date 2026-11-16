package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class pm implements wr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kl b;

    public /* synthetic */ pm(kl klVar, int i) {
        this.a = i;
        this.b = klVar;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        int i = this.a;
        kl klVar = this.b;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                if (th != null && klVar._closedCause == null) {
                    klVar.a(th);
                }
                break;
            default:
                if (th != null && !klVar.h()) {
                    klVar.a(th);
                }
                break;
        }
        return az2.a;
    }
}
