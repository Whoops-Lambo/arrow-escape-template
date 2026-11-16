package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.os.Build;
import android.os.LocaleList;
import android.view.accessibility.AccessibilityWindowInfo;
import androidx.annotation.RequiresApi;
import androidx.core.os.LocaleListCompat;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class AccessibilityWindowInfoCompat {
    public final AccessibilityWindowInfo a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api21Impl {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api24Impl {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api26Impl {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api30Impl {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api33Impl {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api34Impl {
        public static LocaleList a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLocales();
        }

        public static long b(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTransitionTimeMillis();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof AccessibilityWindowInfoCompat)) {
            return this.a.equals(((AccessibilityWindowInfoCompat) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AccessibilityWindowInfo[id=");
        Rect rect = new Rect();
        AccessibilityWindowInfo accessibilityWindowInfo = this.a;
        accessibilityWindowInfo.getBoundsInScreen(rect);
        sb.append(accessibilityWindowInfo.getId());
        sb.append(", type=");
        int type = accessibilityWindowInfo.getType();
        if (type == 1) {
            str = "TYPE_APPLICATION";
        } else if (type == 2) {
            str = "TYPE_INPUT_METHOD";
        } else if (type != 3) {
            str = type != 4 ? "<UNKNOWN>" : "TYPE_ACCESSIBILITY_OVERLAY";
        } else {
            str = "TYPE_SYSTEM";
        }
        sb.append(str);
        sb.append(", layer=");
        sb.append(accessibilityWindowInfo.getLayer());
        sb.append(", bounds=");
        sb.append(rect);
        sb.append(", focused=");
        sb.append(accessibilityWindowInfo.isFocused());
        sb.append(", active=");
        sb.append(accessibilityWindowInfo.isActive());
        sb.append(", hasParent=");
        AccessibilityWindowInfo parent = accessibilityWindowInfo.getParent();
        sb.append((parent != null ? new AccessibilityWindowInfoCompat(parent) : null) != null);
        sb.append(", hasChildren=");
        sb.append(accessibilityWindowInfo.getChildCount() > 0);
        sb.append(", transitionTime=");
        int i = Build.VERSION.SDK_INT;
        sb.append(i >= 34 ? Api34Impl.b(accessibilityWindowInfo) : 0L);
        sb.append(", locales=");
        sb.append(i >= 34 ? LocaleListCompat.f(Api34Impl.a(accessibilityWindowInfo)) : LocaleListCompat.b);
        sb.append(']');
        return sb.toString();
    }

    public AccessibilityWindowInfoCompat(AccessibilityWindowInfo accessibilityWindowInfo) {
        this.a = accessibilityWindowInfo;
    }
}
