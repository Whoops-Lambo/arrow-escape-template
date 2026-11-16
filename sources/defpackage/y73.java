package defpackage;

import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class y73 implements SeekMap {
    public final w73 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final boolean isSeekable() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final long getDurationUs() {
        return this.e;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j) {
        w73 w73Var = this.a;
        long j2 = ((long) w73Var.b) * j;
        int i = this.b;
        long j3 = this.d - 1;
        long jConstrainValue = Util.constrainValue(j2 / (((long) i) * 1000000), 0L, j3);
        int i2 = w73Var.c;
        long j4 = this.c;
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(jConstrainValue * ((long) i), 1000000L, w73Var.b);
        SeekPoint seekPoint = new SeekPoint(jScaleLargeTimestamp, (((long) i2) * jConstrainValue) + j4);
        if (jScaleLargeTimestamp >= j || jConstrainValue == j3) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        long j5 = jConstrainValue + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(Util.scaleLargeTimestamp(j5 * ((long) i), 1000000L, w73Var.b), (((long) i2) * j5) + j4));
    }

    public y73(w73 w73Var, int i, long j, long j2) {
        this.a = w73Var;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / ((long) w73Var.c);
        this.d = j3;
        this.e = Util.scaleLargeTimestamp(j3 * ((long) i), 1000000L, w73Var.b);
    }
}
