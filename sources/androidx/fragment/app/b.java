package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ DefaultSpecialEffectsController.TransitionEffect c;

    public /* synthetic */ b(DefaultSpecialEffectsController.TransitionEffect transitionEffect, ViewGroup viewGroup) {
        this.a = 2;
        this.c = transitionEffect;
        this.b = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        DefaultSpecialEffectsController.TransitionEffect transitionEffect = this.c;
        switch (i) {
            case 0:
                SpecialEffectsController.Operation operation = (SpecialEffectsController.Operation) obj;
                if (FragmentManager.L(2)) {
                    Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
                }
                operation.c(transitionEffect);
                break;
            case 1:
                SpecialEffectsController.Operation operation2 = (SpecialEffectsController.Operation) obj;
                if (FragmentManager.L(2)) {
                    Log.v("FragmentManager", "Transition for operation " + operation2 + " has completed");
                }
                operation2.c(transitionEffect);
                break;
            default:
                ViewGroup viewGroup = (ViewGroup) obj;
                viewGroup.getClass();
                ArrayList arrayList = transitionEffect.c;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    SpecialEffectsController.Operation operation3 = ((DefaultSpecialEffectsController.TransitionInfo) obj2).a;
                    View view = operation3.c.getView();
                    if (view != null) {
                        operation3.a.a(view, viewGroup);
                    }
                }
                break;
        }
    }

    public /* synthetic */ b(SpecialEffectsController.Operation operation, DefaultSpecialEffectsController.TransitionEffect transitionEffect, int i) {
        this.a = i;
        this.b = operation;
        this.c = transitionEffect;
    }
}
