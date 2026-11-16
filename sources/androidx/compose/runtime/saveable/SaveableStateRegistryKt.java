package androidx.compose.runtime.saveable;

import androidx.compose.runtime.StaticProvidableCompositionLocal;
import defpackage.wr0;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime-saveable_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class SaveableStateRegistryKt {
    public static final StaticProvidableCompositionLocal a = new StaticProvidableCompositionLocal(SaveableStateRegistryKt$LocalSaveableStateRegistry$1.i);

    public static final SaveableStateRegistry a(LinkedHashMap linkedHashMap, wr0 wr0Var) {
        return new SaveableStateRegistryImpl(linkedHashMap, wr0Var);
    }
}
