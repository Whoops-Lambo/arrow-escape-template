package androidx.compose.runtime.saveable;

import defpackage.qh1;
import defpackage.rc1;
import defpackage.zr0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a$\u0012\u0004\u0012\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00050\u0003\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "", "", "", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
public final class SaveableStateHolderImpl$Companion$Saver$1 extends rc1 implements zr0 {
    public static final SaveableStateHolderImpl$Companion$Saver$1 i = new SaveableStateHolderImpl$Companion$Saver$1(2);

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        SaveableStateHolderImpl saveableStateHolderImpl = (SaveableStateHolderImpl) obj2;
        ((SaverScope) obj).getClass();
        saveableStateHolderImpl.getClass();
        LinkedHashMap linkedHashMapI0 = qh1.i0(saveableStateHolderImpl.a);
        for (SaveableStateHolderImpl.RegistryHolder registryHolder : saveableStateHolderImpl.b.values()) {
            registryHolder.getClass();
            Map mapB = ((SaveableStateRegistryImpl) registryHolder.b).b();
            boolean zIsEmpty = mapB.isEmpty();
            Object obj3 = registryHolder.a;
            if (zIsEmpty) {
                linkedHashMapI0.remove(obj3);
            } else {
                linkedHashMapI0.put(obj3, mapB);
            }
        }
        if (linkedHashMapI0.isEmpty()) {
            return null;
        }
        return linkedHashMapI0;
    }
}
