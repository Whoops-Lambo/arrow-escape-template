package defpackage;

import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.ts.TsExtractor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class gr0 implements ExtractorsFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ SubtitleParser.Factory b;

    public /* synthetic */ gr0(SubtitleParser.Factory factory, int i) {
        this.a = i;
        this.b = factory;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public final Extractor[] createExtractors() {
        int i = this.a;
        SubtitleParser.Factory factory = this.b;
        switch (i) {
            case 0:
                return FragmentedMp4Extractor.lambda$newFactory$0(factory);
            case 1:
                return MatroskaExtractor.lambda$newFactory$0(factory);
            case 2:
                return Mp4Extractor.lambda$newFactory$0(factory);
            default:
                return TsExtractor.lambda$newFactory$0(factory);
        }
    }
}
