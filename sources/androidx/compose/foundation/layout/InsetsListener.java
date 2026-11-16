package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/layout/InsetsListener;", "Landroidx/core/view/WindowInsetsAnimationCompat$Callback;", "Ljava/lang/Runnable;", "Landroidx/core/view/OnApplyWindowInsetsListener;", "Landroid/view/View$OnAttachStateChangeListener;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class InsetsListener extends WindowInsetsAnimationCompat.Callback implements Runnable, OnApplyWindowInsetsListener, View.OnAttachStateChangeListener {
    public final WindowInsetsHolder c;
    public boolean d;
    public WindowInsetsCompat e;

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final void a(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.d = false;
        WindowInsetsCompat windowInsetsCompat = this.e;
        if (windowInsetsAnimationCompat.a() != 0 && windowInsetsCompat != null) {
            this.c.a(windowInsetsCompat, windowInsetsAnimationCompat.c());
        }
        this.e = null;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final void d(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.d = true;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final WindowInsetsAnimationCompat.BoundsCompat f(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
        this.d = false;
        return boundsCompat;
    }

    public InsetsListener(WindowInsetsHolder windowInsetsHolder) {
        super(!windowInsetsHolder.s ? 1 : 0);
        this.c = windowInsetsHolder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d) {
            this.d = false;
            WindowInsetsCompat windowInsetsCompat = this.e;
            if (windowInsetsCompat != null) {
                WeakHashMap weakHashMap = WindowInsetsHolder.v;
                this.c.a(windowInsetsCompat, 0);
                this.e = null;
            }
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat c(View view, WindowInsetsCompat windowInsetsCompat) {
        view.getClass();
        windowInsetsCompat.getClass();
        if (this.d) {
            this.e = windowInsetsCompat;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return windowInsetsCompat;
            }
        } else {
            WeakHashMap weakHashMap = WindowInsetsHolder.v;
            WindowInsetsHolder windowInsetsHolder = this.c;
            windowInsetsHolder.a(windowInsetsCompat, 0);
            if (windowInsetsHolder.s) {
                WindowInsetsCompat windowInsetsCompat2 = WindowInsetsCompat.CONSUMED;
                windowInsetsCompat2.getClass();
                return windowInsetsCompat2;
            }
        }
        return windowInsetsCompat;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final WindowInsetsCompat e(WindowInsetsCompat windowInsetsCompat, List list) {
        windowInsetsCompat.getClass();
        list.getClass();
        WeakHashMap weakHashMap = WindowInsetsHolder.v;
        WindowInsetsHolder windowInsetsHolder = this.c;
        windowInsetsHolder.a(windowInsetsCompat, 0);
        if (windowInsetsHolder.s) {
            WindowInsetsCompat windowInsetsCompat2 = WindowInsetsCompat.CONSUMED;
            windowInsetsCompat2.getClass();
            return windowInsetsCompat2;
        }
        return windowInsetsCompat;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
    }
}
