package defpackage;

import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.source.preload.PreloadMediaSource;
import com.adsurge.adn.z1.e;
import com.ironsource.C4689cb;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ua implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ua(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((AudioRendererEventListener.EventDispatcher) obj).lambda$positionAdvancing$3(j);
                break;
            case 1:
                ((com.google.android.exoplayer2.audio.AudioRendererEventListener.EventDispatcher) obj).lambda$positionAdvancing$3(j);
                break;
            case 2:
                ((PreloadMediaSource) obj).lambda$preload$0(j);
                break;
            case 3:
                C4689cb.a((C4689cb) obj, j);
                break;
            default:
                ((e) obj).a(j);
                break;
        }
    }
}
