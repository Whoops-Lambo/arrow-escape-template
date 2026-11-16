package androidx.media3.exoplayer.mediacodec;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.mediacodec.MediaCodecSelector;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@UnstableApi
public interface MediaCodecSelector {
    public static final MediaCodecSelector DEFAULT;
    public static final MediaCodecSelector PREFER_SOFTWARE;

    List<MediaCodecInfo> getDecoderInfos(String str, boolean z, boolean z2) throws MediaCodecUtil.DecoderQueryException;

    static {
        final int i = 0;
        DEFAULT = new MediaCodecSelector() { // from class: pj1
            @Override // androidx.media3.exoplayer.mediacodec.MediaCodecSelector
            public final List getDecoderInfos(String str, boolean z, boolean z2) {
                switch (i) {
                    case 0:
                        return MediaCodecUtil.getDecoderInfos(str, z, z2);
                    default:
                        return MediaCodecSelector.lambda$static$0(str, z, z2);
                }
            }
        };
        final int i2 = 1;
        PREFER_SOFTWARE = new MediaCodecSelector() { // from class: pj1
            @Override // androidx.media3.exoplayer.mediacodec.MediaCodecSelector
            public final List getDecoderInfos(String str, boolean z, boolean z2) {
                switch (i2) {
                    case 0:
                        return MediaCodecUtil.getDecoderInfos(str, z, z2);
                    default:
                        return MediaCodecSelector.lambda$static$0(str, z, z2);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ List lambda$static$0(String str, boolean z, boolean z2) throws MediaCodecUtil.DecoderQueryException {
        return MediaCodecUtil.getDecoderInfosSortedBySoftwareOnly(DEFAULT.getDecoderInfos(str, z, z2));
    }
}
