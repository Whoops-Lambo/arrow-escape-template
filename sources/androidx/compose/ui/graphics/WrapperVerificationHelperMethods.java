package androidx.compose.ui.graphics;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import com.ironsource.C4664b4;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@RequiresApi
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J)\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"Landroidx/compose/ui/graphics/WrapperVerificationHelperMethods;", "", "Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/NativePaint;", "paint", "Landroidx/compose/ui/graphics/BlendMode;", C4664b4.a.t, "Laz2;", "a", "(Landroid/graphics/Paint;I)V", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class WrapperVerificationHelperMethods {
    public static final WrapperVerificationHelperMethods a = new WrapperVerificationHelperMethods();

    @DoNotInline
    public final void a(@NotNull android.graphics.Paint paint, int mode) {
        paint.getClass();
        paint.setBlendMode(AndroidBlendMode_androidKt.a(mode));
    }
}
