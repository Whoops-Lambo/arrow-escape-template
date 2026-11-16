package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@RequiresApi
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/ViewLayerVerificationHelper28;", "", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "target", "Laz2;", "a", "(Landroid/view/View;I)V", "b", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class ViewLayerVerificationHelper28 {
    public static final ViewLayerVerificationHelper28 a = new ViewLayerVerificationHelper28();

    @DoNotInline
    public final void a(@NotNull View view, int target) {
        view.getClass();
        view.setOutlineAmbientShadowColor(target);
    }

    @DoNotInline
    public final void b(@NotNull View view, int target) {
        view.getClass();
        view.setOutlineSpotShadowColor(target);
    }
}
