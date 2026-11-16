package androidx.compose.ui.window;

import androidx.compose.runtime.Immutable;
import defpackage.jc1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/window/PopupProperties;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PopupProperties {
    public final boolean a;
    public final SecureFlagPolicy b;
    public final boolean c;
    public final boolean d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupProperties)) {
            return false;
        }
        PopupProperties popupProperties = (PopupProperties) obj;
        return this.a == popupProperties.a && this.b == popupProperties.b && this.c == popupProperties.c && this.d == popupProperties.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + jc1.f(jc1.f((this.b.hashCode() + jc1.f(jc1.f(jc1.f(Boolean.hashCode(true) * 31, 31, this.a), 31, true), 31, true)) * 31, 31, this.c), 31, this.d);
    }

    public PopupProperties(int i) {
        boolean z = (i & 1) == 0;
        boolean z2 = (i & 32) != 0;
        this.a = z;
        this.b = SecureFlagPolicy.a;
        this.c = true;
        this.d = z2;
    }
}
