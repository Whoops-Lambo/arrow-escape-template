package defpackage;

import android.os.Handler;
import com.google.android.gms.internal.ads.zzatr;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class bf3 implements Executor {
    public final /* synthetic */ int a;
    public final Handler b;

    public bf3(zzatr zzatrVar, Handler handler) {
        this.a = 2;
        this.b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        Handler handler = this.b;
        switch (i) {
            case 0:
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 1:
                handler.post(runnable);
                return;
            case 2:
                handler.post(runnable);
                return;
            default:
                handler.post(runnable);
                return;
        }
    }

    public /* synthetic */ bf3(Handler handler, int i) {
        this.a = i;
        this.b = handler;
    }
}
