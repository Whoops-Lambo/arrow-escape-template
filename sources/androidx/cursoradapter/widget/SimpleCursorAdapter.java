package androidx.cursoradapter.widget;

import android.database.Cursor;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class SimpleCursorAdapter extends ResourceCursorAdapter {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface CursorToStringConverter {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface ViewBinder {
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public final String b(Cursor cursor) {
        return cursor.getString(0);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public final void d(View view, Cursor cursor) {
        throw null;
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public final Cursor g(Cursor cursor) {
        if (cursor == null) {
            return super.g(cursor);
        }
        throw null;
    }
}
