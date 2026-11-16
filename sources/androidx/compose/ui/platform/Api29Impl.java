package androidx.compose.ui.platform;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@RequiresApi
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/Api29Impl;", "", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager", "", "originalTimeout", "uiContentFlags", "a", "(Landroid/view/accessibility/AccessibilityManager;II)I", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Api29Impl {
    public static final Api29Impl a = new Api29Impl();

    @DoNotInline
    public final int a(@NotNull android.view.accessibility.AccessibilityManager accessibilityManager, int originalTimeout, int uiContentFlags) {
        accessibilityManager.getClass();
        return accessibilityManager.getRecommendedTimeoutMillis(originalTimeout, uiContentFlags);
    }
}
