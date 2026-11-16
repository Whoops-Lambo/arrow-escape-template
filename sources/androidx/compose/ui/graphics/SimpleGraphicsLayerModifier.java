package androidx.compose.ui.graphics;

import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectorValueInfo;
import com.unity3d.services.UnityAdsConstants;
import defpackage.hg0;
import defpackage.jc1;
import defpackage.n30;
import defpackage.pv1;
import defpackage.s71;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class SimpleGraphicsLayerModifier extends InspectorValueInfo implements LayoutModifier {
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final long h;
    public final Shape i;
    public final boolean j;
    public final long k;
    public final long l;
    public final wr0 m;

    public final boolean equals(Object obj) {
        SimpleGraphicsLayerModifier simpleGraphicsLayerModifier = obj instanceof SimpleGraphicsLayerModifier ? (SimpleGraphicsLayerModifier) obj : null;
        if (simpleGraphicsLayerModifier != null && this.b == simpleGraphicsLayerModifier.b && this.c == simpleGraphicsLayerModifier.c && this.d == simpleGraphicsLayerModifier.d && this.e == simpleGraphicsLayerModifier.e && this.f == simpleGraphicsLayerModifier.f && this.g == simpleGraphicsLayerModifier.g) {
            long j = simpleGraphicsLayerModifier.h;
            int i = TransformOrigin.c;
            if (this.h == j && s71.b(this.i, simpleGraphicsLayerModifier.i) && this.j == simpleGraphicsLayerModifier.j && Color.c(this.k, simpleGraphicsLayerModifier.k) && Color.c(this.l, simpleGraphicsLayerModifier.l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iB = n30.b(this.g, n30.b(this.f, n30.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, n30.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, n30.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, n30.b(this.e, n30.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, n30.b(this.d, n30.b(this.c, Float.hashCode(this.b) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = TransformOrigin.c;
        int iF = jc1.f((this.i.hashCode() + pv1.d(iB, 31, this.h)) * 31, 961, this.j);
        int i2 = Color.j;
        return Long.hashCode(this.l) + pv1.d(iF, 31, this.k);
    }

    public final String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.b + ", scaleY=" + this.c + ", alpha = " + this.d + ", translationX=0.0, translationY=" + this.e + ", shadowElevation=0.0, rotationX=0.0, rotationY=0.0, rotationZ=" + this.f + ", cameraDistance=" + this.g + ", transformOrigin=" + ((Object) TransformOrigin.a(this.h)) + ", shape=" + this.i + ", clip=" + this.j + ", renderEffect=null, ambientShadowColor=" + ((Object) Color.i(this.k)) + ", spotShadowColor=" + ((Object) Color.i(this.l)) + ')';
    }

    public SimpleGraphicsLayerModifier(float f, float f2, float f3, float f4, float f5, long j, Shape shape, boolean z, long j2, long j3, wr0 wr0Var) {
        super(wr0Var);
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = 8.0f;
        this.h = j;
        this.i = shape;
        this.j = z;
        this.k = j2;
        this.l = j3;
        this.m = new SimpleGraphicsLayerModifier$layerBlock$1(this);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final MeasureResult s(MeasureScope measureScope, Measurable measurable, long j) {
        measureScope.getClass();
        measurable.getClass();
        Placeable placeableY = measurable.Y(j);
        return measureScope.C(placeableY.a, placeableY.b, hg0.a, new SimpleGraphicsLayerModifier$measure$1(placeableY, this));
    }
}
