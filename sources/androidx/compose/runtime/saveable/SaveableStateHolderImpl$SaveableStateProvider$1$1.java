package androidx.compose.runtime.saveable;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import defpackage.e32;
import defpackage.rc1;
import defpackage.wr0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class SaveableStateHolderImpl$SaveableStateProvider$1$1 extends rc1 implements wr0 {
    public final /* synthetic */ SaveableStateHolderImpl i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ SaveableStateHolderImpl.RegistryHolder k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveableStateHolderImpl$SaveableStateProvider$1$1(SaveableStateHolderImpl.RegistryHolder registryHolder, SaveableStateHolderImpl saveableStateHolderImpl, Object obj) {
        super(1);
        this.i = saveableStateHolderImpl;
        this.j = obj;
        this.k = registryHolder;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        ((DisposableEffectScope) obj).getClass();
        final SaveableStateHolderImpl saveableStateHolderImpl = this.i;
        LinkedHashMap linkedHashMap = saveableStateHolderImpl.b;
        final Object obj2 = this.j;
        if (linkedHashMap.containsKey(obj2)) {
            e32.n(obj2, " was used multiple times ", "Key ");
            return null;
        }
        saveableStateHolderImpl.a.remove(obj2);
        final SaveableStateHolderImpl.RegistryHolder registryHolder = this.k;
        linkedHashMap.put(obj2, registryHolder);
        return new DisposableEffectResult() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$SaveableStateProvider$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                SaveableStateHolderImpl saveableStateHolderImpl2 = saveableStateHolderImpl;
                Map map = saveableStateHolderImpl2.a;
                map.getClass();
                SaveableStateHolderImpl.RegistryHolder registryHolder2 = registryHolder;
                Map mapB = ((SaveableStateRegistryImpl) registryHolder2.b).b();
                boolean zIsEmpty = mapB.isEmpty();
                Object obj3 = registryHolder2.a;
                if (zIsEmpty) {
                    map.remove(obj3);
                } else {
                    map.put(obj3, mapB);
                }
                saveableStateHolderImpl2.b.remove(obj2);
            }
        };
    }
}
