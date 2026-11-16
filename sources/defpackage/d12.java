package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class d12 {

    @NotNull
    public static final c12 Companion = new c12();
    public Integer a;
    public g52 b;

    public final g52 b() {
        g52 g52Var = this.b;
        if (g52Var != null) {
            return g52Var;
        }
        s71.D("restrictionType");
        throw null;
    }

    public d12(Integer num, g52 g52Var) {
        this.a = num;
        this.b = g52Var;
    }

    public final String a() throws Throwable {
        boolean z;
        if (b() != g52.NOT_ALLOWED && b() != g52.REQUIRE_CONSENT && b() != g52.REQUIRE_LI) {
            z = false;
        } else {
            z = true;
        }
        Integer num = this.a;
        if (num != null && num.intValue() > 0 && z) {
            return this.a + "-" + b().a;
        }
        throw new Throwable("cannot hash invalid PurposeRestriction");
    }
}
