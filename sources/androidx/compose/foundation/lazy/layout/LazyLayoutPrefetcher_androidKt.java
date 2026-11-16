package androidx.compose.foundation.lazy.layout;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class LazyLayoutPrefetcher_androidKt {
    public static final void a(LazyLayoutPrefetchState lazyLayoutPrefetchState, LazyLayoutItemContentFactory lazyLayoutItemContentFactory, SubcomposeLayoutState subcomposeLayoutState, Composer composer, int i) {
        lazyLayoutItemContentFactory.getClass();
        subcomposeLayoutState.getClass();
        ComposerImpl composerImplT = composer.t(1113453182);
        View view = (View) composerImplT.v(AndroidCompositionLocals_androidKt.f);
        composerImplT.B(1618982084);
        boolean zL = composerImplT.l(subcomposeLayoutState) | composerImplT.l(lazyLayoutPrefetchState) | composerImplT.l(view);
        Object objB0 = composerImplT.b0();
        if (zL || objB0 == Composer.Companion.a) {
            composerImplT.C0(new LazyLayoutPrefetcher(lazyLayoutPrefetchState, subcomposeLayoutState, lazyLayoutItemContentFactory, view));
        }
        composerImplT.R(false);
        RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT == null) {
            return;
        }
        recomposeScopeImplT.d = new LazyLayoutPrefetcher_androidKt$LazyLayoutPrefetcher$2(lazyLayoutPrefetchState, lazyLayoutItemContentFactory, subcomposeLayoutState, i);
    }
}
