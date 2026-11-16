package androidx.compose.runtime;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/OffsetApplier;", "N", "Landroidx/compose/runtime/Applier;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class OffsetApplier<N> implements Applier<N> {
    public final Applier a;
    public final int b;
    public int c;

    @Override // androidx.compose.runtime.Applier
    public final void a(int i, int i2) {
        this.a.a(i + (this.c == 0 ? this.b : 0), i2);
    }

    @Override // androidx.compose.runtime.Applier
    public final void c(int i, int i2, int i3) {
        int i4 = this.c == 0 ? this.b : 0;
        this.a.c(i + i4, i2 + i4, i3);
    }

    @Override // androidx.compose.runtime.Applier
    public final void d(int i, Object obj) {
        this.a.d(i + (this.c == 0 ? this.b : 0), obj);
    }

    @Override // androidx.compose.runtime.Applier
    public final Object e() {
        return this.a.e();
    }

    @Override // androidx.compose.runtime.Applier
    public final void f(int i, Object obj) {
        this.a.f(i + (this.c == 0 ? this.b : 0), obj);
    }

    @Override // androidx.compose.runtime.Applier
    public final void g(Object obj) {
        this.c++;
        this.a.g(obj);
    }

    @Override // androidx.compose.runtime.Applier
    public final void h() {
        int i = this.c;
        if (i <= 0) {
            ComposerKt.c("OffsetApplier up called with no corresponding down");
            throw null;
        }
        this.c = i - 1;
        this.a.h();
    }

    public OffsetApplier(Applier applier, int i) {
        applier.getClass();
        this.a = applier;
        this.b = i;
    }
}
