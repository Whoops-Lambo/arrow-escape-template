package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.StructuralEqualityPolicy;
import com.google.android.gms.ads.RequestConfiguration;
import com.unity3d.services.UnityAdsConstants;
import defpackage.az2;
import defpackage.bp0;
import defpackage.cp0;
import defpackage.du;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.eu;
import defpackage.fy;
import defpackage.hg0;
import defpackage.m9;
import defpackage.rc1;
import defpackage.t50;
import defpackage.tb5;
import defpackage.wr0;
import defpackage.wz2;
import defpackage.z62;
import defpackage.zr0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/SwipeableState;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Companion", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@Stable
@ExperimentalMaterialApi
public class SwipeableState<T> {
    public final AnimationSpec a;
    public final wr0 b;
    public final ParcelableSnapshotMutableState c;
    public final ParcelableSnapshotMutableState d;
    public final ParcelableSnapshotMutableState e;
    public final ParcelableSnapshotMutableState f;
    public final ParcelableSnapshotMutableState g;
    public final ParcelableSnapshotMutableState h;
    public final ParcelableSnapshotMutableState i;
    public final m9 j;
    public float k;
    public float l;
    public final ParcelableSnapshotMutableState m;
    public final ParcelableSnapshotMutableState n;
    public final ParcelableSnapshotMutableState o;
    public final DraggableState p;

    /* JADX INFO: renamed from: androidx.compose.material.SwipeableState$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    final class AnonymousClass1 extends rc1 implements wr0 {
        @Override // defpackage.wr0
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/SwipeableState$Companion;", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public static Object b(SwipeableState swipeableState, Object obj, dy dyVar) {
        Object objCollect = swipeableState.j.collect(new SwipeableState$animateTo$2(obj, swipeableState, swipeableState.a), dyVar);
        return objCollect == dz.a ? objCollect : az2.a;
    }

    public final Object a(float f, AnimationSpec animationSpec, dy dyVar) {
        Object objB = this.p.b(MutatePriority.a, new SwipeableState$animateInternalToOffset$2(this, f, animationSpec, null), dyVar);
        return objB == dz.a ? objB : az2.a;
    }

    public final Map c() {
        return (Map) this.i.getA();
    }

    public final float d(float f) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.g;
        float f2 = tb5.f(((Number) parcelableSnapshotMutableState.getA()).floatValue() + f, this.k, this.l) - ((Number) parcelableSnapshotMutableState.getA()).floatValue();
        if (Math.abs(f2) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.p.a(f2);
        }
        return f2;
    }

    public final Object e(final float f, fy fyVar) {
        Object objCollect = this.j.collect(new cp0() { // from class: androidx.compose.material.SwipeableState$performFling$2
            @Override // defpackage.cp0
            public final Object emit(Object obj, dy dyVar) {
                float fFloatValue;
                Map map = (Map) obj;
                SwipeableState swipeableState = this.a;
                Float fA = SwipeableKt.a(swipeableState.c.getA(), map);
                fA.getClass();
                float fFloatValue2 = fA.floatValue();
                float fFloatValue3 = ((Number) swipeableState.e.getA()).floatValue();
                Set setKeySet = map.keySet();
                zr0 zr0Var = (zr0) swipeableState.m.getA();
                float fFloatValue4 = ((Number) swipeableState.n.getA()).floatValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : setKeySet) {
                    if (((Number) obj2).floatValue() <= ((double) fFloatValue3) + 0.001d) {
                        arrayList.add(obj2);
                    }
                }
                Float fK0 = du.k0(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : setKeySet) {
                    if (((Number) obj3).floatValue() >= ((double) fFloatValue3) - 0.001d) {
                        arrayList2.add(obj3);
                    }
                }
                Float fL0 = du.l0(arrayList2);
                List listY = fK0 == null ? eu.A(fL0) : (fL0 == null || fK0.floatValue() == fL0.floatValue()) ? eu.y(fK0) : eu.z(fK0, fL0);
                int size = listY.size();
                if (size == 0) {
                    fFloatValue = fFloatValue2;
                } else if (size != 1) {
                    fFloatValue = ((Number) listY.get(0)).floatValue();
                    float fFloatValue5 = ((Number) listY.get(1)).floatValue();
                    float f2 = f;
                    if (fFloatValue2 > fFloatValue3 ? f2 > (-fFloatValue4) && fFloatValue3 > ((Number) zr0Var.invoke(Float.valueOf(fFloatValue5), Float.valueOf(fFloatValue))).floatValue() : f2 >= fFloatValue4 || fFloatValue3 >= ((Number) zr0Var.invoke(Float.valueOf(fFloatValue), Float.valueOf(fFloatValue5))).floatValue()) {
                        fFloatValue = fFloatValue5;
                    }
                } else {
                    fFloatValue = ((Number) listY.get(0)).floatValue();
                }
                Object obj4 = map.get(new Float(fFloatValue));
                dz dzVar = dz.a;
                if (obj4 == null || !((Boolean) swipeableState.b.invoke(obj4)).booleanValue()) {
                    Object objA = swipeableState.a(fFloatValue2, swipeableState.a, dyVar);
                    if (objA == dzVar) {
                        return objA;
                    }
                } else {
                    Object objB = SwipeableState.b(swipeableState, obj4, dyVar);
                    if (objB == dzVar) {
                        return objB;
                    }
                }
                return az2.a;
            }
        }, fyVar);
        return objCollect == dz.a ? objCollect : az2.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0227  */
    /* JADX WARN: Code duplicated, block: B:93:0x022b  */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01da, code lost:
    
