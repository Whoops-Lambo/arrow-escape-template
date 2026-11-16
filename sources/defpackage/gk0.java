package defpackage;

import com.google.android.exoplayer2.text.ExoplayerCuesDecoder;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.SubtitleDecoder;
import com.google.android.exoplayer2.text.SubtitleOutputBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class gk0 extends SubtitleOutputBuffer {
    public final /* synthetic */ int a;
    public final /* synthetic */ SubtitleDecoder b;

    public /* synthetic */ gk0(SubtitleDecoder subtitleDecoder, int i) {
        this.a = i;
        this.b = subtitleDecoder;
    }

    @Override // com.google.android.exoplayer2.decoder.DecoderOutputBuffer
    public final void release() {
        int i = this.a;
        SubtitleDecoder subtitleDecoder = this.b;
        switch (i) {
            case 0:
                ((ExoplayerCuesDecoder) subtitleDecoder).releaseOutputBuffer(this);
                break;
            default:
                ((SimpleSubtitleDecoder) subtitleDecoder).releaseOutputBuffer(this);
                break;
        }
    }
}
