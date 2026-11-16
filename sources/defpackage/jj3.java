package defpackage;

import com.google.android.gms.internal.measurement.zzez;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class jj3 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final ThreadFactory b;

    public /* synthetic */ jj3(int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = Executors.defaultThreadFactory();
                break;
            case 3:
                this.b = Executors.defaultThreadFactory();
                break;
            default:
                this.b = Executors.defaultThreadFactory();
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        ThreadFactory threadFactory = this.b;
        switch (i) {
            case 0:
                Thread threadNewThread = threadFactory.newThread(runnable);
                if (threadNewThread != null) {
                    threadNewThread.setName("punch".concat(String.valueOf(threadNewThread.getName())));
                    return threadNewThread;
                }
                d.w("Default ThreadFactory returned null thread");
                return null;
            case 1:
                Thread threadNewThread2 = threadFactory.newThread(runnable);
                threadNewThread2.setName("ScionFrontendApi");
                return threadNewThread2;
            case 2:
                Thread threadNewThread3 = threadFactory.newThread(runnable);
                if (threadNewThread3 != null) {
                    threadNewThread3.setName("punch".concat(String.valueOf(threadNewThread3.getName())));
                    return threadNewThread3;
                }
                d.w("Default ThreadFactory returned null thread");
                return null;
            default:
                Thread threadNewThread4 = threadFactory.newThread(runnable);
                if (threadNewThread4 != null) {
                    threadNewThread4.setName("punch".concat(String.valueOf(threadNewThread4.getName())));
                    return threadNewThread4;
                }
                d.w("Default ThreadFactory returned null thread");
                return null;
        }
    }

    public jj3(zzez zzezVar) {
        this.a = 1;
        this.b = Executors.defaultThreadFactory();
    }
}
