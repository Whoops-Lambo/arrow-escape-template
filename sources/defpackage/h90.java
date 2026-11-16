package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class h90 implements Extractor {
    public final Format a;

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        TrackOutput trackOutputTrack = extractorOutput.track(0, 3);
        extractorOutput.seekMap(new SeekMap.Unseekable(-9223372036854775807L));
        extractorOutput.endTracks();
        Format format = this.a;
        trackOutputTrack.format(format.buildUpon().setSampleMimeType("text/x-unknown").setCodecs(format.sampleMimeType).build());
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void seek(long j, long j2) {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean sniff(ExtractorInput extractorInput) {
        return true;
    }

    public h90(Format format) {
        this.a = format;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
        if (extractorInput.skip(Integer.MAX_VALUE) == -1) {
            return -1;
        }
        return 0;
    }
}
