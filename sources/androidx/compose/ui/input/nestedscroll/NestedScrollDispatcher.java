package androidx.compose.ui.input.nestedscroll;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Velocity;
import defpackage.cz;
import defpackage.dn;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.sr0;
import defpackage.wz2;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class NestedScrollDispatcher {
    public sr0 a = new NestedScrollDispatcher$calculateNestedScrollScope$1(this);
    public dn b;
    public NestedScrollModifierLocal c;

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(long j, long j2, fy fyVar) {
        NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$1;
        long j3;
        if (fyVar instanceof NestedScrollDispatcher$dispatchPostFling$1) {
            nestedScrollDispatcher$dispatchPostFling$1 = (NestedScrollDispatcher$dispatchPostFling$1) fyVar;
            int i = nestedScrollDispatcher$dispatchPostFling$1.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                nestedScrollDispatcher$dispatchPostFling$1.t = i - Integer.MIN_VALUE;
            } else {
                nestedScrollDispatcher$dispatchPostFling$1 = new NestedScrollDispatcher$dispatchPostFling$1(this, fyVar);
            }
        } else {
            nestedScrollDispatcher$dispatchPostFling$1 = new NestedScrollDispatcher$dispatchPostFling$1(this, fyVar);
        }
        NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$2 = nestedScrollDispatcher$dispatchPostFling$1;
        Object objD = nestedScrollDispatcher$dispatchPostFling$2.r;
        int i2 = nestedScrollDispatcher$dispatchPostFling$2.t;
        if (i2 == 0) {
            wz2.a0(objD);
            NestedScrollModifierLocal nestedScrollModifierLocal = this.c;
            if (nestedScrollModifierLocal != null) {
                nestedScrollDispatcher$dispatchPostFling$2.t = 1;
                objD = nestedScrollModifierLocal.d(j, j2, nestedScrollDispatcher$dispatchPostFling$2);
                dz dzVar = dz.a;
                if (objD == dzVar) {
                    return dzVar;
                }
            } else {
                j3 = Velocity.b;
            }
            return new Velocity(j3);
        }
        if (i2 != 1) {
            e32.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        wz2.a0(objD);
        j3 = ((Velocity) objD).a;
        return new Velocity(j3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, fy fyVar) {
        NestedScrollDispatcher$dispatchPreFling$1 nestedScrollDispatcher$dispatchPreFling$1;
        long j2;
        if (fyVar instanceof NestedScrollDispatcher$dispatchPreFling$1) {
            nestedScrollDispatcher$dispatchPreFling$1 = (NestedScrollDispatcher$dispatchPreFling$1) fyVar;
            int i = nestedScrollDispatcher$dispatchPreFling$1.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                nestedScrollDispatcher$dispatchPreFling$1.t = i - Integer.MIN_VALUE;
            } else {
                nestedScrollDispatcher$dispatchPreFling$1 = new NestedScrollDispatcher$dispatchPreFling$1(this, fyVar);
            }
        } else {
            nestedScrollDispatcher$dispatchPreFling$1 = new NestedScrollDispatcher$dispatchPreFling$1(this, fyVar);
        }
        Object objE = nestedScrollDispatcher$dispatchPreFling$1.r;
        int i2 = nestedScrollDispatcher$dispatchPreFling$1.t;
        if (i2 == 0) {
            wz2.a0(objE);
            NestedScrollModifierLocal nestedScrollModifierLocal = this.c;
            if (nestedScrollModifierLocal != null) {
                nestedScrollDispatcher$dispatchPreFling$1.t = 1;
                objE = nestedScrollModifierLocal.e(j, nestedScrollDispatcher$dispatchPreFling$1);
                dz dzVar = dz.a;
                if (objE == dzVar) {
                    return dzVar;
                }
            } else {
                j2 = Velocity.b;
            }
            return new Velocity(j2);
        }
        if (i2 != 1) {
            e32.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        wz2.a0(objE);
        j2 = ((Velocity) objE).a;
        return new Velocity(j2);
    }

    public final cz c() {
        cz czVar = (cz) this.a.invoke();
        if (czVar != null) {
            return czVar;
        }
        e32.i("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }
}
