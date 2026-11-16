package defpackage;

import com.applovin.impl.o2;
import com.applovin.impl.s8;
import com.applovin.impl.sdk.l;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ve3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ ve3(int i, l lVar) {
        this.a = i;
        this.b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        l lVar = this.b;
        switch (i) {
            case 0:
                lVar.N0();
                break;
            case 1:
                lVar.O0();
                break;
            case 2:
                lVar.L0();
                break;
            case 3:
                lVar.M0();
                break;
            case 4:
                o2.a(lVar);
                break;
            case 5:
                s8.d(lVar);
                break;
            default:
                s8.e(lVar);
                break;
        }
    }
}
