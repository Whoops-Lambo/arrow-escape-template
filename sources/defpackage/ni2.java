package defpackage;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ForwardingExtractorInput;
import com.google.android.exoplayer2.util.Assertions;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class ni2 extends ForwardingExtractorInput {
    public final long a;

    @Override // com.google.android.exoplayer2.extractor.ForwardingExtractorInput, com.google.android.exoplayer2.extractor.ExtractorInput
    public final void setRetryPosition(long j, Throwable th) throws Throwable {
        super.setRetryPosition(j + this.a, th);
    }

    public ni2(ExtractorInput extractorInput, long j) {
        boolean z;
        super(extractorInput);
        if (extractorInput.getPosition() >= j) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        this.a = j;
    }

    @Override // com.google.android.exoplayer2.extractor.ForwardingExtractorInput, com.google.android.exoplayer2.extractor.ExtractorInput
    public final long getLength() {
        return super.getLength() - this.a;
    }

    @Override // com.google.android.exoplayer2.extractor.ForwardingExtractorInput, com.google.android.exoplayer2.extractor.ExtractorInput
    public final long getPeekPosition() {
        return super.getPeekPosition() - this.a;
    }

    @Override // com.google.android.exoplayer2.extractor.ForwardingExtractorInput, com.google.android.exoplayer2.extractor.ExtractorInput
    public final long getPosition() {
        return super.getPosition() - this.a;
    }
}
