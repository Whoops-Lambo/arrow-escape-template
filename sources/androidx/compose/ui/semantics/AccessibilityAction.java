package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.s71;
import defpackage.xr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u0000*\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/semantics/AccessibilityAction;", "Lxr0;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AccessibilityAction<T extends xr0> {
    public final String a;
    public final xr0 b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityAction)) {
            return false;
        }
        AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
        return s71.b(this.a, accessibilityAction.a) && s71.b(this.b, accessibilityAction.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        xr0 xr0Var = this.b;
        return iHashCode + (xr0Var != null ? xr0Var.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.a + ", action=" + this.b + ')';
    }

    public AccessibilityAction(String str, xr0 xr0Var) {
        this.a = str;
        this.b = xr0Var;
    }
}
