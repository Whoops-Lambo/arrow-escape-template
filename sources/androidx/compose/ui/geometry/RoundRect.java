package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;
import defpackage.h50;
import defpackage.n30;
import defpackage.pv1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/geometry/RoundRect;", "", "Companion", "ui-geometry_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class RoundRect {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/geometry/RoundRect$Companion;", "", "ui-geometry_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundRect)) {
            return false;
        }
        RoundRect roundRect = (RoundRect) obj;
        return Float.valueOf(this.a).equals(Float.valueOf(roundRect.a)) && Float.valueOf(this.b).equals(Float.valueOf(roundRect.b)) && Float.valueOf(this.c).equals(Float.valueOf(roundRect.c)) && Float.valueOf(this.d).equals(Float.valueOf(roundRect.d)) && CornerRadius.a(this.e, roundRect.e) && CornerRadius.a(this.f, roundRect.f) && CornerRadius.a(this.g, roundRect.g) && CornerRadius.a(this.h, roundRect.h);
    }

    static {
        long j = CornerRadius.a;
        CornerRadiusKt.a(CornerRadius.b(j), CornerRadius.c(j));
    }

    public final float a() {
        return this.d - this.b;
    }

    public final float b() {
        return this.c - this.a;
    }

    public final int hashCode() {
        int iB = n30.b(this.d, n30.b(this.c, n30.b(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
        int i = CornerRadius.b;
        return Long.hashCode(this.h) + pv1.d(pv1.d(pv1.d(iB, 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        String str = GeometryUtilsKt.a(this.a) + ", " + GeometryUtilsKt.a(this.b) + ", " + GeometryUtilsKt.a(this.c) + ", " + GeometryUtilsKt.a(this.d);
        long j = this.e;
        long j2 = this.f;
        boolean zA = CornerRadius.a(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (!zA || !CornerRadius.a(j2, j3) || !CornerRadius.a(j3, j4)) {
            StringBuilder sbR = h50.r("RoundRect(rect=", str, ", topLeft=");
            sbR.append((Object) CornerRadius.d(j));
            sbR.append(", topRight=");
            sbR.append((Object) CornerRadius.d(j2));
            sbR.append(", bottomRight=");
            sbR.append((Object) CornerRadius.d(j3));
            sbR.append(", bottomLeft=");
            sbR.append((Object) CornerRadius.d(j4));
            sbR.append(')');
            return sbR.toString();
        }
        if (CornerRadius.b(j) == CornerRadius.c(j)) {
            StringBuilder sbR2 = h50.r("RoundRect(rect=", str, ", radius=");
            sbR2.append(GeometryUtilsKt.a(CornerRadius.b(j)));
            sbR2.append(')');
            return sbR2.toString();
        }
        StringBuilder sbR3 = h50.r("RoundRect(rect=", str, ", x=");
        sbR3.append(GeometryUtilsKt.a(CornerRadius.b(j)));
        sbR3.append(", y=");
        sbR3.append(GeometryUtilsKt.a(CornerRadius.c(j)));
        sbR3.append(')');
        return sbR3.toString();
    }

    public RoundRect(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }
}
