package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import defpackage.az2;
import defpackage.e32;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "Companion", "RegistryHolder", "runtime-saveable_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class SaveableStateHolderImpl implements SaveableStateHolder {
    public static final SaverKt$Saver$1 d = SaverKt.a(SaveableStateHolderImpl$Companion$Saver$1.i, SaveableStateHolderImpl$Companion$Saver$2.i);
    public final Map a;
    public final LinkedHashMap b;
    public SaveableStateRegistry c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$Companion;", "", "runtime-saveable_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$RegistryHolder;", "", "runtime-saveable_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class RegistryHolder {
        public final Object a;
        public final SaveableStateRegistry b;

        public RegistryHolder(SaveableStateHolderImpl saveableStateHolderImpl, Object obj) {
            obj.getClass();
            this.a = obj;
            Map map = (Map) saveableStateHolderImpl.a.get(obj);
            SaveableStateHolderImpl$RegistryHolder$registry$1 saveableStateHolderImpl$RegistryHolder$registry$1 = new SaveableStateHolderImpl$RegistryHolder$registry$1(saveableStateHolderImpl);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = SaveableStateRegistryKt.a;
            this.b = new SaveableStateRegistryImpl(map, saveableStateHolderImpl$RegistryHolder$registry$1);
        }
    }

    public SaveableStateHolderImpl(Map map) {
        map.getClass();
        this.a = map;
        this.b = new LinkedHashMap();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public final void a(Object obj, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        boolean zA;
        obj.getClass();
        ComposerImpl composerImplT = composer.t(-1198538093);
        composerImplT.B(444418301);
        composerImplT.f(obj);
        composerImplT.B(-642722479);
        composerImplT.B(-492369756);
        Object objB0 = composerImplT.b0();
        if (objB0 == Composer.Companion.a) {
            SaveableStateRegistry saveableStateRegistry = this.c;
            if (saveableStateRegistry != null) {
                zA = saveableStateRegistry.a(obj);
            } else {
                zA = true;
            }
            if (zA) {
                objB0 = new RegistryHolder(this, obj);
                composerImplT.C0(objB0);
            } else {
                e32.n(obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.", "Type of the key ");
                return;
            }
        }
        composerImplT.R(false);
        RegistryHolder registryHolder = (RegistryHolder) objB0;
        CompositionLocalKt.a(new ProvidedValue[]{SaveableStateRegistryKt.a.b(registryHolder.b)}, composableLambdaImpl, composerImplT, 56);
        EffectsKt.a(az2.a, new SaveableStateHolderImpl$SaveableStateProvider$1$1(registryHolder, this, obj), composerImplT);
        composerImplT.R(false);
        composerImplT.A();
        composerImplT.R(false);
        RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT == null) {
            return;
        }
        recomposeScopeImplT.d = new SaveableStateHolderImpl$SaveableStateProvider$2(this, obj, composableLambdaImpl, i);
    }
}
