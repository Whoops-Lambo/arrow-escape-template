package defpackage;

import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSourceEventListener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mk1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaSourceEventListener.EventDispatcher b;
    public final /* synthetic */ MediaSourceEventListener c;
    public final /* synthetic */ LoadEventInfo d;
    public final /* synthetic */ MediaLoadData e;

    public /* synthetic */ mk1(MediaSourceEventListener.EventDispatcher eventDispatcher, MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i) {
        this.a = i;
        this.b = eventDispatcher;
        this.c = mediaSourceEventListener;
        this.d = loadEventInfo;
        this.e = mediaLoadData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        MediaLoadData mediaLoadData = this.e;
        LoadEventInfo loadEventInfo = this.d;
        MediaSourceEventListener mediaSourceEventListener = this.c;
        MediaSourceEventListener.EventDispatcher eventDispatcher = this.b;
        switch (i) {
            case 0:
                eventDispatcher.lambda$loadCompleted$1(mediaSourceEventListener, loadEventInfo, mediaLoadData);
                break;
            case 1:
                eventDispatcher.lambda$loadCanceled$2(mediaSourceEventListener, loadEventInfo, mediaLoadData);
                break;
            default:
                eventDispatcher.lambda$loadStarted$0(mediaSourceEventListener, loadEventInfo, mediaLoadData);
                break;
        }
    }
}
