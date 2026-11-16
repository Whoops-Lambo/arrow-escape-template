package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.Key_androidKt;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/text/KeyMappingKt$commonKeyMapping$1", "Landroidx/compose/foundation/text/KeyMapping;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class KeyMappingKt$commonKeyMapping$1 implements KeyMapping {
    public final /* synthetic */ wr0 a = KeyMappingKt$defaultKeyMapping$1.b;

    @Override // androidx.compose.foundation.text.KeyMapping
    public final KeyCommand a(KeyEvent keyEvent) {
        KeyMappingKt$defaultKeyMapping$1 keyMappingKt$defaultKeyMapping$1 = KeyMappingKt$defaultKeyMapping$1.b;
        if (((Boolean) keyMappingKt$defaultKeyMapping$1.invoke(new androidx.compose.ui.input.key.KeyEvent(keyEvent))).booleanValue() && keyEvent.isShiftPressed()) {
            if (Key.a(Key_androidKt.a(keyEvent.getKeyCode()), MappedKeys.f)) {
                return KeyCommand.REDO;
            }
            return null;
        }
        if (((Boolean) keyMappingKt$defaultKeyMapping$1.invoke(new androidx.compose.ui.input.key.KeyEvent(keyEvent))).booleanValue()) {
            long jA = Key_androidKt.a(keyEvent.getKeyCode());
            if (Key.a(jA, MappedKeys.b) ? true : Key.a(jA, MappedKeys.p)) {
                return KeyCommand.COPY;
            }
            if (!Key.a(jA, MappedKeys.d)) {
                if (!Key.a(jA, MappedKeys.e)) {
                    if (Key.a(jA, MappedKeys.a)) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (Key.a(jA, MappedKeys.f)) {
                        return KeyCommand.UNDO;
                    }
                    return null;
                }
                return KeyCommand.CUT;
            }
            return KeyCommand.PASTE;
        }
        if (keyEvent.isCtrlPressed()) {
            return null;
        }
        if (keyEvent.isShiftPressed()) {
            long jA2 = Key_androidKt.a(keyEvent.getKeyCode());
            if (Key.a(jA2, MappedKeys.h)) {
                return KeyCommand.SELECT_LEFT_CHAR;
            }
            if (Key.a(jA2, MappedKeys.i)) {
                return KeyCommand.SELECT_RIGHT_CHAR;
            }
            if (Key.a(jA2, MappedKeys.j)) {
                return KeyCommand.SELECT_UP;
            }
            if (Key.a(jA2, MappedKeys.k)) {
                return KeyCommand.SELECT_DOWN;
            }
            if (Key.a(jA2, MappedKeys.l)) {
                return KeyCommand.SELECT_PAGE_UP;
            }
            if (Key.a(jA2, MappedKeys.m)) {
                return KeyCommand.SELECT_PAGE_DOWN;
            }
            if (Key.a(jA2, MappedKeys.n)) {
                return KeyCommand.SELECT_LINE_START;
            }
            if (Key.a(jA2, MappedKeys.o)) {
                return KeyCommand.SELECT_LINE_END;
            }
            if (!Key.a(jA2, MappedKeys.p)) {
                return null;
            }
        } else {
            long jA3 = Key_androidKt.a(keyEvent.getKeyCode());
            if (Key.a(jA3, MappedKeys.h)) {
                return KeyCommand.LEFT_CHAR;
            }
            if (Key.a(jA3, MappedKeys.i)) {
                return KeyCommand.RIGHT_CHAR;
            }
            if (Key.a(jA3, MappedKeys.j)) {
                return KeyCommand.UP;
            }
            if (Key.a(jA3, MappedKeys.k)) {
                return KeyCommand.DOWN;
            }
            if (Key.a(jA3, MappedKeys.l)) {
                return KeyCommand.PAGE_UP;
            }
            if (Key.a(jA3, MappedKeys.m)) {
                return KeyCommand.PAGE_DOWN;
            }
            if (Key.a(jA3, MappedKeys.n)) {
                return KeyCommand.LINE_START;
            }
            if (Key.a(jA3, MappedKeys.o)) {
                return KeyCommand.LINE_END;
            }
            if (Key.a(jA3, MappedKeys.q)) {
                return KeyCommand.NEW_LINE;
            }
            if (Key.a(jA3, MappedKeys.r)) {
                return KeyCommand.DELETE_PREV_CHAR;
            }
            if (Key.a(jA3, MappedKeys.s)) {
                return KeyCommand.DELETE_NEXT_CHAR;
            }
            if (!Key.a(jA3, MappedKeys.t)) {
                if (!Key.a(jA3, MappedKeys.u)) {
                    if (Key.a(jA3, MappedKeys.v)) {
                        return KeyCommand.TAB;
                    }
                    return null;
                }
                return KeyCommand.CUT;
            }
        }
        return KeyCommand.PASTE;
    }
}
