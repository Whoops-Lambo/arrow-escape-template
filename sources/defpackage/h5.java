package defpackage;

import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.executor.j;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ h5(j jVar, int i) {
        this.a = i;
        this.b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        j jVar = this.b;
        switch (i) {
            case 0:
                AnalyticsClient.a(jVar);
                break;
            case 1:
                j.c(jVar);
                break;
            case 2:
                j.a(jVar);
                break;
            default:
                j.b(jVar);
                break;
        }
    }
}
