package defpackage;

import androidx.media3.exoplayer.drm.DrmSessionEventListener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class me0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DrmSessionEventListener.EventDispatcher b;
    public final /* synthetic */ DrmSessionEventListener c;

    public /* synthetic */ me0(DrmSessionEventListener.EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener, int i) {
        this.a = i;
        this.b = eventDispatcher;
        this.c = drmSessionEventListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        DrmSessionEventListener drmSessionEventListener = this.c;
        DrmSessionEventListener.EventDispatcher eventDispatcher = this.b;
        switch (i) {
            case 0:
                eventDispatcher.lambda$drmKeysRemoved$4(drmSessionEventListener);
                break;
            case 1:
                eventDispatcher.lambda$drmKeysRestored$3(drmSessionEventListener);
                break;
            case 2:
                eventDispatcher.lambda$drmKeysLoaded$1(drmSessionEventListener);
                break;
            default:
                eventDispatcher.lambda$drmSessionReleased$5(drmSessionEventListener);
                break;
        }
    }
}
