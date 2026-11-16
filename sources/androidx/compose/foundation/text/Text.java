package androidx.compose.foundation.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.input.ImeAction;
import defpackage.jc1;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.foundation.text.KeyboardOptions, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/KeyboardOptions;", "", "Companion", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Text {

    /* JADX INFO: renamed from: androidx.compose.foundation.text.KeyboardOptions$Companion */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/KeyboardOptions$Companion;", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof Text);
    }

    public final int hashCode() {
        return Integer.hashCode(1) + jc1.d(1, jc1.f(Integer.hashCode(0) * 31, 31, true), 31);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=None, autoCorrect=true, keyboardType=" + ((Object) "Text") + ", imeAction=" + ((Object) ImeAction.a(1)) + ')';
    }
}
