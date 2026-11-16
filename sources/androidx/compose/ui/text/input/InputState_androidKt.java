package androidx.compose.ui.text.input;

import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import defpackage.dk2;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class InputState_androidKt {
    public static final ExtractedText a(TextFieldValue textFieldValue) {
        textFieldValue.getClass();
        ExtractedText extractedText = new ExtractedText();
        AnnotatedString annotatedString = textFieldValue.a;
        String str = annotatedString.a;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = textFieldValue.b;
        extractedText.selectionStart = TextRange.d(j);
        extractedText.selectionEnd = TextRange.c(j);
        extractedText.flags = !dk2.P(annotatedString.a, '\n') ? 1 : 0;
        return extractedText;
    }
}
