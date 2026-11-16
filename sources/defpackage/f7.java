package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import androidx.core.view.ViewPropertyAnimatorUpdateListener;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f7(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                AppBarLayout appBarLayout = (AppBarLayout) obj;
                pi1 pi1Var = (pi1) this.c;
                int i2 = AppBarLayout.z;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pi1Var.j(fFloatValue);
                Drawable drawable = appBarLayout.v;
                if (drawable instanceof pi1) {
                    ((pi1) drawable).j(fFloatValue);
                }
                Iterator it = appBarLayout.r.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    m93.b();
                    break;
                }
                break;
            default:
                ((ViewPropertyAnimatorUpdateListener) obj).a();
                break;
        }
    }
}
