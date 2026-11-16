package defpackage;

import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class r53 extends wt0 {
    public final ParsableByteArray b;
    public final ParsableByteArray c;
    public int d;
    public boolean e;
    public boolean f;
    public int g;

    public r53(TrackOutput trackOutput) {
        super(trackOutput);
        this.b = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.c = new ParsableByteArray(4);
    }
}
