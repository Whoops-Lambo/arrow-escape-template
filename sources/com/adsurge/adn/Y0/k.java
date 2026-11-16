package com.adsurge.adn.Y0;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class k extends SQLiteOpenHelper {
    public static volatile k d;
    public final String a;
    public final String b;
    public Map c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements u.a {
        public a() {
        }

        @Override // com.adsurge.adn.Y0.u.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l a(int i, String str) {
            return m.a(i, str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b implements u.a {
        public b() {
        }

        @Override // com.adsurge.adn.Y0.u.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p a(int i, String str) {
            return q.a(i, str);
        }
    }

    public k(Context context, String str, String str2, String str3, String str4, int i) {
        super(new com.adsurge.adn.C0.a(context, str), str2, (SQLiteDatabase.CursorFactory) null, i);
        HashMap map = new HashMap(5);
        this.c = map;
        this.a = str3;
        this.b = str4;
        map.put(str3, new u(str3, new a()));
        this.c.put(str4, new u(str4, new b()));
    }

    public static k a(Context context) {
        if (d == null) {
            synchronized (k.class) {
                try {
                    if (d == null) {
                        h.a aVarC = j.f().c();
                        String strE = aVarC.e();
                        if (TextUtils.isEmpty(strE)) {
                            strE = "gdt_stat.db";
                        }
                        String str = strE;
                        String strA = aVarC.a();
                        if (TextUtils.isEmpty(strA)) {
                            strA = "event";
                        }
                        String str2 = strA;
                        String strC = aVarC.c();
                        if (TextUtils.isEmpty(strC)) {
                            strC = "performance";
                        }
                        int iD = aVarC.d();
                        d = new k(context, aVarC.b(), str, str2, strC, iD);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public final void b(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase == null) {
            com.adsurge.adn.J0.a.a("No stat db!");
            return;
        }
        try {
            sQLiteDatabase.beginTransaction();
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                ((u) it.next()).b(sQLiteDatabase);
            }
            sQLiteDatabase.setTransactionSuccessful();
            com.adsurge.adn.J0.a.a("Drop stat db success", new Object[0]);
        } catch (Throwable th) {
            try {
                com.adsurge.adn.J0.a.a("Drop stat table failed!", th);
            } finally {
                sQLiteDatabase.endTransaction();
            }
        }
    }

    public void c() {
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            ((u) it.next()).a(this);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        b(sQLiteDatabase);
        a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        b(sQLiteDatabase);
        a(sQLiteDatabase);
    }

    public u b() {
        return (u) this.c.get(this.b);
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase == null) {
            com.adsurge.adn.J0.a.a("No stat db!");
            return;
        }
        try {
            sQLiteDatabase.beginTransaction();
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                ((u) it.next()).a(sQLiteDatabase);
            }
            sQLiteDatabase.setTransactionSuccessful();
            com.adsurge.adn.J0.a.a("Create stat db success", new Object[0]);
        } catch (Throwable th) {
            try {
                com.adsurge.adn.J0.a.a("Create stat table failed!", th);
            } finally {
                sQLiteDatabase.endTransaction();
            }
        }
    }

    public u a() {
        return (u) this.c.get(this.a);
    }
}
