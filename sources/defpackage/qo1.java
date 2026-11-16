package defpackage;

import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.TrueHdSampleRechunker;
import com.google.android.exoplayer2.extractor.mp4.Track;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class qo1 {
    public final Track a;
    public final qq2 b;
    public final TrackOutput c;
    public final TrueHdSampleRechunker d;
    public int e;

    public qo1(Track track, qq2 qq2Var, TrackOutput trackOutput) {
        TrueHdSampleRechunker trueHdSampleRechunker;
        this.a = track;
        this.b = qq2Var;
        this.c = trackOutput;
        if ("audio/true-hd".equals(track.format.sampleMimeType)) {
            trueHdSampleRechunker = new TrueHdSampleRechunker();
        } else {
            trueHdSampleRechunker = null;
        }
        this.d = trueHdSampleRechunker;
    }
}
