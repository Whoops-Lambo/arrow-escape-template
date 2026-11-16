package defpackage;

import android.content.Context;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import com.adsurge.adn.D1.b;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.inmobi.media.AbstractC4305pk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ya implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ya(Context context, long j, long j2, wr0 wr0Var) {
        this.a = 5;
        this.e = context;
        this.c = j;
        this.d = j2;
        this.b = wr0Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                ((AudioRendererEventListener.EventDispatcher) obj2).lambda$decoderInitialized$1((String) obj, this.c, this.d);
                break;
            case 1:
                ((androidx.media3.exoplayer.audio.AudioRendererEventListener.EventDispatcher) obj2).lambda$decoderInitialized$1((String) obj, this.c, this.d);
                break;
            case 2:
                ((VideoRendererEventListener.EventDispatcher) obj2).lambda$decoderInitialized$1((String) obj, this.c, this.d);
                break;
            case 3:
                ((com.google.android.exoplayer2.video.VideoRendererEventListener.EventDispatcher) obj2).lambda$decoderInitialized$1((String) obj, this.c, this.d);
                break;
            case 4:
                b.a((String) obj, this.c, this.d, (b.InterfaceC0070b) obj2);
                break;
            default:
                AbstractC4305pk.b((Context) obj2, this.c, this.d, (wr0) obj);
                break;
        }
    }

    public /* synthetic */ ya(int i, long j, long j2, Object obj, String str) {
        this.a = i;
        this.e = obj;
        this.b = str;
        this.c = j;
        this.d = j2;
    }

    public /* synthetic */ ya(String str, long j, long j2, b.InterfaceC0070b interfaceC0070b) {
        this.a = 4;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = interfaceC0070b;
    }
}
