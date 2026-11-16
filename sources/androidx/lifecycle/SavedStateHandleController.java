package androidx.lifecycle;

import androidx.savedstate.SavedStateRegistry;
import defpackage.e32;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/SavedStateHandleController;", "Landroidx/lifecycle/LifecycleEventObserver;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SavedStateHandleController implements LifecycleEventObserver {
    public final String a;
    public final SavedStateHandle b;
    public boolean c;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.c = false;
            lifecycleOwner.getLifecycle().c(this);
        }
    }

    public SavedStateHandleController(String str, SavedStateHandle savedStateHandle) {
        this.a = str;
        this.b = savedStateHandle;
    }

    public final void a(Lifecycle lifecycle, SavedStateRegistry savedStateRegistry) {
        savedStateRegistry.getClass();
        lifecycle.getClass();
        if (!this.c) {
            this.c = true;
            lifecycle.a(this);
            savedStateRegistry.c(this.a, this.b.e);
            return;
        }
        e32.i("Already attached to lifecycleOwner");
    }
}
