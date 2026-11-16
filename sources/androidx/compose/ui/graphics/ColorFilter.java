package androidx.compose.ui.graphics;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/ColorFilter;", "", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ColorFilter {
    public final android.graphics.ColorFilter a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/ColorFilter$Companion;", "", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public static ColorFilter a(int i, long j) {
            return new ColorFilter(Build.VERSION.SDK_INT >= 29 ? BlendModeColorFilterHelper.a.a(j, i) : new PorterDuffColorFilter(ColorKt.g(j), AndroidBlendMode_androidKt.b(i)));
        }
    }

    public ColorFilter(android.graphics.ColorFilter colorFilter) {
        colorFilter.getClass();
        this.a = colorFilter;
    }
}
