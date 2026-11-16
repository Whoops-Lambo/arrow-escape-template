package defpackage;

import androidx.compose.ui.platform.AbstractComposeView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistry;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class m72 implements LifecycleEventObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m72(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                SavedStateRegistry savedStateRegistry = (SavedStateRegistry) obj;
                savedStateRegistry.getClass();
                if (event == Lifecycle.Event.ON_START) {
                    savedStateRegistry.f = true;
                } else if (event == Lifecycle.Event.ON_STOP) {
                    savedStateRegistry.f = false;
                }
                break;
            default:
                AbstractComposeView abstractComposeView = (AbstractComposeView) obj;
                if (event == Lifecycle.Event.ON_DESTROY) {
                    abstractComposeView.c();
                }
                break;
        }
    }
}
