package defpackage;

import com.ironsource.C4943qe;
import com.ironsource.Fe;
import com.ironsource.Ge;
import com.ironsource.InterfaceC5068xe;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ml0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ InterfaceC5068xe b;
    public final /* synthetic */ C4943qe c;

    public /* synthetic */ ml0(C4943qe c4943qe, InterfaceC5068xe interfaceC5068xe) {
        this.a = 2;
        this.c = c4943qe;
        this.b = interfaceC5068xe;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        InterfaceC5068xe interfaceC5068xe = this.b;
        C4943qe c4943qe = this.c;
        switch (i) {
            case 0:
                Fe.b(interfaceC5068xe, c4943qe);
                break;
            case 1:
                Ge.a(interfaceC5068xe, c4943qe);
                break;
            default:
                Ge.a.a(c4943qe, interfaceC5068xe);
                break;
        }
    }

    public /* synthetic */ ml0(InterfaceC5068xe interfaceC5068xe, C4943qe c4943qe, int i) {
        this.a = i;
        this.b = interfaceC5068xe;
        this.c = c4943qe;
    }
}
