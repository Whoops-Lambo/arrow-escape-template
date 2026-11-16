package defpackage;

import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.amr.AmrExtractor;
import com.google.android.exoplayer2.extractor.flac.FlacExtractor;
import com.google.android.exoplayer2.extractor.flv.FlvExtractor;
import com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.extractor.mp4.Mp4Extractor;
import com.google.android.exoplayer2.extractor.ogg.OggExtractor;
import com.google.android.exoplayer2.extractor.ts.Ac3Extractor;
import com.google.android.exoplayer2.extractor.ts.Ac4Extractor;
import com.google.android.exoplayer2.extractor.ts.AdtsExtractor;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.extractor.wav.WavExtractor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r2 implements ExtractorsFactory {
    public final /* synthetic */ int a;

    public /* synthetic */ r2(int i) {
        this.a = i;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
    public final Extractor[] createExtractors() {
        switch (this.a) {
            case 0:
                return Ac3Extractor.lambda$static$0();
            case 1:
                return Ac4Extractor.lambda$static$0();
            case 2:
                return AdtsExtractor.lambda$static$0();
            case 3:
                return AmrExtractor.lambda$static$0();
            case 4:
                return ExtractorsFactory.lambda$static$0();
            case 5:
                return FlacExtractor.lambda$static$0();
            case 6:
                return FlvExtractor.lambda$static$0();
            case 7:
                return FragmentedMp4Extractor.lambda$static$0();
            case 8:
                return MatroskaExtractor.lambda$static$0();
            case 9:
                return Mp3Extractor.lambda$static$0();
            case 10:
                return Mp4Extractor.lambda$static$0();
            case 11:
                return OggExtractor.lambda$static$0();
            case 12:
                return PsExtractor.lambda$static$0();
            case 13:
                return TsExtractor.lambda$static$0();
            default:
                return WavExtractor.lambda$static$0();
        }
    }
}
