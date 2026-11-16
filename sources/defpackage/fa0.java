package defpackage;

import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.util.BackgroundThreadStateHandler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class fa0 implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fa0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((BackgroundThreadStateHandler) obj).runInBackground(runnable);
                break;
            case 1:
                ((SimpleBasePlayer) obj).postOrRunOnApplicationHandler(runnable);
                break;
            default:
                ((com.google.android.exoplayer2.SimpleBasePlayer) obj).postOrRunOnApplicationHandler(runnable);
                break;
        }
    }
}
