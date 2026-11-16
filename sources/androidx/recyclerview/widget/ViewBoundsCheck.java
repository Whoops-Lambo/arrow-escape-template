package androidx.recyclerview.widget;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
class ViewBoundsCheck {
    public final Callback a;
    public final BoundFlags b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class BoundFlags {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;

        public final boolean a() {
            int i;
            int i2;
            int i3;
            int i4 = this.a;
            int i5 = 2;
            if ((i4 & 7) != 0) {
                int i6 = this.d;
                int i7 = this.b;
                if (i6 > i7) {
                    i3 = 1;
                } else {
                    i3 = i6 == i7 ? 2 : 4;
                }
                if ((i3 & i4) == 0) {
                    return false;
                }
            }
            if ((i4 & 112) != 0) {
                int i8 = this.d;
                int i9 = this.c;
                if (i8 > i9) {
                    i2 = 1;
                } else {
                    i2 = i8 == i9 ? 2 : 4;
                }
                if (((i2 << 4) & i4) == 0) {
                    return false;
                }
            }
            if ((i4 & 1792) != 0) {
                int i10 = this.e;
                int i11 = this.b;
                if (i10 > i11) {
                    i = 1;
                } else {
                    i = i10 == i11 ? 2 : 4;
                }
                if (((i << 8) & i4) == 0) {
                    return false;
                }
            }
            if ((i4 & 28672) != 0) {
                int i12 = this.e;
                int i13 = this.c;
                if (i12 > i13) {
                    i5 = 1;
                } else if (i12 != i13) {
                    i5 = 4;
                }
                if (((i5 << 12) & i4) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface Callback {
        int a();

        int b();

        View c(int i);

        int d(View view);

        int e(View view);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewBounds {
    }

    public final View a(int i, int i2, int i3, int i4) {
        Callback callback = this.a;
        int iA = callback.a();
        int iB = callback.b();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewC = callback.c(i);
            int iD = callback.d(viewC);
            int iE = callback.e(viewC);
            BoundFlags boundFlags = this.b;
            boundFlags.b = iA;
            boundFlags.c = iB;
            boundFlags.d = iD;
            boundFlags.e = iE;
            if (i3 != 0) {
                boundFlags.a = i3;
                if (boundFlags.a()) {
                    return viewC;
                }
            }
            if (i4 != 0) {
                boundFlags.a = i4;
                if (boundFlags.a()) {
                    view = viewC;
                }
            }
            i += i5;
        }
        return view;
    }

    public final boolean b(View view) {
        Callback callback = this.a;
        int iA = callback.a();
        int iB = callback.b();
        int iD = callback.d(view);
        int iE = callback.e(view);
        BoundFlags boundFlags = this.b;
        boundFlags.b = iA;
        boundFlags.c = iB;
        boundFlags.d = iD;
        boundFlags.e = iE;
        boundFlags.a = 24579;
        return boundFlags.a();
    }

    public ViewBoundsCheck(Callback callback) {
        this.a = callback;
        BoundFlags boundFlags = new BoundFlags();
        boundFlags.a = 0;
        this.b = boundFlags;
    }
}
