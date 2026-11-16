package defpackage;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.unity3d.services.UnityAdsConstants;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class wl2 implements AccessibilityViewCommand {
    public final /* synthetic */ SwipeDismissBehavior a;

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public final boolean a(View view) {
        SwipeDismissBehavior swipeDismissBehavior = this.a;
        if (!swipeDismissBehavior.s(view)) {
            return false;
        }
        WeakHashMap weakHashMap = ViewCompat.a;
        boolean z = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.d;
        view.offsetLeftAndRight((!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        return true;
    }

    public wl2(SwipeDismissBehavior swipeDismissBehavior) {
        this.a = swipeDismissBehavior;
    }
}
