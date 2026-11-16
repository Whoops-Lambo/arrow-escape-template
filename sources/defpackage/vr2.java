package defpackage;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class vr2 {
    public final int a;
    public boolean d;
    public boolean e;
    public boolean f;
    public final TimestampAdjuster b = new TimestampAdjuster(0);
    public long g = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long i = -9223372036854775807L;
    public final ParsableByteArray c = new ParsableByteArray();

    public final void a(ExtractorInput extractorInput) {
        this.c.reset(Util.EMPTY_BYTE_ARRAY);
        this.d = true;
        extractorInput.resetPeekPosition();
    }

    public vr2(int i) {
        this.a = i;
    }
}
