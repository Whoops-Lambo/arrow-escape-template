package defpackage;

import com.ironsource.C5037w1;
import com.ironsource.InterfaceC4939qa;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class gi3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ InterfaceC4939qa b;

    public /* synthetic */ gi3(InterfaceC4939qa interfaceC4939qa, int i) {
        this.a = i;
        this.b = interfaceC4939qa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        InterfaceC4939qa interfaceC4939qa = this.b;
        switch (i) {
            case 0:
                C5037w1.c(interfaceC4939qa);
                break;
            default:
                C5037w1.d(interfaceC4939qa);
                break;
        }
    }
}
