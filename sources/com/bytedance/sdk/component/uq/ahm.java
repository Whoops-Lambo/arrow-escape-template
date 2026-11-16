package com.bytedance.sdk.component.uq;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public interface ahm {
    long ahm(String str, String str2, ContentValues contentValues);

    int kgy(String str, ContentValues contentValues, String str2, String[] strArr);

    int kgy(String str, String str2, String[] strArr);

    long kgy(String str, String str2, ContentValues contentValues);

    Cursor kgy(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5);

    SQLiteDatabase noq();
}
