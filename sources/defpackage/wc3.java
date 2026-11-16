package defpackage;

import com.applovin.impl.sdk.e;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wc3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ wc3(e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        e eVar = this.b;
        switch (i) {
            case 0:
                eVar.d();
                break;
            default:
                eVar.c();
                break;
        }
    }
}
