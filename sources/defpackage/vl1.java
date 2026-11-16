package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.MetadataDecoder;
import com.google.android.exoplayer2.metadata.MetadataDecoderFactory;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.google.android.exoplayer2.metadata.emsg.EventMessageDecoder;
import com.google.android.exoplayer2.metadata.icy.IcyDecoder;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.metadata.scte35.SpliceInfoDecoder;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class vl1 implements MetadataDecoderFactory {
    @Override // com.google.android.exoplayer2.metadata.MetadataDecoderFactory
    public final MetadataDecoder createDecoder(Format format) {
        String str = format.sampleMimeType;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new AppInfoTableDecoder();
                case "application/x-icy":
                    return new IcyDecoder();
                case "application/id3":
                    return new Id3Decoder();
                case "application/x-emsg":
                    return new EventMessageDecoder();
                case "application/x-scte35":
                    return new SpliceInfoDecoder();
            }
        }
        d.r(n30.y("Attempted to create decoder for unsupported MIME type: ", str));
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.MetadataDecoderFactory
    public final boolean supportsFormat(Format format) {
        String str = format.sampleMimeType;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
