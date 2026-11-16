package androidx.compose.runtime;

import defpackage.c91;
import defpackage.dn;
import defpackage.e91;
import defpackage.kc2;
import defpackage.kv;
import defpackage.nl0;
import defpackage.sr0;
import defpackage.sy;
import defpackage.u12;
import defpackage.wr0;
import defpackage.zr0;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class EffectsKt {
    public static final DisposableEffectScope a = new DisposableEffectScope();

    public static final void a(Object obj, wr0 wr0Var, Composer composer) {
        wr0Var.getClass();
        composer.B(-1371986847);
        composer.B(1157296644);
        boolean zL = composer.l(obj);
        Object objC = composer.C();
        if (zL || objC == Composer.Companion.a) {
            composer.x(new DisposableEffectImpl(wr0Var));
        }
        composer.J();
        composer.J();
    }

    public static final void b(Object obj, Object obj2, wr0 wr0Var, Composer composer) {
        wr0Var.getClass();
        composer.B(1429097729);
        composer.B(511388516);
        boolean zL = composer.l(obj) | composer.l(obj2);
        Object objC = composer.C();
        if (zL || objC == Composer.Companion.a) {
            composer.x(new DisposableEffectImpl(wr0Var));
        }
        composer.J();
        composer.J();
    }

    public static final void c(zr0 zr0Var, Composer composer, Object obj) {
        zr0Var.getClass();
        composer.B(1179185413);
        sy syVarW = composer.w();
        composer.B(1157296644);
        boolean zL = composer.l(obj);
        Object objC = composer.C();
        if (zL || objC == Composer.Companion.a) {
            composer.x(new LaunchedEffectImpl(syVarW, zr0Var));
        }
        composer.J();
        composer.J();
    }

    public static final void d(Object obj, Object obj2, zr0 zr0Var, Composer composer) {
        zr0Var.getClass();
        composer.B(590241125);
        sy syVarW = composer.w();
        composer.B(511388516);
        boolean zL = composer.l(obj) | composer.l(obj2);
        Object objC = composer.C();
        if (zL || objC == Composer.Companion.a) {
            composer.x(new LaunchedEffectImpl(syVarW, zr0Var));
        }
        composer.J();
        composer.J();
    }

    public static final void e(Object obj, Object obj2, Object obj3, zr0 zr0Var, Composer composer) {
        zr0Var.getClass();
        composer.B(-54093371);
        sy syVarW = composer.w();
        composer.B(1618982084);
        boolean zL = composer.l(obj) | composer.l(obj2) | composer.l(obj3);
        Object objC = composer.C();
        if (zL || objC == Composer.Companion.a) {
            composer.x(new LaunchedEffectImpl(syVarW, zr0Var));
        }
        composer.J();
        composer.J();
    }

    public static final void f(Object[] objArr, zr0 zr0Var, Composer composer) {
        objArr.getClass();
        composer.B(-139560008);
        sy syVarW = composer.w();
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        composer.B(-568225417);
        boolean zL = false;
        for (Object obj : objArrCopyOf) {
            zL |= composer.l(obj);
        }
        Object objC = composer.C();
        if (zL || objC == Composer.Companion.a) {
            composer.x(new LaunchedEffectImpl(syVarW, zr0Var));
        }
        composer.J();
        composer.J();
    }

    public static final void g(sr0 sr0Var, Composer composer) {
        sr0Var.getClass();
        composer.B(-1288466761);
        composer.i(sr0Var);
        composer.J();
    }

    public static final dn h(sy syVar, Composer composer) {
        syVar.getClass();
        composer.getClass();
        nl0 nl0Var = nl0.i;
        if (syVar.get(nl0Var) != null) {
            e91 e91VarA = u12.a();
            e91VarA.M(new kv(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"), false));
            return kc2.a(e91VarA);
        }
        sy syVarW = composer.w();
        return kc2.a(syVarW.plus(new e91((c91) syVarW.get(nl0Var))).plus(syVar));
    }
}
