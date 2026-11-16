package androidx.compose.ui.node;

import androidx.compose.ui.draw.BuildDrawCacheParams;
import androidx.compose.ui.draw.DrawCacheModifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.sr0;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/node/DrawEntity;", "Landroidx/compose/ui/node/LayoutNodeEntity;", "Landroidx/compose/ui/draw/DrawModifier;", "Landroidx/compose/ui/node/OwnerScope;", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class DrawEntity extends LayoutNodeEntity<DrawEntity, DrawModifier> implements OwnerScope {
    public static final wr0 i = null;
    public DrawCacheModifier e;
    public final DrawEntity$buildCacheParams$1 f;
    public boolean g;
    public final sr0 h;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/DrawEntity$Companion;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/node/DrawEntity;", "Laz2;", "onCommitAffectingDrawEntity", "Lwr0;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // androidx.compose.ui.node.LayoutNodeEntity
    public final void a() {
        DrawModifier drawModifier = (DrawModifier) this.b;
        this.e = drawModifier instanceof DrawCacheModifier ? (DrawCacheModifier) drawModifier : null;
        this.g = true;
        this.d = true;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public final boolean isValid() {
        return this.a.s();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.node.DrawEntity$buildCacheParams$1] */
    public DrawEntity(final LayoutNodeWrapper layoutNodeWrapper, DrawModifier drawModifier) {
        DrawCacheModifier drawCacheModifier;
        super(layoutNodeWrapper, drawModifier);
        layoutNodeWrapper.getClass();
        drawModifier.getClass();
        DrawModifier drawModifier2 = drawModifier;
        if (drawModifier2 instanceof DrawCacheModifier) {
            drawCacheModifier = (DrawCacheModifier) drawModifier2;
        } else {
            drawCacheModifier = null;
        }
        this.e = drawCacheModifier;
        this.f = new BuildDrawCacheParams() { // from class: androidx.compose.ui.node.DrawEntity$buildCacheParams$1
            public final Density a;

            @Override // androidx.compose.ui.draw.BuildDrawCacheParams
            /* JADX INFO: renamed from: getDensity, reason: from getter */
            public final Density getA() {
                return this.a;
            }

            @Override // androidx.compose.ui.draw.BuildDrawCacheParams
            public final LayoutDirection getLayoutDirection() {
                return this.b.a.e.r;
            }

            @Override // androidx.compose.ui.draw.BuildDrawCacheParams
            public final long i() {
                return IntSizeKt.b(layoutNodeWrapper.c);
            }

            {
                this.a = this.b.a.e.p;
            }
        };
        this.g = true;
        this.h = new DrawEntity$updateCache$1(this);
    }

    public final void c(Canvas canvas) {
        canvas.getClass();
        LayoutNodeWrapper layoutNodeWrapper = this.a;
        long j = layoutNodeWrapper.c;
        LayoutNode layoutNode = layoutNodeWrapper.e;
        long jB = IntSizeKt.b(j);
        if (this.e != null && this.g) {
            LayoutNodeKt.a(layoutNode).getSnapshotObserver().b(this, DrawEntity$Companion$onCommitAffectingDrawEntity$1.i, this.h);
        }
        layoutNode.getClass();
        LayoutNodeDrawScope sharedDrawScope = LayoutNodeKt.a(layoutNode).getSharedDrawScope();
        DrawEntity drawEntity = sharedDrawScope.b;
        sharedDrawScope.b = this;
        CanvasDrawScope canvasDrawScope = sharedDrawScope.a;
        MeasureScope measureScopeN0 = layoutNodeWrapper.N0();
        LayoutDirection layoutDirection = layoutNodeWrapper.N0().getLayoutDirection();
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.a;
        Density density = drawParams.a;
        LayoutDirection layoutDirection2 = drawParams.b;
        Canvas canvas2 = drawParams.c;
        long j2 = drawParams.d;
        measureScopeN0.getClass();
        drawParams.a = measureScopeN0;
        drawParams.a(layoutDirection);
        drawParams.c = canvas;
        drawParams.d = jB;
        canvas.r();
        ((DrawModifier) this.b).f0(sharedDrawScope);
        canvas.n();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.a;
        drawParams2.getClass();
        density.getClass();
        drawParams2.a = density;
        drawParams2.a(layoutDirection2);
        canvas2.getClass();
        drawParams2.c = canvas2;
        drawParams2.d = j2;
        sharedDrawScope.b = drawEntity;
    }
}
