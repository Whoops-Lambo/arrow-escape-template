package defpackage;

import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.RenderersFactory;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mj0 implements ol2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RenderersFactory b;

    public /* synthetic */ mj0(RenderersFactory renderersFactory, int i) {
        this.a = i;
        this.b = renderersFactory;
    }

    @Override // defpackage.ol2
    public final Object get() {
        int i = this.a;
        RenderersFactory renderersFactory = this.b;
        switch (i) {
            case 0:
                return ExoPlayer.Builder.lambda$new$2(renderersFactory);
            case 1:
                return ExoPlayer.Builder.lambda$setRenderersFactory$16(renderersFactory);
            case 2:
                return ExoPlayer.Builder.lambda$new$6(renderersFactory);
            default:
                return ExoPlayer.Builder.lambda$new$8(renderersFactory);
        }
    }
}
