package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaSourceList.ForwardingEventListener b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ LoadEventInfo d;
    public final /* synthetic */ MediaLoadData e;

    public /* synthetic */ b0(MediaSourceList.ForwardingEventListener forwardingEventListener, Pair pair, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i) {
        this.a = i;
        this.b = forwardingEventListener;
        this.c = pair;
        this.d = loadEventInfo;
        this.e = mediaLoadData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        MediaLoadData mediaLoadData = this.e;
        LoadEventInfo loadEventInfo = this.d;
        Pair pair = this.c;
        MediaSourceList.ForwardingEventListener forwardingEventListener = this.b;
        switch (i) {
            case 0:
                forwardingEventListener.lambda$onLoadCanceled$2(pair, loadEventInfo, mediaLoadData);
                break;
            default:
                forwardingEventListener.lambda$onLoadCompleted$1(pair, loadEventInfo, mediaLoadData);
                break;
        }
    }
}
