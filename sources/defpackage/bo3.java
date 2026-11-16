package defpackage;

import android.util.Range;
import com.google.android.gms.internal.ads.zzgvz;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class bo3 {
    public long a;
    public long b;
    public double c;
    public Range d;

    public final void b(float f) {
        zzgvz.a(f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f)));
        c();
    }

    public final void c() {
        this.c = ((Double) this.d.getUpper()).doubleValue();
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }

    public bo3() {
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d));
        this.d = range;
        this.c = ((Double) range.getUpper()).doubleValue();
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0031  */
    public final void a(long j, long j2) {
        boolean z;
        double dDoubleValue;
        boolean z2 = false;
        if (j != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        zzgvz.a(z);
        if (j2 != -9223372036854775807L) {
            z2 = true;
        }
        zzgvz.a(z2);
        long j3 = this.a;
        if (j3 != -9223372036854775807L) {
            long j4 = this.b;
            if (j4 != -9223372036854775807L && j != j3) {
                dDoubleValue = (j2 - j4) / (j - j3);
            } else {
                dDoubleValue = ((Double) this.d.getUpper()).doubleValue();
            }
        } else {
            dDoubleValue = ((Double) this.d.getUpper()).doubleValue();
        }
        this.c = (((Double) this.d.clamp(Double.valueOf(dDoubleValue))).doubleValue() * 0.20000000298023224d) + (this.c * 0.800000011920929d);
        this.a = j;
        this.b = j2;
    }
}
