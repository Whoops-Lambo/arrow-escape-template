package io.p071bidmachine.media3.extractor.ogg;

import com.inmobi.media.core.config.models.CrashConfig;
import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.extractor.a0;
import io.p071bidmachine.media3.extractor.y;
import io.p071bidmachine.media3.extractor.z;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class a implements z {
    public final /* synthetic */ b a;

    @Override // io.p071bidmachine.media3.extractor.z
    public final boolean isSeekable() {
        return true;
    }

    @Override // io.p071bidmachine.media3.extractor.z
    public final long getDurationUs() {
        b bVar = this.a;
        return (bVar.d * 1000000) / ((long) ((g) bVar.l).e);
    }

    @Override // io.p071bidmachine.media3.extractor.z
    public final y getSeekPoints(long j) {
        b bVar = this.a;
        long j2 = (((long) ((g) bVar.l).e) * j) / 1000000;
        long j3 = bVar.a;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(j2);
        long j4 = bVar.b;
        a0 a0Var = new a0(j, x.i((bigIntegerValueOf.multiply(BigInteger.valueOf(j4 - j3)).divide(BigInteger.valueOf(bVar.d)).longValue() + j3) - CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, bVar.a, j4 - 1));
        return new y(a0Var, a0Var);
    }

    public a(b bVar) {
        this.a = bVar;
    }
}
