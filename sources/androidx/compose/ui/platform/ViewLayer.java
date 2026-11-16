package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.services.UnityAdsConstants;
import defpackage.sr0;
import defpackage.zr0;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002()R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR*\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR$\u0010#\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0016\u0010'\u001a\u0004\u0018\u00010$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer;", "Landroid/view/View;", "Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/layout/GraphicLayerInfo;", "Landroidx/compose/ui/platform/AndroidComposeView;", "a", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Landroidx/compose/ui/platform/DrawChildContainer;", "b", "Landroidx/compose/ui/platform/DrawChildContainer;", "getContainer", "()Landroidx/compose/ui/platform/DrawChildContainer;", TtmlNode.RUBY_CONTAINER, "", "value", CmcdData.STREAMING_FORMAT_HLS, "Z", "isInvalidated", "()Z", "setInvalidated", "(Z)V", "", "getLayerId", "()J", "layerId", "getOwnerViewId", "ownerViewId", "", "getCameraDistancePx", "()F", "setCameraDistancePx", "(F)V", "cameraDistancePx", "Landroidx/compose/ui/graphics/Path;", "getManualClipPath", "()Landroidx/compose/ui/graphics/Path;", "manualClipPath", "Companion", "UniqueDrawingIdApi29", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ViewLayer extends View implements OwnedLayer, GraphicLayerInfo {
    public static final zr0 m = null;
    public static final ViewLayer$Companion$OutlineProvider$1 n = new ViewLayer$Companion$OutlineProvider$1();
    public static Method o;
    public static Field p;
    public static boolean q;
    public static boolean r;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final AndroidComposeView ownerView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final DrawChildContainer container;
    public LayoutNodeWrapper c;
    public sr0 d;
    public final OutlineResolver e;
    public boolean f;
    public Rect g;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean isInvalidated;
    public boolean i;
    public final CanvasHolder j;
    public final LayerMatrixCache k;
    public long l;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer$Companion;", "", "Lkotlin/Function2;", "Landroid/view/View;", "Landroid/graphics/Matrix;", "Laz2;", "getMatrix", "Lzr0;", "Ljava/lang/reflect/Field;", "recreateDisplayList", "Ljava/lang/reflect/Field;", "Ljava/lang/reflect/Method;", "updateDisplayListIfDirtyMethod", "Ljava/lang/reflect/Method;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public static void a(View view) {
            try {
                if (!ViewLayer.q) {
                    ViewLayer.q = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        ViewLayer.o = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                        ViewLayer.p = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        ViewLayer.o = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.p = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = ViewLayer.o;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = ViewLayer.p;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = ViewLayer.p;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = ViewLayer.o;
                if (method2 != null) {
                    method2.invoke(view, null);
                }
            } catch (Throwable unused) {
                ViewLayer.r = true;
            }
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void destroy() {
        MutableVector mutableVector;
        Reference referencePoll;
        setInvalidated(false);
        AndroidComposeView androidComposeView = this.ownerView;
        androidComposeView.v = true;
        this.c = null;
        this.d = null;
        WeakCache weakCache = androidComposeView.h0;
        do {
            ReferenceQueue referenceQueue = weakCache.b;
            mutableVector = weakCache.a;
            referencePoll = referenceQueue.poll();
            if (referencePoll != null) {
                mutableVector.o(referencePoll);
            }
        } while (referencePoll != null);
        mutableVector.b(new WeakReference(this, weakCache.b));
        this.container.removeViewInLayout(this);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer$UniqueDrawingIdApi29;", "", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "a", "(Landroid/view/View;)J", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class UniqueDrawingIdApi29 {
        @DoNotInline
        public static final long a(@NotNull View view) {
            view.getClass();
            return view.getUniqueDrawingId();
        }
    }

    private final void setInvalidated(boolean z) {
        if (z != this.isInvalidated) {
            this.isInvalidated = z;
            this.ownerView.z(this, z);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void a(MutableRect mutableRect, boolean z) {
        LayerMatrixCache layerMatrixCache = this.k;
        if (!z) {
            Matrix.c(layerMatrixCache.b(this), mutableRect);
            return;
        }
        float[] fArrA = layerMatrixCache.a(this);
        if (fArrA != null) {
            Matrix.c(fArrA, mutableRect);
            return;
        }
        mutableRect.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        mutableRect.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        mutableRect.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        mutableRect.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final long c(long j, boolean z) {
        LayerMatrixCache layerMatrixCache = this.k;
        if (!z) {
            return Matrix.b(j, layerMatrixCache.b(this));
        }
        float[] fArrA = layerMatrixCache.a(this);
        return fArrA != null ? Matrix.b(j, fArrA) : Offset.c;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void d(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (i == getWidth() && i2 == getHeight()) {
            return;
        }
        long j2 = this.l;
        int i3 = TransformOrigin.c;
        float f = i;
        setPivotX(Float.intBitsToFloat((int) (j2 >> 32)) * f);
        float f2 = i2;
        setPivotY(Float.intBitsToFloat((int) (4294967295L & this.l)) * f2);
        long jA = SizeKt.a(f, f2);
        OutlineResolver outlineResolver = this.e;
        if (!Size.a(outlineResolver.d, jA)) {
            outlineResolver.d = jA;
            outlineResolver.h = true;
        }
        setOutlineProvider(outlineResolver.b() != null ? n : null);
        layout(getLeft(), getTop(), getLeft() + i, getTop() + i2);
        j();
        this.k.c();
    }

    @NotNull
    public final DrawChildContainer getContainer() {
        return this.container;
    }

    @NotNull
    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return UniqueDrawingIdApi29.a(this.ownerView);
        }
        return -1L;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void h(long j) {
        int i = IntOffset.c;
        int i2 = (int) (j >> 32);
        int left = getLeft();
        LayerMatrixCache layerMatrixCache = this.k;
        if (i2 != left) {
            offsetLeftAndRight(i2 - getLeft());
            layerMatrixCache.c();
        }
        int i3 = (int) (j & 4294967295L);
        if (i3 != getTop()) {
            offsetTopAndBottom(i3 - getTop());
            layerMatrixCache.c();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void i() {
        if (!this.isInvalidated || r) {
            return;
        }
        setInvalidated(false);
        Companion.a(this);
    }

    @Override // android.view.View, androidx.compose.ui.node.OwnedLayer
    public final void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.ownerView.invalidate();
    }

    public final void j() {
        Rect rect;
        if (this.f) {
            Rect rect2 = this.g;
            if (rect2 == null) {
                this.g = new Rect(0, 0, getWidth(), getHeight());
            } else {
                rect2.getClass();
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.g;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewLayer(AndroidComposeView androidComposeView, DrawChildContainer drawChildContainer, LayoutNodeWrapper layoutNodeWrapper, sr0 sr0Var) {
        super(androidComposeView.getContext());
        drawChildContainer.getClass();
        sr0Var.getClass();
        this.ownerView = androidComposeView;
        this.container = drawChildContainer;
        this.c = layoutNodeWrapper;
        this.d = sr0Var;
        this.e = new OutlineResolver(androidComposeView.getDensity());
        this.j = new CanvasHolder();
        this.k = new LayerMatrixCache(ViewLayer$Companion$getMatrix$1.i);
        this.l = TransformOrigin.b;
        setWillNotDraw(false);
        setId(View.generateViewId());
        drawChildContainer.addView(this);
    }

    private final Path getManualClipPath() {
        if (getClipToOutline()) {
            OutlineResolver outlineResolver = this.e;
            if (outlineResolver.i) {
                outlineResolver.e();
                return outlineResolver.g;
            }
            return null;
        }
        return null;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void b(Canvas canvas) {
        boolean z;
        canvas.getClass();
        if (getElevation() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            z = true;
        } else {
            z = false;
        }
        this.i = z;
        if (z) {
            canvas.o();
        }
        this.container.a(canvas, this, getDrawingTime());
        if (this.i) {
            canvas.e();
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(android.graphics.Canvas canvas) {
        canvas.getClass();
        boolean z = false;
        setInvalidated(false);
        AndroidCanvas androidCanvas = this.j.a;
        android.graphics.Canvas canvas2 = androidCanvas.a;
        androidCanvas.a = canvas;
        if (getManualClipPath() != null || !canvas.isHardwareAccelerated()) {
            androidCanvas.r();
            this.e.a(androidCanvas);
            z = true;
        }
        LayoutNodeWrapper layoutNodeWrapper = this.c;
        if (layoutNodeWrapper != null) {
            layoutNodeWrapper.invoke(androidCanvas);
        }
        if (z) {
            androidCanvas.n();
        }
        androidCanvas.getClass();
        canvas2.getClass();
        androidCanvas.a = canvas2;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void e(LayoutNodeWrapper layoutNodeWrapper, sr0 sr0Var) {
        sr0Var.getClass();
        this.container.addView(this);
        this.f = false;
        this.i = false;
        this.l = TransformOrigin.b;
        this.c = layoutNodeWrapper;
        this.d = sr0Var;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final void f(float f, float f2, float f3, float f4, float f5, float f6, float f7, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3, LayoutDirection layoutDirection, Density density) {
        boolean z2;
        boolean z3;
        boolean z4;
        ViewLayer$Companion$OutlineProvider$1 viewLayer$Companion$OutlineProvider$1;
        sr0 sr0Var;
        shape.getClass();
        layoutDirection.getClass();
        density.getClass();
        this.l = j;
        setScaleX(f);
        setScaleY(f2);
        setAlpha(f3);
        setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        setTranslationY(f4);
        setElevation(f5);
        setRotation(f6);
        setRotationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        setRotationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        long j4 = this.l;
        int i = TransformOrigin.c;
        setPivotX(Float.intBitsToFloat((int) (j4 >> 32)) * getWidth());
        setPivotY(Float.intBitsToFloat((int) (this.l & 4294967295L)) * getHeight());
        setCameraDistancePx(f7);
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.a;
        boolean z5 = false;
        if (z && shape == rectangleShapeKt$RectangleShape$1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f = z2;
        j();
        if (getManualClipPath() != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z && shape != rectangleShapeKt$RectangleShape$1) {
            z4 = true;
        } else {
            z4 = false;
        }
        setClipToOutline(z4);
        boolean zD = this.e.d(shape, getAlpha(), getClipToOutline(), getElevation(), layoutDirection, density);
        if (this.e.b() != null) {
            viewLayer$Companion$OutlineProvider$1 = n;
        } else {
            viewLayer$Companion$OutlineProvider$1 = null;
        }
        setOutlineProvider(viewLayer$Companion$OutlineProvider$1);
        if (getManualClipPath() != null) {
            z5 = true;
        }
        if (z3 != z5 || (z5 && zD)) {
            invalidate();
        }
        if (!this.i && getElevation() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (sr0Var = this.d) != null) {
            sr0Var.invoke();
        }
        this.k.c();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int iG = ColorKt.g(j2);
            ViewLayerVerificationHelper28 viewLayerVerificationHelper28 = ViewLayerVerificationHelper28.a;
            viewLayerVerificationHelper28.a(this, iG);
            viewLayerVerificationHelper28.b(this, ColorKt.g(j3));
        }
        if (i2 >= 31) {
            ViewLayerVerificationHelper31.a.a(this, renderEffect);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public final boolean g(long j) {
        float fC = Offset.c(j);
        float fD = Offset.d(j);
        if (this.f) {
            if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= fC && fC < getWidth() && UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= fD && fD < getHeight()) {
                return true;
            }
            return false;
        }
        if (!getClipToOutline()) {
            return true;
        }
        return this.e.c(j);
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public long getLayerId() {
        return getId();
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * getResources().getDisplayMetrics().densityDpi);
    }
}
