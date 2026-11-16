package defpackage;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.SeekMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class lj2 implements es1 {
    @Override // defpackage.es1
    public final void startSeek(long j) {
    }

    @Override // defpackage.es1
    public final SeekMap createSeekMap() {
        return new SeekMap.Unseekable(-9223372036854775807L);
    }

    @Override // defpackage.es1
    public final long read(ExtractorInput extractorInput) {
        return -1L;
    }
}
