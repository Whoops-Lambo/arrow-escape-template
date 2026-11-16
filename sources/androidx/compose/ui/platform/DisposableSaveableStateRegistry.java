package androidx.compose.ui.platform;

import androidx.compose.runtime.saveable.SaveableStateRegistry;
import defpackage.sr0;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/DisposableSaveableStateRegistry;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class DisposableSaveableStateRegistry implements SaveableStateRegistry {
    public final sr0 a;
    public final /* synthetic */ SaveableStateRegistry b;

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final Map b() {
        return this.b.b();
    }

    public DisposableSaveableStateRegistry(SaveableStateRegistry saveableStateRegistry, sr0 sr0Var) {
        this.a = sr0Var;
        this.b = saveableStateRegistry;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final boolean a(Object obj) {
        obj.getClass();
        return this.b.a(obj);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final SaveableStateRegistry.Entry c(String str, sr0 sr0Var) {
        str.getClass();
        return this.b.c(str, sr0Var);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final Object d(String str) {
        str.getClass();
        return this.b.d(str);
    }
}
