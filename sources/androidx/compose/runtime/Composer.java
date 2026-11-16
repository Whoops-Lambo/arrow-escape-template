package androidx.compose.runtime;

import defpackage.sr0;
import defpackage.sy;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/Composer;", "", "Companion", "Landroidx/compose/runtime/ComposerImpl;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface Composer {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/Composer$Companion;", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public static final Composer$Companion$Empty$1 a = new Composer$Companion$Empty$1();
    }

    void A();

    void B(int i);

    Object C();

    /* JADX INFO: renamed from: D */
    SlotTable getC();

    void E(sr0 sr0Var);

    void F(int i, Object obj);

    void G();

    /* JADX INFO: renamed from: H */
    int getL();

    void I();

    void J();

    void a(boolean z);

    boolean b();

    void c(Object obj);

    void d();

    void e();

    void f(Object obj);

    void g();

    void h();

    void i(sr0 sr0Var);

    void j(RecomposeScope recomposeScope);

    CompositionContext k();

    boolean l(Object obj);

    void o();

    /* JADX INFO: renamed from: r */
    boolean getK();

    void s(Object obj, zr0 zr0Var);

    ComposerImpl t(int i);

    Applier u();

    Object v(CompositionLocal compositionLocal);

    sy w();

    void x(Object obj);

    void y();

    RecomposeScopeImpl z();

    default boolean m(boolean z) {
        return m(z);
    }

    default boolean n(float f) {
        return n(f);
    }

    default boolean p(int i) {
        return p(i);
    }

    default boolean q(long j) {
        return q(j);
    }
}
