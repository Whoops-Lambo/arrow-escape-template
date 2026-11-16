package com.bytedance.sdk.component.yo.kgy.noq;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.t;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class noq implements ct {
    private Context kgy;

    @Override // com.bytedance.sdk.component.yo.kgy.noq.ct
    public void ahm(uq uqVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", uqVar.kgy());
        contentValues.put("url", uqVar.ahm());
        contentValues.put("replaceholder", Integer.valueOf(uqVar.rz() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(uqVar.uq()));
        contentValues.put(t.d, uqVar.yo());
        contentValues.put("error_msg", uqVar.gf());
        contentValues.put("url_type", Integer.valueOf(uqVar.ct()));
        contentValues.put(CreativeInfo.c, uqVar.noq());
        com.bytedance.sdk.component.yo.kgy.kgy.kgy.rz.kgy(this.kgy, "trackurl", contentValues, "id=?", new String[]{uqVar.kgy()});
    }

    @Override // com.bytedance.sdk.component.yo.kgy.noq.ct
    public void rz(uq uqVar) {
        com.bytedance.sdk.component.yo.kgy.kgy.kgy.rz.kgy(this.kgy, "trackurl", "id=?", new String[]{uqVar.kgy()});
    }

    public noq(Context context) {
        this.kgy = context;
    }

    @Override // com.bytedance.sdk.component.yo.kgy.noq.ct
    public uq kgy(String str) {
        boolean z;
        Cursor cursorKgy = com.bytedance.sdk.component.yo.kgy.kgy.kgy.rz.kgy(this.kgy, "trackurl", null, "id=?", new String[]{str}, null, null, null);
        if (cursorKgy != null && cursorKgy.moveToFirst()) {
            try {
                String string = cursorKgy.getString(cursorKgy.getColumnIndex("id"));
                String string2 = cursorKgy.getString(cursorKgy.getColumnIndex("url"));
                if (cursorKgy.getInt(cursorKgy.getColumnIndex("replaceholder")) > 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z2 = z;
                int i = cursorKgy.getInt(cursorKgy.getColumnIndex("retry"));
                int i2 = cursorKgy.getInt(cursorKgy.getColumnIndex("url_type"));
                String string3 = cursorKgy.getString(cursorKgy.getColumnIndex(CreativeInfo.c));
                String string4 = cursorKgy.getString(cursorKgy.getColumnIndex(t.d));
                String string5 = cursorKgy.getString(cursorKgy.getColumnIndex("error_msg"));
                uq uqVar = new uq(string, string2, z2, i2, string3);
                uqVar.kgy(i);
                if (!TextUtils.isEmpty(string4)) {
                    uqVar.kgy(string4);
                }
                if (!TextUtils.isEmpty(string5)) {
                    uqVar.ahm(string5);
                }
                cursorKgy.close();
                return uqVar;
            } catch (Throwable th) {
                try {
                    th.getMessage();
                    cursorKgy.close();
                    cursorKgy = null;
                } catch (Throwable th2) {
                    cursorKgy.close();
                    throw th2;
                }
            }
        }
        if (cursorKgy != null) {
            cursorKgy.close();
        }
        return null;
    }

    public static String ahm() {
        return "CREATE TABLE IF NOT EXISTS trackurl (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,url TEXT ,replaceholder INTEGER default 0, retry INTEGER default 0)";
    }

    @Override // com.bytedance.sdk.component.yo.kgy.noq.ct
    public List<uq> kgy() {
        LinkedList linkedList = new LinkedList();
        Cursor cursorKgy = com.bytedance.sdk.component.yo.kgy.kgy.kgy.rz.kgy(this.kgy, "trackurl", null, null, null, null, null, null);
        if (cursorKgy != null) {
            while (cursorKgy.moveToNext()) {
                try {
                    try {
                        String string = cursorKgy.getString(cursorKgy.getColumnIndex("id"));
                        String string2 = cursorKgy.getString(cursorKgy.getColumnIndex("url"));
                        boolean z = cursorKgy.getInt(cursorKgy.getColumnIndex("replaceholder")) > 0;
                        int i = cursorKgy.getInt(cursorKgy.getColumnIndex("retry"));
                        int i2 = cursorKgy.getInt(cursorKgy.getColumnIndex("url_type"));
                        String string3 = cursorKgy.getString(cursorKgy.getColumnIndex(CreativeInfo.c));
                        String string4 = cursorKgy.getString(cursorKgy.getColumnIndex(t.d));
                        String string5 = cursorKgy.getString(cursorKgy.getColumnIndex("error_msg"));
                        uq uqVar = new uq(string, string2, z, i2, string3);
                        uqVar.kgy(i);
                        if (!TextUtils.isEmpty(string4)) {
                            uqVar.kgy(string4);
                        }
                        if (!TextUtils.isEmpty(string5)) {
                            uqVar.ahm(string5);
                        }
                        linkedList.add(uqVar);
                    } finally {
                        cursorKgy.close();
                    }
                } catch (Throwable unused) {
                    return linkedList;
                }
            }
            cursorKgy.close();
            return linkedList;
        }
        return linkedList;
    }

    @Override // com.bytedance.sdk.component.yo.kgy.noq.ct
    public void kgy(uq uqVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", uqVar.kgy());
        contentValues.put("url", uqVar.ahm());
        contentValues.put("replaceholder", Integer.valueOf(uqVar.rz() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(uqVar.uq()));
        contentValues.put("url_type", Integer.valueOf(uqVar.ct()));
        contentValues.put(CreativeInfo.c, uqVar.noq());
        contentValues.put(t.d, uqVar.yo());
        contentValues.put("error_msg", uqVar.gf());
        com.bytedance.sdk.component.yo.kgy.kgy.kgy.rz.kgy(this.kgy, "trackurl", contentValues);
    }
}
