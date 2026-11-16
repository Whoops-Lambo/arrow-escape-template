package androidx.compose.ui.text.input;

import defpackage.p32;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/FinishComposingTextCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class FinishComposingTextCommand implements EditCommand {
    public final boolean equals(Object obj) {
        return obj instanceof FinishComposingTextCommand;
    }

    public final int hashCode() {
        return p32.a(FinishComposingTextCommand.class).hashCode();
    }

    public final String toString() {
        return "FinishComposingTextCommand()";
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public final void a(EditingBuffer editingBuffer) {
        editingBuffer.getClass();
        editingBuffer.d = -1;
        editingBuffer.e = -1;
    }
}
