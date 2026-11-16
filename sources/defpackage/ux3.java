package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class ux3 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final AtomicInteger b;
    public final Object c;

    public ux3() {
        this.a = 0;
        this.c = Executors.defaultThreadFactory();
        this.b = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        Object obj = this.c;
        AtomicInteger atomicInteger = this.b;
        switch (i) {
            case 0:
                Thread threadNewThread = ((ThreadFactory) obj).newThread(runnable);
                int andIncrement = atomicInteger.getAndIncrement();
                StringBuilder sb = new StringBuilder(String.valueOf(andIncrement).length() + 5);
                sb.append("gads-");
                sb.append(andIncrement);
                threadNewThread.setName(sb.toString());
                return threadNewThread;
            default:
                int andIncrement2 = atomicInteger.getAndIncrement();
                String str = (String) obj;
                StringBuilder sb2 = new StringBuilder(q63.a(12, String.valueOf(andIncrement2).length(), str));
                sb2.append("AdWorker(");
                sb2.append(str);
                sb2.append(") #");
                sb2.append(andIncrement2);
                return new Thread(runnable, sb2.toString());
        }
    }

    public ux3(String str) {
        this.a = 1;
        this.c = str;
        this.b = new AtomicInteger(1);
    }
}
