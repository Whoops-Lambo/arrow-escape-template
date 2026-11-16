package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ϟ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C0534 extends SQLiteOpenHelper {
    public C0534(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!sQLiteDatabase.isReadOnly()) {
            sQLiteDatabase.execSQL(StringFog.decrypt("QIItsaXUxc9/ogmfj/u6wnWpUbmm\n", "ENBs9uiV5ak=\n"));
        }
        sQLiteDatabase.execSQL(StringFog.decrypt("40uXZj6G+XDhW55iSoqfBO5Whgcvm5B39EryTBycqlDPa7cPAaagBPRcinNKk4tt7ViAfkqInH2M\nOaRGBuONYfhN+w==\n", "oBnSJ2rD2SQ=\n"));
    }
}
