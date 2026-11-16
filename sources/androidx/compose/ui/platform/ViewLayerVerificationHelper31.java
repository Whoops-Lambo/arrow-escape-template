package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.RenderEffect;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@RequiresApi
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/ViewLayerVerificationHelper31;", "", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroidx/compose/ui/graphics/RenderEffect;", "target", "Laz2;", "a", "(Landroid/view/View;Landroidx/compose/ui/graphics/RenderEffect;)V", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class ViewLayerVerificationHelper31 {
    public static final ViewLayerVerificationHelper31 a = new ViewLayerVerificationHelper31();

    @DoNotInline
    public final void a(@NotNull View view, @Nullable RenderEffect target) {
        android.graphics.RenderEffect renderEffectA;
        view.getClass();
        if (target != null) {
            renderEffectA = target.a;
            if (renderEffectA == null) {
                renderEffectA = target.a();
                target.a = renderEffectA;
            }
        } else {
            renderEffectA = null;
        }
        view.setRenderEffect(renderEffectA);
    }
}
