package defpackage;

import android.content.Context;
import com.adsurge.adn.P.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class t93 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ Context c;

    public /* synthetic */ t93(a aVar, Context context, int i) {
        this.a = i;
        this.b = aVar;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Context context = this.c;
        a aVar = this.b;
        switch (i) {
            case 0:
                aVar.e(context);
                break;
            default:
                aVar.d(context);
                break;
        }
    }
}
