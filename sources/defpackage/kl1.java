package defpackage;

import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.SampleStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class kl1 implements SampleStream {
    public final SampleStream a;
    public final long b;

    @Override // com.google.android.exoplayer2.source.SampleStream
    public final boolean isReady() {
        return this.a.isReady();
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public final void maybeThrowError() throws IOException {
        this.a.maybeThrowError();
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public final int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i) {
        int data = this.a.readData(formatHolder, decoderInputBuffer, i);
        if (data == -4) {
            decoderInputBuffer.timeUs = Math.max(0L, decoderInputBuffer.timeUs + this.b);
        }
        return data;
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public final int skipData(long j) {
        return this.a.skipData(j - this.b);
    }

    public kl1(SampleStream sampleStream, long j) {
        this.a = sampleStream;
        this.b = j;
    }
}
