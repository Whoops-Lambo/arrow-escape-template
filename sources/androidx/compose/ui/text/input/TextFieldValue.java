package androidx.compose.ui.text.input;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import defpackage.pv1;
import defpackage.s71;
import defpackage.tb5;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "", "Companion", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TextFieldValue {
    public final AnnotatedString a;
    public final long b;
    public final TextRange c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue$Companion;", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldValue)) {
            return false;
        }
        TextFieldValue textFieldValue = (TextFieldValue) obj;
        return TextRange.a(this.b, textFieldValue.b) && s71.b(this.c, textFieldValue.c) && s71.b(this.a, textFieldValue.a);
    }

    static {
        SaverKt.a(TextFieldValue$Companion$Saver$1.i, TextFieldValue$Companion$Saver$2.i);
    }

    public static TextFieldValue a(TextFieldValue textFieldValue, AnnotatedString annotatedString, long j, int i) {
        if ((i & 1) != 0) {
            annotatedString = textFieldValue.a;
        }
        if ((i & 2) != 0) {
            j = textFieldValue.b;
        }
        TextRange textRange = (i & 4) != 0 ? textFieldValue.c : null;
        textFieldValue.getClass();
        annotatedString.getClass();
        return new TextFieldValue(annotatedString, j, textRange);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = TextRange.c;
        int iD = pv1.d(iHashCode, 31, this.b);
        TextRange textRange = this.c;
        return iD + (textRange != null ? Long.hashCode(textRange.a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + ((Object) TextRange.f(this.b)) + ", composition=" + this.c + ')';
    }

    public TextFieldValue(AnnotatedString annotatedString, long j, TextRange textRange) {
        TextRange textRange2;
        this.a = annotatedString;
        int length = annotatedString.a.length();
        int i = TextRange.c;
        int i2 = (int) (j >> 32);
        int iG = tb5.g(i2, 0, length);
        int i3 = (int) (j & 4294967295L);
        int iG2 = tb5.g(i3, 0, length);
        this.b = (iG == i2 && iG2 == i3) ? j : TextRangeKt.a(iG, iG2);
        if (textRange != null) {
            long j2 = textRange.a;
            int length2 = annotatedString.a.length();
            int i4 = (int) (j2 >> 32);
            int iG3 = tb5.g(i4, 0, length2);
            int i5 = (int) (j2 & 4294967295L);
            int iG4 = tb5.g(i5, 0, length2);
            textRange2 = new TextRange((iG3 == i4 && iG4 == i5) ? j2 : TextRangeKt.a(iG3, iG4));
        } else {
            textRange2 = null;
        }
        this.c = textRange2;
    }

    public TextFieldValue(String str, long j, int i) {
        this(new AnnotatedString(6, (i & 1) != 0 ? "" : str, null), (i & 2) != 0 ? TextRange.b : j, (TextRange) null);
    }
}
