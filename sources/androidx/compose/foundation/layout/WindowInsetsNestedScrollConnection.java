package androidx.compose.foundation.layout;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Velocity;
import com.unity3d.services.UnityAdsConstants;
import defpackage.az2;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.j32;
import defpackage.kc2;
import defpackage.li2;
import defpackage.p83;
import defpackage.qo;
import defpackage.rc1;
import defpackage.rd1;
import defpackage.tb5;
import defpackage.wr0;
import defpackage.wz2;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@RequiresApi
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroid/view/WindowInsetsAnimationControlListener;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class WindowInsetsNestedScrollConnection implements NestedScrollConnection, WindowInsetsAnimationControlListener {
    public final AndroidWindowInsets a;
    public final View b;
    public final SideCalculator c;
    public final Density d;
    public WindowInsetsAnimationController e;
    public boolean f;
    public final CancellationSignal g;
    public float h;
    public li2 i;
    public qo j;

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$onReady$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Laz2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    final class AnonymousClass1 extends rc1 implements wr0 {
        public static final AnonymousClass1 i = new AnonymousClass1(1);

        @Override // defpackage.wr0
        public final Object invoke(Object obj) {
            ((Throwable) obj).getClass();
            return az2.a;
        }
    }

    public final void a() {
        WindowInsetsAnimationController windowInsetsAnimationController;
        WindowInsetsAnimationController windowInsetsAnimationController2 = this.e;
        if (windowInsetsAnimationController2 != null && windowInsetsAnimationController2.isReady() && (windowInsetsAnimationController = this.e) != null) {
            windowInsetsAnimationController.finish(((Boolean) this.a.d.getA()).booleanValue());
        }
        this.e = null;
        qo qoVar = this.j;
        if (qoVar != null) {
            qoVar.C(null, WindowInsetsNestedScrollConnection$animationEnded$1.i);
        }
        this.j = null;
        li2 li2Var = this.i;
        if (li2Var != null) {
            li2Var.cancel(null);
        }
        this.i = null;
        this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f = false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object f(long j, float f, boolean z, fy fyVar) {
        WindowInsetsNestedScrollConnection$fling$1 windowInsetsNestedScrollConnection$fling$1;
        float f2;
        long j2;
        j32 j32Var;
        long j3;
        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection;
        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection2;
        long j4;
        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection3 = this;
        if (fyVar instanceof WindowInsetsNestedScrollConnection$fling$1) {
            windowInsetsNestedScrollConnection$fling$1 = (WindowInsetsNestedScrollConnection$fling$1) fyVar;
            int i = windowInsetsNestedScrollConnection$fling$1.x;
            if ((i & Integer.MIN_VALUE) != 0) {
                windowInsetsNestedScrollConnection$fling$1.x = i - Integer.MIN_VALUE;
            } else {
                windowInsetsNestedScrollConnection$fling$1 = new WindowInsetsNestedScrollConnection$fling$1(windowInsetsNestedScrollConnection3, fyVar);
            }
        } else {
            windowInsetsNestedScrollConnection$fling$1 = new WindowInsetsNestedScrollConnection$fling$1(windowInsetsNestedScrollConnection3, fyVar);
        }
        Object obj = windowInsetsNestedScrollConnection$fling$1.v;
        int i2 = windowInsetsNestedScrollConnection$fling$1.x;
        dz dzVar = dz.a;
        if (i2 == 0) {
            wz2.a0(obj);
            li2 li2Var = windowInsetsNestedScrollConnection3.i;
            if (li2Var != null) {
                li2Var.cancel(null);
            }
            windowInsetsNestedScrollConnection3.i = null;
            windowInsetsNestedScrollConnection3.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if ((f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !z) || (windowInsetsNestedScrollConnection3.e == null && ((Boolean) windowInsetsNestedScrollConnection3.a.d.getA()).booleanValue() == z)) {
                return new Velocity(Velocity.b);
            }
            windowInsetsNestedScrollConnection$fling$1.r = windowInsetsNestedScrollConnection3;
            windowInsetsNestedScrollConnection$fling$1.t = j;
            windowInsetsNestedScrollConnection$fling$1.u = f;
            windowInsetsNestedScrollConnection$fling$1.x = 1;
            Object objR = windowInsetsNestedScrollConnection3.e;
            if (objR == null) {
                qo qoVar = new qo(1, kc2.q(windowInsetsNestedScrollConnection$fling$1));
                qoVar.s();
                windowInsetsNestedScrollConnection3.j = qoVar;
                windowInsetsNestedScrollConnection3.g();
                objR = qoVar.r();
            }
            if (objR != dzVar) {
                f2 = f;
                j2 = j;
                obj = objR;
            }
            return dzVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                j3 = windowInsetsNestedScrollConnection$fling$1.t;
                j32Var = windowInsetsNestedScrollConnection$fling$1.s;
                windowInsetsNestedScrollConnection = (WindowInsetsNestedScrollConnection) windowInsetsNestedScrollConnection$fling$1.r;
                wz2.a0(obj);
                return new Velocity(windowInsetsNestedScrollConnection.c.g(j3, j32Var.a));
            }
            if (i2 != 3) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j4 = windowInsetsNestedScrollConnection$fling$1.t;
            windowInsetsNestedScrollConnection2 = (WindowInsetsNestedScrollConnection) windowInsetsNestedScrollConnection$fling$1.r;
            wz2.a0(obj);
            return new Velocity(windowInsetsNestedScrollConnection2.c.g(j4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        }
        float f3 = windowInsetsNestedScrollConnection$fling$1.u;
        j2 = windowInsetsNestedScrollConnection$fling$1.t;
        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection4 = (WindowInsetsNestedScrollConnection) windowInsetsNestedScrollConnection$fling$1.r;
        wz2.a0(obj);
        f2 = f3;
        windowInsetsNestedScrollConnection3 = windowInsetsNestedScrollConnection4;
        WindowInsetsAnimationController windowInsetsAnimationControllerF = p83.f(obj);
        if (windowInsetsAnimationControllerF == null) {
            return new Velocity(Velocity.b);
        }
        SideCalculator sideCalculator = windowInsetsNestedScrollConnection3.c;
        Insets hiddenStateInsets = windowInsetsAnimationControllerF.getHiddenStateInsets();
        hiddenStateInsets.getClass();
        int iF = sideCalculator.f(hiddenStateInsets);
        SideCalculator sideCalculator2 = windowInsetsNestedScrollConnection3.c;
        Insets shownStateInsets = windowInsetsAnimationControllerF.getShownStateInsets();
        shownStateInsets.getClass();
        int iF2 = sideCalculator2.f(shownStateInsets);
        Insets currentInsets = windowInsetsAnimationControllerF.getCurrentInsets();
        currentInsets.getClass();
        int iF3 = windowInsetsNestedScrollConnection3.c.f(currentInsets);
        if ((f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && iF3 == iF) || (f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && iF3 == iF2)) {
            windowInsetsAnimationControllerF.finish(iF3 == iF2);
            windowInsetsNestedScrollConnection3.e = null;
            return new Velocity(Velocity.b);
        }
        SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec = new SplineBasedFloatDecayAnimationSpec(windowInsetsNestedScrollConnection3.d);
        float fE = iF3 + splineBasedFloatDecayAnimationSpec.e(f2);
        float f4 = iF;
        boolean z2 = (fE - f4) / ((float) (iF2 - iF)) > 0.5f;
        if (z2) {
            iF = iF2;
        }
        if (fE > iF2 || fE < f4) {
            j32 j32Var2 = new j32();
            WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection5 = windowInsetsNestedScrollConnection3;
            WindowInsetsNestedScrollConnection$fling$2 windowInsetsNestedScrollConnection$fling$2 = new WindowInsetsNestedScrollConnection$fling$2(f2, iF3, iF, iF2, null, j32Var2, windowInsetsAnimationControllerF, splineBasedFloatDecayAnimationSpec, windowInsetsNestedScrollConnection5, z2);
            windowInsetsNestedScrollConnection$fling$1.r = windowInsetsNestedScrollConnection5;
            windowInsetsNestedScrollConnection$fling$1.s = j32Var2;
            windowInsetsNestedScrollConnection$fling$1.t = j2;
            windowInsetsNestedScrollConnection$fling$1.x = 2;
            if (kc2.j(windowInsetsNestedScrollConnection$fling$2, windowInsetsNestedScrollConnection$fling$1) != dzVar) {
                j32Var = j32Var2;
                j3 = j2;
                windowInsetsNestedScrollConnection = windowInsetsNestedScrollConnection5;
                return new Velocity(windowInsetsNestedScrollConnection.c.g(j3, j32Var.a));
            }
        } else {
            WindowInsetsNestedScrollConnection$fling$3 windowInsetsNestedScrollConnection$fling$3 = new WindowInsetsNestedScrollConnection$fling$3(f2, iF3, iF, null, windowInsetsAnimationControllerF, windowInsetsNestedScrollConnection3, z2);
            windowInsetsNestedScrollConnection$fling$1.r = windowInsetsNestedScrollConnection3;
            windowInsetsNestedScrollConnection$fling$1.t = j2;
            windowInsetsNestedScrollConnection$fling$1.x = 3;
            if (kc2.j(windowInsetsNestedScrollConnection$fling$3, windowInsetsNestedScrollConnection$fling$1) != dzVar) {
                windowInsetsNestedScrollConnection2 = windowInsetsNestedScrollConnection3;
                j4 = j2;
                return new Velocity(windowInsetsNestedScrollConnection2.c.g(j4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            }
        }
        return dzVar;
    }

    public final void g() {
        if (this.f) {
            return;
        }
        this.f = true;
        WindowInsetsController windowInsetsController = this.b.getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.controlWindowInsetsAnimation(this.a.a, -1L, null, this.g, p83.e(this));
        }
    }

    public final long h(long j, float f) {
        li2 li2Var = this.i;
        if (li2Var != null) {
            li2Var.cancel(null);
            this.i = null;
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.e;
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (((Boolean) this.a.d.getA()).booleanValue() != (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) || windowInsetsAnimationController != null) {
                SideCalculator sideCalculator = this.c;
                if (windowInsetsAnimationController == null) {
                    this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    g();
                    return sideCalculator.c(j);
                }
                Insets hiddenStateInsets = windowInsetsAnimationController.getHiddenStateInsets();
                hiddenStateInsets.getClass();
                int iF = sideCalculator.f(hiddenStateInsets);
                Insets shownStateInsets = windowInsetsAnimationController.getShownStateInsets();
                shownStateInsets.getClass();
                int iF2 = sideCalculator.f(shownStateInsets);
                Insets currentInsets = windowInsetsAnimationController.getCurrentInsets();
                currentInsets.getClass();
                int iF3 = sideCalculator.f(currentInsets);
                if (iF3 == (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? iF2 : iF)) {
                    this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    return Offset.b;
                }
                float f2 = iF3 + f + this.h;
                int iG = tb5.g(rd1.p(f2), iF, iF2);
                this.h = f2 - rd1.p(f2);
                if (iG != iF3) {
                    windowInsetsAnimationController.setInsetsAndAlpha(sideCalculator.e(currentInsets, iG), 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                return sideCalculator.c(j);
            }
        }
        return Offset.b;
    }

    public WindowInsetsNestedScrollConnection(AndroidWindowInsets androidWindowInsets, View view, SideCalculator sideCalculator, Density density) {
        androidWindowInsets.getClass();
        view.getClass();
        sideCalculator.getClass();
        density.getClass();
        this.a = androidWindowInsets;
        this.b = view;
        this.c = sideCalculator;
        this.d = density;
        this.g = new CancellationSignal();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long b(int i, long j) {
        return h(j, this.c.b(Offset.c(j), Offset.d(j)));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long c(int i, long j, long j2) {
        return h(j2, this.c.a(Offset.c(j2), Offset.d(j2)));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final Object d(long j, long j2, fy fyVar) {
        return f(j2, this.c.a(Velocity.a(j2), Velocity.b(j2)), true, fyVar);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final Object e(long j, fy fyVar) {
        return f(j, this.c.b(Velocity.a(j), Velocity.b(j)), false, fyVar);
    }

    public final void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
        a();
    }

    public final void onFinished(WindowInsetsAnimationController windowInsetsAnimationController) {
        windowInsetsAnimationController.getClass();
        a();
    }

    public final void onReady(WindowInsetsAnimationController windowInsetsAnimationController, int i) {
        windowInsetsAnimationController.getClass();
        this.e = windowInsetsAnimationController;
        this.f = false;
        qo qoVar = this.j;
        if (qoVar != null) {
            qoVar.C(windowInsetsAnimationController, AnonymousClass1.i);
        }
        this.j = null;
    }
}
