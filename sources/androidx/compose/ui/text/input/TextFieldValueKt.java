package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class TextFieldValueKt {
    public static final AnnotatedString a(TextFieldValue textFieldValue) {
        textFieldValue.getClass();
        AnnotatedString annotatedString = textFieldValue.a;
        long j = textFieldValue.b;
        annotatedString.getClass();
        return annotatedString.subSequence(TextRange.d(j), TextRange.c(j));
    }

    public static final AnnotatedString b(TextFieldValue textFieldValue, int i) {
        textFieldValue.getClass();
        AnnotatedString annotatedString = textFieldValue.a;
        long j = textFieldValue.b;
        return annotatedString.subSequence(TextRange.c(j), Math.min(TextRange.c(j) + i, annotatedString.a.length()));
    }

    public static final AnnotatedString c(TextFieldValue textFieldValue, int i) {
        textFieldValue.getClass();
        AnnotatedString annotatedString = textFieldValue.a;
        long j = textFieldValue.b;
        return annotatedString.subSequence(Math.max(0, TextRange.d(j) - i), TextRange.d(j));
    }
}
