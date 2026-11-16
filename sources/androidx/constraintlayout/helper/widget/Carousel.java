package androidx.constraintlayout.helper.widget;

import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class Carousel extends MotionHelper {
    public Adapter k;

    /* JADX INFO: renamed from: androidx.constraintlayout.helper.widget.Carousel$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: androidx.constraintlayout.helper.widget.Carousel$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes8.dex */
        class RunnableC00521 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface Adapter {
        int count();
    }

    public int getCurrentIndex() {
        return 0;
    }

    public int getCount() {
        Adapter adapter = this.k;
        if (adapter != null) {
            return adapter.count();
        }
        return 0;
    }

    public void setAdapter(Adapter adapter) {
        this.k = adapter;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            if (this.b <= 0) {
                Adapter adapter = this.k;
                if (adapter != null && motionLayout != null && adapter.count() != 0) {
                    throw null;
                }
                return;
            }
            motionLayout.a(this.a[0]);
            throw null;
        }
    }
}
