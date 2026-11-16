package androidx.compose.ui.graphics;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@RequiresApi
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001J7\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/graphics/RenderEffectVerificationHelper;", "", "Landroidx/compose/ui/graphics/RenderEffect;", "inputRenderEffect", "", "radiusX", "radiusY", "Landroidx/compose/ui/graphics/TileMode;", "edgeTreatment", "Landroid/graphics/RenderEffect;", "a", "(Landroidx/compose/ui/graphics/RenderEffect;FFI)Landroid/graphics/RenderEffect;", "Landroidx/compose/ui/geometry/Offset;", "offset", "b", "(Landroidx/compose/ui/graphics/RenderEffect;J)Landroid/graphics/RenderEffect;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class RenderEffectVerificationHelper {
    public static final RenderEffectVerificationHelper a = new RenderEffectVerificationHelper();

    @DoNotInline
    @NotNull
    public final android.graphics.RenderEffect a(@Nullable RenderEffect inputRenderEffect, float radiusX, float radiusY, int edgeTreatment) {
        if (inputRenderEffect == null) {
            android.graphics.RenderEffect renderEffectCreateBlurEffect = android.graphics.RenderEffect.createBlurEffect(radiusX, radiusY, AndroidTileMode_androidKt.a(edgeTreatment));
            renderEffectCreateBlurEffect.getClass();
            return renderEffectCreateBlurEffect;
        }
        android.graphics.RenderEffect renderEffectA = inputRenderEffect.a;
        if (renderEffectA == null) {
            renderEffectA = inputRenderEffect.a();
            inputRenderEffect.a = renderEffectA;
        }
        android.graphics.RenderEffect renderEffectCreateBlurEffect2 = android.graphics.RenderEffect.createBlurEffect(radiusX, radiusY, renderEffectA, AndroidTileMode_androidKt.a(edgeTreatment));
        renderEffectCreateBlurEffect2.getClass();
        return renderEffectCreateBlurEffect2;
    }

    @DoNotInline
    @NotNull
    public final android.graphics.RenderEffect b(@Nullable RenderEffect inputRenderEffect, long offset) {
        if (inputRenderEffect == null) {
            android.graphics.RenderEffect renderEffectCreateOffsetEffect = android.graphics.RenderEffect.createOffsetEffect(Offset.c(offset), Offset.d(offset));
            renderEffectCreateOffsetEffect.getClass();
            return renderEffectCreateOffsetEffect;
        }
        float fC = Offset.c(offset);
        float fD = Offset.d(offset);
        android.graphics.RenderEffect renderEffectA = inputRenderEffect.a;
        if (renderEffectA == null) {
            renderEffectA = inputRenderEffect.a();
            inputRenderEffect.a = renderEffectA;
        }
        android.graphics.RenderEffect renderEffectCreateOffsetEffect2 = android.graphics.RenderEffect.createOffsetEffect(fC, fD, renderEffectA);
        renderEffectCreateOffsetEffect2.getClass();
        return renderEffectCreateOffsetEffect2;
    }
}
