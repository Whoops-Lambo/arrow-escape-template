package androidx.compose.runtime;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.cm2;
import defpackage.sr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/LazyValueHolder;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/State;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LazyValueHolder<T> implements State<T> {
    public final cm2 a;

    @Override // androidx.compose.runtime.State
    /* JADX INFO: renamed from: getValue */
    public final Object getA() {
        return this.a.getValue();
    }

    public LazyValueHolder(sr0 sr0Var) {
        sr0Var.getClass();
        this.a = new cm2(sr0Var);
    }
}
