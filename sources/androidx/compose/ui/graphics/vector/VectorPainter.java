package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class VectorPainter extends Painter {
    public final ParcelableSnapshotMutableState f = SnapshotStateKt.c(new Size(Size.b), StructuralEqualityPolicy.a);
    public final ParcelableSnapshotMutableState g = SnapshotStateKt.c(Boolean.FALSE, StructuralEqualityPolicy.a);
    public final VectorComponent h;
    public Composition i;
    public final ParcelableSnapshotMutableState j;
    public float k;
    public ColorFilter l;

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean b(float f) {
        this.k = f;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean c(ColorFilter colorFilter) {
        this.l = colorFilter;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: h */
    public final long getI() {
        return ((Size) this.f.getA()).a;
    }

    public VectorPainter() {
        VectorComponent vectorComponent = new VectorComponent();
        vectorComponent.e = new VectorPainter$vector$1$1(this);
        this.h = vectorComponent;
        this.j = SnapshotStateKt.c(Boolean.TRUE, StructuralEqualityPolicy.a);
        this.k = 1.0f;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void i(DrawScope drawScope) {
        drawScope.getClass();
        ColorFilter colorFilter = this.l;
        VectorComponent vectorComponent = this.h;
        if (colorFilter == null) {
            colorFilter = (ColorFilter) vectorComponent.f.getA();
        }
        if (((Boolean) this.g.getA()).booleanValue() && drawScope.getLayoutDirection() == LayoutDirection.b) {
            long jU = drawScope.U();
            CanvasDrawScope$drawContext$1 b = drawScope.getB();
            long jB = b.b();
            b.a().r();
            b.a.c(-1.0f, 1.0f, jU);
            vectorComponent.e(drawScope, this.k, colorFilter);
            b.a().n();
            b.c(jB);
        } else {
            vectorComponent.e(drawScope, this.k, colorFilter);
        }
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.j;
        if (((Boolean) parcelableSnapshotMutableState.getA()).booleanValue()) {
            parcelableSnapshotMutableState.setValue(Boolean.FALSE);
        }
    }

    public final void j(String str, float f, float f2, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        str.getClass();
        ComposerImpl composerImplT = composer.t(1264894527);
        VectorComponent vectorComponent = this.h;
        vectorComponent.getClass();
        GroupComponent groupComponent = vectorComponent.b;
        groupComponent.getClass();
        groupComponent.i = str;
        groupComponent.c();
        if (vectorComponent.g != f) {
            vectorComponent.g = f;
            vectorComponent.c = true;
            vectorComponent.e.invoke();
        }
        if (vectorComponent.h != f2) {
            vectorComponent.h = f2;
            vectorComponent.c = true;
            vectorComponent.e.invoke();
        }
        CompositionContext compositionContextB = ComposablesKt.b(composerImplT);
        Composition compositionImpl = this.i;
        if (compositionImpl == null || compositionImpl.getR()) {
            groupComponent.getClass();
            VectorApplier vectorApplier = new VectorApplier(groupComponent);
            compositionContextB.getClass();
            compositionImpl = new CompositionImpl(compositionContextB, vectorApplier);
        }
        this.i = compositionImpl;
        compositionImpl.n(ComposableLambdaKt.c(-1916507005, new VectorPainter$composeVector$1(composableLambdaImpl, this), true));
        EffectsKt.a(compositionImpl, new VectorPainter$RenderVector$2(compositionImpl), composerImplT);
        RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT == null) {
            return;
        }
        recomposeScopeImplT.d = new VectorPainter$RenderVector$3(this, str, f, f2, composableLambdaImpl, i);
    }
}
