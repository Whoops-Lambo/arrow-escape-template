package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import com.unity3d.services.UnityAdsConstants;
import defpackage.s71;
import defpackage.sr0;
import defpackage.zr0;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "", "CachedItemContent", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LazyLayoutItemContentFactory {
    public final SaveableStateHolder a;
    public final sr0 b;
    public final LinkedHashMap c;
    public Density d;
    public long e;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent;", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class CachedItemContent {
        public final Object a;
        public final Object b;
        public final ParcelableSnapshotMutableState c;
        public ComposableLambdaImpl d;
        public final /* synthetic */ LazyLayoutItemContentFactory e;

        public CachedItemContent(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, int i, Object obj, Object obj2) {
            obj.getClass();
            this.e = lazyLayoutItemContentFactory;
            this.a = obj;
            this.b = obj2;
            this.c = SnapshotStateKt.c(Integer.valueOf(i), StructuralEqualityPolicy.a);
        }
    }

    public final Object b(Object obj) {
        CachedItemContent cachedItemContent = (CachedItemContent) this.c.get(obj);
        if (cachedItemContent != null) {
            return cachedItemContent.b;
        }
        LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) ((LazyLayoutKt$LazyLayout$itemContentFactory$1$1) this.b).invoke();
        Integer num = (Integer) lazyLayoutItemProvider.c().get(obj);
        if (num != null) {
            return lazyLayoutItemProvider.a(num.intValue());
        }
        return null;
    }

    public LazyLayoutItemContentFactory(SaveableStateHolder saveableStateHolder, sr0 sr0Var) {
        saveableStateHolder.getClass();
        this.a = saveableStateHolder;
        this.b = sr0Var;
        this.c = new LinkedHashMap();
        this.d = DensityKt.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.e = ConstraintsKt.b(0, 0, 15);
    }

    public final zr0 a(int i, Object obj) {
        obj.getClass();
        LinkedHashMap linkedHashMap = this.c;
        CachedItemContent cachedItemContent = (CachedItemContent) linkedHashMap.get(obj);
        Object objA = ((LazyLayoutItemProvider) ((LazyLayoutKt$LazyLayout$itemContentFactory$1$1) this.b).invoke()).a(i);
        if (cachedItemContent != null && ((Number) cachedItemContent.c.getA()).intValue() == i && s71.b(cachedItemContent.b, objA)) {
            ComposableLambdaImpl composableLambdaImpl = cachedItemContent.d;
            if (composableLambdaImpl == null) {
                ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(1403994769, new LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1(cachedItemContent.e, cachedItemContent), true);
                cachedItemContent.d = composableLambdaImplC;
                return composableLambdaImplC;
            }
            return composableLambdaImpl;
        }
        CachedItemContent cachedItemContent2 = new CachedItemContent(this, i, obj, objA);
        linkedHashMap.put(obj, cachedItemContent2);
        ComposableLambdaImpl composableLambdaImpl2 = cachedItemContent2.d;
        if (composableLambdaImpl2 == null) {
            ComposableLambdaImpl composableLambdaImplC2 = ComposableLambdaKt.c(1403994769, new LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1(this, cachedItemContent2), true);
            cachedItemContent2.d = composableLambdaImplC2;
            return composableLambdaImplC2;
        }
        return composableLambdaImpl2;
    }
}
