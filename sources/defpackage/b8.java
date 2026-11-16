package defpackage;

import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b8 implements Executor {
    public final /* synthetic */ int a;

    private final void a(Runnable runnable) {
    }

    public /* synthetic */ b8(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ArchTaskExecutor.a().a.b.execute(runnable);
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                PlaybackVideoGraphWrapper.lambda$static$0(runnable);
                break;
            case 3:
                break;
            default:
                AppLovinSdkUtils.runOnUiThread(runnable);
                break;
        }
    }
}
