package androidx.compose.ui.platform;

import android.graphics.RenderNode;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.RenderEffect;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@RequiresApi
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeApi29VerificationHelper;", "", "Landroid/graphics/RenderNode;", "renderNode", "Landroidx/compose/ui/graphics/RenderEffect;", "target", "Laz2;", "a", "(Landroid/graphics/RenderNode;Landroidx/compose/ui/graphics/RenderEffect;)V", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class RenderNodeApi29VerificationHelper {
    public static final RenderNodeApi29VerificationHelper a = new RenderNodeApi29VerificationHelper();

    @DoNotInline
    public final void a(@NotNull RenderNode renderNode, @Nullable RenderEffect target) {
        android.graphics.RenderEffect renderEffectA;
        renderNode.getClass();
        if (target != null) {
            renderEffectA = target.a;
            if (renderEffectA == null) {
                renderEffectA = target.a();
                target.a = renderEffectA;
            }
        } else {
            renderEffectA = null;
        }
        renderNode.setRenderEffect(renderEffectA);
    }
}
