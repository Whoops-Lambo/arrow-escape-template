package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build;
import defpackage.d;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "Landroidx/compose/ui/platform/AccessibilityManager;", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AndroidAccessibilityManager implements AccessibilityManager {
    public final android.view.accessibility.AccessibilityManager a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/AndroidAccessibilityManager$Companion;", "", "", "FlagContentControls", "I", "FlagContentIcons", "FlagContentText", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public AndroidAccessibilityManager(Context context) {
        Object systemService = context.getSystemService("accessibility");
        if (systemService != null) {
            this.a = (android.view.accessibility.AccessibilityManager) systemService;
        } else {
            d.w("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
            throw null;
        }
    }

    @Override // androidx.compose.ui.platform.AccessibilityManager
    public final long a(long j, boolean z) {
        int i;
        if (j < 2147483647L) {
            if (z) {
                i = 7;
            } else {
                i = 3;
            }
            int i2 = Build.VERSION.SDK_INT;
            android.view.accessibility.AccessibilityManager accessibilityManager = this.a;
            if (i2 >= 29) {
                int iA = Api29Impl.a.a(accessibilityManager, (int) j, i);
                if (iA != Integer.MAX_VALUE) {
                    return iA;
                }
                return Long.MAX_VALUE;
            }
            if (z && accessibilityManager.isTouchExplorationEnabled()) {
                return Long.MAX_VALUE;
            }
        }
        return j;
    }
}
