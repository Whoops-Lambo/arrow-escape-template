package androidx.compose.foundation.lazy;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import defpackage.az2;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.kc2;
import defpackage.wz2;
import defpackage.y62;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/AwaitFirstLayoutModifier;", "Landroidx/compose/ui/layout/OnGloballyPositionedModifier;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AwaitFirstLayoutModifier implements OnGloballyPositionedModifier {
    public boolean a;
    public y62 b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(fy fyVar) throws Throwable {
        AwaitFirstLayoutModifier$waitForFirstLayout$1 awaitFirstLayoutModifier$waitForFirstLayout$1;
        y62 y62Var;
        if (fyVar instanceof AwaitFirstLayoutModifier$waitForFirstLayout$1) {
            awaitFirstLayoutModifier$waitForFirstLayout$1 = (AwaitFirstLayoutModifier$waitForFirstLayout$1) fyVar;
            int i = awaitFirstLayoutModifier$waitForFirstLayout$1.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                awaitFirstLayoutModifier$waitForFirstLayout$1.u = i - Integer.MIN_VALUE;
            } else {
                awaitFirstLayoutModifier$waitForFirstLayout$1 = new AwaitFirstLayoutModifier$waitForFirstLayout$1(this, fyVar);
            }
        } else {
            awaitFirstLayoutModifier$waitForFirstLayout$1 = new AwaitFirstLayoutModifier$waitForFirstLayout$1(this, fyVar);
        }
        Object obj = awaitFirstLayoutModifier$waitForFirstLayout$1.s;
        int i2 = awaitFirstLayoutModifier$waitForFirstLayout$1.u;
        az2 az2Var = az2.a;
        if (i2 == 0) {
            wz2.a0(obj);
            if (!this.a) {
                y62 y62Var2 = this.b;
                awaitFirstLayoutModifier$waitForFirstLayout$1.r = y62Var2;
                awaitFirstLayoutModifier$waitForFirstLayout$1.u = 1;
                y62 y62Var3 = new y62(kc2.q(awaitFirstLayoutModifier$waitForFirstLayout$1), dz.b);
                this.b = y62Var3;
                Object objB = y62Var3.b();
                dz dzVar = dz.a;
                if (objB == dzVar) {
                    return dzVar;
                }
                y62Var = y62Var2;
            }
            return az2Var;
        }
        if (i2 != 1) {
            e32.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y62Var = awaitFirstLayoutModifier$waitForFirstLayout$1.r;
        wz2.a0(obj);
        if (y62Var != null) {
            y62Var.resumeWith(az2Var);
        }
        return az2Var;
    }

    @Override // androidx.compose.ui.layout.OnGloballyPositionedModifier
    public final void x0(LayoutCoordinates layoutCoordinates) {
        layoutCoordinates.getClass();
        if (!this.a) {
            this.a = true;
            y62 y62Var = this.b;
            if (y62Var != null) {
                y62Var.resumeWith(az2.a);
            }
            this.b = null;
        }
    }
}
