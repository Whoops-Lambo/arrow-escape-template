package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import androidx.annotation.RequiresApi;
import androidx.collection.SimpleArrayMap;
import androidx.media3.common.C;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class WindowInsetsControllerCompat {
    public final Impl a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Impl {
        public void a(int i) {
        }

        public void b(boolean z) {
        }

        public void c(boolean z) {
        }

        public void d() {
        }

        public void e(int i) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Impl20 extends Impl {
        public final Window a;
        public final SoftwareKeyboardControllerCompat b;

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void a(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    if (i2 == 1) {
                        f(4);
                    } else if (i2 == 2) {
                        f(2);
                    } else if (i2 == 8) {
                        this.b.a.a();
                    }
                }
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void e(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    if (i2 == 1) {
                        g(4);
                        this.a.clearFlags(1024);
                    } else if (i2 == 2) {
                        g(2);
                    } else if (i2 == 8) {
                        this.b.a.b();
                    }
                }
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void d() {
            this.a.getDecorView().setTag(356039078, 2);
            g(2048);
            f(4096);
        }

        public final void f(int i) {
            View decorView = this.a.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        public final void g(int i) {
            View decorView = this.a.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        public Impl20(Window window, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            this.a = window;
            this.b = softwareKeyboardControllerCompat;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Impl23 extends Impl20 {
        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void c(boolean z) {
            if (!z) {
                g(8192);
                return;
            }
            Window window = this.a;
            window.clearFlags(C.BUFFER_FLAG_NOT_DEPENDED_ON);
            window.addFlags(Integer.MIN_VALUE);
            f(8192);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Impl26 extends Impl23 {
        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void b(boolean z) {
            if (!z) {
                g(16);
                return;
            }
            Window window = this.a;
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            f(16);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Impl30 extends Impl {
        public final WindowInsetsController a;
        public final SoftwareKeyboardControllerCompat b;
        public final Window c;

        /* JADX INFO: renamed from: androidx.core.view.WindowInsetsControllerCompat$Impl30$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        class AnonymousClass1 implements WindowInsetsAnimationControlListener {
            public final void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
                throw null;
            }

            public final void onFinished(WindowInsetsAnimationController windowInsetsAnimationController) {
                throw null;
            }

            public final void onReady(WindowInsetsAnimationController windowInsetsAnimationController, int i) {
                throw null;
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void a(int i) {
            if ((i & 8) != 0) {
                this.b.a.a();
            }
            this.a.hide(i & (-9));
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void b(boolean z) {
            Window window = this.c;
            if (z) {
                if (window != null) {
                    f(16);
                }
                this.a.setSystemBarsAppearance(16, 16);
            } else {
                if (window != null) {
                    g(16);
                }
                this.a.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void c(boolean z) {
            Window window = this.c;
            if (z) {
                if (window != null) {
                    f(8192);
                }
                this.a.setSystemBarsAppearance(8, 8);
            } else {
                if (window != null) {
                    g(8192);
                }
                this.a.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void d() {
            Window window = this.c;
            if (window == null) {
                this.a.setSystemBarsBehavior(2);
                return;
            }
            window.getDecorView().setTag(356039078, 2);
            g(2048);
            f(4096);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void e(int i) {
            if ((i & 8) != 0) {
                this.b.a.b();
            }
            this.a.show(i & (-9));
        }

        public final void f(int i) {
            View decorView = this.c.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        public final void g(int i) {
            View decorView = this.c.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        public Impl30(Window window, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            WindowInsetsController insetsController = window.getInsetsController();
            new SimpleArrayMap(0);
            this.a = insetsController;
            this.b = softwareKeyboardControllerCompat;
            this.c = window;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Impl31 extends Impl30 {
        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl30, androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void d() {
            this.a.setSystemBarsBehavior(2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Impl35 extends Impl31 {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface OnControllableInsetsChangedListener {
    }

    public final void a(int i) {
        this.a.a(i);
    }

    public final void b(boolean z) {
        this.a.b(z);
    }

    public final void c(boolean z) {
        this.a.c(z);
    }

    public final void d() {
        this.a.d();
    }

    public final void e(int i) {
        this.a.e(i);
    }

    public WindowInsetsControllerCompat(Window window, View view) {
        SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat = new SoftwareKeyboardControllerCompat(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new Impl35(window, softwareKeyboardControllerCompat);
            return;
        }
        if (i >= 30) {
            this.a = new Impl30(window, softwareKeyboardControllerCompat);
        } else if (i >= 26) {
            this.a = new Impl26(window, softwareKeyboardControllerCompat);
        } else {
            this.a = new Impl23(window, softwareKeyboardControllerCompat);
        }
    }
}
