package androidx.compose.runtime;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.sy;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/ProduceStateScopeImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/ProduceStateScope;", "Landroidx/compose/runtime/MutableState;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class ProduceStateScopeImpl<T> implements ProduceStateScope<T>, MutableState<T> {
    public final sy a;
    public final /* synthetic */ MutableState b;

    @Override // defpackage.cz
    /* JADX INFO: renamed from: getCoroutineContext, reason: from getter */
    public final sy getA() {
        return this.a;
    }

    @Override // androidx.compose.runtime.State
    /* JADX INFO: renamed from: getValue */
    public final Object getA() {
        return this.b.getA();
    }

    @Override // androidx.compose.runtime.MutableState
    public final void setValue(Object obj) {
        this.b.setValue(obj);
    }

    public ProduceStateScopeImpl(MutableState mutableState, sy syVar) {
        mutableState.getClass();
        syVar.getClass();
        this.a = syVar;
        this.b = mutableState;
    }
}
