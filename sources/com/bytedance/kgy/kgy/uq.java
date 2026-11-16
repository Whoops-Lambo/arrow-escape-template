package com.bytedance.kgy.kgy;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class uq extends com.bytedance.sdk.component.uq.kgy implements gf {
    private final String ahm;
    private final Context kgy;
    private final boolean rz;
    private final ConcurrentHashMap<Class<? extends com.bytedance.kgy.kgy>, fi<? extends com.bytedance.kgy.kgy>> uq;

    @Override // com.bytedance.sdk.component.uq.kgy
    public void kgy(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 2) {
            rz(sQLiteDatabase);
        }
    }

    @Override // com.bytedance.sdk.component.uq.kgy
    public int uq() {
        return 2;
    }

    private void rz(SQLiteDatabase sQLiteDatabase) {
        Iterator<fi<? extends com.bytedance.kgy.kgy>> it = this.uq.values().iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL("ALTER TABLE " + it.next().fi() + " ADD COLUMN cypher_type INTEGER DEFAULT 0;");
        }
    }

    @Override // com.bytedance.sdk.component.uq.kgy
    public void ahm(SQLiteDatabase sQLiteDatabase) {
        rz.kgy(sQLiteDatabase, this.uq);
    }

    @Override // com.bytedance.sdk.component.uq.kgy
    public boolean ct() {
        return this.rz;
    }

    public uq(Context context, ahm ahmVar, com.bytedance.kgy.rz.ct ctVar) {
        super(context);
        this.kgy = context;
        this.ahm = rz.kgy(ctVar.uq());
        this.rz = ctVar.yo();
        this.uq = ahmVar.ahm();
    }

    @Override // com.bytedance.kgy.kgy.gf
    public SQLiteDatabase getReadableDatabase() {
        return yo().getReadableDatabase();
    }

    @Override // com.bytedance.kgy.kgy.gf
    public SQLiteDatabase getWritableDatabase() {
        return yo().getWritableDatabase();
    }

    @Override // com.bytedance.sdk.component.uq.kgy
    public String ahm() {
        return this.ahm;
    }

    @Override // com.bytedance.sdk.component.uq.kgy
    public void kgy(SQLiteDatabase sQLiteDatabase) {
        rz.kgy(sQLiteDatabase);
    }

    @Override // com.bytedance.sdk.component.uq.kgy
    public String kgy() {
        return "AppLoggerDBOpenHelperV2";
    }

    @Override // com.bytedance.sdk.component.uq.kgy
    public String rz() {
        return this.ahm;
    }
}
