package androidx.compose.runtime;

import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/DisposableEffectImpl;", "Landroidx/compose/runtime/RememberObserver;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class DisposableEffectImpl implements RememberObserver {
    public final wr0 a;
    public DisposableEffectResult b;

    @Override // androidx.compose.runtime.RememberObserver
    public final void d() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void a() {
        this.b = (DisposableEffectResult) this.a.invoke(EffectsKt.a);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void e() {
        DisposableEffectResult disposableEffectResult = this.b;
        if (disposableEffectResult != null) {
            disposableEffectResult.dispose();
        }
        this.b = null;
    }

    public DisposableEffectImpl(wr0 wr0Var) {
        wr0Var.getClass();
        this.a = wr0Var;
    }
}
