package androidx.compose.foundation.layout;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.graphics.Insets;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.WindowInsetsCompat;
import com.ironsource.mediationsdk.d;
import java.util.WeakHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsHolder;", "", "Companion", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class WindowInsetsHolder {
    public static final WeakHashMap v = new WeakHashMap();
    public final AndroidWindowInsets a = Companion.a(WindowInsetsCompat.Type.captionBar(), "captionBar");
    public final AndroidWindowInsets b;
    public final AndroidWindowInsets c;
    public final AndroidWindowInsets d;
    public final AndroidWindowInsets e;
    public final AndroidWindowInsets f;
    public final AndroidWindowInsets g;
    public final AndroidWindowInsets h;
    public final AndroidWindowInsets i;
    public final ValueInsets j;
    public final WindowInsets k;
    public final WindowInsets l;
    public final WindowInsets m;
    public final ValueInsets n;
    public final ValueInsets o;
    public final ValueInsets p;
    public final ValueInsets q;
    public final ValueInsets r;
    public final boolean s;
    public int t;
    public final InsetsListener u;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsHolder$Companion;", "", "", "testInsets", "Z", "Ljava/util/WeakHashMap;", "Landroid/view/View;", "Landroidx/compose/foundation/layout/WindowInsetsHolder;", "viewMap", "Ljava/util/WeakHashMap;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public static final AndroidWindowInsets a(int i, String str) {
            WeakHashMap weakHashMap = WindowInsetsHolder.v;
            return new AndroidWindowInsets(i, str);
        }

        public static final ValueInsets b(int i, String str) {
            WeakHashMap weakHashMap = WindowInsetsHolder.v;
            Insets insets = Insets.NONE;
            insets.getClass();
            return new ValueInsets(WindowInsets_androidKt.a(insets), str);
        }

        public static WindowInsetsHolder c(Composer composer) {
            WindowInsetsHolder windowInsetsHolder;
            composer.B(-1366542614);
            View view = (View) composer.v(AndroidCompositionLocals_androidKt.f);
            WeakHashMap weakHashMap = WindowInsetsHolder.v;
            synchronized (weakHashMap) {
                try {
                    Object windowInsetsHolder2 = weakHashMap.get(view);
                    if (windowInsetsHolder2 == null) {
                        windowInsetsHolder2 = new WindowInsetsHolder(view);
                        weakHashMap.put(view, windowInsetsHolder2);
                    }
                    windowInsetsHolder = (WindowInsetsHolder) windowInsetsHolder2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            EffectsKt.a(windowInsetsHolder, new WindowInsetsHolder$Companion$current$1(windowInsetsHolder, view), composer);
            composer.J();
            return windowInsetsHolder;
        }
    }

    public WindowInsetsHolder(View view) {
        View view2;
        Object tag;
        boolean zBooleanValue;
        AndroidWindowInsets androidWindowInsetsA = Companion.a(WindowInsetsCompat.Type.displayCutout(), "displayCutout");
        this.b = androidWindowInsetsA;
        AndroidWindowInsets androidWindowInsetsA2 = Companion.a(WindowInsetsCompat.Type.ime(), "ime");
        this.c = androidWindowInsetsA2;
        AndroidWindowInsets androidWindowInsetsA3 = Companion.a(WindowInsetsCompat.Type.mandatorySystemGestures(), "mandatorySystemGestures");
        this.d = androidWindowInsetsA3;
        this.e = Companion.a(WindowInsetsCompat.Type.navigationBars(), "navigationBars");
        this.f = Companion.a(WindowInsetsCompat.Type.statusBars(), "statusBars");
        AndroidWindowInsets androidWindowInsetsA4 = Companion.a(WindowInsetsCompat.Type.systemBars(), "systemBars");
        this.g = androidWindowInsetsA4;
        AndroidWindowInsets androidWindowInsetsA5 = Companion.a(WindowInsetsCompat.Type.systemGestures(), "systemGestures");
        this.h = androidWindowInsetsA5;
        AndroidWindowInsets androidWindowInsetsA6 = Companion.a(WindowInsetsCompat.Type.tappableElement(), "tappableElement");
        this.i = androidWindowInsetsA6;
        Insets insets = Insets.NONE;
        insets.getClass();
        ValueInsets valueInsets = new ValueInsets(WindowInsets_androidKt.a(insets), d.h);
        this.j = valueInsets;
        WindowInsets windowInsetsA = WindowInsetsKt.a(WindowInsetsKt.a(androidWindowInsetsA4, androidWindowInsetsA2), androidWindowInsetsA);
        this.k = windowInsetsA;
        WindowInsets windowInsetsA2 = WindowInsetsKt.a(WindowInsetsKt.a(WindowInsetsKt.a(androidWindowInsetsA6, androidWindowInsetsA3), androidWindowInsetsA5), valueInsets);
        this.l = windowInsetsA2;
        this.m = WindowInsetsKt.a(windowInsetsA, windowInsetsA2);
        this.n = Companion.b(WindowInsetsCompat.Type.captionBar(), "captionBarIgnoringVisibility");
        this.o = Companion.b(WindowInsetsCompat.Type.navigationBars(), "navigationBarsIgnoringVisibility");
        this.p = Companion.b(WindowInsetsCompat.Type.statusBars(), "statusBarsIgnoringVisibility");
        this.q = Companion.b(WindowInsetsCompat.Type.systemBars(), "systemBarsIgnoringVisibility");
        this.r = Companion.b(WindowInsetsCompat.Type.tappableElement(), "tappableElementIgnoringVisibility");
        Object parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        if (view2 != null) {
            tag = view2.getTag(com.ecffri.arrows.R.id.consume_window_insets_tag);
        } else {
            tag = null;
        }
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = true;
        }
        this.s = zBooleanValue;
        this.u = new InsetsListener(this);
    }

    public final void a(WindowInsetsCompat windowInsetsCompat, int i) {
        windowInsetsCompat.getClass();
        this.a.f(windowInsetsCompat, i);
        this.c.f(windowInsetsCompat, i);
        this.b.f(windowInsetsCompat, i);
        this.e.f(windowInsetsCompat, i);
        this.f.f(windowInsetsCompat, i);
        this.g.f(windowInsetsCompat, i);
        this.h.f(windowInsetsCompat, i);
        this.i.f(windowInsetsCompat, i);
        this.d.f(windowInsetsCompat, i);
        if (i == 0) {
            Insets insetsIgnoringVisibility = windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.captionBar());
            insetsIgnoringVisibility.getClass();
            this.n.b.setValue(WindowInsets_androidKt.a(insetsIgnoringVisibility));
            Insets insetsIgnoringVisibility2 = windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.navigationBars());
            insetsIgnoringVisibility2.getClass();
            this.o.b.setValue(WindowInsets_androidKt.a(insetsIgnoringVisibility2));
            Insets insetsIgnoringVisibility3 = windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.statusBars());
            insetsIgnoringVisibility3.getClass();
            this.p.b.setValue(WindowInsets_androidKt.a(insetsIgnoringVisibility3));
            Insets insetsIgnoringVisibility4 = windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars());
            insetsIgnoringVisibility4.getClass();
            this.q.b.setValue(WindowInsets_androidKt.a(insetsIgnoringVisibility4));
            Insets insetsIgnoringVisibility5 = windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.tappableElement());
            insetsIgnoringVisibility5.getClass();
            this.r.b.setValue(WindowInsets_androidKt.a(insetsIgnoringVisibility5));
            DisplayCutoutCompat displayCutout = windowInsetsCompat.getDisplayCutout();
            if (displayCutout != null) {
                Insets insetsA = displayCutout.a();
                insetsA.getClass();
                this.j.b.setValue(WindowInsets_androidKt.a(insetsA));
            }
        }
        Snapshot.Companion.e();
    }
}
