package defpackage;

import android.os.Looper;
import com.mbridge.msdk.config.manager.a;
import com.tiktok.TikTokBusinessSdk;
import com.tiktok.appevents.TTAppEventLogger;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.s;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g5(TTAppEventLogger tTAppEventLogger, AtomicBoolean atomicBoolean, TikTokBusinessSdk.TTInitCallback tTInitCallback, long j) {
        this.a = 1;
        this.c = tTAppEventLogger;
        this.d = atomicBoolean;
        this.e = tTInitCallback;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        long j = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                AnalyticsClient.b((Sdk.SDKMetric.SDKMetricType) obj3, j, (s) obj2, (String) obj);
                break;
            case 1:
                ((TTAppEventLogger) obj3).lambda$initConfig$1((AtomicBoolean) obj2, (TikTokBusinessSdk.TTInitCallback) obj, j);
                break;
            default:
                ((a) obj3).a(j, (Looper) obj2, (com.mbridge.msdk.config.manager.callback.a) obj);
                break;
        }
    }

    public /* synthetic */ g5(int i, long j, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.c = obj;
        this.b = j;
        this.d = obj2;
        this.e = obj3;
    }
}
