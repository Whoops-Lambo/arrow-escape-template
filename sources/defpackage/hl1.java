package defpackage;

import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class hl1 implements LifecycleEventObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hl1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                MenuHostHelper menuHostHelper = (MenuHostHelper) obj2;
                MenuProvider menuProvider = (MenuProvider) obj;
                if (event != Lifecycle.Event.ON_DESTROY) {
                    menuHostHelper.getClass();
                } else {
                    menuHostHelper.c(menuProvider);
                }
                break;
            default:
                f fVar = (f) obj2;
                d.f fVar2 = (d.f) obj;
                int i2 = f.a.a[event.ordinal()];
                if (i2 == 1) {
                    fVar.b.invoke();
                    break;
                } else if (i2 == 4) {
                    fVar2.invoke();
                    break;
                }
                break;
        }
    }
}
