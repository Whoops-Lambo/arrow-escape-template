package defpackage;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.google.android.exoplayer2.extractor.BinarySearchSeeker;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ts.TsUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class tr2 implements BinarySearchSeeker.TimestampSeeker {
    public final TimestampAdjuster a;
    public final ParsableByteArray b = new ParsableByteArray();
    public final int c;
    public final int d;

    @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
    public final void onSeekFinished() {
        this.b.reset(Util.EMPTY_BYTE_ARRAY);
    }

    @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
    public final BinarySearchSeeker.TimestampSearchResult searchForTimestamp(ExtractorInput extractorInput, long j) throws IOException {
        int iFindSyncBytePosition;
        int iFindSyncBytePosition2;
        long position = extractorInput.getPosition();
        int iMin = (int) Math.min(this.d, extractorInput.getLength() - position);
        ParsableByteArray parsableByteArray = this.b;
        parsableByteArray.reset(iMin);
        extractorInput.peekFully(parsableByteArray.getData(), 0, iMin);
        int iLimit = parsableByteArray.limit();
        long j2 = -1;
        long j3 = -1;
        long j4 = -9223372036854775807L;
        while (parsableByteArray.bytesLeft() >= 188 && (iFindSyncBytePosition2 = (iFindSyncBytePosition = TsUtil.findSyncBytePosition(parsableByteArray.getData(), parsableByteArray.getPosition(), iLimit)) + 188) <= iLimit) {
            long pcrFromPacket = TsUtil.readPcrFromPacket(parsableByteArray, iFindSyncBytePosition, this.c);
            if (pcrFromPacket != -9223372036854775807L) {
                long jAdjustTsTimestamp = this.a.adjustTsTimestamp(pcrFromPacket);
                if (jAdjustTsTimestamp > j) {
                    return j4 == -9223372036854775807L ? BinarySearchSeeker.TimestampSearchResult.overestimatedResult(jAdjustTsTimestamp, position) : BinarySearchSeeker.TimestampSearchResult.targetFoundResult(position + j3);
                }
                if (SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US + jAdjustTsTimestamp > j) {
                    return BinarySearchSeeker.TimestampSearchResult.targetFoundResult(position + ((long) iFindSyncBytePosition));
                }
                j3 = iFindSyncBytePosition;
                j4 = jAdjustTsTimestamp;
            }
            parsableByteArray.setPosition(iFindSyncBytePosition2);
            j2 = iFindSyncBytePosition2;
        }
        return j4 != -9223372036854775807L ? BinarySearchSeeker.TimestampSearchResult.underestimatedResult(j4, position + j2) : BinarySearchSeeker.TimestampSearchResult.NO_TIMESTAMP_IN_RANGE_RESULT;
    }

    public tr2(int i, TimestampAdjuster timestampAdjuster, int i2) {
        this.c = i;
        this.a = timestampAdjuster;
        this.d = i2;
    }
}
