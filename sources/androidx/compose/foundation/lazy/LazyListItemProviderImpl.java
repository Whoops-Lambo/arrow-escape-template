package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListItemProviderImpl;", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LazyListItemProviderImpl implements LazyListItemProvider {
    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final Object a(int i) {
        throw null;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final Map c() {
        throw null;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final Object d(int i) {
        throw null;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    public final LazyItemScopeImpl e() {
        return null;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final int f() {
        throw null;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    public final List g() {
        throw null;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final void b(int i, Composer composer, int i2) {
        int i3;
        int i4;
        ComposerImpl composerImplT = composer.t(1704733014);
        if (composerImplT.p(i)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if (composerImplT.l(this)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        if (((i5 | i4) & 91) == 18 && composerImplT.b()) {
            composerImplT.h();
            RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
            if (recomposeScopeImplT == null) {
                return;
            }
            recomposeScopeImplT.d = new LazyListItemProviderImpl$Item$1(this, i, i2);
            return;
        }
        throw null;
    }
}
