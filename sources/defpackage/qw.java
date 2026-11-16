package defpackage;

import com.google.android.exoplayer2.util.Util;
import com.mbridge.msdk.config.component.asy.a;
import java.io.Serializable;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class qw implements ThreadFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;

    public /* synthetic */ qw(int i, Serializable serializable) {
        this.a = i;
        this.b = serializable;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        Serializable serializable = this.b;
        switch (i) {
            case 0:
                Thread thread = new Thread(runnable, (String) serializable);
                thread.setPriority(10);
                return thread;
            case 1:
                return Util.lambda$newSingleThreadExecutor$3((String) serializable, runnable);
            case 2:
                return androidx.media3.common.util.Util.lambda$newSingleThreadExecutor$3((String) serializable, runnable);
            case 3:
                return androidx.media3.common.util.Util.lambda$newSingleThreadScheduledExecutor$4((String) serializable, runnable);
            default:
                return a.a((AtomicInteger) serializable, runnable);
        }
    }
}
