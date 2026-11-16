package io.p071bidmachine.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.exoplayer.video.g;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;

    public /* synthetic */ a(k kVar, g gVar, int i) {
        this.a = i;
        this.b = gVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        int i = this.a;
        g gVar = this.b;
        switch (i) {
            case 0:
                Handler handler = gVar.a;
                if (x.a >= 30) {
                    gVar.a(j);
                } else {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                }
                break;
            default:
                Handler handler2 = gVar.a;
                if (x.a >= 30) {
                    gVar.a(j);
                } else {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                }
                break;
        }
    }
}
