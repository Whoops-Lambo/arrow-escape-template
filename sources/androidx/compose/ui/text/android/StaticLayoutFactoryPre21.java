package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.DoNotInline;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactoryPre21;", "Landroidx/compose/ui/text/android/StaticLayoutFactoryImpl;", "Landroidx/compose/ui/text/android/StaticLayoutParams;", "params", "Landroid/text/StaticLayout;", "a", "(Landroidx/compose/ui/text/android/StaticLayoutParams;)Landroid/text/StaticLayout;", "Companion", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class StaticLayoutFactoryPre21 implements StaticLayoutFactoryImpl {
    public static boolean a;
    public static Constructor b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactoryPre21$Companion;", "", "", "isInitialized", "Z", "Ljava/lang/reflect/Constructor;", "Landroid/text/StaticLayout;", "staticLayoutConstructor", "Ljava/lang/reflect/Constructor;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    @DoNotInline
    @NotNull
    public StaticLayout a(@NotNull StaticLayoutParams params) {
        Constructor constructor;
        params.getClass();
        Layout.Alignment alignment = params.f;
        StaticLayout staticLayout = null;
        if (a) {
            constructor = b;
        } else {
            a = true;
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                b = StaticLayout.class.getConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            } catch (NoSuchMethodException unused) {
                b = null;
                Log.e("StaticLayoutFactory", "unable to collect necessary constructor.");
            }
            constructor = b;
        }
        if (constructor != null) {
            try {
                staticLayout = (StaticLayout) constructor.newInstance(params.a, 0, Integer.valueOf(params.b), params.c, Integer.valueOf(params.d), alignment, params.e, Float.valueOf(1.0f), Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), Boolean.valueOf(params.k), params.h, Integer.valueOf(params.i), Integer.valueOf(params.g));
            } catch (IllegalAccessException unused2) {
                b = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            } catch (InstantiationException unused3) {
                b = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            } catch (InvocationTargetException unused4) {
                b = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            }
        }
        return staticLayout != null ? staticLayout : new StaticLayout(params.a, 0, params.b, params.c, params.d, alignment, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, params.k, params.h, params.i);
    }
}
