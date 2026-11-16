package androidx.compose.ui.platform;

import android.os.Looper;
import android.view.View;
import androidx.compose.runtime.Latch;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.MotionDurationScale;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import defpackage.az2;
import defpackage.cg0;
import defpackage.cm2;
import defpackage.dn;
import defpackage.dy;
import defpackage.e32;
import defpackage.fz;
import defpackage.kc2;
import defpackage.m32;
import defpackage.sy;
import defpackage.tb5;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/Recomposer;", "rootView", "Landroid/view/View;"}, k = 3, mv = {1, 6, 0}, xi = 48)
public final class WindowRecomposerFactory$Companion$LifecycleAware$1 implements WindowRecomposerFactory {
    public static final WindowRecomposerFactory$Companion$LifecycleAware$1 b = new WindowRecomposerFactory$Companion$LifecycleAware$1();

    @Override // androidx.compose.ui.platform.WindowRecomposerFactory
    public final Recomposer a(final View view) {
        sy syVar;
        final PausableMonotonicFrameClock pausableMonotonicFrameClock;
        LinkedHashMap linkedHashMap = WindowRecomposer_androidKt.a;
        sy syVar2 = cg0.a;
        MonotonicFrameClock.Key key = MonotonicFrameClock.Key.a;
        cm2 cm2Var = AndroidUiDispatcher.m;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            syVar = (sy) AndroidUiDispatcher.m.getValue();
        } else {
            syVar = AndroidUiDispatcher.n.get();
            if (syVar == null) {
                e32.i("no AndroidUiDispatcher for this thread");
                return null;
            }
        }
        sy syVarPlus = syVar.plus(syVar2);
        MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) syVarPlus.get(key);
        if (monotonicFrameClock != null) {
            PausableMonotonicFrameClock pausableMonotonicFrameClock2 = new PausableMonotonicFrameClock(monotonicFrameClock);
            Latch latch = pausableMonotonicFrameClock2.b;
            synchronized (latch.a) {
                latch.d = false;
            }
            pausableMonotonicFrameClock = pausableMonotonicFrameClock2;
        } else {
            pausableMonotonicFrameClock = null;
        }
        final m32 m32Var = new m32();
        sy motionDurationScaleImpl = (MotionDurationScale) syVarPlus.get(MotionDurationScale.Key.a);
        if (motionDurationScaleImpl == null) {
            motionDurationScaleImpl = new MotionDurationScaleImpl();
            m32Var.a = motionDurationScaleImpl;
        }
        if (pausableMonotonicFrameClock != null) {
            syVar2 = pausableMonotonicFrameClock;
        }
        sy syVarPlus2 = syVarPlus.plus(syVar2).plus(motionDurationScaleImpl);
        final Recomposer recomposer = new Recomposer(syVarPlus2);
        final dn dnVarA = kc2.a(syVarPlus2);
        LifecycleOwner lifecycleOwnerA = ViewTreeLifecycleOwner.a(view);
        Lifecycle lifecycle = lifecycleOwnerA != null ? lifecycleOwnerA.getLifecycle() : null;
        if (lifecycle == null) {
            e32.h(view, "ViewTreeLifecycleOwner not found from ");
            return null;
        }
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$1
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view2) {
                view2.getClass();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view2) {
                view2.getClass();
                view.removeOnAttachStateChangeListener(this);
                recomposer.u();
            }
        });
        lifecycle.a(new LifecycleEventObserver() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2

            /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Lifecycle.Event.values().length];
                    iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
                    iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
                    iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
                    iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
                    iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 5;
                    iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 6;
                    iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                boolean z;
                int i = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
                if (i == 1) {
                    tb5.t(dnVarA, null, fz.d, new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(m32Var, recomposer, lifecycleOwner, this, view, null), 1);
                    return;
                }
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return;
                        }
                        recomposer.u();
                        return;
                    }
                    PausableMonotonicFrameClock pausableMonotonicFrameClock3 = pausableMonotonicFrameClock;
                    if (pausableMonotonicFrameClock3 != null) {
                        Latch latch2 = pausableMonotonicFrameClock3.b;
                        synchronized (latch2.a) {
                            latch2.d = false;
                        }
                        return;
                    }
                    return;
                }
                PausableMonotonicFrameClock pausableMonotonicFrameClock4 = pausableMonotonicFrameClock;
                if (pausableMonotonicFrameClock4 != null) {
                    Latch latch3 = pausableMonotonicFrameClock4.b;
                    synchronized (latch3.a) {
                        try {
                            synchronized (latch3.a) {
                                z = latch3.d;
                            }
                            if (z) {
                                return;
                            }
                            ArrayList arrayList = latch3.b;
                            latch3.b = latch3.c;
                            latch3.c = arrayList;
                            latch3.d = true;
                            int size = arrayList.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                ((dy) arrayList.get(i2)).resumeWith(az2.a);
                            }
                            arrayList.clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        });
        return recomposer;
    }
}
