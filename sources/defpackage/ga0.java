package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import com.mbridge.msdk.config.component.animation.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ga0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ga0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((DefaultTimeBar) obj).lambda$new$1(valueAnimator);
                break;
            case 1:
                ((we0) obj).d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                b.a((GradientDrawable) obj, valueAnimator);
                break;
            case 3:
                b.a((TextView) obj, valueAnimator);
                break;
            case 4:
                b.a((ImageView) obj, valueAnimator);
                break;
            default:
                b.a((View) obj, valueAnimator);
                break;
        }
    }
}
