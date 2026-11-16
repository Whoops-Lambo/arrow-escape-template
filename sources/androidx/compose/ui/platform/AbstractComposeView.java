package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.InternalComposeUiApi;
import androidx.compose.ui.node.Owner;
import com.ecffri.arrows.R;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C4664b4;
import com.singular.sdk.internal.Constants;
import defpackage.cw0;
import defpackage.d;
import defpackage.dw0;
import defpackage.e32;
import defpackage.ku0;
import defpackage.li2;
import defpackage.sr0;
import defpackage.tb5;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b'\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR(\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0006R$\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u0019\u0010\u001aR0\u0010$\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\u001c8F@FX\u0087\u000e¢\u0006\u0018\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b#\u0010\u001a\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020\u001c8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b%\u0010 R\u0011\u0010(\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b'\u0010 ¨\u0006)"}, d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/view/ViewGroup;", "Landroidx/compose/runtime/CompositionContext;", "parent", "Laz2;", "setParentCompositionContext", "(Landroidx/compose/runtime/CompositionContext;)V", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", C4664b4.f.e, "setViewCompositionStrategy", "(Landroidx/compose/ui/platform/ViewCompositionStrategy;)V", "Landroid/os/IBinder;", "value", "b", "Landroid/os/IBinder;", "setPreviousAttachedWindowToken", "(Landroid/os/IBinder;)V", "previousAttachedWindowToken", "d", "Landroidx/compose/runtime/CompositionContext;", "setParentContext", "parentContext", "Lkotlin/Function0;", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "Lsr0;", "getDisposeViewCompositionStrategy$annotations", "()V", "disposeViewCompositionStrategy", "", InneractiveMediationDefs.GENDER_FEMALE, "Z", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "getShowLayoutBounds$annotations", "showLayoutBounds", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "getHasComposition", "hasComposition", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class AbstractComposeView extends ViewGroup {
    public WeakReference a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public IBinder previousAttachedWindowToken;
    public Composition c;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public CompositionContext parentContext;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public sr0 disposeViewCompositionStrategy;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean showLayoutBounds;
    public boolean g;

    public AbstractComposeView(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        this.disposeViewCompositionStrategy = ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.a.a(this);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    @InternalComposeUiApi
    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public abstract void a(Composer composer, int i);

    public void e(int i, int i2, int i3, int i4, boolean z) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public void f(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        e(i, i2, i3, i4, z);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    private final void setParentContext(CompositionContext compositionContext) {
        if (this.parentContext != compositionContext) {
            this.parentContext = compositionContext;
            if (compositionContext != null) {
                this.a = null;
            }
            Composition composition = this.c;
            if (composition != null) {
                composition.dispose();
                this.c = null;
                if (isAttachedToWindow()) {
                    d();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.a = null;
        }
    }

    public final void b() {
        if (this.g) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void c() {
        Composition composition = this.c;
        if (composition != null) {
            composition.dispose();
        }
        this.c = null;
        requestLayout();
    }

    public final void d() {
        if (this.c == null) {
            try {
                this.g = true;
                this.c = Wrapper_androidKt.a(this, g(), ComposableLambdaKt.c(-656146368, new AbstractComposeView$ensureCompositionCreated$1(this), true));
            } finally {
                this.g = false;
            }
        }
    }

    public final CompositionContext g() {
        Recomposer recomposerA;
        CompositionContext compositionContextB = this.parentContext;
        if (compositionContextB == null) {
            compositionContextB = WindowRecomposer_androidKt.b(this);
            if (compositionContextB == null) {
                for (ViewParent parent = getParent(); compositionContextB == null && (parent instanceof View); parent = parent.getParent()) {
                    compositionContextB = WindowRecomposer_androidKt.b((View) parent);
                }
            }
            Recomposer.State state = Recomposer.State.b;
            if (compositionContextB != null) {
                CompositionContext compositionContext = (!(compositionContextB instanceof Recomposer) || ((Recomposer.State) ((Recomposer) compositionContextB).p.getValue()).compareTo(state) > 0) ? compositionContextB : null;
                if (compositionContext != null) {
                    this.a = new WeakReference(compositionContext);
                }
            } else {
                compositionContextB = null;
            }
            if (compositionContextB == null) {
                WeakReference weakReference = this.a;
                if (weakReference == null || (compositionContextB = (CompositionContext) weakReference.get()) == null || ((compositionContextB instanceof Recomposer) && ((Recomposer.State) ((Recomposer) compositionContextB).p.getValue()).compareTo(state) <= 0)) {
                    compositionContextB = null;
                }
                if (compositionContextB == null) {
                    if (!isAttachedToWindow()) {
                        d.i(this, " is not attached to a window", "Cannot locate windowRecomposer; View ");
                        return null;
                    }
                    Object parent2 = getParent();
                    View view = this;
                    while (parent2 instanceof View) {
                        View view2 = (View) parent2;
                        if (view2.getId() == 16908290) {
                            break;
                        }
                        view = view2;
                        parent2 = view2.getParent();
                    }
                    CompositionContext compositionContextB2 = WindowRecomposer_androidKt.b(view);
                    if (compositionContextB2 == null) {
                        recomposerA = ((WindowRecomposerFactory) WindowRecomposerPolicy.a.get()).a(view);
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, recomposerA);
                        Handler handler = view.getHandler();
                        handler.getClass();
                        int i = dw0.a;
                        final li2 li2VarT = tb5.t(ku0.a, new cw0(handler, "windowRecomposer cleanup", false).f, null, new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(recomposerA, view, null), 2);
                        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$1
                            @Override // android.view.View.OnAttachStateChangeListener
                            public final void onViewAttachedToWindow(View view3) {
                                view3.getClass();
                            }

                            @Override // android.view.View.OnAttachStateChangeListener
                            public final void onViewDetachedFromWindow(View view3) {
                                view3.getClass();
                                view3.removeOnAttachStateChangeListener(this);
                                li2VarT.cancel(null);
                            }
                        });
                    } else {
                        if (!(compositionContextB2 instanceof Recomposer)) {
                            e32.i("root viewTreeParentCompositionContext is not a Recomposer");
                            return null;
                        }
                        recomposerA = (Recomposer) compositionContextB2;
                    }
                    Recomposer recomposer = ((Recomposer.State) recomposerA.p.getValue()).compareTo(state) > 0 ? recomposerA : null;
                    if (recomposer != null) {
                        this.a = new WeakReference(recomposer);
                    }
                    return recomposerA;
                }
            }
        }
        return compositionContextB;
    }

    public final boolean getHasComposition() {
        return this.c != null;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public final void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((Owner) childAt).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            d();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        d();
        f(i, i2);
    }

    public final void setParentCompositionContext(@Nullable CompositionContext parent) {
        setParentContext(parent);
    }

    public final void setViewCompositionStrategy(@NotNull ViewCompositionStrategy strategy) {
        strategy.getClass();
        sr0 sr0Var = this.disposeViewCompositionStrategy;
        if (sr0Var != null) {
            sr0Var.invoke();
        }
        this.disposeViewCompositionStrategy = strategy.a(this);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        b();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        b();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        b();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i, layoutParams);
    }
}
