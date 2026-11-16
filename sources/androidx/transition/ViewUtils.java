package androidx.transition;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
class ViewUtils {
    public static final ViewUtilsApi23 a;
    public static final Property b;
    public static final Property c;

    /* JADX INFO: renamed from: androidx.transition.ViewUtils$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass1 extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(ViewUtils.a.a(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            float fFloatValue = f.floatValue();
            ViewUtils.a.b(view, fFloatValue);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.ViewUtils$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass2 extends Property<View, Rect> {
        @Override // android.util.Property
        public final Rect get(View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        public final void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new ViewUtilsApi29();
        } else {
            a = new ViewUtilsApi23();
        }
        b = new AnonymousClass1(Float.class, "translationAlpha");
        c = new AnonymousClass2(Rect.class, "clipBounds");
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        a.g(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        a.c(view, i);
    }
}
