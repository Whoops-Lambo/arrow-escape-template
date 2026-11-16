package defpackage;

import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.extractor.jpeg.StartOffsetExtractorOutput;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class oi2 implements SeekMap {
    public final /* synthetic */ SeekMap a;
    public final /* synthetic */ StartOffsetExtractorOutput b;

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final long getDurationUs() {
        return this.a.getDurationUs();
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j) {
        SeekMap.SeekPoints seekPoints = this.a.getSeekPoints(j);
        SeekPoint seekPoint = seekPoints.first;
        long j2 = seekPoint.timeUs;
        long j3 = seekPoint.position;
        StartOffsetExtractorOutput startOffsetExtractorOutput = this.b;
        SeekPoint seekPoint2 = new SeekPoint(j2, startOffsetExtractorOutput.startOffset + j3);
        SeekPoint seekPoint3 = seekPoints.second;
        return new SeekMap.SeekPoints(seekPoint2, new SeekPoint(seekPoint3.timeUs, startOffsetExtractorOutput.startOffset + seekPoint3.position));
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final boolean isSeekable() {
        return this.a.isSeekable();
    }

    public oi2(StartOffsetExtractorOutput startOffsetExtractorOutput, SeekMap seekMap) {
        this.b = startOffsetExtractorOutput;
        this.a = seekMap;
    }
}
