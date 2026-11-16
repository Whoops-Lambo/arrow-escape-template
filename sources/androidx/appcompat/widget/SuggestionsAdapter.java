package androidx.appcompat.widget;

import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.cursoradapter.widget.ResourceCursorAdapter;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
class SuggestionsAdapter extends ResourceCursorAdapter implements View.OnClickListener {
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class ChildViewCache {
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public final String b(Cursor cursor) {
        String string = null;
        if (cursor == null) {
            return null;
        }
        int columnIndex = cursor.getColumnIndex("suggest_intent_query");
        if (columnIndex != -1) {
            try {
                string = cursor.getString(columnIndex);
            } catch (Exception e) {
                Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            }
        }
        string.getClass();
        return string;
    }

    @Override // androidx.cursoradapter.widget.ResourceCursorAdapter, androidx.cursoradapter.widget.CursorAdapter
    public final View f(Cursor cursor, ViewGroup viewGroup) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable h(java.lang.String r2) {
        /*
            r1 = this;
            r1 = 0
            if (r2 == 0) goto L23
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L23
            java.lang.String r0 = "0"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L12
            goto L23
        L12:
            java.lang.Integer.parseInt(r2)     // Catch: android.content.res.Resources.NotFoundException -> L16 java.lang.NumberFormatException -> L22
            throw r1
        L16:
            java.lang.String r0 = "Icon resource not found: "
            java.lang.String r2 = r0.concat(r2)
            java.lang.String r0 = "SuggestionsAdapter"
            android.util.Log.w(r0, r2)
            return r1
        L22:
            throw r1
        L23:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SuggestionsAdapter.h(java.lang.String):android.graphics.drawable.Drawable");
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public final Cursor c(CharSequence charSequence) {
        if (charSequence != null) {
            charSequence.toString();
        }
        throw null;
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public final void a(Cursor cursor) {
        try {
            super.a(cursor);
            if (cursor != null) {
                this.f = cursor.getColumnIndex("suggest_text_1");
                this.g = cursor.getColumnIndex("suggest_text_2");
                this.h = cursor.getColumnIndex("suggest_text_2_url");
                this.i = cursor.getColumnIndex("suggest_icon_1");
                this.j = cursor.getColumnIndex("suggest_icon_2");
                this.k = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public final void d(View view, Cursor cursor) {
        int i;
        ChildViewCache childViewCache = (ChildViewCache) view.getTag();
        int i2 = this.k;
        if (i2 != -1) {
            i = cursor.getInt(i2);
        } else {
            i = 0;
        }
        childViewCache.getClass();
        int i3 = this.e;
        if (i3 != 2 && (i3 != 1 || (i & 1) == 0)) {
            throw null;
        }
        throw null;
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            throw null;
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            throw null;
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        Bundle extras;
        super.notifyDataSetChanged();
        Cursor cursor = this.b;
        if (cursor != null) {
            extras = cursor.getExtras();
        } else {
            extras = null;
        }
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        Bundle extras;
        super.notifyDataSetInvalidated();
        Cursor cursor = this.b;
        if (cursor != null) {
            extras = cursor.getExtras();
        } else {
            extras = null;
        }
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!(view.getTag() instanceof CharSequence)) {
        } else {
            throw null;
        }
    }
}
