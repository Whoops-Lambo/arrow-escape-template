package androidx.compose.ui.graphics;

import android.graphics.BlendModeColorFilter;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import defpackage.na;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@RequiresApi
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, d2 = {"Landroidx/compose/ui/graphics/BlendModeColorFilterHelper;", "", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "Landroid/graphics/BlendModeColorFilter;", "a", "(JI)Landroid/graphics/BlendModeColorFilter;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class BlendModeColorFilterHelper {
    public static final BlendModeColorFilterHelper a = new BlendModeColorFilterHelper();

    @DoNotInline
    @NotNull
    public final BlendModeColorFilter a(long color, int blendMode) {
        na.g();
        return na.d(ColorKt.g(color), AndroidBlendMode_androidKt.a(blendMode));
    }
}
