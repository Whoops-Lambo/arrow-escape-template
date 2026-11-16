package defpackage;

import android.content.Context;
import com.ironsource.C5104ze;
import com.ironsource.Ge;
import com.ironsource.InterfaceC5068xe;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ot0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ C5104ze c;
    public final /* synthetic */ InterfaceC5068xe d;

    public /* synthetic */ ot0(Context context, C5104ze c5104ze, InterfaceC5068xe interfaceC5068xe, int i) {
        this.a = i;
        this.b = context;
        this.c = c5104ze;
        this.d = interfaceC5068xe;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        InterfaceC5068xe interfaceC5068xe = this.d;
        C5104ze c5104ze = this.c;
        Context context = this.b;
        switch (i) {
            case 0:
                Ge.b(context, c5104ze, interfaceC5068xe);
                break;
            default:
                Ge.d(context, c5104ze, interfaceC5068xe);
                break;
        }
    }
}
