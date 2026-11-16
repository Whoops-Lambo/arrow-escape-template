package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/EditProcessor;", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class EditProcessor {
    public TextFieldValue a;
    public EditingBuffer b;

    public final TextFieldValue a(List list) {
        list.getClass();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((EditCommand) list.get(i)).a(this.b);
        }
        TextRange textRange = null;
        AnnotatedString annotatedString = new AnnotatedString(6, this.b.a.toString(), null);
        EditingBuffer editingBuffer = this.b;
        long jA = TextRangeKt.a(editingBuffer.b, editingBuffer.c);
        EditingBuffer editingBuffer2 = this.b;
        if (editingBuffer2.d()) {
            textRange = new TextRange(TextRangeKt.a(editingBuffer2.d, editingBuffer2.e));
        }
        TextFieldValue textFieldValue = new TextFieldValue(annotatedString, jA, textRange);
        this.a = textFieldValue;
        return textFieldValue;
    }
}
