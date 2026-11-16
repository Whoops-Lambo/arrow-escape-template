package com.bytedance.sdk.openadsdk.fpp.ahm;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.noq.ahm;
import com.bytedance.sdk.openadsdk.fpz.rz;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class kgy {
    private static final ConcurrentHashMap<String, Object> kgy = new ConcurrentHashMap<>();

    public static Map<String, List<String>> kgy(Cursor cursor) {
        HashMap map = new HashMap();
        if (cursor != null) {
            try {
                String[] columnNames = cursor.getColumnNames();
                while (cursor.getCount() > 0 && cursor.moveToNext()) {
                    for (String str : columnNames) {
                        if (!map.containsKey(str)) {
                            map.put(str, new LinkedList());
                        }
                        ((List) map.get(str)).add(cursor.getString(cursor.getColumnIndex(str)));
                    }
                }
                cursor.close();
                return map;
            } catch (Throwable th) {
                rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EErDxS/j+aTbhr", "f8wMkQKsfcKSf8NUgAI=", "WPs/hgyuXcitS8c=", 92);
                cursor.close();
            }
        }
        return map;
    }

    public static int kgy(Context context, String str, String str2, String[] strArr) {
        int iKgy;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        synchronized (kgy(str)) {
            try {
                try {
                    iKgy = ahm.kgy(context).kgy(str, str2, strArr);
                } catch (Throwable th) {
                    rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EErDxS/j+aTbhr", "f8wMkQKsfcKSf8NUgAI=", "X+shkBe5", 44);
                    return 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iKgy;
    }

    public static int kgy(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        int iKgy;
        if (contentValues == null || TextUtils.isEmpty(str)) {
            return 0;
        }
        synchronized (kgy(str)) {
            try {
                try {
                    iKgy = ahm.kgy(context).kgy(str, contentValues, str2, strArr);
                } catch (Throwable th) {
                    rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EErDxS/j+aTbhr", "f8wMkQKsfcKSf8NUgAI=", "Tv4plBe5", 58);
                    return 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iKgy;
    }

    public static Map<String, List<String>> kgy(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        Map<String, List<String>> mapKgy;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (kgy(str)) {
            try {
                try {
                    mapKgy = kgy(ahm.kgy(context).kgy(str, strArr, str2, strArr2, str3, str4, str5));
                } catch (Throwable th) {
                    rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EErDxS/j+aTbhr", "f8wMkQKsfcKSf8NUgAI=", "Svsohxo=", 73);
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mapKgy;
    }

    public static void kgy(Context context, String str, ContentValues contentValues) {
        if (contentValues == null || TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (kgy(str)) {
            try {
                ahm.kgy(context).kgy(str, (String) null, contentValues);
            } catch (Throwable th) {
                rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EErDxS/j+aTbhr", "f8wMkQKsfcKSf8NUgAI=", "UuA+kBGo", 31);
            }
        }
    }

    private static Object kgy(String str) {
        Object obj;
        ConcurrentHashMap<String, Object> concurrentHashMap = kgy;
        Object obj2 = concurrentHashMap.get(str);
        if (obj2 != null) {
            return obj2;
        }
        synchronized (kgy.class) {
            try {
                obj = concurrentHashMap.get(str);
                if (obj == null) {
                    obj = new Object();
                    concurrentHashMap.put(str, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
