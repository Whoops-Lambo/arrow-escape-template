package androidx.compose.ui.text.input;

import defpackage.ak1;
import defpackage.h50;
import defpackage.jc1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/DeleteSurroundingTextInCodePointsCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class DeleteSurroundingTextInCodePointsCommand implements EditCommand {
    public final int a;
    public final int b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteSurroundingTextInCodePointsCommand)) {
            return false;
        }
        DeleteSurroundingTextInCodePointsCommand deleteSurroundingTextInCodePointsCommand = (DeleteSurroundingTextInCodePointsCommand) obj;
        return this.a == deleteSurroundingTextInCodePointsCommand.a && this.b == deleteSurroundingTextInCodePointsCommand.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return h50.l(sb, this.b, ')');
    }

    public DeleteSurroundingTextInCodePointsCommand(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        ak1.n(jc1.n("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i, " and ", i2, " respectively."));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    @Override // androidx.compose.ui.text.input.EditCommand
    public final void a(EditingBuffer editingBuffer) {
        editingBuffer.getClass();
        PartialGapBuffer partialGapBuffer = editingBuffer.a;
        int i = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = i + 1;
            int i4 = editingBuffer.b;
            if (i4 > i3) {
                char cB = editingBuffer.b((i4 - i3) - 1);
                char cB2 = editingBuffer.b(editingBuffer.b - i3);
                if (Character.isHighSurrogate(cB) && Character.isLowSurrogate(cB2)) {
                    i += 2;
                } else {
                    i = i3;
                }
            } else {
                i = i3;
            }
            if (i == editingBuffer.b) {
                break;
            }
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.b; i6++) {
            int i7 = i5 + 1;
            if (editingBuffer.c + i7 < partialGapBuffer.a()) {
                char cB3 = editingBuffer.b((editingBuffer.c + i7) - 1);
                char cB4 = editingBuffer.b(editingBuffer.c + i7);
                if (Character.isHighSurrogate(cB3) && Character.isLowSurrogate(cB4)) {
                    i5 += 2;
                } else {
                    i5 = i7;
                }
            } else {
                i5 = i7;
            }
            if (editingBuffer.c + i5 == partialGapBuffer.a()) {
                break;
            }
        }
        int i8 = editingBuffer.c;
        editingBuffer.a(i8, i5 + i8);
        int i9 = editingBuffer.b;
        editingBuffer.a(i9 - i, i9);
    }
}
