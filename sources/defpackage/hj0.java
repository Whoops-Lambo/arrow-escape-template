package defpackage;

import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.LoadControl;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class hj0 implements ol2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LoadControl b;

    public /* synthetic */ hj0(LoadControl loadControl, int i) {
        this.a = i;
        this.b = loadControl;
    }

    @Override // defpackage.ol2
    public final Object get() {
        int i = this.a;
        LoadControl loadControl = this.b;
        switch (i) {
            case 0:
                return ExoPlayer.Builder.lambda$setLoadControl$19(loadControl);
            default:
                return ExoPlayer.Builder.lambda$new$11(loadControl);
        }
    }
}
