package androidx.cursoradapter.widget;

import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import defpackage.e32;
import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class CursorAdapter extends BaseAdapter implements Filterable, CursorFilter.CursorFilterClient {
    public boolean a;
    public Cursor b;
    public int c;
    public CursorFilter d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class ChangeObserver extends ContentObserver {
        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class MyDataSetObserver extends DataSetObserver {
        @Override // android.database.DataSetObserver
        public final void onChanged() {
            throw null;
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            throw null;
        }
    }

    public abstract void d(View view, Cursor cursor);

    public abstract View f(Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public String b(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    public Cursor c(CharSequence charSequence) {
        return this.b;
    }

    public Cursor g(Cursor cursor) {
        Cursor cursor2 = this.b;
        if (cursor == cursor2) {
            return null;
        }
        this.b = cursor;
        if (cursor != null) {
            this.c = cursor.getColumnIndexOrThrow("_id");
            this.a = true;
            notifyDataSetChanged();
            return cursor2;
        }
        this.c = -1;
        this.a = false;
        notifyDataSetInvalidated();
        return cursor2;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.a || (cursor = this.b) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.a) {
            return null;
        }
        this.b.moveToPosition(i);
        if (view == null) {
            view = e(this.b, viewGroup);
        }
        d(view, this.b);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.d == null) {
            CursorFilter cursorFilter = new CursorFilter();
            cursorFilter.a = this;
            this.d = cursorFilter;
        }
        return this.d;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.a || (cursor = this.b) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.b;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.a && (cursor = this.b) != null && cursor.moveToPosition(i)) {
            return this.b.getLong(this.c);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.a) {
            e32.i("this should only be called when the cursor is valid");
            return null;
        }
        if (!this.b.moveToPosition(i)) {
            e32.i(pv1.k(i, "couldn't move cursor to position "));
            return null;
        }
        if (view == null) {
            view = f(this.b, viewGroup);
        }
        d(view, this.b);
        return view;
    }

    public void a(Cursor cursor) {
        Cursor cursorG = g(cursor);
        if (cursorG != null) {
            cursorG.close();
        }
    }

    public View e(Cursor cursor, ViewGroup viewGroup) {
        return f(cursor, viewGroup);
    }
}
