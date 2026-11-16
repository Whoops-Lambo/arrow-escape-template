package androidx.compose.ui.input.pointer;

import defpackage.d;
import defpackage.h50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/AndroidPointerIconType;", "Landroidx/compose/ui/input/pointer/PointerIcon;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AndroidPointerIconType implements PointerIcon {
    public final int a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (AndroidPointerIconType.class.equals(obj != null ? obj.getClass() : null)) {
            if (obj == null) {
                d.w("null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
                return false;
            }
            if (this.a == ((AndroidPointerIconType) obj).a) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public final int getA() {
        return this.a;
    }

    public final String toString() {
        return h50.l(new StringBuilder("AndroidPointerIcon(type="), this.a, ')');
    }

    public AndroidPointerIconType(int i) {
        this.a = i;
    }
}
