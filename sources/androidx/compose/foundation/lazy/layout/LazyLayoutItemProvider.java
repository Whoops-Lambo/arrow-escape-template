package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import defpackage.hg0;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Stable
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface LazyLayoutItemProvider {
    default Object a(int i) {
        return null;
    }

    void b(int i, Composer composer, int i2);

    int f();

    default Map c() {
        return hg0.a;
    }

    default Object d(int i) {
        return new DefaultLazyKey(i);
    }
}
