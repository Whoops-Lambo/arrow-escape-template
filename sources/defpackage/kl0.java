package defpackage;

import com.ironsource.C4978se;
import com.ironsource.Fe;
import com.ironsource.Ge;
import com.ironsource.InterfaceC5068xe;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class kl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ InterfaceC5068xe b;
    public final /* synthetic */ C4978se c;

    public /* synthetic */ kl0(InterfaceC5068xe interfaceC5068xe, C4978se c4978se, int i) {
        this.a = i;
        this.b = interfaceC5068xe;
        this.c = c4978se;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        C4978se c4978se = this.c;
        InterfaceC5068xe interfaceC5068xe = this.b;
        switch (i) {
            case 0:
                Fe.b(interfaceC5068xe, c4978se);
                break;
            default:
                Ge.a.a(interfaceC5068xe, c4978se);
                break;
        }
    }
}
