package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import com.unity3d.services.UnityAdsConstants;
import defpackage.az2;
import defpackage.cg0;
import defpackage.cz;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.j52;
import defpackage.kc2;
import defpackage.ku0;
import defpackage.li2;
import defpackage.ph;
import defpackage.qo;
import defpackage.sy;
import defpackage.tb5;
import defpackage.wz2;
import defpackage.y62;
import defpackage.zr0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilter;", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "Landroidx/compose/ui/input/pointer/PointerInputModifier;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/ui/unit/Density;", "PointerEventHandlerCoroutine", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SuspendingPointerInputFilter extends PointerInputFilter implements PointerInputModifier, PointerInputScope, Density {
    public final ViewConfiguration c;
    public final /* synthetic */ Density d;
    public PointerEvent e;
    public final MutableVector f;
    public final MutableVector g;
    public PointerEvent h;
    public long i;
    public cz j;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilter$PointerEventHandlerCoroutine;", "R", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/unit/Density;", "Ldy;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class PointerEventHandlerCoroutine<R> implements AwaitPointerEventScope, Density, dy {
        public final qo a;
        public final /* synthetic */ SuspendingPointerInputFilter b;
        public qo c;
        public PointerEventPass d = PointerEventPass.b;

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public final Object A(long j, zr0 zr0Var, dy dyVar) throws Throwable {
            SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1 suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1;
            if (dyVar instanceof SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1) {
                suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1 = (SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1) dyVar;
                int i = suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1.t;
                if ((i & Integer.MIN_VALUE) != 0) {
                    suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1.t = i - Integer.MIN_VALUE;
                } else {
                    suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1 = new SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1(this, (ph) dyVar);
                }
            } else {
                suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1 = new SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1(this, (ph) dyVar);
            }
            Object obj = suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1.r;
            int i2 = suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1.t;
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        wz2.a0(obj);
                        return obj;
                    }
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wz2.a0(obj);
                suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1.t = 1;
                Object objK = K(j, zr0Var, suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1);
                dz dzVar = dz.a;
                return objK == dzVar ? dzVar : objK;
            } catch (PointerEventTimeoutCancellationException unused) {
                return null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public final Object K(long j, zr0 zr0Var, dy dyVar) throws Throwable {
            SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1 suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1;
            Throwable th;
            li2 li2Var;
            qo qoVar;
            if (dyVar instanceof SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1) {
                suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1 = (SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1) dyVar;
                int i = suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1.u;
                if ((i & Integer.MIN_VALUE) != 0) {
                    suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1.u = i - Integer.MIN_VALUE;
                } else {
                    suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1 = new SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1(this, (ph) dyVar);
                }
            } else {
                suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1 = new SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1(this, (ph) dyVar);
            }
            Object objInvoke = suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1.s;
            int i2 = suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1.u;
            if (i2 != 0) {
                if (i2 != 1) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                li2Var = suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1.r;
                try {
                    wz2.a0(objInvoke);
                    li2Var.cancel(null);
                    return objInvoke;
                } catch (Throwable th2) {
                    th = th2;
                    li2Var.cancel(null);
                    throw th;
                }
            }
            wz2.a0(objInvoke);
            if (j <= 0 && (qoVar = this.c) != null) {
                qoVar.resumeWith(new j52(new PointerEventTimeoutCancellationException(j)));
            }
            li2 li2VarT = tb5.t(SuspendingPointerInputFilter.this.j, null, null, new SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1(j, this, null), 3);
            try {
                suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1.r = li2VarT;
                suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1.u = 1;
                objInvoke = zr0Var.invoke(this, suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1);
                Object obj = dz.a;
                if (objInvoke == obj) {
                    return obj;
                }
                li2Var = li2VarT;
                li2Var.cancel(null);
                return objInvoke;
            } catch (Throwable th3) {
                th = th3;
                li2Var = li2VarT;
                li2Var.cancel(null);
                throw th;
            }
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public final Object b0(PointerEventPass pointerEventPass, ph phVar) {
            qo qoVar = new qo(1, kc2.q(phVar));
            qoVar.s();
            this.d = pointerEventPass;
            this.c = qoVar;
            return qoVar.r();
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public final long d() {
            return SuspendingPointerInputFilter.this.i;
        }

        @Override // defpackage.dy
        public final sy getContext() {
            return cg0.a;
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: getDensity */
        public final float getB() {
            return this.b.d.getB();
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: getFontScale */
        public final float getC() {
            return this.b.d.getC();
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public final ViewConfiguration getViewConfiguration() {
            return SuspendingPointerInputFilter.this.c;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public final long i0() {
            SuspendingPointerInputFilter suspendingPointerInputFilter = SuspendingPointerInputFilter.this;
            long jMo8toSizeXkaWNTQ = suspendingPointerInputFilter.d.mo8toSizeXkaWNTQ(suspendingPointerInputFilter.c.d());
            LayoutCoordinates layoutCoordinates = suspendingPointerInputFilter.a;
            long jD = layoutCoordinates != null ? layoutCoordinates.d() : 0L;
            return SizeKt.a(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Size.d(jMo8toSizeXkaWNTQ) - ((int) (jD >> 32))) / 2.0f, Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Size.b(jMo8toSizeXkaWNTQ) - ((int) (jD & 4294967295L))) / 2.0f);
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public final PointerEvent q0() {
            return SuspendingPointerInputFilter.this.e;
        }

        @Override // defpackage.dy
        public final void resumeWith(Object obj) {
            SuspendingPointerInputFilter suspendingPointerInputFilter = SuspendingPointerInputFilter.this;
            synchronized (suspendingPointerInputFilter.f) {
                suspendingPointerInputFilter.f.o(this);
            }
            this.a.resumeWith(obj);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: roundToPx--R2X_6o */
        public final int mo0roundToPxR2X_6o(long j) {
            return this.b.d.mo0roundToPxR2X_6o(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: roundToPx-0680j_4 */
        public final int mo1roundToPx0680j_4(float f) {
            return this.b.d.mo1roundToPx0680j_4(f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDp-GaN1DYA */
        public final float mo2toDpGaN1DYA(long j) {
            return this.b.d.mo2toDpGaN1DYA(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public final float mo3toDpu2uoSUM(float f) {
            return this.b.d.mo3toDpu2uoSUM(f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDpSize-k-rfVVM */
        public final long mo5toDpSizekrfVVM(long j) {
            return this.b.d.mo5toDpSizekrfVVM(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toPx--R2X_6o */
        public final float mo6toPxR2X_6o(long j) {
            return this.b.d.mo6toPxR2X_6o(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toPx-0680j_4 */
        public final float mo7toPx0680j_4(float f) {
            return this.b.d.mo7toPx0680j_4(f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSize-XkaWNTQ */
        public final long mo8toSizeXkaWNTQ(long j) {
            return this.b.d.mo8toSizeXkaWNTQ(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSp-0xMU5do */
        public final long mo9toSp0xMU5do(float f) {
            return this.b.d.mo9toSp0xMU5do(f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public final long mo10toSpkPz2Gy4(float f) {
            return this.b.d.mo10toSpkPz2Gy4(f);
        }

        public PointerEventHandlerCoroutine(qo qoVar) {
            this.a = qoVar;
            this.b = SuspendingPointerInputFilter.this;
        }

        @Override // androidx.compose.ui.unit.Density
        public final Rect toRect(DpRect dpRect) {
            dpRect.getClass();
            return this.b.d.toRect(dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public final float mo4toDpu2uoSUM(int i) {
            return this.b.d.mo4toDpu2uoSUM(i);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public final long mo11toSpkPz2Gy4(int i) {
            return this.b.d.mo11toSpkPz2Gy4(i);
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    public final boolean J() {
        return false;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputModifier
    public final PointerInputFilter u0() {
        return this;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PointerEventPass.values().length];
            iArr[0] = 1;
            iArr[2] = 2;
            iArr[1] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0042 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:6:0x000d, B:13:0x001b, B:15:0x0021, B:16:0x0024, B:18:0x0032, B:20:0x0036, B:21:0x003b, B:26:0x0042, B:28:0x0048, B:29:0x004b, B:31:0x0059, B:33:0x005d), top: B:43:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0048 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:6:0x000d, B:13:0x001b, B:15:0x0021, B:16:0x0024, B:18:0x0032, B:20:0x0036, B:21:0x003b, B:26:0x0042, B:28:0x0048, B:29:0x004b, B:31:0x0059, B:33:0x005d), top: B:43:0x000d }] */
    public final void F0(PointerEvent pointerEvent, PointerEventPass pointerEventPass) {
        MutableVector mutableVector;
        int i;
        Object[] objArr;
        int i2;
        PointerEventHandlerCoroutine pointerEventHandlerCoroutine;
        qo qoVar;
        qo qoVar2;
        synchronized (this.f) {
            MutableVector mutableVector2 = this.g;
            mutableVector2.c(mutableVector2.c, this.f);
        }
        try {
            int iOrdinal = pointerEventPass.ordinal();
            if (iOrdinal == 0) {
                mutableVector = this.g;
                i = mutableVector.c;
                if (i > 0) {
                    objArr = mutableVector.a;
                    i2 = 0;
                    do {
                        pointerEventHandlerCoroutine = (PointerEventHandlerCoroutine) objArr[i2];
                        pointerEventHandlerCoroutine.getClass();
                        pointerEvent.getClass();
                        if (pointerEventPass == pointerEventHandlerCoroutine.d && (qoVar = pointerEventHandlerCoroutine.c) != null) {
                            pointerEventHandlerCoroutine.c = null;
                            qoVar.resumeWith(pointerEvent);
                        }
                        i2++;
                    } while (i2 < i);
                }
            } else if (iOrdinal == 1) {
                MutableVector mutableVector3 = this.g;
                int i3 = mutableVector3.c;
                if (i3 > 0) {
                    int i4 = i3 - 1;
                    Object[] objArr2 = mutableVector3.a;
                    do {
                        PointerEventHandlerCoroutine pointerEventHandlerCoroutine2 = (PointerEventHandlerCoroutine) objArr2[i4];
                        pointerEventHandlerCoroutine2.getClass();
                        pointerEvent.getClass();
                        if (pointerEventPass == pointerEventHandlerCoroutine2.d && (qoVar2 = pointerEventHandlerCoroutine2.c) != null) {
                            pointerEventHandlerCoroutine2.c = null;
                            qoVar2.resumeWith(pointerEvent);
                        }
                        i4--;
                    } while (i4 >= 0);
                }
            } else if (iOrdinal == 2) {
                mutableVector = this.g;
                i = mutableVector.c;
                if (i > 0) {
                    objArr = mutableVector.a;
                    i2 = 0;
                    do {
                        pointerEventHandlerCoroutine = (PointerEventHandlerCoroutine) objArr[i2];
                        pointerEventHandlerCoroutine.getClass();
                        pointerEvent.getClass();
                        if (pointerEventPass == pointerEventHandlerCoroutine.d) {
                            pointerEventHandlerCoroutine.c = null;
                            qoVar.resumeWith(pointerEvent);
                        }
                        i2++;
                    } while (i2 < i);
                }
            }
        } finally {
            this.g.h();
        }
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: getDensity */
    public final float getB() {
        return this.d.getB();
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: getFontScale */
    public final float getC() {
        return this.d.getC();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    /* JADX INFO: renamed from: getViewConfiguration, reason: from getter */
    public final ViewConfiguration getC() {
        return this.c;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    public final void k0() {
        PointerEvent pointerEvent = this.h;
        if (pointerEvent == null) {
            return;
        }
        List list = pointerEvent.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((PointerInputChange) list.get(i)).d) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    PointerInputChange pointerInputChange = (PointerInputChange) list.get(i2);
                    long j = pointerInputChange.a;
                    long j2 = pointerInputChange.c;
                    long j3 = pointerInputChange.b;
                    boolean z = pointerInputChange.d;
                    arrayList.add(new PointerInputChange(j, j3, j2, false, j3, j2, z, z, 1, Offset.b));
                }
                PointerEvent pointerEvent2 = new PointerEvent(arrayList, null);
                this.e = pointerEvent2;
                F0(pointerEvent2, PointerEventPass.a);
                F0(pointerEvent2, PointerEventPass.b);
                F0(pointerEvent2, PointerEventPass.c);
                this.h = null;
                return;
            }
        }
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    public final int mo0roundToPxR2X_6o(long j) {
        return this.d.mo0roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    public final int mo1roundToPx0680j_4(float f) {
        return this.d.mo1roundToPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    public final float mo2toDpGaN1DYA(long j) {
        return this.d.mo2toDpGaN1DYA(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public final float mo3toDpu2uoSUM(float f) {
        return this.d.mo3toDpu2uoSUM(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    public final long mo5toDpSizekrfVVM(long j) {
        return this.d.mo5toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx--R2X_6o */
    public final float mo6toPxR2X_6o(long j) {
        return this.d.mo6toPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx-0680j_4 */
    public final float mo7toPx0680j_4(float f) {
        return this.d.mo7toPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    public final long mo8toSizeXkaWNTQ(long j) {
        return this.d.mo8toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-0xMU5do */
    public final long mo9toSp0xMU5do(float f) {
        return this.d.mo9toSp0xMU5do(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public final long mo10toSpkPz2Gy4(float f) {
        return this.d.mo10toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public final Object z(zr0 zr0Var, dy dyVar) {
        qo qoVar = new qo(1, kc2.q(dyVar));
        qoVar.s();
        PointerEventHandlerCoroutine pointerEventHandlerCoroutine = new PointerEventHandlerCoroutine(qoVar);
        synchronized (this.f) {
            this.f.b(pointerEventHandlerCoroutine);
            new y62(kc2.q(kc2.k(pointerEventHandlerCoroutine, pointerEventHandlerCoroutine, zr0Var)), dz.a).resumeWith(az2.a);
        }
        qoVar.v(new SuspendingPointerInputFilter$awaitPointerEventScope$2$2(pointerEventHandlerCoroutine));
        return qoVar.r();
    }

    public SuspendingPointerInputFilter(ViewConfiguration viewConfiguration, Density density) {
        viewConfiguration.getClass();
        density.getClass();
        this.c = viewConfiguration;
        this.d = density;
        this.e = SuspendingPointerInputFilterKt.a;
        MutableVector mutableVector = new MutableVector();
        mutableVector.a = new PointerEventHandlerCoroutine[16];
        mutableVector.c = 0;
        this.f = mutableVector;
        MutableVector mutableVector2 = new MutableVector();
        mutableVector2.a = new PointerEventHandlerCoroutine[16];
        mutableVector2.c = 0;
        this.g = mutableVector2;
        this.i = 0L;
        this.j = ku0.a;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    public final void E0(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        pointerEvent.getClass();
        this.i = j;
        if (pointerEventPass == PointerEventPass.a) {
            this.e = pointerEvent;
        }
        F0(pointerEvent, pointerEventPass);
        List list = pointerEvent.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!PointerEventKt.d((PointerInputChange) list.get(i))) {
                this.h = pointerEvent;
            }
        }
        pointerEvent = null;
        this.h = pointerEvent;
    }

    @Override // androidx.compose.ui.unit.Density
    public final Rect toRect(DpRect dpRect) {
        dpRect.getClass();
        return this.d.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public final float mo4toDpu2uoSUM(int i) {
        return this.d.mo4toDpu2uoSUM(i);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public final long mo11toSpkPz2Gy4(int i) {
        return this.d.mo11toSpkPz2Gy4(i);
    }
}
