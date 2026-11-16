package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@RequiresApi
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/WrapperVerificationHelperMethods;", "", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "", "a", "(Landroid/view/View;)Ljava/util/Map;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class WrapperVerificationHelperMethods {
    public static final WrapperVerificationHelperMethods a = new WrapperVerificationHelperMethods();

    @DoNotInline
    @RequiresApi
    @NotNull
    public final Map<Integer, Integer> a(@NotNull View view) {
        view.getClass();
        Map<Integer, Integer> attributeSourceResourceMap = view.getAttributeSourceResourceMap();
        attributeSourceResourceMap.getClass();
        return attributeSourceResourceMap;
    }
}
