package androidx.compose.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.compose.material.DropdownMenuPositionProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.ecffri.arrows.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.d;
import defpackage.s71;
import defpackage.zr0;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.util.UUID;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/internal/PopupLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/platform/ViewRootForInspector;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
final class PopupLayout extends AbstractComposeView implements ViewRootForInspector, ViewTreeObserver.OnGlobalLayoutListener {
    public final View h;
    public final WindowManager i;
    public final WindowManager.LayoutParams j;
    public DropdownMenuPositionProvider k;
    public LayoutDirection l;
    public final ParcelableSnapshotMutableState m;
    public final ParcelableSnapshotMutableState n;
    public final State o;
    public final Rect p;
    public final Rect q;
    public final zr0 r;
    public final ParcelableSnapshotMutableState s;
    public boolean t;

    @Override // android.view.View
    public final void setLayoutDirection(int i) {
    }

    /* JADX INFO: renamed from: androidx.compose.material.internal.PopupLayout$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/material/internal/PopupLayout$2", "Landroid/view/ViewOutlineProvider;", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class AnonymousClass2 extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            view.getClass();
            outline.getClass();
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    /* JADX INFO: renamed from: getShouldCreateCompositionOnAttachedToWindow, reason: from getter */
    public final boolean getT() {
        return this.t;
    }

    public final void i() {
        IntSize intSize;
        IntRect intRect = (IntRect) this.m.getA();
        if (intRect == null || (intSize = (IntSize) this.n.getA()) == null) {
            return;
        }
        long j = intSize.a;
        View view = this.h;
        Rect rect = this.p;
        view.getWindowVisibleDisplayFrame(rect);
        long jA = this.k.a(intRect, IntSizeKt.a(rect.right - rect.left, rect.bottom - rect.top), this.l, j);
        int i = IntOffset.c;
        WindowManager.LayoutParams layoutParams = this.j;
        layoutParams.x = (int) (jA >> 32);
        layoutParams.y = (int) (jA & 4294967295L);
        this.i.updateViewLayout(this, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.h;
        Rect rect = this.q;
        view.getWindowVisibleDisplayFrame(rect);
        if (s71.b(rect, this.p)) {
            return;
        }
        i();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Offset offset;
        if (motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        if ((motionEvent.getAction() == 0 && (motionEvent.getX() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || motionEvent.getX() >= getWidth() || motionEvent.getY() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || motionEvent.getY() >= getHeight())) || motionEvent.getAction() == 4) {
            IntRect intRect = (IntRect) this.m.getA();
            if (intRect == null) {
                return true;
            }
            if (motionEvent.getX() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && motionEvent.getY() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                offset = null;
            } else {
                WindowManager.LayoutParams layoutParams = this.j;
                offset = new Offset(OffsetKt.a(motionEvent.getX() + layoutParams.x, motionEvent.getY() + layoutParams.y));
            }
            if (((Boolean) ((PopupLayout$dismissOnOutsideClick$1) this.r).invoke(offset, intRect)).booleanValue()) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PopupLayout(String str, View view, Density density, DropdownMenuPositionProvider dropdownMenuPositionProvider, UUID uuid) {
        str.getClass();
        view.getClass();
        density.getClass();
        Context context = view.getContext();
        context.getClass();
        super(context);
        this.h = view;
        Object systemService = view.getContext().getSystemService("window");
        if (systemService != null) {
            this.i = (WindowManager) systemService;
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.gravity = 8388659;
            layoutParams.flags = 393248;
            layoutParams.softInputMode = 1;
            layoutParams.type = 1000;
            layoutParams.token = view.getApplicationWindowToken();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
            this.j = layoutParams;
            this.k = dropdownMenuPositionProvider;
            this.l = LayoutDirection.a;
            this.m = SnapshotStateKt.c(null, StructuralEqualityPolicy.a);
            this.n = SnapshotStateKt.c(null, StructuralEqualityPolicy.a);
            this.o = SnapshotStateKt.b(new PopupLayout$canCalculatePosition$2(this));
            this.p = new Rect();
            this.q = new Rect();
            this.r = PopupLayout$dismissOnOutsideClick$1.i;
            setId(android.R.id.content);
            setTag(R.id.view_tree_lifecycle_owner, ViewTreeLifecycleOwner.a(view));
            setTag(R.id.view_tree_view_model_store_owner, ViewTreeViewModelStoreOwner.a(view));
            setTag(R.id.view_tree_saved_state_registry_owner, ViewTreeSavedStateRegistryOwner.a(view));
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
            setClipChildren(false);
            setElevation(density.mo7toPx0680j_4(30.0f));
            setOutlineProvider(new AnonymousClass2());
            this.s = SnapshotStateKt.c(ComposableSingletons$ExposedDropdownMenuPopupKt.a, StructuralEqualityPolicy.a);
            return;
        }
        d.w("null cannot be cast to non-null type android.view.WindowManager");
        throw null;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void a(Composer composer, int i) {
        ComposerImpl composerImplT = composer.t(-1288867704);
        ((zr0) this.s.getA()).invoke(composerImplT, 0);
        RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT == null) {
            return;
        }
        recomposeScopeImplT.d = new PopupLayout$Content$4(this, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        keyEvent.getClass();
        if (keyEvent.getKeyCode() == 4) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void h(String str, LayoutDirection layoutDirection) {
        str.getClass();
        layoutDirection.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i2 = 1;
        if (i != 1) {
            if (i != 2) {
                e.b();
                return;
            }
        } else {
            i2 = 0;
        }
        super.setLayoutDirection(i2);
    }
}
