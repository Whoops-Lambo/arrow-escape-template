package androidx.media3.exoplayer.mediacodec;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements MediaCodecUtil.ScoreProvider {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i) {
        this.a = i;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ScoreProvider
    public final int getScore(Object obj) {
        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) obj;
        switch (this.a) {
            case 0:
                return MediaCodecUtil.lambda$getDecoderInfosSortedBySoftwareOnly$2(mediaCodecInfo);
            default:
                return MediaCodecUtil.lambda$applyWorkarounds$3(mediaCodecInfo);
        }
    }
}
