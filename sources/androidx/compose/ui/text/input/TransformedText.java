package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import defpackage.s71;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/TransformedText;", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TransformedText {
    public final AnnotatedString a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TransformedText) {
            return s71.b(this.a, ((TransformedText) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return OffsetMapping.Companion.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + OffsetMapping.Companion.a + ')';
    }

    public TransformedText(AnnotatedString annotatedString) {
        annotatedString.getClass();
        this.a = annotatedString;
    }
}
