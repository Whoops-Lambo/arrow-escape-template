package defpackage;

import android.content.Context;
import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sdk.n;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class if3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;
    public final /* synthetic */ b c;
    public final /* synthetic */ Context d;

    public /* synthetic */ if3(n nVar, b bVar, Context context, int i) {
        this.a = i;
        this.b = nVar;
        this.c = bVar;
        this.d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Context context = this.d;
        b bVar = this.c;
        n nVar = this.b;
        switch (i) {
            case 0:
                nVar.a(bVar, context);
                break;
            default:
                nVar.b(bVar, context);
                break;
        }
    }
}
