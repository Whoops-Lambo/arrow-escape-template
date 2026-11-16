package androidx.compose.ui.graphics.vector;

import android.graphics.Bitmap;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import defpackage.e32;
import defpackage.sr0;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorComponent;", "Landroidx/compose/ui/graphics/vector/VNode;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class VectorComponent extends VNode {
    public final GroupComponent b;
    public boolean c;
    public final DrawCache d;
    public sr0 e;
    public final ParcelableSnapshotMutableState f;
    public float g;
    public float h;
    public long i;
    public final wr0 j;

    /* JADX WARN: Code duplicated, block: B:19:0x00a6  */
    public final void e(DrawScope drawScope, float f, ColorFilter colorFilter) {
        long j;
        drawScope.getClass();
        ColorFilter colorFilter2 = colorFilter != null ? colorFilter : (ColorFilter) this.f.getA();
        boolean z = this.c;
        DrawCache drawCache = this.d;
        if (z || !Size.a(this.i, drawScope.i())) {
            float fD = Size.d(drawScope.i()) / this.g;
            GroupComponent groupComponent = this.b;
            groupComponent.m = fD;
            groupComponent.q = true;
            groupComponent.c();
            groupComponent.n = Size.b(drawScope.i()) / this.h;
            groupComponent.q = true;
            groupComponent.c();
            long jA = IntSizeKt.a((int) Math.ceil(Size.d(drawScope.i())), (int) Math.ceil(Size.b(drawScope.i())));
            LayoutDirection layoutDirection = drawScope.getLayoutDirection();
            drawCache.getClass();
            layoutDirection.getClass();
            wr0 wr0Var = this.j;
            wr0Var.getClass();
            drawCache.c = drawScope;
            AndroidImageBitmap androidImageBitmapA = drawCache.a;
            AndroidCanvas androidCanvasA = drawCache.b;
            if (androidImageBitmapA != null) {
                Bitmap bitmap = androidImageBitmapA.a;
                if (androidCanvasA != null) {
                    j = 4294967295L;
                    if (((int) (jA >> 32)) > bitmap.getWidth() || ((int) (jA & 4294967295L)) > bitmap.getHeight()) {
                    }
                } else {
                    j = 4294967295L;
                }
                androidImageBitmapA = ImageBitmapKt.a((int) (jA >> 32), (int) (jA & j), 0, 28);
                androidCanvasA = CanvasKt.a(androidImageBitmapA);
                drawCache.a = androidImageBitmapA;
                drawCache.b = androidCanvasA;
            } else {
                j = 4294967295L;
                androidImageBitmapA = ImageBitmapKt.a((int) (jA >> 32), (int) (jA & j), 0, 28);
                androidCanvasA = CanvasKt.a(androidImageBitmapA);
                drawCache.a = androidImageBitmapA;
                drawCache.b = androidCanvasA;
            }
            drawCache.d = jA;
            CanvasDrawScope canvasDrawScope = drawCache.e;
            long jB = IntSizeKt.b(jA);
            CanvasDrawScope.DrawParams drawParams = canvasDrawScope.a;
            Density density = drawParams.a;
            LayoutDirection layoutDirection2 = drawParams.b;
            Canvas canvas = drawParams.c;
            long j2 = drawParams.d;
            drawParams.a = drawScope;
            drawParams.b = layoutDirection;
            drawParams.c = androidCanvasA;
            drawParams.d = jB;
            androidCanvasA.r();
            DrawScope.M(canvasDrawScope, Color.b, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 62);
            ((VectorComponent$drawVectorBlock$1) wr0Var).invoke(canvasDrawScope);
            androidCanvasA.n();
            CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.a;
            drawParams2.getClass();
            density.getClass();
            drawParams2.a = density;
            drawParams2.a(layoutDirection2);
            canvas.getClass();
            drawParams2.c = canvas;
            drawParams2.d = j2;
            androidImageBitmapA.b();
            this.c = false;
            this.i = drawScope.i();
        }
        drawCache.getClass();
        AndroidImageBitmap androidImageBitmap = drawCache.a;
        if (androidImageBitmap != null) {
            DrawScope.u(drawScope, androidImageBitmap, 0L, drawCache.d, 0L, 0L, f, null, colorFilter2, 0, 0, 858);
        } else {
            e32.i("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
    }

    public final String toString() {
        return "Params: \tname: " + this.b.i + "\n\tviewportWidth: " + this.g + "\n\tviewportHeight: " + this.h + "\n";
    }

    public VectorComponent() {
        GroupComponent groupComponent = new GroupComponent();
        groupComponent.k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        groupComponent.q = true;
        groupComponent.c();
        groupComponent.l = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        groupComponent.q = true;
        groupComponent.c();
        groupComponent.d(new VectorComponent$root$1$1(this));
        this.b = groupComponent;
        this.c = true;
        this.d = new DrawCache();
        this.e = VectorComponent$invalidateCallback$1.i;
        this.f = SnapshotStateKt.c(null, StructuralEqualityPolicy.a);
        this.i = Size.c;
        this.j = new VectorComponent$drawVectorBlock$1(this);
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public final void a(DrawScope drawScope) {
        drawScope.getClass();
        e(drawScope, 1.0f, null);
    }
}
