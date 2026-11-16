package com.moloco.sdk.internal;

import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.ecffri.arrows.R;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class e implements b, LifecycleOwner, SavedStateRegistryOwner {
    public final LifecycleRegistry a = new LifecycleRegistry(this);
    public final SavedStateRegistryController b = new SavedStateRegistryController(this);

    public static final void a(e eVar, FrameLayout frameLayout) {
        LifecycleRegistry lifecycleRegistry = eVar.a;
        View rootView = frameLayout.getRootView();
        if (rootView == null) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "RootView is absent, skipping", null, false, 12, null);
            return;
        }
        if (ViewTreeSavedStateRegistryOwner.a(rootView) == null) {
            rootView.setTag(R.id.view_tree_saved_state_registry_owner, eVar);
            try {
                eVar.b.b(null);
            } catch (Throwable unused) {
            }
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "ViewTreeSavedStateRegistryOwner is absent, setting custom one", null, false, 12, null);
        }
        if (ViewTreeLifecycleOwner.a(rootView) == null) {
            rootView.setTag(R.id.view_tree_lifecycle_owner, eVar);
            lifecycleRegistry.f(Lifecycle.Event.ON_CREATE);
            lifecycleRegistry.f(Lifecycle.Event.ON_START);
            lifecycleRegistry.f(Lifecycle.Event.ON_RESUME);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "ViewTreeLifecycleOwner is absent, setting custom one", null, false, 12, null);
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.a;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.b.b;
    }
}
