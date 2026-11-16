package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;
import com.unity3d.services.UnityAdsConstants;
import defpackage.n30;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/geometry/Rect;", "", "Companion", "ui-geometry_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class Rect {
    public static final Rect e = new Rect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/geometry/Rect$Companion;", "", "ui-geometry_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rect)) {
            return false;
        }
        Rect rect = (Rect) obj;
        return Float.valueOf(this.a).equals(Float.valueOf(rect.a)) && Float.valueOf(this.b).equals(Float.valueOf(rect.b)) && Float.valueOf(this.c).equals(Float.valueOf(rect.c)) && Float.valueOf(this.d).equals(Float.valueOf(rect.d));
    }

    public final float c() {
        return this.d - this.b;
    }

    public final float d() {
        return this.c - this.a;
    }

    public final Rect f(float f, float f2) {
        return new Rect(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final Rect g(long j) {
        return new Rect(Offset.c(j) + this.a, Offset.d(j) + this.b, Offset.c(j) + this.c, Offset.d(j) + this.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + n30.b(this.c, n30.b(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + GeometryUtilsKt.a(this.a) + ", " + GeometryUtilsKt.a(this.b) + ", " + GeometryUtilsKt.a(this.c) + ", " + GeometryUtilsKt.a(this.d) + ')';
    }

    public Rect(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean a(long j) {
        if (Offset.c(j) >= this.a && Offset.c(j) < this.c && Offset.d(j) >= this.b && Offset.d(j) < this.d) {
            return true;
        }
        return false;
    }

    public final long b() {
        return OffsetKt.a((d() / 2.0f) + this.a, (c() / 2.0f) + this.b);
    }

    public final boolean e(Rect rect) {
        rect.getClass();
        if (this.c <= rect.a || rect.c <= this.a || this.d <= rect.b || rect.d <= this.b) {
            return false;
        }
        return true;
    }
}
