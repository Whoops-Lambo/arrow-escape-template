package com.bytedance.sdk.component.yo.kgy.kgy.kgy;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class rz {
    public static Cursor kgy(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return kgy.kgy(context).kgy().kgy(str, strArr, str2, strArr2, null, null, str5);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void kgy(Context context, String str, List<com.bytedance.sdk.component.yo.kgy.uq.kgy> list) {
        if (list == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            kgy.kgy(context).kgy().kgy(str, (String) null, list);
        } catch (Throwable unused) {
        }
    }

    public static int kgy(Context context, String str, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return kgy.kgy(context).kgy().kgy(str, str2, strArr);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int kgy(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        if (contentValues != null && !TextUtils.isEmpty(str)) {
            try {
                return kgy.kgy(context).kgy().kgy(str, contentValues, str2, strArr);
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    public static void kgy(Context context, String str, ContentValues contentValues) {
        if (contentValues == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            kgy.kgy(context).kgy().kgy(str, (String) null, contentValues);
        } catch (Throwable unused) {
        }
    }

    public static void kgy(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            kgy.kgy(context).kgy().kgy(Uri.decode(str));
        } catch (Throwable unused) {
        }
    }
}
