package defpackage;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.SavedStateHandle;
import androidx.p003activity.ComponentActivity;
import androidx.savedstate.SavedStateRegistry;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tv implements SavedStateRegistry.SavedStateProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tv(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public final Bundle a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ComponentActivity.g((ComponentActivity) obj);
            case 1:
                return ((FragmentManager) obj).X();
            default:
                return SavedStateHandle.a((SavedStateHandle) obj);
        }
    }
}
