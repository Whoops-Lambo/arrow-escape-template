package androidx.media3.exoplayer;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaSourceList.ForwardingEventListener b;
    public final /* synthetic */ Pair c;

    public /* synthetic */ c0(MediaSourceList.ForwardingEventListener forwardingEventListener, Pair pair, int i) {
        this.a = i;
        this.b = forwardingEventListener;
        this.c = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Pair pair = this.c;
        MediaSourceList.ForwardingEventListener forwardingEventListener = this.b;
        switch (i) {
            case 0:
                forwardingEventListener.lambda$onDrmKeysRemoved$10(pair);
                break;
            case 1:
                forwardingEventListener.lambda$onDrmKeysRestored$9(pair);
                break;
            case 2:
                forwardingEventListener.lambda$onDrmSessionReleased$11(pair);
                break;
            default:
                forwardingEventListener.lambda$onDrmKeysLoaded$7(pair);
                break;
        }
    }
}
