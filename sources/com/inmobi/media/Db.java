package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Db {
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public final SharedPreferences a;

    public final void b(Set set) {
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.putStringSet("reported_events", set);
        editorEdit.apply();
    }

    public Db(Context context, String str) {
        this.a = context.getSharedPreferences(str, 0);
    }

    public final boolean a(String str) {
        str.getClass();
        if (this.a.contains(str)) {
            SharedPreferences.Editor editorEdit = this.a.edit();
            editorEdit.remove(str);
            editorEdit.apply();
            return true;
        }
        return false;
    }

    public static void a(Db db, String str, boolean z) {
        str.getClass();
        SharedPreferences.Editor editorEdit = db.a.edit();
        editorEdit.putBoolean(str, z);
        editorEdit.apply();
    }

    public final void a(String str, String str2, boolean z) {
        str.getClass();
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.putString(str, str2);
        if (z) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }

    public final Set a(Set set) {
        return this.a.getStringSet("reported_events", set);
    }

    public final void a(String str, int i, boolean z) {
        str.getClass();
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.putInt(str, i);
        if (z) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }

    public final void a(String str, long j, boolean z) {
        str.getClass();
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.putLong(str, j);
        if (z) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }
}
