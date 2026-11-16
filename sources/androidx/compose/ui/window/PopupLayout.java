package androidx.compose.ui.window;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.ecffri.arrows.R;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.singular.sdk.internal.Constants;
import com.unity3d.services.UnityAdsConstants;
import defpackage.d;
import defpackage.rd1;
import defpackage.sr0;
import defpackage.zr0;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.util.UUID;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u000bR\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010!\u001a\u00020\u001a8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R8\u0010:\u001a\u0004\u0018\u0001022\b\u00103\u001a\u0004\u0018\u0001028F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R/\u0010A\u001a\u0004\u0018\u00010;2\b\u00103\u001a\u0004\u0018\u00010;8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b<\u00105\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001b\u0010F\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ERA\u0010N\u001a\r\u0012\u0004\u0012\u00020\u00050G¢\u0006\u0002\bH2\u0011\u00103\u001a\r\u0012\u0004\u0012\u00020\u00050G¢\u0006\u0002\bH8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bI\u00105\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u0010R\u001a\u00020\b2\u0006\u00103\u001a\u00020\b8\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010ER\u0014\u0010U\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010X\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0014\u0010Z\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bY\u0010W\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006["}, d2 = {"Landroidx/compose/ui/window/PopupLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/platform/ViewRootForInspector;", "", "layoutDirection", "Laz2;", "setLayoutDirection", "(I)V", "", "isFocusable", "setIsFocusable", "(Z)V", "Landroidx/compose/ui/window/SecureFlagPolicy;", "securePolicy", "setSecurePolicy", "(Landroidx/compose/ui/window/SecureFlagPolicy;)V", "clippingEnabled", "setClippingEnabled", "", "j", "Ljava/lang/String;", "getTestTag", "()Ljava/lang/String;", "setTestTag", "(Ljava/lang/String;)V", "testTag", "Landroid/view/WindowManager$LayoutParams;", "n", "Landroid/view/WindowManager$LayoutParams;", "getParams$ui_release", "()Landroid/view/WindowManager$LayoutParams;", "getParams$ui_release$annotations", "()V", "params", "Landroidx/compose/ui/window/PopupPositionProvider;", "o", "Landroidx/compose/ui/window/PopupPositionProvider;", "getPositionProvider", "()Landroidx/compose/ui/window/PopupPositionProvider;", "setPositionProvider", "(Landroidx/compose/ui/window/PopupPositionProvider;)V", "positionProvider", "Landroidx/compose/ui/unit/LayoutDirection;", "p", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setParentLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "parentLayoutDirection", "Landroidx/compose/ui/unit/IntSize;", "<set-?>", CampaignEx.JSON_KEY_AD_Q, "Landroidx/compose/runtime/MutableState;", "getPopupContentSize-bOM6tXw", "()Landroidx/compose/ui/unit/IntSize;", "setPopupContentSize-fhxjrPA", "(Landroidx/compose/ui/unit/IntSize;)V", "popupContentSize", "Landroidx/compose/ui/layout/LayoutCoordinates;", "r", "getParentLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setParentLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "parentLayoutCoordinates", "t", "Landroidx/compose/runtime/State;", "getCanCalculatePosition", "()Z", "canCalculatePosition", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "v", "getContent", "()Lzr0;", "setContent", "(Lzr0;)V", "content", "w", "Z", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "getSubCompositionView", "()Landroidx/compose/ui/platform/AbstractComposeView;", "subCompositionView", "getDisplayWidth", "()I", "displayWidth", "getDisplayHeight", "displayHeight", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class PopupLayout extends AbstractComposeView implements ViewRootForInspector {
    public sr0 h;
    public PopupProperties i;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public String testTag;
    public final View k;
    public final PopupLayoutHelper l;
    public final WindowManager m;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public final WindowManager.LayoutParams params;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public PopupPositionProvider positionProvider;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public LayoutDirection parentLayoutDirection;
    public final ParcelableSnapshotMutableState q;
    public final ParcelableSnapshotMutableState r;
    public IntRect s;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public final State canCalculatePosition;
    public final Rect u;
    public final ParcelableSnapshotMutableState v;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public boolean shouldCreateCompositionOnAttachedToWindow;
    public final int[] x;

    @VisibleForTesting
    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    @NotNull
    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    @Nullable
    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // android.view.View
    public void setLayoutDirection(int layoutDirection) {
    }

    /* JADX INFO: renamed from: androidx.compose.ui.window.PopupLayout$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/window/PopupLayout$2", "Landroid/view/ViewOutlineProvider;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
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

    /* JADX WARN: Illegal instructions before constructor call */
    public PopupLayout(sr0 sr0Var, PopupProperties popupProperties, String str, View view, Density density, PopupPositionProvider popupPositionProvider, UUID uuid) {
        PopupLayoutHelper popupLayoutHelperImpl29 = Build.VERSION.SDK_INT >= 29 ? new PopupLayoutHelperImpl29() : new PopupLayoutHelperImpl();
        popupProperties.getClass();
        str.getClass();
        view.getClass();
        density.getClass();
        popupPositionProvider.getClass();
        Context context = view.getContext();
        context.getClass();
        super(context);
        this.h = sr0Var;
        this.i = popupProperties;
        this.testTag = str;
        this.k = view;
        this.l = popupLayoutHelperImpl29;
        Object systemService = view.getContext().getSystemService("window");
        if (systemService == null) {
            d.w("null cannot be cast to non-null type android.view.WindowManager");
            throw null;
        }
        this.m = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = (layoutParams.flags & (-8552473)) | Constants.REFERRER_LINK_MAX_RESPONSE_CHARS;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.params = layoutParams;
        this.positionProvider = popupPositionProvider;
        this.parentLayoutDirection = LayoutDirection.a;
        this.q = SnapshotStateKt.c(null, StructuralEqualityPolicy.a);
        this.r = SnapshotStateKt.c(null, StructuralEqualityPolicy.a);
        this.canCalculatePosition = SnapshotStateKt.b(new PopupLayout$canCalculatePosition$2(this));
        this.u = new Rect();
        setId(android.R.id.content);
        setTag(R.id.view_tree_lifecycle_owner, ViewTreeLifecycleOwner.a(view));
        setTag(R.id.view_tree_view_model_store_owner, ViewTreeViewModelStoreOwner.a(view));
        setTag(R.id.view_tree_saved_state_registry_owner, ViewTreeSavedStateRegistryOwner.a(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(density.mo7toPx0680j_4(30.0f));
        setOutlineProvider(new AnonymousClass2());
        this.v = SnapshotStateKt.c(ComposableSingletons$AndroidPopup_androidKt.a, StructuralEqualityPolicy.a);
        this.x = new int[2];
    }

    private final zr0 getContent() {
        return (zr0) this.v.getA();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates getParentLayoutCoordinates() {
        return (LayoutCoordinates) this.r.getA();
    }

    private final void setClippingEnabled(boolean clippingEnabled) {
        WindowManager.LayoutParams layoutParams = this.params;
        layoutParams.flags = clippingEnabled ? layoutParams.flags & (-513) : layoutParams.flags | 512;
        this.l.b(this.m, this, layoutParams);
    }

    private final void setContent(zr0 zr0Var) {
        this.v.setValue(zr0Var);
    }

    private final void setIsFocusable(boolean isFocusable) {
        WindowManager.LayoutParams layoutParams = this.params;
        layoutParams.flags = !isFocusable ? layoutParams.flags | 8 : layoutParams.flags & (-9);
        this.l.b(this.m, this, layoutParams);
    }

    private final void setParentLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this.r.setValue(layoutCoordinates);
    }

    private final void setSecurePolicy(SecureFlagPolicy securePolicy) {
        boolean zB = AndroidPopup_androidKt.b(this.k);
        securePolicy.getClass();
        int iOrdinal = securePolicy.ordinal();
        if (iOrdinal != 0) {
            zB = true;
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    e.b();
                    return;
                }
                zB = false;
            }
        }
        WindowManager.LayoutParams layoutParams = this.params;
        layoutParams.flags = zB ? layoutParams.flags | 8192 : layoutParams.flags & (-8193);
        this.l.b(this.m, this, layoutParams);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void f(int i, int i2) {
        this.i.getClass();
        super.f(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.canCalculatePosition.getA()).booleanValue();
    }

    @NotNull
    /* JADX INFO: renamed from: getParams$ui_release, reason: from getter */
    public final WindowManager.LayoutParams getParams() {
        return this.params;
    }

    @NotNull
    public final LayoutDirection getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    @Nullable
    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final IntSize m13getPopupContentSizebOM6tXw() {
        return (IntSize) this.q.getA();
    }

    @NotNull
    public final PopupPositionProvider getPositionProvider() {
        return this.positionProvider;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    /* JADX INFO: renamed from: getShouldCreateCompositionOnAttachedToWindow, reason: from getter */
    public boolean getT() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @NotNull
    public final String getTestTag() {
        return this.testTag;
    }

    public final void m() {
        IntSize intSizeM13getPopupContentSizebOM6tXw;
        IntRect intRect = this.s;
        if (intRect == null || (intSizeM13getPopupContentSizebOM6tXw = m13getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j = intSizeM13getPopupContentSizebOM6tXw.a;
        View view = this.k;
        PopupLayoutHelper popupLayoutHelper = this.l;
        Rect rect = this.u;
        popupLayoutHelper.c(rect, view);
        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = AndroidPopup_androidKt.a;
        long jA = IntSizeKt.a(rect.right - rect.left, rect.bottom - rect.top);
        long jA2 = this.positionProvider.a(intRect, jA, this.parentLayoutDirection, j);
        int i = IntOffset.c;
        WindowManager.LayoutParams layoutParams = this.params;
        layoutParams.x = (int) (jA2 >> 32);
        layoutParams.y = (int) (jA2 & 4294967295L);
        if (this.i.c) {
            popupLayoutHelper.a(this, (int) (jA >> 32), (int) (jA & 4294967295L));
        }
        popupLayoutHelper.b(this.m, this, layoutParams);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.i.getClass();
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || motionEvent.getX() >= getWidth() || motionEvent.getY() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || motionEvent.getY() >= getHeight())) {
            sr0 sr0Var = this.h;
            if (sr0Var != null) {
                sr0Var.invoke();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            sr0 sr0Var2 = this.h;
            if (sr0Var2 != null) {
                sr0Var2.invoke();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m14setPopupContentSizefhxjrPA(@Nullable IntSize intSize) {
        this.q.setValue(intSize);
    }

    private final int getDisplayHeight() {
        return rd1.p(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return rd1.p(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void a(Composer composer, int i) {
        ComposerImpl composerImplT = composer.t(-857613600);
        getContent().invoke(composerImplT, 0);
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
            this.i.getClass();
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                sr0 sr0Var = this.h;
                if (sr0Var != null) {
                    sr0Var.invoke();
                }
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void e(int i, int i2, int i3, int i4, boolean z) {
        super.e(i, i2, i3, i4, z);
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.params;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.l.b(this.m, this, layoutParams);
    }

    public final void i(CompositionContext compositionContext, zr0 zr0Var) {
        compositionContext.getClass();
        setParentCompositionContext(compositionContext);
        setContent(zr0Var);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }

    public final void j(sr0 sr0Var, PopupProperties popupProperties, String str, LayoutDirection layoutDirection) {
        popupProperties.getClass();
        str.getClass();
        layoutDirection.getClass();
        this.h = sr0Var;
        this.i = popupProperties;
        this.testTag = str;
        setIsFocusable(popupProperties.a);
        setSecurePolicy(popupProperties.b);
        setClippingEnabled(popupProperties.d);
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

    public final void k() {
        LayoutCoordinates parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            long jD = parentLayoutCoordinates.d();
            long j = parentLayoutCoordinates.j(Offset.b);
            long jA = IntOffsetKt.a(rd1.p(Offset.c(j)), rd1.p(Offset.d(j)));
            int i = IntOffset.c;
            int i2 = (int) (jA >> 32);
            int i3 = (int) (jA & 4294967295L);
            IntRect intRect = new IntRect(i2, i3, ((int) (jD >> 32)) + i2, ((int) (jD & 4294967295L)) + i3);
            if (!intRect.equals(this.s)) {
                this.s = intRect;
                m();
            }
        }
    }

    public final void l(LayoutCoordinates layoutCoordinates) {
        setParentLayoutCoordinates(layoutCoordinates);
        k();
    }

    public final void setParentLayoutDirection(@NotNull LayoutDirection layoutDirection) {
        layoutDirection.getClass();
        this.parentLayoutDirection = layoutDirection;
    }

    public final void setPositionProvider(@NotNull PopupPositionProvider popupPositionProvider) {
        popupPositionProvider.getClass();
        this.positionProvider = popupPositionProvider;
    }

    public final void setTestTag(@NotNull String str) {
        str.getClass();
        this.testTag = str;
    }
}
