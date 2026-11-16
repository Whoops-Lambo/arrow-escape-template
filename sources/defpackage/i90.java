package defpackage;

import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Util;
import com.inmobi.media.core.config.models.CrashConfig;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class i90 implements SeekMap {
    public final /* synthetic */ j90 a;

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final boolean isSeekable() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final long getDurationUs() {
        j90 j90Var = this.a;
        return (j90Var.f * 1000000) / ((long) j90Var.d.i);
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j) {
        j90 j90Var = this.a;
        long j2 = (((long) j90Var.d.i) * j) / 1000000;
        long j3 = j90Var.b;
        long j4 = j90Var.c;
        return new SeekMap.SeekPoints(new SeekPoint(j, Util.constrainValue(((((j4 - j3) * j2) / j90Var.f) + j3) - CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, j3, j4 - 1)));
    }

    public i90(j90 j90Var) {
        this.a = j90Var;
    }
}
