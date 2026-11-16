package defpackage;

import com.applovin.impl.b;
import com.applovin.impl.x4;
import com.applovin.impl.y1;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vi3 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ x4 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vi3(x4 x4Var, Executor executor, x4.b bVar) {
        this.b = x4Var;
        this.c = executor;
        this.d = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        x4 x4Var = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                x4Var.b((Executor) obj2, (x4.b) obj);
                break;
            default:
                ((y1) obj2).a((b) obj, x4Var);
                break;
        }
    }

    public /* synthetic */ vi3(y1 y1Var, b bVar, x4 x4Var) {
        this.c = y1Var;
        this.d = bVar;
        this.b = x4Var;
    }
}
