package defpackage;

import com.google.android.exoplayer2.extractor.BinarySearchSeeker;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.FlacFrameReader;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class oo0 implements BinarySearchSeeker.TimestampSeeker {
    public final FlacStreamMetadata a;
    public final int b;
    public final FlacFrameReader.SampleNumberHolder c = new FlacFrameReader.SampleNumberHolder();

    public oo0(int i, FlacStreamMetadata flacStreamMetadata) {
        this.a = flacStreamMetadata;
        this.b = i;
    }

    public final long a(ExtractorInput extractorInput) throws IOException {
        FlacFrameReader.SampleNumberHolder sampleNumberHolder;
        FlacStreamMetadata flacStreamMetadata;
        while (true) {
            long peekPosition = extractorInput.getPeekPosition();
            long length = extractorInput.getLength() - 6;
            sampleNumberHolder = this.c;
            flacStreamMetadata = this.a;
            if (peekPosition >= length || FlacFrameReader.checkFrameHeaderFromPeek(extractorInput, flacStreamMetadata, this.b, sampleNumberHolder)) {
                break;
            }
            extractorInput.advancePeekPosition(1);
        }
        if (extractorInput.getPeekPosition() >= extractorInput.getLength() - 6) {
            extractorInput.advancePeekPosition((int) (extractorInput.getLength() - extractorInput.getPeekPosition()));
            return flacStreamMetadata.totalSamples;
        }
        return sampleNumberHolder.sampleNumber;
    }

    @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
    public final BinarySearchSeeker.TimestampSearchResult searchForTimestamp(ExtractorInput extractorInput, long j) throws IOException {
        long position = extractorInput.getPosition();
        long jA = a(extractorInput);
        long peekPosition = extractorInput.getPeekPosition();
        extractorInput.advancePeekPosition(Math.max(6, this.a.minFrameSize));
        long jA2 = a(extractorInput);
        long peekPosition2 = extractorInput.getPeekPosition();
        if (jA <= j && jA2 > j) {
            return BinarySearchSeeker.TimestampSearchResult.targetFoundResult(peekPosition);
        }
        if (jA2 <= j) {
            return BinarySearchSeeker.TimestampSearchResult.underestimatedResult(jA2, peekPosition2);
        }
        return BinarySearchSeeker.TimestampSearchResult.overestimatedResult(jA, position);
    }
}
