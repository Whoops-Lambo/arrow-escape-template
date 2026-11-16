package defpackage;

import com.ironsource.lifecycle.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class lb3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ lb3(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                bVar.f();
                break;
            case 1:
                bVar.g();
                break;
            case 2:
                bVar.h();
                break;
            case 3:
                bVar.i();
                break;
            default:
                bVar.j();
                break;
        }
    }
}
