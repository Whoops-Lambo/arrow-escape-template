package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayIntMap;
import androidx.compose.runtime.collection.IdentityArrayMap;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/RecomposeScopeImpl;", "Landroidx/compose/runtime/ScopeUpdateScope;", "Landroidx/compose/runtime/RecomposeScope;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class RecomposeScopeImpl implements ScopeUpdateScope, RecomposeScope {
    public int a;
    public CompositionImpl b;
    public Anchor c;
    public zr0 d;
    public int e;
    public IdentityArrayIntMap f;
    public IdentityArrayMap g;

    public final void a(boolean z) {
        int i = this.a;
        if (z) {
            this.a = i | 32;
        } else {
            this.a = i & (-33);
        }
    }

    @Override // androidx.compose.runtime.RecomposeScope
    public final void invalidate() {
        CompositionImpl compositionImpl = this.b;
        if (compositionImpl != null) {
            compositionImpl.w(this, null);
        }
    }

    public RecomposeScopeImpl(CompositionImpl compositionImpl) {
        this.b = compositionImpl;
    }
}
