package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/animation/core/TwoWayConverterImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class TwoWayConverterImpl<T, V extends AnimationVector> implements TwoWayConverter<T, V> {
    public final wr0 a;
    public final wr0 b;

    @Override // androidx.compose.animation.core.TwoWayConverter
    /* JADX INFO: renamed from: a, reason: from getter */
    public final wr0 getA() {
        return this.a;
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    /* JADX INFO: renamed from: b, reason: from getter */
    public final wr0 getB() {
        return this.b;
    }

    public TwoWayConverterImpl(wr0 wr0Var, wr0 wr0Var2) {
        wr0Var.getClass();
        wr0Var2.getClass();
        this.a = wr0Var;
        this.b = wr0Var2;
    }
}
