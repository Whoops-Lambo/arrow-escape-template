package androidx.constraintlayout.motion.widget;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class MotionScene {
    public Transition a;
    public int b;

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.MotionScene$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes6.dex */
    class AnonymousClass1 implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Transition {
        public int a;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static class TransitionOnClick implements View.OnClickListener {
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                throw null;
            }
        }
    }

    public final int a() {
        Transition transition = this.a;
        return transition != null ? transition.a : this.b;
    }

    public final Interpolator b() {
        this.a.getClass();
        return new AccelerateDecelerateInterpolator();
    }
}
