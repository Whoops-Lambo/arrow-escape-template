package defpackage;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.FlacSeekTableSeekMap;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class qo0 implements es1 {
    public FlacStreamMetadata a;
    public FlacStreamMetadata.SeekTable b;
    public long c;
    public long d;

    @Override // defpackage.es1
    public final SeekMap createSeekMap() {
        Assertions.checkState(this.c != -1);
        return new FlacSeekTableSeekMap(this.a, this.c);
    }

    @Override // defpackage.es1
    public final long read(ExtractorInput extractorInput) {
        long j = this.d;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.d = -1L;
        return j2;
    }

    @Override // defpackage.es1
    public final void startSeek(long j) {
        long[] jArr = this.b.pointSampleNumbers;
        this.d = jArr[Util.binarySearchFloor(jArr, j, true, true)];
    }
}
