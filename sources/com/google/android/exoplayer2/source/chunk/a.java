package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class a implements TrackOutput {
    public final int a;
    public final int b;
    public final Format c;
    public final DummyTrackOutput d = new DummyTrackOutput();
    public Format e;
    public TrackOutput f;
    public long g;

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void format(Format format) {
        Format format2 = this.c;
        if (format2 != null) {
            format = format.withManifestFormatInfo(format2);
        }
        this.e = format;
        ((TrackOutput) Util.castNonNull(this.f)).format(this.e);
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final int sampleData(DataReader dataReader, int i, boolean z, int i2) {
        return ((TrackOutput) Util.castNonNull(this.f)).sampleData(dataReader, i, z);
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void sampleMetadata(long j, int i, int i2, int i3, TrackOutput.CryptoData cryptoData) {
        long j2 = this.g;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.f = this.d;
        }
        ((TrackOutput) Util.castNonNull(this.f)).sampleMetadata(j, i, i2, i3, cryptoData);
    }

    public a(int i, int i2, Format format) {
        this.a = i;
        this.b = i2;
        this.c = format;
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void sampleData(ParsableByteArray parsableByteArray, int i, int i2) {
        ((TrackOutput) Util.castNonNull(this.f)).sampleData(parsableByteArray, i);
    }
}
