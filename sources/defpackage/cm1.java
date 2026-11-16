package defpackage;

import android.os.HandlerThread;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.HandlerWrapper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class cm1 {
    public final MediaSource.Factory a;
    public final HandlerThread b;
    public final HandlerWrapper c;
    public final lc2 d;

    public cm1(MediaSource.Factory factory, Clock clock) {
        this.a = factory;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:MetadataRetriever");
        this.b = handlerThread;
        handlerThread.start();
        this.c = clock.createHandler(handlerThread.getLooper(), new bm1(this));
        this.d = new lc2();
    }
}
