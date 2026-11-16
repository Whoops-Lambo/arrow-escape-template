package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/Invalidation;", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class Invalidation {
    public final RecomposeScopeImpl a;
    public final int b;
    public IdentityArraySet c;

    public Invalidation(RecomposeScopeImpl recomposeScopeImpl, int i, IdentityArraySet identityArraySet) {
        recomposeScopeImpl.getClass();
        this.a = recomposeScopeImpl;
        this.b = i;
        this.c = identityArraySet;
    }
}
