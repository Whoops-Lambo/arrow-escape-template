package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import com.unity3d.services.UnityAdsConstants;
import defpackage.az2;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.l32;
import defpackage.wz2;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollingLogic;", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class ScrollingLogic {
    public final Orientation a;
    public final boolean b;
    public final State c;
    public final ScrollableState d;
    public final FlingBehavior e;
    public final OverscrollEffect f;

    public final long e(float f) {
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return Offset.b;
        }
        return this.a == Orientation.b ? OffsetKt.a(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : OffsetKt.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f);
    }

    public final long a(ScrollScope scrollScope, long j, Offset offset, int i) {
        Offset offset2;
        long jE;
        int i2;
        long jB;
        scrollScope.getClass();
        OverscrollEffect overscrollEffect = this.f;
        if (overscrollEffect == null || !overscrollEffect.getA()) {
            offset2 = offset;
            jE = Offset.b;
        } else {
            offset2 = offset;
            jE = overscrollEffect.e(j, offset2);
        }
        long jE2 = Offset.e(j, jE);
        NestedScrollDispatcher nestedScrollDispatcher = (NestedScrollDispatcher) this.c.getA();
        NestedScrollModifierLocal nestedScrollModifierLocal = nestedScrollDispatcher.c;
        if (nestedScrollModifierLocal != null) {
            i2 = i;
            jB = nestedScrollModifierLocal.b(i2, jE2);
        } else {
            i2 = i;
            jB = Offset.b;
        }
        long jE3 = Offset.e(jE2, jB);
        boolean z = this.b;
        long jE4 = e(scrollScope.a(d(z ? Offset.g(jE3, -1.0f) : jE3)));
        if (z) {
            jE4 = Offset.g(jE4, -1.0f);
        }
        long j2 = jE4;
        long jE5 = Offset.e(jE3, j2);
        NestedScrollModifierLocal nestedScrollModifierLocal2 = nestedScrollDispatcher.c;
        long jC = nestedScrollModifierLocal2 != null ? nestedScrollModifierLocal2.c(i2, j2, jE5) : Offset.b;
        if (overscrollEffect != null && overscrollEffect.getA()) {
            this.f.f(jE3, Offset.e(jE5, jC), offset2, i);
        }
        return jE5;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, fy fyVar) {
        ScrollingLogic$doFlingAnimation$1 scrollingLogic$doFlingAnimation$1;
        l32 l32Var;
        if (fyVar instanceof ScrollingLogic$doFlingAnimation$1) {
            scrollingLogic$doFlingAnimation$1 = (ScrollingLogic$doFlingAnimation$1) fyVar;
            int i = scrollingLogic$doFlingAnimation$1.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                scrollingLogic$doFlingAnimation$1.u = i - Integer.MIN_VALUE;
            } else {
                scrollingLogic$doFlingAnimation$1 = new ScrollingLogic$doFlingAnimation$1(this, fyVar);
            }
        } else {
            scrollingLogic$doFlingAnimation$1 = new ScrollingLogic$doFlingAnimation$1(this, fyVar);
        }
        Object obj = scrollingLogic$doFlingAnimation$1.s;
        int i2 = scrollingLogic$doFlingAnimation$1.u;
        if (i2 == 0) {
            wz2.a0(obj);
            l32 l32Var2 = new l32();
            l32Var2.a = j;
            ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this, l32Var2, j, null);
            scrollingLogic$doFlingAnimation$1.r = l32Var2;
            scrollingLogic$doFlingAnimation$1.u = 1;
            Object objC = this.d.c(MutatePriority.a, scrollingLogic$doFlingAnimation$2, scrollingLogic$doFlingAnimation$1);
            dz dzVar = dz.a;
            if (objC == dzVar) {
                return dzVar;
            }
            l32Var = l32Var2;
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l32Var = scrollingLogic$doFlingAnimation$1.r;
            wz2.a0(obj);
        }
        return new Velocity(l32Var.a);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:54:0x0106  */
    /* JADX WARN: Code duplicated, block: B:58:0x0126  */
    /* JADX WARN: Code duplicated, block: B:61:0x0135  */
    /* JADX WARN: Code duplicated, block: B:65:0x013f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0144  */
    /* JADX WARN: Code duplicated, block: B:68:0x014a  */
    /* JADX WARN: Code duplicated, block: B:69:0x014f  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object c(float f, fy fyVar) {
        ScrollingLogic$onDragStopped$1 scrollingLogic$onDragStopped$1;
        float fA;
        Object obj;
        float f2;
        ScrollingLogic scrollingLogic;
        float f3;
        long jA;
        Object objB;
        ScrollingLogic scrollingLogic2;
        long j;
        long jC;
        ScrollingLogic scrollingLogic3;
        long j2;
        long j3;
        long jC2;
        OverscrollEffect overscrollEffect;
        Orientation orientation;
        float fB;
        long jA2;
        ScrollingLogic scrollingLogic4 = this;
        float f4 = f;
        if (fyVar instanceof ScrollingLogic$onDragStopped$1) {
            scrollingLogic$onDragStopped$1 = (ScrollingLogic$onDragStopped$1) fyVar;
            int i = scrollingLogic$onDragStopped$1.x;
            if ((i & Integer.MIN_VALUE) != 0) {
                scrollingLogic$onDragStopped$1.x = i - Integer.MIN_VALUE;
            } else {
                scrollingLogic$onDragStopped$1 = new ScrollingLogic$onDragStopped$1(scrollingLogic4, fyVar);
            }
        } else {
            scrollingLogic$onDragStopped$1 = new ScrollingLogic$onDragStopped$1(scrollingLogic4, fyVar);
        }
        ScrollingLogic$onDragStopped$1 scrollingLogic$onDragStopped$2 = scrollingLogic$onDragStopped$1;
        Object objB2 = scrollingLogic$onDragStopped$2.v;
        int i2 = scrollingLogic$onDragStopped$2.x;
        Orientation orientation2 = Orientation.b;
        az2 az2Var = az2.a;
        dz dzVar = dz.a;
        if (i2 == 0) {
            wz2.a0(objB2);
            OverscrollEffect overscrollEffect2 = scrollingLogic4.f;
            if (overscrollEffect2 == null || !overscrollEffect2.getA()) {
                fA = 0.0f;
                f3 = f4 - fA;
                if (scrollingLogic4.a == orientation2) {
                    jA = VelocityKt.a(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                } else {
                    jA = VelocityKt.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3);
                }
                NestedScrollDispatcher nestedScrollDispatcher = (NestedScrollDispatcher) scrollingLogic4.c.getA();
                scrollingLogic$onDragStopped$2.r = scrollingLogic4;
                scrollingLogic$onDragStopped$2.s = null;
                scrollingLogic$onDragStopped$2.u = jA;
                scrollingLogic$onDragStopped$2.x = 2;
                objB = nestedScrollDispatcher.b(jA, scrollingLogic$onDragStopped$2);
                if (objB != dzVar) {
                    scrollingLogic2 = scrollingLogic4;
                    j = jA;
                    objB2 = objB;
                    jC = Velocity.c(j, ((Velocity) objB2).a);
                    scrollingLogic$onDragStopped$2.r = scrollingLogic2;
                    scrollingLogic$onDragStopped$2.u = jC;
                    scrollingLogic$onDragStopped$2.x = 3;
                    objB2 = scrollingLogic2.b(jC, scrollingLogic$onDragStopped$2);
                    if (objB2 != dzVar) {
                        scrollingLogic3 = scrollingLogic2;
                        j2 = ((Velocity) objB2).a;
                        NestedScrollDispatcher nestedScrollDispatcher2 = (NestedScrollDispatcher) scrollingLogic3.c.getA();
                        long jC3 = Velocity.c(jC, j2);
                        scrollingLogic$onDragStopped$2.r = scrollingLogic3;
                        scrollingLogic$onDragStopped$2.u = j2;
                        scrollingLogic$onDragStopped$2.x = 4;
                        objB2 = nestedScrollDispatcher2.a(jC3, j2, scrollingLogic$onDragStopped$2);
                        if (objB2 != dzVar) {
                            j3 = j2;
                            jC2 = Velocity.c(j3, ((Velocity) objB2).a);
                            overscrollEffect = scrollingLogic3.f;
                            orientation = scrollingLogic3.a;
                            if (overscrollEffect != null) {
                                OverscrollEffect overscrollEffect3 = scrollingLogic3.f;
                                if (orientation == orientation2) {
                                    fB = Velocity.a(jC2);
                                } else {
                                    fB = Velocity.b(jC2);
                                }
                                if (orientation == orientation2) {
                                    jA2 = VelocityKt.a(fB, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                } else {
                                    jA2 = VelocityKt.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fB);
                                }
                                scrollingLogic$onDragStopped$2.r = null;
                                scrollingLogic$onDragStopped$2.x = 5;
                                overscrollEffect3.b(jA2);
                                if (az2Var == dzVar) {
                                }
                            }
                            return az2Var;
                        }
                    }
                }
            } else {
                long jA3 = scrollingLogic4.a == orientation2 ? VelocityKt.a(f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : VelocityKt.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4);
                scrollingLogic$onDragStopped$2.r = scrollingLogic4;
                scrollingLogic$onDragStopped$2.s = scrollingLogic4;
                scrollingLogic$onDragStopped$2.t = f4;
                scrollingLogic$onDragStopped$2.x = 1;
                Velocity velocityD = overscrollEffect2.d(jA3);
                if (velocityD != dzVar) {
                    obj = velocityD;
                    f2 = f4;
                    scrollingLogic = scrollingLogic4;
                }
            }
            return dzVar;
        }
        if (i2 == 1) {
            float f5 = scrollingLogic$onDragStopped$2.t;
            ScrollingLogic scrollingLogic5 = (ScrollingLogic) scrollingLogic$onDragStopped$2.s;
            ScrollingLogic scrollingLogic6 = (ScrollingLogic) scrollingLogic$onDragStopped$2.r;
            wz2.a0(objB2);
            obj = objB2;
            f2 = f5;
            scrollingLogic4 = scrollingLogic5;
            scrollingLogic = scrollingLogic6;
        } else {
            if (i2 == 2) {
                j = scrollingLogic$onDragStopped$2.u;
                ScrollingLogic scrollingLogic7 = (ScrollingLogic) scrollingLogic$onDragStopped$2.r;
                wz2.a0(objB2);
                scrollingLogic2 = scrollingLogic7;
                jC = Velocity.c(j, ((Velocity) objB2).a);
                scrollingLogic$onDragStopped$2.r = scrollingLogic2;
                scrollingLogic$onDragStopped$2.u = jC;
                scrollingLogic$onDragStopped$2.x = 3;
                objB2 = scrollingLogic2.b(jC, scrollingLogic$onDragStopped$2);
                if (objB2 != dzVar) {
                    scrollingLogic3 = scrollingLogic2;
                    j2 = ((Velocity) objB2).a;
                    NestedScrollDispatcher nestedScrollDispatcher3 = (NestedScrollDispatcher) scrollingLogic3.c.getA();
                    long jC4 = Velocity.c(jC, j2);
                    scrollingLogic$onDragStopped$2.r = scrollingLogic3;
                    scrollingLogic$onDragStopped$2.u = j2;
                    scrollingLogic$onDragStopped$2.x = 4;
                    objB2 = nestedScrollDispatcher3.a(jC4, j2, scrollingLogic$onDragStopped$2);
                    if (objB2 != dzVar) {
                        j3 = j2;
                    }
                }
                return dzVar;
            }
            if (i2 == 3) {
                jC = scrollingLogic$onDragStopped$2.u;
                scrollingLogic3 = (ScrollingLogic) scrollingLogic$onDragStopped$2.r;
                wz2.a0(objB2);
                j2 = ((Velocity) objB2).a;
                NestedScrollDispatcher nestedScrollDispatcher4 = (NestedScrollDispatcher) scrollingLogic3.c.getA();
                long jC5 = Velocity.c(jC, j2);
                scrollingLogic$onDragStopped$2.r = scrollingLogic3;
                scrollingLogic$onDragStopped$2.u = j2;
                scrollingLogic$onDragStopped$2.x = 4;
                objB2 = nestedScrollDispatcher4.a(jC5, j2, scrollingLogic$onDragStopped$2);
                if (objB2 != dzVar) {
                    j3 = j2;
                }
                return dzVar;
            }
            if (i2 != 4) {
                if (i2 == 5) {
                    wz2.a0(objB2);
                    return az2Var;
                }
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j3 = scrollingLogic$onDragStopped$2.u;
            scrollingLogic3 = (ScrollingLogic) scrollingLogic$onDragStopped$2.r;
            wz2.a0(objB2);
        }
        jC2 = Velocity.c(j3, ((Velocity) objB2).a);
        overscrollEffect = scrollingLogic3.f;
        orientation = scrollingLogic3.a;
        if (overscrollEffect != null && overscrollEffect.getA()) {
            OverscrollEffect overscrollEffect4 = scrollingLogic3.f;
            if (orientation == orientation2) {
                fB = Velocity.a(jC2);
            } else {
                fB = Velocity.b(jC2);
            }
            if (orientation == orientation2) {
                jA2 = VelocityKt.a(fB, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            } else {
                jA2 = VelocityKt.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fB);
            }
            scrollingLogic$onDragStopped$2.r = null;
            scrollingLogic$onDragStopped$2.x = 5;
            overscrollEffect4.b(jA2);
            if (az2Var == dzVar) {
                return dzVar;
            }
        }
        return az2Var;
        long j4 = ((Velocity) obj).a;
        float f6 = f2;
        fA = scrollingLogic4.a == orientation2 ? Velocity.a(j4) : Velocity.b(j4);
        scrollingLogic4 = scrollingLogic;
        f4 = f6;
        f3 = f4 - fA;
        if (scrollingLogic4.a == orientation2) {
            jA = VelocityKt.a(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            jA = VelocityKt.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3);
        }
        NestedScrollDispatcher nestedScrollDispatcher5 = (NestedScrollDispatcher) scrollingLogic4.c.getA();
        scrollingLogic$onDragStopped$2.r = scrollingLogic4;
        scrollingLogic$onDragStopped$2.s = null;
        scrollingLogic$onDragStopped$2.u = jA;
        scrollingLogic$onDragStopped$2.x = 2;
        objB = nestedScrollDispatcher5.b(jA, scrollingLogic$onDragStopped$2);
        if (objB != dzVar) {
            scrollingLogic2 = scrollingLogic4;
            j = jA;
            objB2 = objB;
            jC = Velocity.c(j, ((Velocity) objB2).a);
            scrollingLogic$onDragStopped$2.r = scrollingLogic2;
            scrollingLogic$onDragStopped$2.u = jC;
            scrollingLogic$onDragStopped$2.x = 3;
            objB2 = scrollingLogic2.b(jC, scrollingLogic$onDragStopped$2);
            if (objB2 != dzVar) {
                scrollingLogic3 = scrollingLogic2;
                j2 = ((Velocity) objB2).a;
                NestedScrollDispatcher nestedScrollDispatcher6 = (NestedScrollDispatcher) scrollingLogic3.c.getA();
                long jC6 = Velocity.c(jC, j2);
                scrollingLogic$onDragStopped$2.r = scrollingLogic3;
                scrollingLogic$onDragStopped$2.u = j2;
                scrollingLogic$onDragStopped$2.x = 4;
                objB2 = nestedScrollDispatcher6.a(jC6, j2, scrollingLogic$onDragStopped$2);
                if (objB2 != dzVar) {
                    j3 = j2;
                    jC2 = Velocity.c(j3, ((Velocity) objB2).a);
                    overscrollEffect = scrollingLogic3.f;
                    orientation = scrollingLogic3.a;
                    if (overscrollEffect != null) {
                        OverscrollEffect overscrollEffect5 = scrollingLogic3.f;
                        if (orientation == orientation2) {
                            fB = Velocity.a(jC2);
                        } else {
                            fB = Velocity.b(jC2);
                        }
                        if (orientation == orientation2) {
                            jA2 = VelocityKt.a(fB, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        } else {
                            jA2 = VelocityKt.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fB);
                        }
                        scrollingLogic$onDragStopped$2.r = null;
                        scrollingLogic$onDragStopped$2.x = 5;
                        overscrollEffect5.b(jA2);
                        if (az2Var == dzVar) {
                        }
                    }
                    return az2Var;
                }
            }
        }
        return dzVar;
    }

    public final float d(long j) {
        return this.a == Orientation.b ? Offset.c(j) : Offset.d(j);
    }

    public ScrollingLogic(Orientation orientation, boolean z, MutableState mutableState, ScrollableState scrollableState, FlingBehavior flingBehavior, OverscrollEffect overscrollEffect) {
        mutableState.getClass();
        scrollableState.getClass();
        flingBehavior.getClass();
        this.a = orientation;
        this.b = z;
        this.c = mutableState;
        this.d = scrollableState;
        this.e = flingBehavior;
        this.f = overscrollEffect;
    }
}
