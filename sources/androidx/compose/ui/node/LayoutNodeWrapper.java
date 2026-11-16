package androidx.compose.ui.node;

import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.GraphicsLayerScopeKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.ads.RequestConfiguration;
import com.unity3d.services.UnityAdsConstants;
import defpackage.az2;
import defpackage.d;
import defpackage.e32;
import defpackage.n8;
import defpackage.rc1;
import defpackage.s71;
import defpackage.sr0;
import defpackage.wr0;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005:\u0002\b\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeWrapper;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/node/OwnerScope;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "Laz2;", "Companion", "HitTestSource", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class LayoutNodeWrapper extends Placeable implements Measurable, LayoutCoordinates, OwnerScope, wr0 {
    public static final LayoutNodeWrapper$Companion$SemanticsSource$1 A;
    public static final wr0 w = null;
    public static final wr0 x = null;
    public static final ReusableGraphicsLayerScope y;
    public static final LayoutNodeWrapper$Companion$PointerInputSource$1 z;
    public final LayoutNode e;
    public LayoutNodeWrapper f;
    public boolean g;
    public wr0 h;
    public Density i;
    public LayoutDirection j;
    public float k;
    public boolean l;
    public MeasureResult m;
    public LinkedHashMap n;
    public long o;
    public float p;
    public boolean q;
    public MutableRect r;
    public final LayoutNodeEntity[] s;
    public final sr0 t;
    public boolean u;
    public OwnedLayer v;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeWrapper$Companion;", "", "", "ExpectAttachedLayoutCoordinates", "Ljava/lang/String;", "UnmeasuredError", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "graphicsLayerScope", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "Lkotlin/Function1;", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "Laz2;", "onCommitAffectingLayer", "Lwr0;", "onCommitAffectingLayerParams", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b`\u0018\u0000*\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0001*\u0004\b\u0001\u0010\u0003*\b\b\u0002\u0010\u0005*\u00020\u00042\u00020\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeWrapper$HitTestSource;", "Landroidx/compose/ui/node/LayoutNodeEntity;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "C", "Landroidx/compose/ui/Modifier;", "M", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface HitTestSource<T extends LayoutNodeEntity<T, M>, C, M extends Modifier> {
        int a();

        Object b(LayoutNodeEntity layoutNodeEntity);

        boolean c(LayoutNodeEntity layoutNodeEntity);

        void d(LayoutNode layoutNode, long j, HitTestResult hitTestResult, boolean z, boolean z2);

        boolean e(LayoutNode layoutNode);
    }

    /* JADX INFO: renamed from: androidx.compose.ui.node.LayoutNodeWrapper$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Laz2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    final class AnonymousClass1 extends rc1 implements sr0 {
        public final /* synthetic */ Canvas j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Canvas canvas) {
            super(0);
            this.j = canvas;
        }

        @Override // defpackage.sr0
        public final Object invoke() {
            wr0 wr0Var = LayoutNodeWrapper.w;
            LayoutNodeWrapper layoutNodeWrapper = LayoutNodeWrapper.this;
            DrawEntity drawEntity = (DrawEntity) layoutNodeWrapper.s[0];
            Canvas canvas = this.j;
            if (drawEntity == null) {
                layoutNodeWrapper.Z0(canvas);
            } else {
                drawEntity.c(canvas);
            }
            return az2.a;
        }
    }

    public final void D0() {
        this.l = true;
        W0(this.h);
        for (LayoutNodeEntity layoutNodeEntity : this.s) {
            for (; layoutNodeEntity != null; layoutNodeEntity = layoutNodeEntity.c) {
                layoutNodeEntity.a();
            }
        }
    }

    public abstract int E0(AlignmentLine alignmentLine);

    public abstract MeasureScope N0();

    public LayoutNodeWrapper Q0() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00db, code lost:
    
        if (androidx.compose.ui.node.DistanceAndInLayer.a(r17.c(), androidx.compose.ui.node.HitTestResultKt.a(r8, r19)) > 0) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S0(androidx.compose.ui.node.LayoutNodeWrapper.HitTestSource r14, long r15, androidx.compose.ui.node.HitTestResult r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNodeWrapper.S0(androidx.compose.ui.node.LayoutNodeWrapper$HitTestSource, long, androidx.compose.ui.node.HitTestResult, boolean, boolean):void");
    }

    static {
        ReusableGraphicsLayerScope reusableGraphicsLayerScope = new ReusableGraphicsLayerScope();
        reusableGraphicsLayerScope.a = 1.0f;
        reusableGraphicsLayerScope.b = 1.0f;
        reusableGraphicsLayerScope.c = 1.0f;
        long j = GraphicsLayerScopeKt.a;
        reusableGraphicsLayerScope.f = j;
        reusableGraphicsLayerScope.g = j;
        reusableGraphicsLayerScope.i = 8.0f;
        reusableGraphicsLayerScope.j = TransformOrigin.b;
        reusableGraphicsLayerScope.k = RectangleShapeKt.a;
        reusableGraphicsLayerScope.m = DensityKt.b();
        y = reusableGraphicsLayerScope;
        z = new LayoutNodeWrapper$Companion$PointerInputSource$1();
        A = new LayoutNodeWrapper$Companion$SemanticsSource$1();
    }

    public final long C0(LayoutNodeWrapper layoutNodeWrapper, long j) {
        if (layoutNodeWrapper == this) {
            return j;
        }
        LayoutNodeWrapper layoutNodeWrapper2 = this.f;
        return (layoutNodeWrapper2 == null || s71.b(layoutNodeWrapper, layoutNodeWrapper2)) ? L0(j) : L0(layoutNodeWrapper2.C0(layoutNodeWrapper, j));
    }

    public final void G0() {
        for (LayoutNodeEntity layoutNodeEntity : this.s) {
            for (; layoutNodeEntity != null; layoutNodeEntity = layoutNodeEntity.c) {
                layoutNodeEntity.b();
            }
        }
        this.l = false;
        W0(this.h);
        LayoutNode layoutNodeS = this.e.s();
        if (layoutNodeS != null) {
            layoutNodeS.x();
        }
    }

    public final long L0(long j) {
        long j2 = this.o;
        float fC = Offset.c(j);
        int i = IntOffset.c;
        long jA = OffsetKt.a(fC - ((int) (j2 >> 32)), Offset.d(j) - ((int) (j2 & 4294967295L)));
        OwnedLayer ownedLayer = this.v;
        return ownedLayer != null ? ownedLayer.c(jA, true) : jA;
    }

    public final MeasureResult M0() {
        MeasureResult measureResult = this.m;
        if (measureResult != null) {
            return measureResult;
        }
        e32.i("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    public final long O0() {
        return this.i.mo8toSizeXkaWNTQ(this.e.s.d());
    }

    public final Object P0(SimpleEntity simpleEntity) {
        if (simpleEntity != null) {
            return ((ParentDataModifier) simpleEntity.b).t0(N0(), P0((SimpleEntity) simpleEntity.c));
        }
        LayoutNodeWrapper layoutNodeWrapperQ0 = Q0();
        if (layoutNodeWrapperQ0 != null) {
            return layoutNodeWrapperQ0.getM();
        }
        return null;
    }

    public final void R0(LayoutNodeEntity layoutNodeEntity, HitTestSource hitTestSource, long j, HitTestResult hitTestResult, boolean z2, boolean z3, float f) {
        if (layoutNodeEntity == null) {
            T0(hitTestSource, j, hitTestResult, z2, z3);
        } else {
            hitTestResult.d(hitTestSource.b(layoutNodeEntity), f, z3, new LayoutNodeWrapper$hitNear$1(this, layoutNodeEntity, hitTestSource, j, hitTestResult, z2, z3, f));
        }
    }

    public final void U0() {
        OwnedLayer ownedLayer = this.v;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
            return;
        }
        LayoutNodeWrapper layoutNodeWrapper = this.f;
        if (layoutNodeWrapper != null) {
            layoutNodeWrapper.U0();
        }
    }

    public final boolean V0() {
        if (this.v != null && this.k <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return true;
        }
        LayoutNodeWrapper layoutNodeWrapper = this.f;
        if (layoutNodeWrapper != null) {
            return layoutNodeWrapper.V0();
        }
        return false;
    }

    public final void W0(wr0 wr0Var) {
        Owner owner;
        wr0 wr0Var2 = this.h;
        LayoutNode layoutNode = this.e;
        boolean z2 = (wr0Var2 == wr0Var && s71.b(this.i, layoutNode.p) && this.j == layoutNode.r) ? false : true;
        this.h = wr0Var;
        this.i = layoutNode.p;
        this.j = layoutNode.r;
        boolean zS = s();
        sr0 sr0Var = this.t;
        if (!zS || wr0Var == null) {
            OwnedLayer ownedLayer = this.v;
            if (ownedLayer != null) {
                ownedLayer.destroy();
                layoutNode.H = true;
                ((LayoutNodeWrapper$invalidateParentLayer$1) sr0Var).invoke();
                if (s() && (owner = layoutNode.g) != null) {
                    owner.i(layoutNode);
                }
            }
            this.v = null;
            this.u = false;
            return;
        }
        if (this.v != null) {
            if (z2) {
                f1();
                return;
            }
            return;
        }
        OwnedLayer ownedLayerE = LayoutNodeKt.a(layoutNode).e(this, sr0Var);
        ownedLayerE.d(this.c);
        ownedLayerE.h(this.o);
        this.v = ownedLayerE;
        f1();
        layoutNode.H = true;
        ((LayoutNodeWrapper$invalidateParentLayer$1) sr0Var).invoke();
    }

    public final void X0() {
        LayoutNodeEntity[] layoutNodeEntityArr = this.s;
        if (EntityList.b(layoutNodeEntityArr, 5)) {
            Snapshot snapshotA = Snapshot.Companion.a();
            try {
                Snapshot snapshotI = snapshotA.i();
                try {
                    for (LayoutNodeEntity layoutNodeEntity = layoutNodeEntityArr[5]; layoutNodeEntity != null; layoutNodeEntity = layoutNodeEntity.c) {
                        ((OnRemeasuredModifier) ((SimpleEntity) layoutNodeEntity).b).Y(this.c);
                    }
                    Snapshot.o(snapshotI);
                    snapshotA.c();
                } catch (Throwable th) {
                    Snapshot.o(snapshotI);
                    throw th;
                }
            } catch (Throwable th2) {
                snapshotA.c();
                throw th2;
            }
        }
    }

    public void Y0() {
        OwnedLayer ownedLayer = this.v;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    /* JADX INFO: renamed from: a */
    public final Object getM() {
        return P0((SimpleEntity) this.s[3]);
    }

    public final void a1(MutableRect mutableRect, boolean z2, boolean z3) {
        OwnedLayer ownedLayer = this.v;
        if (ownedLayer != null) {
            if (this.g) {
                if (z3) {
                    long jO0 = O0();
                    float fD = Size.d(jO0) / 2.0f;
                    float fB = Size.b(jO0) / 2.0f;
                    long j = this.c;
                    mutableRect.a(-fD, -fB, ((int) (j >> 32)) + fD, ((int) (j & 4294967295L)) + fB);
                } else if (z2) {
                    long j2 = this.c;
                    mutableRect.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (int) (j2 >> 32), (int) (j2 & 4294967295L));
                }
                if (mutableRect.b()) {
                    return;
                }
            }
            ownedLayer.a(mutableRect, false);
        }
        long j3 = this.o;
        int i = IntOffset.c;
        float f = (int) (j3 >> 32);
        mutableRect.a += f;
        mutableRect.c += f;
        float f2 = (int) (j3 & 4294967295L);
        mutableRect.b += f2;
        mutableRect.d += f2;
    }

    public final boolean c1() {
        LayoutNodeWrapper layoutNodeWrapperQ0;
        PointerInputEntity pointerInputEntity = (PointerInputEntity) this.s[1];
        return (pointerInputEntity != null && pointerInputEntity.c()) || ((layoutNodeWrapperQ0 = Q0()) != null && layoutNodeWrapperQ0.c1());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final long d() {
        return this.c;
    }

    public final void d1(LayoutNodeEntity layoutNodeEntity, HitTestSource hitTestSource, long j, HitTestResult hitTestResult, boolean z2, boolean z3, float f) {
        if (layoutNodeEntity == null) {
            T0(hitTestSource, j, hitTestResult, z2, z3);
            return;
        }
        if (!hitTestSource.c(layoutNodeEntity)) {
            d1(layoutNodeEntity.c, hitTestSource, j, hitTestResult, z2, z3, f);
            return;
        }
        Object objB = hitTestSource.b(layoutNodeEntity);
        LayoutNodeWrapper$speculativeHit$1 layoutNodeWrapper$speculativeHit$1 = new LayoutNodeWrapper$speculativeHit$1(this, layoutNodeEntity, hitTestSource, j, hitTestResult, z2, z3, f);
        hitTestResult.getClass();
        if (hitTestResult.c == hitTestResult.d - 1) {
            hitTestResult.d(objB, f, z3, layoutNodeWrapper$speculativeHit$1);
            if (hitTestResult.c + 1 == hitTestResult.d - 1) {
                hitTestResult.e();
                return;
            }
            return;
        }
        long jC = hitTestResult.c();
        int i = hitTestResult.c;
        hitTestResult.c = hitTestResult.d - 1;
        hitTestResult.d(objB, f, z3, layoutNodeWrapper$speculativeHit$1);
        if (hitTestResult.c + 1 < hitTestResult.d - 1 && DistanceAndInLayer.a(jC, hitTestResult.c()) > 0) {
            int i2 = hitTestResult.c + 1;
            int i3 = i + 1;
            Object[] objArr = hitTestResult.a;
            n8.P(i3, i2, hitTestResult.d, objArr, objArr);
            long[] jArr = hitTestResult.b;
            System.arraycopy(jArr, i2, jArr, i3, hitTestResult.d - i2);
            hitTestResult.c = ((hitTestResult.d + i) - hitTestResult.c) - 1;
        }
        hitTestResult.e();
        hitTestResult.c = i;
    }

    public final long e1(long j) {
        OwnedLayer ownedLayer = this.v;
        if (ownedLayer != null) {
            j = ownedLayer.c(j, false);
        }
        long j2 = this.o;
        float fC = Offset.c(j);
        int i = IntOffset.c;
        return OffsetKt.a(fC + ((int) (j2 >> 32)), Offset.d(j) + ((int) (j2 & 4294967295L)));
    }

    public final void f1() {
        LayoutNodeWrapper layoutNodeWrapper;
        ReusableGraphicsLayerScope reusableGraphicsLayerScope;
        OwnedLayer ownedLayer = this.v;
        wr0 wr0Var = this.h;
        ReusableGraphicsLayerScope reusableGraphicsLayerScope2 = y;
        LayoutNode layoutNode = this.e;
        if (ownedLayer == null) {
            layoutNodeWrapper = this;
            reusableGraphicsLayerScope = reusableGraphicsLayerScope2;
            if (wr0Var != null) {
                d.r("Failed requirement.");
                return;
            }
        } else {
            if (wr0Var == null) {
                d.r("Required value was null.");
                return;
            }
            reusableGraphicsLayerScope2.a = 1.0f;
            reusableGraphicsLayerScope2.b = 1.0f;
            reusableGraphicsLayerScope2.c = 1.0f;
            reusableGraphicsLayerScope2.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            reusableGraphicsLayerScope2.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            long j = GraphicsLayerScopeKt.a;
            reusableGraphicsLayerScope2.f = j;
            reusableGraphicsLayerScope2.g = j;
            reusableGraphicsLayerScope2.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            reusableGraphicsLayerScope2.i = 8.0f;
            reusableGraphicsLayerScope2.j = TransformOrigin.b;
            reusableGraphicsLayerScope2.k = RectangleShapeKt.a;
            reusableGraphicsLayerScope2.l = false;
            reusableGraphicsLayerScope2.n = null;
            Density density = layoutNode.p;
            density.getClass();
            reusableGraphicsLayerScope2.m = density;
            LayoutNodeKt.a(layoutNode).getSnapshotObserver().b(this, LayoutNodeWrapper$Companion$onCommitAffectingLayerParams$1.i, new LayoutNodeWrapper$updateLayerParameters$1(wr0Var));
            reusableGraphicsLayerScope = reusableGraphicsLayerScope2;
            ownedLayer.f(reusableGraphicsLayerScope2.a, reusableGraphicsLayerScope2.b, reusableGraphicsLayerScope2.c, reusableGraphicsLayerScope2.d, reusableGraphicsLayerScope2.e, reusableGraphicsLayerScope2.h, reusableGraphicsLayerScope2.i, reusableGraphicsLayerScope2.j, reusableGraphicsLayerScope2.k, reusableGraphicsLayerScope2.l, reusableGraphicsLayerScope2.n, reusableGraphicsLayerScope2.f, reusableGraphicsLayerScope2.g, layoutNode.r, layoutNode.p);
            layoutNodeWrapper = this;
            layoutNodeWrapper.g = reusableGraphicsLayerScope.l;
        }
        layoutNodeWrapper.k = reusableGraphicsLayerScope.c;
        Owner owner = layoutNode.g;
        if (owner != null) {
            owner.i(layoutNode);
        }
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        Canvas canvas = (Canvas) obj;
        canvas.getClass();
        LayoutNode layoutNode = this.e;
        if (layoutNode.u) {
            LayoutNodeKt.a(layoutNode).getSnapshotObserver().b(this, LayoutNodeWrapper$Companion$onCommitAffectingLayer$1.i, new AnonymousClass1(canvas));
            this.u = false;
        } else {
            this.u = true;
        }
        return az2.a;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    /* JADX INFO: renamed from: isValid */
    public final boolean getD() {
        return this.v != null;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final boolean s() {
        if (!this.l || this.e.A()) {
            return this.l;
        }
        d.r("Failed requirement.");
        return false;
    }

    public final void z0(LayoutNodeWrapper layoutNodeWrapper, MutableRect mutableRect, boolean z2) {
        if (layoutNodeWrapper == this) {
            return;
        }
        LayoutNodeWrapper layoutNodeWrapper2 = this.f;
        if (layoutNodeWrapper2 != null) {
            layoutNodeWrapper2.z0(layoutNodeWrapper, mutableRect, z2);
        }
        long j = this.o;
        int i = IntOffset.c;
        float f = (int) (j >> 32);
        mutableRect.a -= f;
        mutableRect.c -= f;
        float f2 = (int) (j & 4294967295L);
        mutableRect.b -= f2;
        mutableRect.d -= f2;
        OwnedLayer ownedLayer = this.v;
        if (ownedLayer != null) {
            ownedLayer.a(mutableRect, true);
            if (this.g && z2) {
                long j2 = this.c;
                mutableRect.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    public LayoutNodeWrapper(LayoutNode layoutNode) {
        layoutNode.getClass();
        this.e = layoutNode;
        this.i = layoutNode.p;
        this.j = layoutNode.r;
        this.k = 0.8f;
        this.o = IntOffset.b;
        this.s = new LayoutNodeEntity[6];
        this.t = new LayoutNodeWrapper$invalidateParentLayer$1(this);
    }

    public final long F0(long j) {
        return SizeKt.a(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Size.d(j) - s0()) / 2.0f), Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Size.b(j) - n0()) / 2.0f));
    }

    public final float H0(long j, long j2) {
        float fS0;
        float fN0;
        if (s0() >= Size.d(j2) && n0() >= Size.b(j2)) {
            return Float.POSITIVE_INFINITY;
        }
        long jF0 = F0(j2);
        float fD = Size.d(jF0);
        float fB = Size.b(jF0);
        float fC = Offset.c(j);
        if (fC < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fS0 = -fC;
        } else {
            fS0 = fC - s0();
        }
        float fMax = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fS0);
        float fD2 = Offset.d(j);
        if (fD2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fN0 = -fD2;
        } else {
            fN0 = fD2 - n0();
        }
        long jA = OffsetKt.a(fMax, Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fN0));
        if ((fD <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fB <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) || Offset.c(jA) > fD || Offset.d(jA) > fB) {
            return Float.POSITIVE_INFINITY;
        }
        return (Offset.d(jA) * Offset.d(jA)) + (Offset.c(jA) * Offset.c(jA));
    }

    public final void I0(Canvas canvas) {
        canvas.getClass();
        OwnedLayer ownedLayer = this.v;
        if (ownedLayer != null) {
            ownedLayer.b(canvas);
            return;
        }
        long j = this.o;
        int i = IntOffset.c;
        float f = (int) (j >> 32);
        float f2 = (int) (j & 4294967295L);
        canvas.c(f, f2);
        DrawEntity drawEntity = (DrawEntity) this.s[0];
        if (drawEntity == null) {
            Z0(canvas);
        } else {
            drawEntity.c(canvas);
        }
        canvas.c(-f, -f2);
    }

    public final void J0(Canvas canvas, Paint paint) {
        canvas.getClass();
        paint.getClass();
        long j = this.c;
        canvas.h(new Rect(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f), paint);
    }

    public final LayoutNodeWrapper K0(LayoutNodeWrapper layoutNodeWrapper) {
        layoutNodeWrapper.getClass();
        LayoutNode layoutNode = layoutNodeWrapper.e;
        LayoutNode layoutNode2 = this.e;
        if (layoutNode == layoutNode2) {
            LayoutNodeWrapper layoutNodeWrapper2 = layoutNode2.D.f;
            LayoutNodeWrapper layoutNodeWrapper3 = this;
            while (layoutNodeWrapper3 != layoutNodeWrapper2 && layoutNodeWrapper3 != layoutNodeWrapper) {
                layoutNodeWrapper3 = layoutNodeWrapper3.f;
                layoutNodeWrapper3.getClass();
            }
            if (layoutNodeWrapper3 != layoutNodeWrapper) {
                return this;
            }
            return layoutNodeWrapper;
        }
        LayoutNode layoutNodeS = layoutNode;
        while (layoutNodeS.h > layoutNode2.h) {
            layoutNodeS = layoutNodeS.s();
            layoutNodeS.getClass();
        }
        LayoutNode layoutNodeS2 = layoutNode2;
        while (layoutNodeS2.h > layoutNodeS.h) {
            layoutNodeS2 = layoutNodeS2.s();
            layoutNodeS2.getClass();
        }
        while (layoutNodeS != layoutNodeS2) {
            layoutNodeS = layoutNodeS.s();
            layoutNodeS2 = layoutNodeS2.s();
            if (layoutNodeS == null || layoutNodeS2 == null) {
                d.r("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (layoutNodeS2 != layoutNode2) {
            if (layoutNodeS != layoutNode) {
                return layoutNodeS.C;
            }
            return layoutNodeWrapper;
        }
        return this;
    }

    public void T0(HitTestSource hitTestSource, long j, HitTestResult hitTestResult, boolean z2, boolean z3) {
        hitTestSource.getClass();
        hitTestResult.getClass();
        LayoutNodeWrapper layoutNodeWrapperQ0 = Q0();
        if (layoutNodeWrapperQ0 != null) {
            layoutNodeWrapperQ0.S0(hitTestSource, layoutNodeWrapperQ0.L0(j), hitTestResult, z2, z3);
        }
    }

    public void Z0(Canvas canvas) {
        canvas.getClass();
        LayoutNodeWrapper layoutNodeWrapperQ0 = Q0();
        if (layoutNodeWrapperQ0 != null) {
            layoutNodeWrapperQ0.I0(canvas);
        }
    }

    public final void b1(MeasureResult measureResult) {
        LayoutNode layoutNode;
        LayoutNode layoutNodeS;
        measureResult.getClass();
        MeasureResult measureResult2 = this.m;
        if (measureResult != measureResult2) {
            this.m = measureResult;
            LayoutNode layoutNode2 = this.e;
            if (measureResult2 == null || measureResult.getA() != measureResult2.getA() || measureResult.getB() != measureResult2.getB()) {
                int a = measureResult.getA();
                int b = measureResult.getB();
                OwnedLayer ownedLayer = this.v;
                if (ownedLayer != null) {
                    ownedLayer.d(IntSizeKt.a(a, b));
                } else {
                    LayoutNodeWrapper layoutNodeWrapper = this.f;
                    if (layoutNodeWrapper != null) {
                        layoutNodeWrapper.U0();
                    }
                }
                Owner owner = layoutNode2.g;
                if (owner != null) {
                    owner.i(layoutNode2);
                }
                w0(IntSizeKt.a(a, b));
                for (LayoutNodeEntity layoutNodeEntity = this.s[0]; layoutNodeEntity != null; layoutNodeEntity = layoutNodeEntity.c) {
                    ((DrawEntity) layoutNodeEntity).g = true;
                }
            }
            LinkedHashMap linkedHashMap = this.n;
            if (((linkedHashMap != null && !linkedHashMap.isEmpty()) || !measureResult.getC().isEmpty()) && !s71.b(measureResult.getC(), this.n)) {
                LayoutNodeWrapper layoutNodeWrapperQ0 = Q0();
                if (layoutNodeWrapperQ0 != null) {
                    layoutNode = layoutNodeWrapperQ0.e;
                } else {
                    layoutNode = null;
                }
                if (s71.b(layoutNode, layoutNode2)) {
                    LayoutNode layoutNodeS2 = layoutNode2.s();
                    if (layoutNodeS2 != null) {
                        layoutNodeS2.G();
                    }
                    LayoutNodeAlignmentLines layoutNodeAlignmentLines = layoutNode2.t;
                    if (layoutNodeAlignmentLines.c) {
                        LayoutNode layoutNodeS3 = layoutNode2.s();
                        if (layoutNodeS3 != null) {
                            layoutNodeS3.O(false);
                        }
                    } else if (layoutNodeAlignmentLines.d && (layoutNodeS = layoutNode2.s()) != null) {
                        LayoutNode.M(layoutNodeS);
                    }
                } else {
                    layoutNode2.G();
                }
                layoutNode2.t.b = true;
                LinkedHashMap linkedHashMap2 = this.n;
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap();
                    this.n = linkedHashMap2;
                }
                linkedHashMap2.clear();
                linkedHashMap2.putAll(measureResult.getC());
            }
        }
    }

    @Override // androidx.compose.ui.layout.Measured
    public final int f0(AlignmentLine alignmentLine) {
        int iE0;
        long j;
        alignmentLine.getClass();
        if (this.m == null || (iE0 = E0(alignmentLine)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        if (alignmentLine instanceof VerticalAlignmentLine) {
            long jL0 = l0();
            int i = IntOffset.c;
            j = jL0 >> 32;
        } else {
            long jL1 = l0();
            int i2 = IntOffset.c;
            j = jL1 & 4294967295L;
        }
        return iE0 + ((int) j);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final long j(long j) {
        return LayoutNodeKt.a(this.e).h(n(j));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final Rect k(LayoutCoordinates layoutCoordinates, boolean z2) {
        layoutCoordinates.getClass();
        if (s()) {
            if (layoutCoordinates.s()) {
                LayoutNodeWrapper layoutNodeWrapper = (LayoutNodeWrapper) layoutCoordinates;
                LayoutNodeWrapper layoutNodeWrapperK0 = K0(layoutNodeWrapper);
                MutableRect mutableRect = this.r;
                if (mutableRect == null) {
                    mutableRect = new MutableRect();
                    mutableRect.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    mutableRect.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    mutableRect.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    mutableRect.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    this.r = mutableRect;
                }
                mutableRect.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                mutableRect.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                mutableRect.c = (int) (layoutCoordinates.d() >> 32);
                mutableRect.d = (int) (layoutCoordinates.d() & 4294967295L);
                while (layoutNodeWrapper != layoutNodeWrapperK0) {
                    layoutNodeWrapper.a1(mutableRect, z2, false);
                    if (mutableRect.b()) {
                        return Rect.e;
                    }
                    layoutNodeWrapper = layoutNodeWrapper.f;
                    layoutNodeWrapper.getClass();
                }
                z0(layoutNodeWrapperK0, mutableRect, z2);
                return new Rect(mutableRect.a, mutableRect.b, mutableRect.c, mutableRect.d);
            }
            d.i(layoutCoordinates, " is not attached!", "LayoutCoordinates ");
            return null;
        }
        e32.i("LayoutCoordinate operations are only valid when isAttached is true");
        return null;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutNodeWrapper m() {
        if (s()) {
            return this.e.D.f.f;
        }
        e32.i("LayoutCoordinate operations are only valid when isAttached is true");
        return null;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final long n(long j) {
        if (s()) {
            while (this != null) {
                j = this.e1(j);
                this = this.f;
            }
            return j;
        }
        e32.i("LayoutCoordinate operations are only valid when isAttached is true");
        return 0L;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final long r(LayoutCoordinates layoutCoordinates, long j) {
        layoutCoordinates.getClass();
        LayoutNodeWrapper layoutNodeWrapper = (LayoutNodeWrapper) layoutCoordinates;
        LayoutNodeWrapper layoutNodeWrapperK0 = K0(layoutNodeWrapper);
        while (layoutNodeWrapper != layoutNodeWrapperK0) {
            j = layoutNodeWrapper.e1(j);
            layoutNodeWrapper = layoutNodeWrapper.f;
            layoutNodeWrapper.getClass();
        }
        return C0(layoutNodeWrapperK0, j);
    }

    @Override // androidx.compose.ui.layout.Placeable
    public void t0(long j, float f, wr0 wr0Var) {
        LayoutNode layoutNode;
        W0(wr0Var);
        long j2 = this.o;
        int i = IntOffset.c;
        if (j2 != j) {
            this.o = j;
            OwnedLayer ownedLayer = this.v;
            if (ownedLayer != null) {
                ownedLayer.h(j);
            } else {
                LayoutNodeWrapper layoutNodeWrapper = this.f;
                if (layoutNodeWrapper != null) {
                    layoutNodeWrapper.U0();
                }
            }
            LayoutNodeWrapper layoutNodeWrapperQ0 = Q0();
            if (layoutNodeWrapperQ0 != null) {
                layoutNode = layoutNodeWrapperQ0.e;
            } else {
                layoutNode = null;
            }
            LayoutNode layoutNode2 = this.e;
            if (!s71.b(layoutNode, layoutNode2)) {
                layoutNode2.G();
            } else {
                LayoutNode layoutNodeS = layoutNode2.s();
                if (layoutNodeS != null) {
                    layoutNodeS.G();
                }
            }
            Owner owner = layoutNode2.g;
            if (owner != null) {
                owner.i(layoutNode2);
            }
        }
        this.p = f;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final long x(long j) {
        if (s()) {
            LayoutCoordinates layoutCoordinatesD = LayoutCoordinatesKt.d(this);
            return r(layoutCoordinatesD, Offset.e(LayoutNodeKt.a(this.e).c(j), LayoutCoordinatesKt.e(layoutCoordinatesD)));
        }
        e32.i("LayoutCoordinate operations are only valid when isAttached is true");
        return 0L;
    }
}
