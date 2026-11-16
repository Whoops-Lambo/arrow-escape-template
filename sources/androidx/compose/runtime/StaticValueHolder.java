package androidx.compose.runtime;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.s71;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/StaticValueHolder;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/State;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class StaticValueHolder<T> implements State<T> {
    public final Object a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StaticValueHolder) && s71.b(this.a, ((StaticValueHolder) obj).a);
    }

    @Override // androidx.compose.runtime.State
    /* JADX INFO: renamed from: getValue, reason: from getter */
    public final Object getA() {
        return this.a;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.a + ')';
    }

    public StaticValueHolder(Object obj) {
        this.a = obj;
    }
}
