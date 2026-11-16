package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@UnstableApi
public class ForwardingExtractorOutput implements ExtractorOutput {
    private final ExtractorOutput output;

    @Override // androidx.media3.extractor.ExtractorOutput
    public void endTracks() {
        this.output.endTracks();
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void seekMap(SeekMap seekMap) {
        this.output.seekMap(seekMap);
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public TrackOutput track(int i, int i2) {
        return this.output.track(i, i2);
    }

    public ForwardingExtractorOutput(ExtractorOutput extractorOutput) {
        this.output = extractorOutput;
    }
}
