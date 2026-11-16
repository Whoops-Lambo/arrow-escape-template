package androidx.media3.exoplayer.mediacodec;

import androidx.media3.common.Format;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements MediaCodecUtil.ScoreProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ Format b;

    public /* synthetic */ d(Format format, int i) {
        this.a = i;
        this.b = format;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ScoreProvider
    public final int getScore(Object obj) {
        int i = this.a;
        Format format = this.b;
        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) obj;
        switch (i) {
            case 0:
                return MediaCodecUtil.lambda$getDecoderInfosSortedByFullFormatSupport$1(format, mediaCodecInfo);
            default:
                return MediaCodecUtil.lambda$getDecoderInfosSortedByFormatSupport$0(format, mediaCodecInfo);
        }
    }
}
