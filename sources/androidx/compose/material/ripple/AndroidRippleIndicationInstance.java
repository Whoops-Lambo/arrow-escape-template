package androidx.compose.material.ripple;

import android.content.Context;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import defpackage.cz;
import defpackage.eu;
import defpackage.iu;
import defpackage.rd1;
import defpackage.sr0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material/ripple/AndroidRippleIndicationInstance;", "Landroidx/compose/material/ripple/RippleIndicationInstance;", "Landroidx/compose/runtime/RememberObserver;", "material-ripple_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AndroidRippleIndicationInstance extends RippleIndicationInstance implements RememberObserver {
    public final boolean b;
    public final float c;
    public final MutableState d;
    public final MutableState e;
    public final RippleContainer f;
    public final ParcelableSnapshotMutableState g;
    public final ParcelableSnapshotMutableState h;
    public long i;
    public int j;
    public final sr0 k;

    @Override // androidx.compose.runtime.RememberObserver
    public final void a() {
    }

    @Override // androidx.compose.foundation.IndicationInstance
    public final void b(LayoutNodeDrawScope layoutNodeDrawScope) {
        CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.a;
        this.i = canvasDrawScope.i();
        float f = this.c;
        this.j = Float.isNaN(f) ? rd1.p(RippleAnimationKt.a(layoutNodeDrawScope, this.b, canvasDrawScope.i())) : canvasDrawScope.mo1roundToPx0680j_4(f);
        long j = ((Color) this.d.getA()).a;
        float f2 = ((RippleAlpha) this.e.getA()).d;
        layoutNodeDrawScope.W();
        f(layoutNodeDrawScope, f, j);
        Canvas canvasA = canvasDrawScope.b.a();
        ((Boolean) this.h.getA()).booleanValue();
        RippleHostView rippleHostView = (RippleHostView) this.g.getA();
        if (rippleHostView != null) {
            rippleHostView.e(canvasDrawScope.i(), this.j, j, f2);
            android.graphics.Canvas canvas = AndroidCanvas_androidKt.a;
            canvasA.getClass();
            rippleHostView.draw(((AndroidCanvas) canvasA).a);
        }
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public final void c(PressInteraction.Press press, cz czVar) {
        press.getClass();
        czVar.getClass();
        RippleContainer rippleContainer = this.f;
        ArrayList arrayList = rippleContainer.b;
        RippleHostMap rippleHostMap = rippleContainer.d;
        LinkedHashMap linkedHashMap = rippleHostMap.a;
        LinkedHashMap linkedHashMap2 = rippleHostMap.a;
        RippleHostView rippleHostView = (RippleHostView) linkedHashMap.get(this);
        LinkedHashMap linkedHashMap3 = rippleHostMap.b;
        if (rippleHostView == null) {
            rippleHostView = (RippleHostView) iu.R(rippleContainer.c);
            if (rippleHostView == null) {
                if (rippleContainer.e > eu.o(arrayList)) {
                    Context context = rippleContainer.getContext();
                    context.getClass();
                    rippleHostView = new RippleHostView(context);
                    rippleContainer.addView(rippleHostView);
                    arrayList.add(rippleHostView);
                } else {
                    rippleHostView = (RippleHostView) arrayList.get(rippleContainer.e);
                    rippleHostView.getClass();
                    AndroidRippleIndicationInstance androidRippleIndicationInstance = (AndroidRippleIndicationInstance) linkedHashMap3.get(rippleHostView);
                    if (androidRippleIndicationInstance != null) {
                        androidRippleIndicationInstance.g.setValue(null);
                        RippleHostView rippleHostView2 = (RippleHostView) linkedHashMap2.get(androidRippleIndicationInstance);
                        if (rippleHostView2 != null) {
                        }
                        linkedHashMap2.remove(androidRippleIndicationInstance);
                        rippleHostView.c();
                    }
                }
                int i = rippleContainer.e;
                if (i < rippleContainer.a - 1) {
                    rippleContainer.e = i + 1;
                } else {
                    rippleContainer.e = 0;
                }
            }
            linkedHashMap2.put(this, rippleHostView);
            linkedHashMap3.put(rippleHostView, this);
        }
        RippleHostView rippleHostView3 = rippleHostView;
        rippleHostView3.b(press, this.b, this.i, this.j, ((Color) this.d.getA()).a, ((RippleAlpha) this.e.getA()).d, this.k);
        this.g.setValue(rippleHostView3);
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public final void g(PressInteraction.Press press) {
        RippleHostView rippleHostView = (RippleHostView) this.g.getA();
        if (rippleHostView != null) {
            rippleHostView.d();
        }
    }

    public final void h() {
        RippleContainer rippleContainer = this.f;
        rippleContainer.getClass();
        this.g.setValue(null);
        RippleHostMap rippleHostMap = rippleContainer.d;
        RippleHostView rippleHostView = (RippleHostView) rippleHostMap.a.get(this);
        if (rippleHostView != null) {
            rippleHostView.c();
            LinkedHashMap linkedHashMap = rippleHostMap.a;
            RippleHostView rippleHostView2 = (RippleHostView) linkedHashMap.get(this);
            if (rippleHostView2 != null) {
            }
            linkedHashMap.remove(this);
            rippleContainer.c.add(rippleHostView);
        }
    }

    public AndroidRippleIndicationInstance(boolean z, float f, MutableState mutableState, MutableState mutableState2, RippleContainer rippleContainer) {
        super(mutableState2, z);
        this.b = z;
        this.c = f;
        this.d = mutableState;
        this.e = mutableState2;
        this.f = rippleContainer;
        this.g = SnapshotStateKt.c(null, StructuralEqualityPolicy.a);
        this.h = SnapshotStateKt.c(Boolean.TRUE, StructuralEqualityPolicy.a);
        this.i = Size.b;
        this.j = -1;
        this.k = new AndroidRippleIndicationInstance$onInvalidateRipple$1(this);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void d() {
        h();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void e() {
        h();
    }
}
