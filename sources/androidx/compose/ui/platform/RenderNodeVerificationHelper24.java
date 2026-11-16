package androidx.compose.ui.platform;

import android.view.RenderNode;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@RequiresApi
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeVerificationHelper24;", "", "Landroid/view/RenderNode;", "renderNode", "Laz2;", "a", "(Landroid/view/RenderNode;)V", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class RenderNodeVerificationHelper24 {
    public static final RenderNodeVerificationHelper24 a = new RenderNodeVerificationHelper24();

    @DoNotInline
    public final void a(@NotNull RenderNode renderNode) {
        renderNode.getClass();
        renderNode.discardDisplayList();
    }
}
