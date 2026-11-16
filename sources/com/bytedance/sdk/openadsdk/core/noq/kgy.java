package com.bytedance.sdk.openadsdk.core.noq;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.sdk.openadsdk.core.xh;
import com.bytedance.sdk.openadsdk.uq.dg;
import com.bytedance.sdk.openadsdk.uq.fpp;
import com.bytedance.sdk.openadsdk.uq.nu;
import com.bytedance.sdk.openadsdk.uq.um;
import com.bytedance.sdk.openadsdk.uq.vs;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class kgy extends com.bytedance.sdk.component.uq.kgy {
    private static volatile kgy kgy;

    @Override // com.bytedance.sdk.component.uq.kgy
    public void kgy(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 2) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'ad_video_info';");
        }
        if (i < 3) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'ad_video_info';");
        }
        if (i < 7) {
            kgy(sQLiteDatabase, com.bytedance.sdk.openadsdk.uq.uq.ahm());
            kgy(sQLiteDatabase, nu.uq());
            kgy(sQLiteDatabase, dg.ahm());
            kgy(sQLiteDatabase, vs.ahm());
        }
        if (i < 11) {
            kgy(sQLiteDatabase, com.bytedance.sdk.openadsdk.core.at.kgy.rz.uq());
            try {
                com.bytedance.sdk.openadsdk.fpz.ahm.kgy(sQLiteDatabase);
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V6i8=", "f8wFkA+sbNW2GA==", "VOAYhQSuaMOFfthymQWlOg==", 92);
            }
        }
    }

    @Override // com.bytedance.sdk.component.uq.kgy
    public int uq() {
        return 12;
    }

    private kgy(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.component.uq.kgy
    public void ahm(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.uq.uq.kgy());
        sQLiteDatabase.execSQL(nu.rz());
        sQLiteDatabase.execSQL(dg.kgy());
        sQLiteDatabase.execSQL(vs.kgy());
        sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.fpz.ahm.kgy());
        sQLiteDatabase.execSQL(fpp.rz());
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.kgy.ahm.ahm.rz());
        sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.at.kgy.rz.rz());
        sQLiteDatabase.execSQL(um.kgy());
    }

    @Override // com.bytedance.sdk.component.uq.kgy
    public String ahm() {
        return "ttopensdk";
    }

    @Override // com.bytedance.sdk.component.uq.kgy
    public String kgy() {
        return "DBHelper";
    }

    public static kgy kgy(Context context) {
        if (kgy == null) {
            synchronized (kgy.class) {
                try {
                    if (kgy == null) {
                        if (context == null) {
                            context = xh.kgy();
                        }
                        Context contextKgy = xh.kgy(context);
                        if (contextKgy != null) {
                            context = contextKgy;
                        }
                        kgy = new kgy(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kgy;
    }
}
