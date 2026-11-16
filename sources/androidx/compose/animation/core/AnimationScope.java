package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.sr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/animation/core/AnimationScope;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AnimationScope<T, V extends AnimationVector> {
    public final TwoWayConverter a;
    public final Object b;
    public final long c;
    public final sr0 d;
    public final ParcelableSnapshotMutableState e;
    public AnimationVector f;
    public long g;
    public long h;
    public final ParcelableSnapshotMutableState i;

    public final void a() {
        this.i.setValue(Boolean.FALSE);
        this.d.invoke();
    }

    public AnimationScope(Object obj, TwoWayConverter twoWayConverter, AnimationVector animationVector, long j, Object obj2, long j2, sr0 sr0Var) {
        twoWayConverter.getClass();
        animationVector.getClass();
        this.a = twoWayConverter;
        this.b = obj2;
        this.c = j2;
        this.d = sr0Var;
        this.e = SnapshotStateKt.c(obj, StructuralEqualityPolicy.a);
        this.f = AnimationVectorsKt.a(animationVector);
        this.g = j;
        this.h = Long.MIN_VALUE;
        this.i = SnapshotStateKt.c(Boolean.TRUE, StructuralEqualityPolicy.a);
    }
}
