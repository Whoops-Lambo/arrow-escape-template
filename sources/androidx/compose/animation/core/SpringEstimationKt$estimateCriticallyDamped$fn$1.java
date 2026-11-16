package androidx.compose.animation.core;

import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "t", "invoke", "(D)Ljava/lang/Double;"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class SpringEstimationKt$estimateCriticallyDamped$fn$1 extends rc1 implements wr0 {
    public final /* synthetic */ double i;
    public final /* synthetic */ double j;
    public final /* synthetic */ double k;
    public final /* synthetic */ double l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpringEstimationKt$estimateCriticallyDamped$fn$1(double d, double d2, double d3, double d4) {
        super(1);
        this.i = d;
        this.j = d2;
        this.k = d3;
        this.l = d4;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        return Double.valueOf((Math.exp(this.k * dDoubleValue) * ((this.j * dDoubleValue) + this.i)) + this.l);
    }
}
