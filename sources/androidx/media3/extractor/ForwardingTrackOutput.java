package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@UnstableApi
public class ForwardingTrackOutput implements TrackOutput {
    private final TrackOutput trackOutput;

    @Override // androidx.media3.extractor.TrackOutput
    public void durationUs(long j) {
        this.trackOutput.durationUs(j);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void format(Format format) {
        this.trackOutput.format(format);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public int sampleData(DataReader dataReader, int i, boolean z) throws IOException {
        return this.trackOutput.sampleData(dataReader, i, z);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleMetadata(long j, int i, int i2, int i3, @Nullable TrackOutput.CryptoData cryptoData) {
        this.trackOutput.sampleMetadata(j, i, i2, i3, cryptoData);
    }

    public ForwardingTrackOutput(TrackOutput trackOutput) {
        this.trackOutput = trackOutput;
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleData(ParsableByteArray parsableByteArray, int i) {
        this.trackOutput.sampleData(parsableByteArray, i);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public int sampleData(DataReader dataReader, int i, boolean z, int i2) throws IOException {
        return this.trackOutput.sampleData(dataReader, i, z, i2);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleData(ParsableByteArray parsableByteArray, int i, int i2) {
        this.trackOutput.sampleData(parsableByteArray, i, i2);
    }
}
