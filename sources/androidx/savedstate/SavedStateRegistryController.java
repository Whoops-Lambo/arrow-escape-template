package androidx.savedstate;

import android.os.Bundle;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.Lifecycle;
import defpackage.e32;
import defpackage.m72;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/savedstate/SavedStateRegistryController;", "", "Companion", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SavedStateRegistryController {
    public final SavedStateRegistryOwner a;
    public final SavedStateRegistry b = new SavedStateRegistry();
    public boolean c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/savedstate/SavedStateRegistryController$Companion;", "", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public final void a() {
        SavedStateRegistryOwner savedStateRegistryOwner = this.a;
        Lifecycle lifecycle = savedStateRegistryOwner.getLifecycle();
        if (lifecycle.getD() != Lifecycle.State.b) {
            e32.i("Restarter must be created only during owner's initialization stage");
            return;
        }
        lifecycle.a(new Recreator(savedStateRegistryOwner));
        SavedStateRegistry savedStateRegistry = this.b;
        savedStateRegistry.getClass();
        if (savedStateRegistry.b) {
            e32.i("SavedStateRegistry was already attached.");
            return;
        }
        lifecycle.a(new m72(savedStateRegistry, 0));
        savedStateRegistry.b = true;
        this.c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.c) {
            a();
        }
        Lifecycle lifecycle = this.a.getLifecycle();
        if (lifecycle.getD().compareTo(Lifecycle.State.d) >= 0) {
            e32.h(lifecycle.getD(), "performRestore cannot be called when owner is ");
            return;
        }
        SavedStateRegistry savedStateRegistry = this.b;
        if (!savedStateRegistry.b) {
            e32.i("You must call performAttach() before calling performRestore(Bundle).");
        } else if (savedStateRegistry.d) {
            e32.i("SavedStateRegistry was already restored.");
        } else {
            savedStateRegistry.c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
            savedStateRegistry.d = true;
        }
    }

    public final void c(Bundle bundle) {
        SavedStateRegistry savedStateRegistry = this.b;
        savedStateRegistry.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = savedStateRegistry.c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        SafeIterableMap safeIterableMap = savedStateRegistry.a;
        safeIterableMap.getClass();
        SafeIterableMap.IteratorWithAdditions iteratorWithAdditions = new SafeIterableMap.IteratorWithAdditions();
        safeIterableMap.c.put(iteratorWithAdditions, Boolean.FALSE);
        while (iteratorWithAdditions.hasNext()) {
            Map.Entry entry = (Map.Entry) iteratorWithAdditions.next();
            bundle2.putBundle((String) entry.getKey(), ((SavedStateRegistry.SavedStateProvider) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public SavedStateRegistryController(SavedStateRegistryOwner savedStateRegistryOwner) {
        this.a = savedStateRegistryOwner;
    }
}
