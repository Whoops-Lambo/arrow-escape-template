package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal;
import androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNode$measureScope$1;
import androidx.compose.ui.platform.NestedScrollInteropConnectionKt;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.VelocityKt;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.savedstate.SavedStateRegistryOwner;
import com.ecffri.arrows.R;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.MBridgeConstans;
import com.singular.sdk.internal.Constants;
import defpackage.az2;
import defpackage.cz;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.hg0;
import defpackage.m32;
import defpackage.sr0;
import defpackage.t50;
import defpackage.tb5;
import defpackage.ul2;
import defpackage.wr0;
import defpackage.wz2;
import defpackage.zr0;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u0002J\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR.\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R6\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\"\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R0\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0013\u0018\u00010#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R*\u00102\u001a\u00020+2\u0006\u0010\n\u001a\u00020+8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R0\u00106\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u0013\u0018\u00010#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u0010%\u001a\u0004\b4\u0010'\"\u0004\b5\u0010)R.\u0010>\u001a\u0004\u0018\u0001072\b\u0010\n\u001a\u0004\u0018\u0001078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R.\u0010F\u001a\u0004\u0018\u00010?2\b\u0010\n\u001a\u0004\u0018\u00010?8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER0\u0010K\u001a\u0010\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u0013\u0018\u00010#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bH\u0010%\u001a\u0004\bI\u0010'\"\u0004\bJ\u0010)R\u0017\u0010Q\u001a\u00020L8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P¨\u0006R"}, d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroid/view/ViewGroup;", "Landroidx/core/view/NestedScrollingParent3;", "Landroid/view/ViewGroup$LayoutParams;", "getLayoutParams", "()Landroid/view/ViewGroup$LayoutParams;", "", "getNestedScrollAxes", "()I", "Landroid/view/View;", "value", "b", "Landroid/view/View;", "getView", "()Landroid/view/View;", "setView$ui_release", "(Landroid/view/View;)V", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lkotlin/Function0;", "Laz2;", "c", "Lsr0;", "getUpdate", "()Lsr0;", "setUpdate", "(Lsr0;)V", "update", "Landroidx/compose/ui/Modifier;", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "modifier", "Lkotlin/Function1;", InneractiveMediationDefs.GENDER_FEMALE, "Lwr0;", "getOnModifierChanged$ui_release", "()Lwr0;", "setOnModifierChanged$ui_release", "(Lwr0;)V", "onModifierChanged", "Landroidx/compose/ui/unit/Density;", "g", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "density", CmcdData.STREAMING_FORMAT_HLS, "getOnDensityChanged$ui_release", "setOnDensityChanged$ui_release", "onDensityChanged", "Landroidx/lifecycle/LifecycleOwner;", "i", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "setLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "lifecycleOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "j", "Landroidx/savedstate/SavedStateRegistryOwner;", "getSavedStateRegistryOwner", "()Landroidx/savedstate/SavedStateRegistryOwner;", "setSavedStateRegistryOwner", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "savedStateRegistryOwner", "", "n", "getOnRequestDisallowInterceptTouchEvent$ui_release", "setOnRequestDisallowInterceptTouchEvent$ui_release", "onRequestDisallowInterceptTouchEvent", "Landroidx/compose/ui/node/LayoutNode;", "s", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class AndroidViewHolder extends ViewGroup implements NestedScrollingParent3 {
    public final NestedScrollDispatcher a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public View view;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public sr0 update;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public Modifier modifier;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public wr0 onModifierChanged;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public Density density;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public wr0 onDensityChanged;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public LifecycleOwner lifecycleOwner;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public SavedStateRegistryOwner savedStateRegistryOwner;
    public final SnapshotStateObserver k;
    public final wr0 l;
    public final sr0 m;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public wr0 onRequestDisallowInterceptTouchEvent;
    public final int[] o;
    public int p;
    public int q;
    public final NestedScrollingParentHelper r;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public final LayoutNode layoutNode;

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes7.dex */
    @t50(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", l = {470, 475}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcz;", "Laz2;", "<anonymous>", "(Lcz;)V"}, k = 3, mv = {1, 6, 0})
    final class AnonymousClass1 extends ul2 implements zr0 {
        public int r;
        public final /* synthetic */ boolean s;
        public final /* synthetic */ AndroidViewHolder t;
        public final /* synthetic */ long u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, AndroidViewHolder androidViewHolder, long j, dy dyVar) {
            super(2, dyVar);
            this.s = z;
            this.t = androidViewHolder;
            this.u = j;
        }

        @Override // defpackage.ph
        public final dy create(Object obj, dy dyVar) {
            return new AnonymousClass1(this.s, this.t, this.u, dyVar);
        }

        @Override // defpackage.zr0
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((cz) obj, (dy) obj2)).invokeSuspend(az2.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
        
            if (r3.a(r4, r9.u, r9) == r10) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
        
            if (r3.a(r9.u, r6, r9) == r10) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
        
            return r10;
         */
        @Override // defpackage.ph
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                int r0 = r9.r
                r1 = 2
                r2 = 1
                if (r0 == 0) goto L16
                if (r0 == r2) goto L12
                if (r0 != r1) goto Lb
                goto L12
            Lb:
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.e32.i(r9)
                r9 = 0
                return r9
            L12:
                defpackage.wz2.a0(r10)
                goto L3f
            L16:
                defpackage.wz2.a0(r10)
                androidx.compose.ui.viewinterop.AndroidViewHolder r10 = r9.t
                androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r3 = r10.a
                dz r10 = defpackage.dz.a
                boolean r0 = r9.s
                if (r0 != 0) goto L31
                long r4 = androidx.compose.ui.unit.Velocity.b
                r9.r = r2
                long r6 = r9.u
                r8 = r9
                java.lang.Object r9 = r3.a(r4, r6, r8)
                if (r9 != r10) goto L3f
                goto L3e
            L31:
                r8 = r9
                long r6 = androidx.compose.ui.unit.Velocity.b
                r8.r = r1
                long r4 = r8.u
                java.lang.Object r9 = r3.a(r4, r6, r8)
                if (r9 != r10) goto L3f
            L3e:
                return r10
            L3f:
                az2 r9 = defpackage.az2.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.AndroidViewHolder.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes6.dex */
    @t50(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", l = {488}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcz;", "Laz2;", "<anonymous>", "(Lcz;)V"}, k = 3, mv = {1, 6, 0})
    final class C16221 extends ul2 implements zr0 {
        public int r;
        public final /* synthetic */ long t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16221(long j, dy dyVar) {
            super(2, dyVar);
            this.t = j;
        }

        @Override // defpackage.ph
        public final dy create(Object obj, dy dyVar) {
            return AndroidViewHolder.this.new C16221(this.t, dyVar);
        }

        @Override // defpackage.zr0
        public final Object invoke(Object obj, Object obj2) {
            return ((C16221) create((cz) obj, (dy) obj2)).invokeSuspend(az2.a);
        }

        @Override // defpackage.ph
        public final Object invokeSuspend(Object obj) {
            int i = this.r;
            if (i == 0) {
                wz2.a0(obj);
                NestedScrollDispatcher nestedScrollDispatcher = AndroidViewHolder.this.a;
                this.r = 1;
                Object objB = nestedScrollDispatcher.b(this.t, this);
                dz dzVar = dz.a;
                if (objB == dzVar) {
                    return dzVar;
                }
            } else {
                if (i != 1) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wz2.a0(obj);
            }
            return az2.a;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.o;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void h(int i, View view) {
        NestedScrollingParentHelper nestedScrollingParentHelper = this.r;
        if (i == 1) {
            nestedScrollingParentHelper.b = 0;
        } else {
            nestedScrollingParentHelper.a = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public static final int a(AndroidViewHolder androidViewHolder, int i, int i2, int i3) {
        if (i3 >= 0 || i == i2) {
            return View.MeasureSpec.makeMeasureSpec(tb5.g(i3, i, i2), 1073741824);
        }
        if (i3 != -2 || i2 == Integer.MAX_VALUE) {
            return (i3 != -1 || i2 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
    }

    @NotNull
    public final Density getDensity() {
        return this.density;
    }

    @NotNull
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @Override // android.view.View
    @Nullable
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams;
        View view = this.view;
        return (view == null || (layoutParams = view.getLayoutParams()) == null) ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    @Nullable
    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    @NotNull
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        NestedScrollingParentHelper nestedScrollingParentHelper = this.r;
        return nestedScrollingParentHelper.b | nestedScrollingParentHelper.a;
    }

    @Nullable
    /* JADX INFO: renamed from: getOnDensityChanged$ui_release, reason: from getter */
    public final wr0 getOnDensityChanged() {
        return this.onDensityChanged;
    }

    @Nullable
    /* JADX INFO: renamed from: getOnModifierChanged$ui_release, reason: from getter */
    public final wr0 getOnModifierChanged() {
        return this.onModifierChanged;
    }

    @Nullable
    /* JADX INFO: renamed from: getOnRequestDisallowInterceptTouchEvent$ui_release, reason: from getter */
    public final wr0 getOnRequestDisallowInterceptTouchEvent() {
        return this.onRequestDisallowInterceptTouchEvent;
    }

    @Nullable
    public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    @NotNull
    public final sr0 getUpdate() {
        return this.update;
    }

    @Nullable
    public final View getView() {
        return this.view;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        View view = this.view;
        return view != null ? view.isNestedScrollingEnabled() : super.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.view;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.view;
        if (view != null) {
            view.measure(i, i2);
        }
        View view2 = this.view;
        int measuredWidth = view2 != null ? view2.getMeasuredWidth() : 0;
        View view3 = this.view;
        setMeasuredDimension(measuredWidth, view3 != null ? view3.getMeasuredHeight() : 0);
        this.p = i;
        this.q = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        wr0 wr0Var = this.onRequestDisallowInterceptTouchEvent;
        if (wr0Var != null) {
            wr0Var.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != this.lifecycleOwner) {
            this.lifecycleOwner = lifecycleOwner;
            setTag(R.id.view_tree_lifecycle_owner, lifecycleOwner);
        }
    }

    public final void setOnDensityChanged$ui_release(@Nullable wr0 wr0Var) {
        this.onDensityChanged = wr0Var;
    }

    public final void setOnModifierChanged$ui_release(@Nullable wr0 wr0Var) {
        this.onModifierChanged = wr0Var;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(@Nullable wr0 wr0Var) {
        this.onRequestDisallowInterceptTouchEvent = wr0Var;
    }

    public final void setSavedStateRegistryOwner(@Nullable SavedStateRegistryOwner savedStateRegistryOwner) {
        if (savedStateRegistryOwner != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = savedStateRegistryOwner;
            setTag(R.id.view_tree_saved_state_registry_owner, savedStateRegistryOwner);
        }
    }

    public final void setView$ui_release(@Nullable View view) {
        if (view != this.view) {
            this.view = view;
            removeAllViews();
            if (view != null) {
                addView(view);
                ((AndroidViewHolder$runUpdate$1) this.m).invoke();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder(Context context, CompositionContext compositionContext, NestedScrollDispatcher nestedScrollDispatcher) {
        super(context);
        context.getClass();
        nestedScrollDispatcher.getClass();
        this.a = nestedScrollDispatcher;
        if (compositionContext != null) {
            LinkedHashMap linkedHashMap = WindowRecomposer_androidKt.a;
            setTag(R.id.androidx_compose_ui_view_composition_context, compositionContext);
        }
        setSaveFromParentEnabled(false);
        this.update = AndroidViewHolder$update$1.i;
        this.modifier = Modifier.Companion.a;
        this.density = DensityKt.b();
        this.k = new SnapshotStateObserver(new AndroidViewHolder$snapshotObserver$1(this));
        this.l = new AndroidViewHolder$onCommitAffectingUpdate$1(this);
        this.m = new AndroidViewHolder$runUpdate$1(this);
        this.o = new int[2];
        this.p = Integer.MIN_VALUE;
        this.q = Integer.MIN_VALUE;
        this.r = new NestedScrollingParentHelper();
        final LayoutNode layoutNode = new LayoutNode(false);
        Modifier modifierA = OnGloballyPositionedModifierKt.a(DrawModifierKt.a(PointerInteropFilter_androidKt.a(this), new AndroidViewHolder$layoutNode$1$coreModifier$1(layoutNode, this)), new AndroidViewHolder$layoutNode$1$coreModifier$2(layoutNode, this));
        layoutNode.e(this.modifier.N(modifierA));
        this.onModifierChanged = new AndroidViewHolder$layoutNode$1$1(layoutNode, modifierA);
        layoutNode.f(this.density);
        this.onDensityChanged = new AndroidViewHolder$layoutNode$1$2(layoutNode);
        m32 m32Var = new m32();
        layoutNode.L = new AndroidViewHolder$layoutNode$1$3(this, layoutNode, m32Var);
        layoutNode.M = new AndroidViewHolder$layoutNode$1$4(this, m32Var);
        layoutNode.d(new MeasurePolicy() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final MeasureResult a(MeasureScope measureScope, List list, long j) {
                measureScope.getClass();
                list.getClass();
                int iJ = Constraints.j(j);
                AndroidViewHolder androidViewHolder = this;
                if (iJ != 0) {
                    androidViewHolder.getChildAt(0).setMinimumWidth(Constraints.j(j));
                }
                if (Constraints.i(j) != 0) {
                    androidViewHolder.getChildAt(0).setMinimumHeight(Constraints.i(j));
                }
                int iJ2 = Constraints.j(j);
                int iH = Constraints.h(j);
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                layoutParams.getClass();
                int iA = AndroidViewHolder.a(androidViewHolder, iJ2, iH, layoutParams.width);
                int i = Constraints.i(j);
                int iG = Constraints.g(j);
                ViewGroup.LayoutParams layoutParams2 = androidViewHolder.getLayoutParams();
                layoutParams2.getClass();
                androidViewHolder.measure(iA, AndroidViewHolder.a(androidViewHolder, i, iG, layoutParams2.height));
                return measureScope.C(androidViewHolder.getMeasuredWidth(), androidViewHolder.getMeasuredHeight(), hg0.a, new AndroidViewHolder$layoutNode$1$5$measure$1(layoutNode, androidViewHolder));
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final int b(LayoutNode$measureScope$1 layoutNode$measureScope$1, List list, int i) {
                layoutNode$measureScope$1.getClass();
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                AndroidViewHolder androidViewHolder = this;
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                layoutParams.getClass();
                androidViewHolder.measure(iMakeMeasureSpec, AndroidViewHolder.a(androidViewHolder, 0, i, layoutParams.height));
                return androidViewHolder.getMeasuredWidth();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final int c(LayoutNode$measureScope$1 layoutNode$measureScope$1, List list, int i) {
                layoutNode$measureScope$1.getClass();
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                AndroidViewHolder androidViewHolder = this;
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                layoutParams.getClass();
                androidViewHolder.measure(iMakeMeasureSpec, AndroidViewHolder.a(androidViewHolder, 0, i, layoutParams.height));
                return androidViewHolder.getMeasuredWidth();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final int d(LayoutNode$measureScope$1 layoutNode$measureScope$1, List list, int i) {
                layoutNode$measureScope$1.getClass();
                AndroidViewHolder androidViewHolder = this;
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                layoutParams.getClass();
                androidViewHolder.measure(AndroidViewHolder.a(androidViewHolder, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return androidViewHolder.getMeasuredHeight();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final int e(LayoutNode$measureScope$1 layoutNode$measureScope$1, List list, int i) {
                layoutNode$measureScope$1.getClass();
                AndroidViewHolder androidViewHolder = this;
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                layoutParams.getClass();
                androidViewHolder.measure(AndroidViewHolder.a(androidViewHolder, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return androidViewHolder.getMeasuredHeight();
            }
        });
        this.layoutNode = layoutNode;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void i(View view, View view2, int i, int i2) {
        view.getClass();
        NestedScrollingParentHelper nestedScrollingParentHelper = this.r;
        if (i2 == 1) {
            nestedScrollingParentHelper.b = i;
        } else {
            nestedScrollingParentHelper.a = i;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        this.layoutNode.x();
        return null;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void j(View view, int i, int i2, int i3, int i4, int i5) {
        int i6;
        if (!isNestedScrollingEnabled()) {
            return;
        }
        long jA = OffsetKt.a(i * (-1.0f), i2 * (-1.0f));
        long jA2 = OffsetKt.a(i3 * (-1.0f), i4 * (-1.0f));
        if (i5 == 0) {
            i6 = 1;
        } else {
            i6 = 2;
        }
        int i7 = i6;
        NestedScrollModifierLocal nestedScrollModifierLocal = this.a.c;
        if (nestedScrollModifierLocal != null) {
            nestedScrollModifierLocal.c(i7, jA, jA2);
        } else {
            int i8 = Offset.e;
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void l(View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        long jB;
        if (!isNestedScrollingEnabled()) {
            return;
        }
        long jA = OffsetKt.a(i * (-1.0f), i2 * (-1.0f));
        if (i3 == 0) {
            i4 = 1;
        } else {
            i4 = 2;
        }
        NestedScrollModifierLocal nestedScrollModifierLocal = this.a.c;
        if (nestedScrollModifierLocal != null) {
            jB = nestedScrollModifierLocal.b(i4, jA);
        } else {
            jB = Offset.b;
        }
        iArr[0] = NestedScrollInteropConnectionKt.b(Offset.c(jB));
        iArr[1] = NestedScrollInteropConnectionKt.b(Offset.d(jB));
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public final void n(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        int i6;
        long jC;
        if (!isNestedScrollingEnabled()) {
            return;
        }
        long jA = OffsetKt.a(i * (-1.0f), i2 * (-1.0f));
        long jA2 = OffsetKt.a(i3 * (-1.0f), i4 * (-1.0f));
        if (i5 == 0) {
            i6 = 1;
        } else {
            i6 = 2;
        }
        NestedScrollModifierLocal nestedScrollModifierLocal = this.a.c;
        if (nestedScrollModifierLocal != null) {
            jC = nestedScrollModifierLocal.c(i6, jA, jA2);
        } else {
            jC = Offset.b;
        }
        iArr[0] = NestedScrollInteropConnectionKt.b(Offset.c(jC));
        iArr[1] = NestedScrollInteropConnectionKt.b(Offset.d(jC));
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final boolean o(View view, View view2, int i, int i2) {
        view.getClass();
        if ((i & 2) != 0 || (i & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        SnapshotStateObserver snapshotStateObserver = this.k;
        snapshotStateObserver.e = Snapshot.Companion.c(snapshotStateObserver.b);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        view.getClass();
        view2.getClass();
        super.onDescendantInvalidated(view, view2);
        this.layoutNode.x();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SnapshotStateObserver snapshotStateObserver = this.k;
        snapshotStateObserver.e();
        snapshotStateObserver.a();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        view.getClass();
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        tb5.t(this.a.c(), null, null, new AnonymousClass1(z, this, VelocityKt.a(f * (-1.0f), f2 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        view.getClass();
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        tb5.t(this.a.c(), null, null, new C16221(VelocityKt.a(f * (-1.0f), f2 * (-1.0f)), null), 3);
        return false;
    }

    public final void setDensity(@NotNull Density density) {
        density.getClass();
        if (density != this.density) {
            this.density = density;
            wr0 wr0Var = this.onDensityChanged;
            if (wr0Var != null) {
                wr0Var.invoke(density);
            }
        }
    }

    public final void setModifier(@NotNull Modifier modifier) {
        modifier.getClass();
        if (modifier != this.modifier) {
            this.modifier = modifier;
            wr0 wr0Var = this.onModifierChanged;
            if (wr0Var != null) {
                wr0Var.invoke(modifier);
            }
        }
    }

    public final void setUpdate(@NotNull sr0 sr0Var) {
        sr0Var.getClass();
        this.update = sr0Var;
        this.d = true;
        ((AndroidViewHolder$runUpdate$1) this.m).invoke();
    }
}
