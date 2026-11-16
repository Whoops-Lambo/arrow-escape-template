package defpackage;

import com.applovin.impl.sdk.m;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class af3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ af3(m mVar, int i) {
        this.a = i;
        this.b = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        m mVar = this.b;
        switch (i) {
            case 0:
                mVar.W();
                break;
            case 1:
                mVar.X();
                break;
            default:
                mVar.V();
                break;
        }
    }
}
