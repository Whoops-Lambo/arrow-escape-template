package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.TransformOrigin;
import defpackage.pv1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/Scale;", "", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class Scale {
    public final long a;
    public final FiniteAnimationSpec b;

    public final String toString() {
        return "Scale(scale=0.92, transformOrigin=" + ((Object) TransformOrigin.a(this.a)) + ", animationSpec=" + this.b + ')';
    }

    public Scale(long j, FiniteAnimationSpec finiteAnimationSpec) {
        this.a = j;
        this.b = finiteAnimationSpec;
    }

    public final boolean equals(Object obj) {
        Object objValueOf = Float.valueOf(0.92f);
        if (this != obj) {
            if (obj instanceof Scale) {
                Scale scale = (Scale) obj;
                if (objValueOf.equals(objValueOf)) {
                    long j = scale.a;
                    int i = TransformOrigin.c;
                    if (this.a == j && this.b.equals(scale.b)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(0.92f) * 31;
        int i = TransformOrigin.c;
        return this.b.hashCode() + pv1.d(iHashCode, 31, this.a);
    }
}
