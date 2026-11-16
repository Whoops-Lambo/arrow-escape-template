package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.LoadControl;
import androidx.media3.exoplayer.source.preload.DefaultPreloadManager;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class m90 implements ol2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LoadControl b;

    public /* synthetic */ m90(LoadControl loadControl, int i) {
        this.a = i;
        this.b = loadControl;
    }

    @Override // defpackage.ol2
    public final Object get() {
        int i = this.a;
        LoadControl loadControl = this.b;
        switch (i) {
            case 0:
                return DefaultPreloadManager.Builder.lambda$setLoadControl$5(loadControl);
            case 1:
                return ExoPlayer.Builder.lambda$setLoadControl$19(loadControl);
            default:
                return ExoPlayer.Builder.lambda$new$11(loadControl);
        }
    }
}
