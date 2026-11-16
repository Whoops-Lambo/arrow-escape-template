package defpackage;

import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.avi.AviExtractor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ig implements SeekMap {
    public final long a;
    public final /* synthetic */ AviExtractor b;

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final boolean isSeekable() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final long getDurationUs() {
        return this.a;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j) {
        AviExtractor aviExtractor = this.b;
        SeekMap.SeekPoints seekPointsB = aviExtractor.chunkReaders[0].b(j);
        for (int i = 1; i < aviExtractor.chunkReaders.length; i++) {
            SeekMap.SeekPoints seekPointsB2 = aviExtractor.chunkReaders[i].b(j);
            if (seekPointsB2.first.position < seekPointsB.first.position) {
                seekPointsB = seekPointsB2;
            }
        }
        return seekPointsB;
    }

    public ig(AviExtractor aviExtractor, long j) {
        this.b = aviExtractor;
        this.a = j;
    }
}
