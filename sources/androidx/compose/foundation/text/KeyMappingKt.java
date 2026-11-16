package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.Key_androidKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class KeyMappingKt {
    public static final KeyMappingKt$defaultKeyMapping$2$1 a;

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1] */
    static {
        KeyMappingKt$defaultKeyMapping$1 keyMappingKt$defaultKeyMapping$1 = KeyMappingKt$defaultKeyMapping$1.b;
        final KeyMappingKt$commonKeyMapping$1 keyMappingKt$commonKeyMapping$1 = new KeyMappingKt$commonKeyMapping$1();
        a = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1
            @Override // androidx.compose.foundation.text.KeyMapping
            public final KeyCommand a(KeyEvent keyEvent) {
                KeyCommand keyCommand = null;
                if (keyEvent.isShiftPressed() && keyEvent.isCtrlPressed()) {
                    long jA = Key_androidKt.a(keyEvent.getKeyCode());
                    if (Key.a(jA, MappedKeys.h)) {
                        keyCommand = KeyCommand.SELECT_LEFT_WORD;
                    } else if (Key.a(jA, MappedKeys.i)) {
                        keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (Key.a(jA, MappedKeys.j)) {
                        keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (Key.a(jA, MappedKeys.k)) {
                        keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (keyEvent.isCtrlPressed()) {
                    long jA2 = Key_androidKt.a(keyEvent.getKeyCode());
                    if (Key.a(jA2, MappedKeys.h)) {
                        keyCommand = KeyCommand.LEFT_WORD;
                    } else if (Key.a(jA2, MappedKeys.i)) {
                        keyCommand = KeyCommand.RIGHT_WORD;
                    } else if (Key.a(jA2, MappedKeys.j)) {
                        keyCommand = KeyCommand.PREV_PARAGRAPH;
                    } else if (Key.a(jA2, MappedKeys.k)) {
                        keyCommand = KeyCommand.NEXT_PARAGRAPH;
                    } else if (Key.a(jA2, MappedKeys.c)) {
                        keyCommand = KeyCommand.DELETE_PREV_CHAR;
                    } else if (Key.a(jA2, MappedKeys.s)) {
                        keyCommand = KeyCommand.DELETE_NEXT_WORD;
                    } else if (Key.a(jA2, MappedKeys.r)) {
                        keyCommand = KeyCommand.DELETE_PREV_WORD;
                    } else if (Key.a(jA2, MappedKeys.g)) {
                        keyCommand = KeyCommand.DESELECT;
                    }
                } else if (keyEvent.isShiftPressed()) {
                    long jA3 = Key_androidKt.a(keyEvent.getKeyCode());
                    if (Key.a(jA3, MappedKeys.n)) {
                        keyCommand = KeyCommand.SELECT_HOME;
                    } else if (Key.a(jA3, MappedKeys.o)) {
                        keyCommand = KeyCommand.SELECT_END;
                    }
                }
                if (keyCommand == null) {
                    return keyMappingKt$commonKeyMapping$1.a(keyEvent);
                }
                return keyCommand;
            }
        };
    }
}
