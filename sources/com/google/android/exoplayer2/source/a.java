package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class a implements SampleStream {
    public final SampleStream a;
    public boolean b;
    public final /* synthetic */ ClippingMediaPeriod c;

    @Override // com.google.android.exoplayer2.source.SampleStream
    public final boolean isReady() {
        return !this.c.isPendingInitialDiscontinuity() && this.a.isReady();
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public final void maybeThrowError() throws IOException {
        this.a.maybeThrowError();
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public final int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i) {
        ClippingMediaPeriod clippingMediaPeriod = this.c;
        if (clippingMediaPeriod.isPendingInitialDiscontinuity()) {
            return -3;
        }
        if (this.b) {
            decoderInputBuffer.setFlags(4);
            return -4;
        }
        int data = this.a.readData(formatHolder, decoderInputBuffer, i);
        if (data == -5) {
            Format format = (Format) Assertions.checkNotNull(formatHolder.format);
            int i2 = format.encoderDelay;
            if (i2 == 0 && format.encoderPadding == 0) {
                return -5;
            }
            if (clippingMediaPeriod.startUs != 0) {
                i2 = 0;
            }
            formatHolder.format = format.buildUpon().setEncoderDelay(i2).setEncoderPadding(clippingMediaPeriod.endUs == Long.MIN_VALUE ? format.encoderPadding : 0).build();
            return -5;
        }
        long j = clippingMediaPeriod.endUs;
        if (j == Long.MIN_VALUE || ((data != -4 || decoderInputBuffer.timeUs < j) && !(data == -3 && clippingMediaPeriod.getBufferedPositionUs() == Long.MIN_VALUE && !decoderInputBuffer.waitingForKeys))) {
            return data;
        }
        decoderInputBuffer.clear();
        decoderInputBuffer.setFlags(4);
        this.b = true;
        return -4;
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public final int skipData(long j) {
        if (this.c.isPendingInitialDiscontinuity()) {
            return -3;
        }
        return this.a.skipData(j);
    }

    public a(ClippingMediaPeriod clippingMediaPeriod, SampleStream sampleStream) {
        this.c = clippingMediaPeriod;
        this.a = sampleStream;
    }
}
