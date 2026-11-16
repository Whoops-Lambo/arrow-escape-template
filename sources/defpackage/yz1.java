package defpackage;

import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.exoplayer.source.SingleSampleMediaSource;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class yz1 implements ol2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ol2 b;
    public final /* synthetic */ Consumer c;

    public /* synthetic */ yz1(ol2 ol2Var, Consumer consumer, int i) {
        this.a = i;
        this.b = ol2Var;
        this.c = consumer;
    }

    @Override // defpackage.ol2
    public final Object get() {
        switch (this.a) {
            case 0:
                return ProgressiveMediaSource.Factory.lambda$setDownloadExecutor$1(this.b, this.c);
            default:
                return SingleSampleMediaSource.Factory.lambda$setDownloadExecutor$0(this.b, this.c);
        }
    }
}
