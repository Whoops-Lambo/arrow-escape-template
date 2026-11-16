package defpackage;

import android.media.MediaCodec;
import com.google.android.exoplayer2.mediacodec.MediaCodecAdapter;
import com.google.android.exoplayer2.mediacodec.SynchronousMediaCodecAdapter;
import com.google.android.exoplayer2.mediacodec.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p9 implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p9(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((MediaCodecAdapter.OnFrameRenderedListener) obj).onFrameRendered((a) obj2, j, j2);
                break;
            case 1:
                ((SynchronousMediaCodecAdapter) obj2).lambda$setOnFrameRenderedListener$0((MediaCodecAdapter.OnFrameRenderedListener) obj, mediaCodec, j, j2);
                break;
            default:
                ((androidx.media3.exoplayer.mediacodec.SynchronousMediaCodecAdapter) obj2).lambda$setOnFrameRenderedListener$0((androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnFrameRenderedListener) obj, mediaCodec, j, j2);
                break;
        }
    }
}
