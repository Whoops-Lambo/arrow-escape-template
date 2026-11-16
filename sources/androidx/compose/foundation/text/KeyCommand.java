package androidx.compose.foundation.text;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/KeyCommand;", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public enum KeyCommand {
    LEFT_CHAR(false),
    RIGHT_CHAR(false),
    RIGHT_WORD(false),
    LEFT_WORD(false),
    NEXT_PARAGRAPH(false),
    PREV_PARAGRAPH(false),
    LINE_START(false),
    LINE_END(false),
    /* JADX INFO: Fake field, exist only in values array */
    LINE_LEFT(false),
    /* JADX INFO: Fake field, exist only in values array */
    LINE_RIGHT(false),
    UP(false),
    DOWN(false),
    PAGE_UP(false),
    PAGE_DOWN(false),
    /* JADX INFO: Fake field, exist only in values array */
    HOME(false),
    /* JADX INFO: Fake field, exist only in values array */
    SELECT_LINE_RIGHT(false),
    COPY(false),
    PASTE(true),
    CUT(true),
    DELETE_PREV_CHAR(true),
    DELETE_NEXT_CHAR(true),
    DELETE_PREV_WORD(true),
    DELETE_NEXT_WORD(true),
    /* JADX INFO: Fake field, exist only in values array */
    SELECT_LINE_RIGHT(true),
    /* JADX INFO: Fake field, exist only in values array */
    DELETE_TO_LINE_END(true),
    SELECT_ALL(false),
    SELECT_LEFT_CHAR(false),
    SELECT_RIGHT_CHAR(false),
    SELECT_UP(false),
    SELECT_DOWN(false),
    SELECT_PAGE_UP(false),
    SELECT_PAGE_DOWN(false),
    SELECT_HOME(false),
    SELECT_END(false),
    SELECT_LEFT_WORD(false),
    SELECT_RIGHT_WORD(false),
    SELECT_NEXT_PARAGRAPH(false),
    SELECT_PREV_PARAGRAPH(false),
    SELECT_LINE_START(false),
    SELECT_LINE_END(false),
    /* JADX INFO: Fake field, exist only in values array */
    SELECT_LINE_LEFT(false),
    /* JADX INFO: Fake field, exist only in values array */
    SELECT_LINE_RIGHT(false),
    DESELECT(false),
    NEW_LINE(true),
    TAB(true),
    UNDO(true),
    REDO(true),
    /* JADX INFO: Fake field, exist only in values array */
    CHARACTER_PALETTE(true);

    public final boolean a;

    KeyCommand(boolean z) {
        this.a = z;
    }
}
