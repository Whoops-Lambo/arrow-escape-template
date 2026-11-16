package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.source.MediaLoadData;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaSourceList.ForwardingEventListener b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ MediaLoadData d;

    public /* synthetic */ y(MediaSourceList.ForwardingEventListener forwardingEventListener, Pair pair, MediaLoadData mediaLoadData, int i) {
        this.a = i;
        this.b = forwardingEventListener;
        this.c = pair;
        this.d = mediaLoadData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        MediaLoadData mediaLoadData = this.d;
        Pair pair = this.c;
        MediaSourceList.ForwardingEventListener forwardingEventListener = this.b;
        switch (i) {
            case 0:
                forwardingEventListener.lambda$onUpstreamDiscarded$4(pair, mediaLoadData);
                break;
            default:
                forwardingEventListener.lambda$onDownstreamFormatChanged$5(pair, mediaLoadData);
                break;
        }
    }
}
