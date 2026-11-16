package com.bytedance.sdk.openadsdk.core.noq;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.sdk.openadsdk.core.xh;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class noq extends com.bytedance.sdk.component.uq.kgy {
    private static volatile noq kgy;

    @Override // com.bytedance.sdk.component.uq.kgy
    public int uq() {
        return 2;
    }

    public static noq kgy(Context context) {
        if (kgy == null) {
            synchronized (noq.class) {
                try {
                    if (kgy == null) {
                        if (context == null) {
                            context = xh.kgy();
                        }
                        Context contextKgy = xh.kgy(context);
                        if (contextKgy != null) {
                            context = contextKgy;
                        }
                        kgy = new noq(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kgy;
    }

    private noq(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.component.uq.kgy
    public void ahm(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.kus.kgy.kgy.ahm.fi());
        sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.kus.kgy.kgy.ahm.gf());
    }

    @Override // com.bytedance.sdk.component.uq.kgy
    public String ahm() {
        return "pag_business";
    }

    @Override // com.bytedance.sdk.component.uq.kgy
    public void kgy(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // com.bytedance.sdk.component.uq.kgy
    public String kgy() {
        return "TTDBHelper";
    }
}
