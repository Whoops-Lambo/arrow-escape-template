package androidx.core.view;

import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import defpackage.hl1;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class MenuHostHelper {
    public final Runnable a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final HashMap c = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class LifecycleContainer {
        public final Lifecycle a;
        public LifecycleEventObserver b;

        public LifecycleContainer(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
            this.a = lifecycle;
            this.b = lifecycleEventObserver;
            lifecycle.a(lifecycleEventObserver);
        }
    }

    public final void a(MenuProvider menuProvider, LifecycleOwner lifecycleOwner) {
        this.b.add(menuProvider);
        this.a.run();
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        HashMap map = this.c;
        LifecycleContainer lifecycleContainer = (LifecycleContainer) map.remove(menuProvider);
        if (lifecycleContainer != null) {
            lifecycleContainer.a.c(lifecycleContainer.b);
            lifecycleContainer.b = null;
        }
        map.put(menuProvider, new LifecycleContainer(lifecycle, new hl1(0, this, menuProvider)));
    }

    public final void c(MenuProvider menuProvider) {
        this.b.remove(menuProvider);
        LifecycleContainer lifecycleContainer = (LifecycleContainer) this.c.remove(menuProvider);
        if (lifecycleContainer != null) {
            lifecycleContainer.a.c(lifecycleContainer.b);
            lifecycleContainer.b = null;
        }
        this.a.run();
    }

    public MenuHostHelper(Runnable runnable) {
        this.a = runnable;
    }

    public final void b(final MenuProvider menuProvider, LifecycleOwner lifecycleOwner, final Lifecycle.State state) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        HashMap map = this.c;
        LifecycleContainer lifecycleContainer = (LifecycleContainer) map.remove(menuProvider);
        if (lifecycleContainer != null) {
            lifecycleContainer.a.c(lifecycleContainer.b);
            lifecycleContainer.b = null;
        }
        map.put(menuProvider, new LifecycleContainer(lifecycle, new LifecycleEventObserver() { // from class: gl1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                MenuHostHelper menuHostHelper = this.a;
                Runnable runnable = menuHostHelper.a;
                CopyOnWriteArrayList copyOnWriteArrayList = menuHostHelper.b;
                Lifecycle.Event.INSTANCE.getClass();
                Lifecycle.State state2 = state;
                Lifecycle.Event eventB = Lifecycle.Event.Companion.b(state2);
                MenuProvider menuProvider2 = menuProvider;
                if (event == eventB) {
                    copyOnWriteArrayList.add(menuProvider2);
                    runnable.run();
                } else if (event == Lifecycle.Event.ON_DESTROY) {
                    menuHostHelper.c(menuProvider2);
                } else if (event == Lifecycle.Event.Companion.a(state2)) {
                    copyOnWriteArrayList.remove(menuProvider2);
                    runnable.run();
                }
            }
        }));
    }
}
