package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.n30;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/animation/core/AnimationState;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/runtime/State;", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AnimationState<T, V extends AnimationVector> implements State<T> {
    public final TwoWayConverter a;
    public final ParcelableSnapshotMutableState b;
    public AnimationVector c;
    public long d;
    public long e;
    public boolean f;

    @Override // androidx.compose.runtime.State
    /* JADX INFO: renamed from: getValue */
    public final Object getA() {
        return this.b.getA();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationState(value=");
        sb.append(this.b.getA());
        sb.append(", velocity=");
        sb.append(this.a.getB().invoke(this.c));
        sb.append(", isRunning=");
        sb.append(this.f);
        sb.append(", lastFrameTimeNanos=");
        sb.append(this.d);
        sb.append(", finishedTimeNanos=");
        return n30.o(sb, this.e, ')');
    }

    public AnimationState(TwoWayConverter twoWayConverter, Object obj, AnimationVector animationVector, long j, long j2, boolean z) {
        AnimationVector animationVectorC;
        twoWayConverter.getClass();
        this.a = twoWayConverter;
        this.b = SnapshotStateKt.c(obj, StructuralEqualityPolicy.a);
        if (animationVector != null) {
            animationVectorC = AnimationVectorsKt.a(animationVector);
        } else {
            AnimationVector animationVector2 = (AnimationVector) twoWayConverter.getA().invoke(obj);
            animationVector2.getClass();
            animationVectorC = animationVector2.c();
        }
        this.c = animationVectorC;
        this.d = j;
        this.e = j2;
        this.f = z;
    }

    public /* synthetic */ AnimationState(TwoWayConverter twoWayConverter, Object obj, AnimationVector animationVector, int i) {
        this(twoWayConverter, obj, (i & 4) != 0 ? null : animationVector, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
