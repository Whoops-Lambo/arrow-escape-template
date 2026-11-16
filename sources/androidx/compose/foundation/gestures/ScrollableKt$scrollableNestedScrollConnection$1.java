package androidx.compose.foundation.gestures;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.wz2;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/gestures/ScrollableKt$scrollableNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ScrollableKt$scrollableNestedScrollConnection$1 implements NestedScrollConnection {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ MutableState b;

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long c(int i, long j, long j2) {
        if (!this.a) {
            return Offset.b;
        }
        ScrollingLogic scrollingLogic = (ScrollingLogic) this.b.getA();
        ScrollableState scrollableState = scrollingLogic.d;
        boolean z = scrollingLogic.b;
        if (scrollableState.b()) {
            return Offset.b;
        }
        float fD = scrollingLogic.d(j2);
        if (z) {
            fD *= -1.0f;
        }
        float fA = scrollableState.a(fD);
        if (z) {
            fA *= -1.0f;
        }
        return scrollingLogic.e(fA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final Object d(long j, long j2, fy fyVar) {
        ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1;
        long jC;
        if (fyVar instanceof ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1) {
            scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 = (ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1) fyVar;
            int i = scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.u = i - Integer.MIN_VALUE;
            } else {
                scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 = new ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1(this, fyVar);
            }
        } else {
            scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 = new ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1(this, fyVar);
        }
        Object objB = scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.s;
        int i2 = scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.u;
        if (i2 == 0) {
            wz2.a0(objB);
            if (this.a) {
                ScrollingLogic scrollingLogic = (ScrollingLogic) this.b.getA();
                scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.r = j2;
                scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.u = 1;
                objB = scrollingLogic.b(j2, scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1);
                dz dzVar = dz.a;
                if (objB == dzVar) {
                    return dzVar;
                }
            } else {
                jC = Velocity.b;
            }
            return new Velocity(jC);
        }
        if (i2 != 1) {
            e32.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.r;
        wz2.a0(objB);
        jC = Velocity.c(j2, ((Velocity) objB).a);
        return new Velocity(jC);
    }

    public ScrollableKt$scrollableNestedScrollConnection$1(MutableState mutableState, boolean z) {
        this.a = z;
        this.b = mutableState;
    }
}
