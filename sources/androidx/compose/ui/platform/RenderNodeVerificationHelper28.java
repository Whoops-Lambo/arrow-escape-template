package androidx.compose.ui.platform;

import android.view.RenderNode;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@RequiresApi
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\u0006J\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeVerificationHelper28;", "", "Landroid/view/RenderNode;", "renderNode", "", "a", "(Landroid/view/RenderNode;)I", "target", "Laz2;", "c", "(Landroid/view/RenderNode;I)V", "b", "d", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class RenderNodeVerificationHelper28 {
    public static final RenderNodeVerificationHelper28 a = new RenderNodeVerificationHelper28();

    @DoNotInline
    public final int a(@NotNull RenderNode renderNode) {
        renderNode.getClass();
        return renderNode.getAmbientShadowColor();
    }

    @DoNotInline
    public final int b(@NotNull RenderNode renderNode) {
        renderNode.getClass();
        return renderNode.getSpotShadowColor();
    }

    @DoNotInline
    public final void c(@NotNull RenderNode renderNode, int target) {
        renderNode.getClass();
        renderNode.setAmbientShadowColor(target);
    }

    @DoNotInline
    public final void d(@NotNull RenderNode renderNode, int target) {
        renderNode.getClass();
        renderNode.setSpotShadowColor(target);
    }
}
