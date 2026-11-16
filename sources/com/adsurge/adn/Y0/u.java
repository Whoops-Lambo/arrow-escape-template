package com.adsurge.adn.Y0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import defpackage.pv1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class u {
    public final String a;
    public final String b;
    public final String c;
    public int d = 0;
    public k e;
    public a f;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface a {
        Object a(int i, String str);
    }

    public void a(List list) {
        SQLiteDatabase writableDatabase;
        if (list == null || list.size() <= 0) {
            return;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                writableDatabase = this.e.getWritableDatabase();
                try {
                    writableDatabase.beginTransaction();
                    StringBuilder sb = new StringBuilder("insert into ");
                    sb.append(this.a);
                    sb.append(" (");
                    sb.append("content");
                    sb.append(", ");
                    sb.append("ts");
                    sb.append(") ");
                    o oVar = (o) list.get(0);
                    sb.append("select '");
                    sb.append(oVar.c());
                    sb.append("', ");
                    sb.append(oVar.b());
                    int size = list.size();
                    for (int i = 1; i < size; i++) {
                        o oVar2 = (o) list.get(i);
                        sb.append(" union all select '");
                        sb.append(oVar2.c());
                        sb.append("', ");
                        sb.append(oVar2.b());
                    }
                    writableDatabase.execSQL(sb.toString());
                    int iDelete = writableDatabase.delete(this.a, this.c, null);
                    int size2 = list.size() - iDelete;
                    com.adsurge.adn.J0.a.a("Insert stat:" + list.size() + ", delete stat: " + iDelete + " from table: " + this.a, new Object[0]);
                    writableDatabase.setTransactionSuccessful();
                    this.d = this.d + size2;
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    th = th;
                    sQLiteDatabase = writableDatabase;
                    try {
                        com.adsurge.adn.J0.a.a("Insert stat db failed", th);
                        if (sQLiteDatabase == null) {
                            return;
                        }
                        sQLiteDatabase.endTransaction();
                        writableDatabase = sQLiteDatabase;
                    } catch (Throwable th2) {
                        if (sQLiteDatabase != null) {
                            try {
                                sQLiteDatabase.endTransaction();
                                sQLiteDatabase.close();
                            } catch (Throwable unused) {
                            }
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
            writableDatabase.close();
        } catch (Throwable unused2) {
        }
    }

    public List b() {
        SQLiteDatabase readableDatabase;
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                readableDatabase = this.e.getReadableDatabase();
                try {
                    Cursor cursorQuery = readableDatabase.query(this.a, new String[]{"id", "content"}, null, null, null, null, "ts");
                    if (cursorQuery == null || cursorQuery.getCount() <= 0) {
                        com.adsurge.adn.J0.a.a("Read stat 0 from table: " + this.a, new Object[0]);
                    } else {
                        while (cursorQuery.moveToNext()) {
                            o oVar = (o) this.f.a(cursorQuery.getInt(cursorQuery.getColumnIndex("id")), cursorQuery.getString(cursorQuery.getColumnIndex("content")));
                            if (oVar != null) {
                                arrayList.add(oVar);
                            }
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        com.adsurge.adn.J0.a.a("Read stat db failed", th);
                        if (0 != 0) {
                            cursor.close();
                        }
                        if (readableDatabase != null) {
                        }
                        com.adsurge.adn.J0.a.a("Read stat data: " + arrayList.size() + " from table: " + this.a, new Object[0]);
                        return arrayList;
                    } catch (Throwable th2) {
                        if (0 != 0) {
                            cursor.close();
                        }
                        if (readableDatabase == null) {
                            throw th2;
                        }
                        try {
                            readableDatabase.close();
                            throw th2;
                        } catch (Throwable unused) {
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                readableDatabase = null;
            }
            readableDatabase.close();
        } catch (Throwable unused2) {
        }
        com.adsurge.adn.J0.a.a("Read stat data: " + arrayList.size() + " from table: " + this.a, new Object[0]);
        return arrayList;
    }

    public u(String str, a aVar) {
        this.a = str;
        this.b = pv1.n("create table ", str, "(id integer primary key autoincrement,content text not null,ts long not null)");
        this.c = pv1.n("id not in (select id from ", str, " order by ts desc limit 1000)");
        this.f = aVar;
    }

    public void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("drop table if exists " + this.a);
        this.d = 0;
    }

    public void a(k kVar) {
        this.e = kVar;
        this.d = b().size();
        com.adsurge.adn.J0.a.a("Stat db init: total " + this.a + " count=" + this.d, new Object[0]);
    }

    public void a(Set set) {
        SQLiteDatabase writableDatabase;
        if (set == null || set.size() == 0) {
            return;
        }
        Iterator it = set.iterator();
        StringBuilder sb = new StringBuilder("(");
        if (it.hasNext()) {
            sb.append(it.next());
        }
        while (it.hasNext()) {
            sb.append(",");
            sb.append(it.next());
        }
        sb.append(")");
        SQLiteDatabase sQLiteDatabase = null;
        try {
            writableDatabase = this.e.getWritableDatabase();
            try {
                int iDelete = writableDatabase.delete(this.a, "id in " + sb.toString(), null);
                com.adsurge.adn.J0.a.a("Delete stat count: " + iDelete + " from table: " + this.a, new Object[0]);
                int i = this.d - iDelete;
                this.d = i;
                if (i < 0) {
                    this.d = 0;
                }
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = writableDatabase;
                try {
                    com.adsurge.adn.J0.a.a("Delete stat db failed", th);
                    if (sQLiteDatabase == null) {
                        return;
                    } else {
                        writableDatabase = sQLiteDatabase;
                    }
                } catch (Throwable th2) {
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.close();
                        } catch (Throwable unused) {
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            writableDatabase.close();
        } catch (Throwable unused2) {
        }
    }

    public long a() {
        return this.d;
    }

    public void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(this.b);
        this.d = 0;
    }
}