        if (r1.a(r3, r0, r4) == r7) goto L92;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(java.util.Map r17, java.util.Map r18, defpackage.fy r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState.f(java.util.Map, java.util.Map, fy):java.lang.Object");
    }

    public final void g(Object obj) {
        this.c.setValue(obj);
    }

    public SwipeableState(Object obj, AnimationSpec animationSpec, wr0 wr0Var) {
        animationSpec.getClass();
        wr0Var.getClass();
        this.a = animationSpec;
        this.b = wr0Var;
        this.c = SnapshotStateKt.c(obj, StructuralEqualityPolicy.a);
        this.d = SnapshotStateKt.c(Boolean.FALSE, StructuralEqualityPolicy.a);
        Float fValueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.e = SnapshotStateKt.c(fValueOf, StructuralEqualityPolicy.a);
        this.f = SnapshotStateKt.c(fValueOf, StructuralEqualityPolicy.a);
        this.g = SnapshotStateKt.c(fValueOf, StructuralEqualityPolicy.a);
        this.h = SnapshotStateKt.c(null, StructuralEqualityPolicy.a);
        this.i = SnapshotStateKt.c(hg0.a, StructuralEqualityPolicy.a);
        final z62 z62VarJ = SnapshotStateKt.j(new SwipeableState$latestNonEmptyAnchorsFlow$1(this));
        this.j = new m9(new bp0() { // from class: androidx.compose.material.SwipeableState$special$$inlined$filter$1

            /* JADX INFO: renamed from: androidx.compose.material.SwipeableState$special$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
            /* JADX INFO: loaded from: classes8.dex */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "value", "Laz2;", "emit", "(Ljava/lang/Object;Ldy;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            public final class AnonymousClass2<T> implements cp0 {
                public final /* synthetic */ cp0 a;

                /* JADX INFO: renamed from: androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
                /* JADX INFO: loaded from: classes4.dex */
                @t50(c = "androidx.compose.material.SwipeableState$special$$inlined$filter$1$2", f = "Swipeable.kt", l = {224}, m = "emit")
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                public final class AnonymousClass1 extends fy {
                    public /* synthetic */ Object r;
                    public int s;

                    public AnonymousClass1(dy dyVar) {
                        super(dyVar);
                    }

                    @Override // defpackage.ph
                    public final Object invokeSuspend(Object obj) {
                        this.r = obj;
                        this.s |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // defpackage.cp0
                public final Object emit(Object obj, dy dyVar) {
                    AnonymousClass1 anonymousClass1;
                    if (dyVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dyVar;
                        int i = anonymousClass1.s;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.s = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(dyVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(dyVar);
                    }
                    Object obj2 = anonymousClass1.r;
                    int i2 = anonymousClass1.s;
                    if (i2 == 0) {
                        wz2.a0(obj2);
                        if (!((Map) obj).isEmpty()) {
                            anonymousClass1.s = 1;
                            Object objEmit = this.a.emit(obj, anonymousClass1);
                            dz dzVar = dz.a;
                            if (objEmit == dzVar) {
                                return dzVar;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            e32.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        wz2.a0(obj2);
                    }
                    return az2.a;
                }

                public AnonymousClass2(cp0 cp0Var) {
                    this.a = cp0Var;
                }
            }

            @Override // defpackage.bp0
            public final Object collect(cp0 cp0Var, dy dyVar) {
                Object objCollect = z62VarJ.collect(new AnonymousClass2(cp0Var), dyVar);
                return objCollect == dz.a ? objCollect : az2.a;
            }
        }, 3);
        this.k = Float.NEGATIVE_INFINITY;
        this.l = Float.POSITIVE_INFINITY;
        this.m = SnapshotStateKt.c(SwipeableState$thresholds$2.i, StructuralEqualityPolicy.a);
        this.n = SnapshotStateKt.c(fValueOf, StructuralEqualityPolicy.a);
        this.o = SnapshotStateKt.c(null, StructuralEqualityPolicy.a);
        this.p = DraggableKt.a(new SwipeableState$draggableState$1(this));
    }
}
