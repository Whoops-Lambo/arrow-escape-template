package androidx.compose.ui.graphics;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import com.ironsource.mediationsdk.metadata.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@RequiresApi
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/graphics/CanvasZHelper;", "", "Landroid/graphics/Canvas;", "canvas", "", a.k, "Laz2;", "a", "(Landroid/graphics/Canvas;Z)V", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class CanvasZHelper {
    public static final CanvasZHelper a = new CanvasZHelper();

    @DoNotInline
    public final void a(@NotNull android.graphics.Canvas canvas, boolean enable) {
        canvas.getClass();
        if (enable) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
