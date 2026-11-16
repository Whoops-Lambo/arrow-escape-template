package defpackage;

import com.google.android.gms.internal.ads.zzfq;
import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class cj0 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;

    public /* synthetic */ cj0(int i, Serializable serializable) {
        this.a = i;
        this.b = serializable;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        Serializable serializable = this.b;
        switch (i) {
            case 0:
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(new bj0(runnable, 0));
                threadNewThread.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) serializable).getAndIncrement());
                return threadNewThread;
            default:
                String str = zzfq.a;
                return new Thread(runnable, (String) serializable);
        }
    }
}
