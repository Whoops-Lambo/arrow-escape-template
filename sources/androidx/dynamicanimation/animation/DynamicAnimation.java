package androidx.dynamicanimation.animation;

import android.view.View;
import androidx.dynamicanimation.animation.DynamicAnimation;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class DynamicAnimation<T extends DynamicAnimation<T>> implements AnimationHandler.AnimationFrameCallback {
    public final FloatPropertyCompat d;
    public float a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public float b = Float.MAX_VALUE;
    public boolean c = false;
    public boolean e = false;
    public float f = Float.MAX_VALUE;
    public float g = -3.4028235E38f;
    public long h = 0;
    public final ArrayList j = new ArrayList();
    public final ArrayList k = new ArrayList();
    public float i = 1.0f;

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class AnonymousClass1 extends ViewProperty {
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$10, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class AnonymousClass10 extends ViewProperty {
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$11, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class AnonymousClass11 extends ViewProperty {
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$12, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class AnonymousClass12 extends ViewProperty {
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$13, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class AnonymousClass13 extends ViewProperty {
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$14, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class AnonymousClass14 extends ViewProperty {
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class AnonymousClass2 extends ViewProperty {
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class AnonymousClass3 extends ViewProperty {
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class AnonymousClass4 extends ViewProperty {
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class AnonymousClass5 extends ViewProperty {
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$6, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class AnonymousClass6 extends ViewProperty {
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$7, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class AnonymousClass7 extends ViewProperty {
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$8, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class AnonymousClass8 extends ViewProperty {
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$9, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class AnonymousClass9 extends ViewProperty {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class MassState {
        public float a;
        public float b;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface OnAnimationEndListener {
        void a(float f);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface OnAnimationUpdateListener {
        void l(float f);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class ViewProperty extends FloatPropertyCompat<View> {
    }

    public abstract boolean c(long j);

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$15, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes7.dex */
    class AnonymousClass15 extends FloatPropertyCompat {
        public final /* synthetic */ FloatValueHolder a;

        public AnonymousClass15(FloatValueHolder floatValueHolder) {
            this.a = floatValueHolder;
        }
    }

    @Override // androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallback
    public final boolean a(long j) {
        ArrayList arrayList;
        long j2 = this.h;
        int i = 0;
        if (j2 == 0) {
            this.h = j;
            b(this.b);
            return false;
        }
        this.h = j;
        boolean zC = c(j - j2);
        float fMin = Math.min(this.b, this.f);
        this.b = fMin;
        float fMax = Math.max(fMin, this.g);
        this.b = fMax;
        b(fMax);
        if (zC) {
            this.e = false;
            ThreadLocal threadLocal = AnimationHandler.f;
            if (threadLocal.get() == null) {
                threadLocal.set(new AnimationHandler());
            }
            AnimationHandler animationHandler = (AnimationHandler) threadLocal.get();
            animationHandler.a.remove(this);
            ArrayList arrayList2 = animationHandler.b;
            int iIndexOf = arrayList2.indexOf(this);
            if (iIndexOf >= 0) {
                arrayList2.set(iIndexOf, null);
                animationHandler.e = true;
            }
            this.h = 0L;
            this.c = false;
            while (true) {
                arrayList = this.j;
                if (i >= arrayList.size()) {
                    break;
                }
                if (arrayList.get(i) != null) {
                    ((OnAnimationEndListener) arrayList.get(i)).a(this.b);
                }
                i++;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (arrayList.get(size) == null) {
                    arrayList.remove(size);
                }
            }
        }
        return zC;
    }

    public final void b(float f) {
        ArrayList arrayList;
        ((AnonymousClass15) this.d).a.a = f;
        int i = 0;
        while (true) {
            arrayList = this.k;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                ((OnAnimationUpdateListener) arrayList.get(i)).l(this.b);
            }
            i++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public DynamicAnimation(FloatValueHolder floatValueHolder) {
        this.d = new AnonymousClass15(floatValueHolder);
    }
}
