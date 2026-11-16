package androidx.compose.ui.text.input;

import androidx.compose.runtime.Immutable;
import defpackage.jc1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/input/ImeOptions;", "", "Companion", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ImeOptions {
    public static final ImeOptions b = new ImeOptions(false);
    public final boolean a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/ImeOptions$Companion;", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ImeOptions) {
            return this.a == ((ImeOptions) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(1) + jc1.d(1, jc1.f(jc1.d(0, Boolean.hashCode(this.a) * 31, 31), 31, true), 31);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.a + ", capitalization=None, autoCorrect=true, keyboardType=" + ((Object) "Text") + ", imeAction=" + ((Object) ImeAction.a(1)) + ')';
    }

    public ImeOptions(boolean z) {
        this.a = z;
    }
}
