package com.mbridge.msdk.foundation.db;

import android.database.sqlite.SQLiteDatabase;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class a<T> {
    protected f mHelper;

    public synchronized SQLiteDatabase getReadableDatabase() {
        try {
        } catch (Exception unused) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            q0.a("BaseDao", "getReadableDatabase error");
            return null;
        }
        return this.mHelper.c();
    }

    public synchronized SQLiteDatabase getWritableDatabase() {
        try {
        } catch (Exception unused) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            q0.a("BaseDao", "getWritableDatabase error");
            return null;
        }
        return this.mHelper.d();
    }

    public a(f fVar) {
        this.mHelper = fVar;
    }
}
