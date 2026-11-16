package defpackage;

import com.google.android.gms.internal.ads.zzcfd;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class rn0 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final AtomicInteger b;

    public rn0(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new AtomicInteger(1);
                break;
            case 2:
            default:
                this.b = new AtomicInteger(1);
                break;
            case 3:
                this.b = new AtomicInteger(1);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        AtomicInteger atomicInteger = this.b;
        switch (i) {
            case 0:
                return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(atomicInteger.getAndIncrement())));
            case 1:
                return new Thread(runnable, "ConcurrencyUtil#" + atomicInteger.getAndIncrement());
            case 2:
                int andIncrement = atomicInteger.getAndIncrement();
                return new Thread(runnable, pv1.l(andIncrement, "AdWorker(SCION_TASK_EXECUTOR) #", new StringBuilder(String.valueOf(andIncrement).length() + 31)));
            default:
                int andIncrement2 = atomicInteger.getAndIncrement();
                return new Thread(runnable, pv1.l(andIncrement2, "AdWorker(NG) #", new StringBuilder(String.valueOf(andIncrement2).length() + 14)));
        }
    }

    public rn0(zzcfd zzcfdVar) {
        this.a = 2;
        this.b = new AtomicInteger(1);
    }
}
