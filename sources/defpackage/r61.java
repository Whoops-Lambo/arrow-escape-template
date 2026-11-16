package defpackage;

import android.view.View;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class r61 extends WindowInsetsAnimationCompat.Callback {
    public final View c;
    public int d;
    public int e;
    public final int[] f;

    public r61(View view) {
        super(0);
        this.f = new int[2];
        this.c = view;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final void a(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.c.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final void d(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        View view = this.c;
        int[] iArr = this.f;
        view.getLocationOnScreen(iArr);
        this.d = iArr[1];
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final WindowInsetsAnimationCompat.BoundsCompat f(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
        View view = this.c;
        int[] iArr = this.f;
        view.getLocationOnScreen(iArr);
        int i = this.d - iArr[1];
        this.e = i;
        view.setTranslationY(i);
        return boundsCompat;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final WindowInsetsCompat e(WindowInsetsCompat windowInsetsCompat, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            WindowInsetsAnimationCompat windowInsetsAnimationCompat = (WindowInsetsAnimationCompat) it.next();
            if ((windowInsetsAnimationCompat.c() & WindowInsetsCompat.Type.ime()) != 0) {
                this.c.setTranslationY(y6.c(windowInsetsAnimationCompat.b(), this.e, 0));
                break;
            }
        }
        return windowInsetsCompat;
    }
}
