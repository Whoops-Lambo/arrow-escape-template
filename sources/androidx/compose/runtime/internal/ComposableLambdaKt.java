package androidx.compose.runtime.internal;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImpl;
import defpackage.d;
import defpackage.s71;
import defpackage.xr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ComposableLambdaKt {
    /* JADX WARN: Code duplicated, block: B:16:0x0021  */
    public static final boolean d(RecomposeScope recomposeScope, RecomposeScope recomposeScope2) {
        boolean z;
        if (recomposeScope != null) {
            if ((recomposeScope instanceof RecomposeScopeImpl) && (recomposeScope2 instanceof RecomposeScopeImpl)) {
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) recomposeScope;
                if (recomposeScopeImpl.b == null) {
                    z = false;
                } else {
                    Anchor anchor = recomposeScopeImpl.c;
                    if (anchor != null ? anchor.a() : false) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    if ((recomposeScope == recomposeScope2) || s71.b(recomposeScopeImpl.c, ((RecomposeScopeImpl) recomposeScope2).c)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static final int a(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final ComposableLambdaImpl b(Composer composer, int i, xr0 xr0Var) {
        ComposableLambdaImpl composableLambdaImpl;
        composer.getClass();
        composer.B(i);
        Object objC = composer.C();
        if (objC == Composer.Companion.a) {
            composableLambdaImpl = new ComposableLambdaImpl(i, true);
            composer.x(composableLambdaImpl);
        } else if (objC != null) {
            composableLambdaImpl = (ComposableLambdaImpl) objC;
        } else {
            d.w("null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            return null;
        }
        composableLambdaImpl.j(xr0Var);
        composer.J();
        return composableLambdaImpl;
    }

    public static final ComposableLambdaImpl c(int i, Object obj, boolean z) {
        obj.getClass();
        ComposableLambdaImpl composableLambdaImpl = new ComposableLambdaImpl(i, z);
        composableLambdaImpl.j(obj);
        return composableLambdaImpl;
    }
}
