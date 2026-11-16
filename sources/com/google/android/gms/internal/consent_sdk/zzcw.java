package com.google.android.gms.internal.consent_sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzcw {
    public static void b(Context context, HashSet hashSet) {
        HashMap map;
        zzcv zzcvVar = new zzcv(context);
        Iterator it = hashSet.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map = zzcvVar.c;
            if (!zHasNext) {
                break;
            }
            String str = (String) it.next();
            zzcu zzcuVarA = a(context, str);
            if (zzcuVarA == null) {
                Log.d("UserMessagingPlatform", "clearKeys: unable to process key: ".concat(String.valueOf(str)));
            } else {
                String str2 = zzcuVarA.a;
                if (!map.containsKey(str2)) {
                    map.put(str2, zzcvVar.b.getSharedPreferences(str2, 0).edit());
                }
                ((SharedPreferences.Editor) map.get(str2)).remove(zzcuVarA.b);
            }
        }
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            ((SharedPreferences.Editor) it2.next()).commit();
        }
    }

    public static zzcu a(Context context, String str) {
        String strConcat;
        String str2;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("/", -1);
            int length = strArrSplit.length;
            if (length == 1) {
                String strValueOf = String.valueOf(context.getPackageName());
                str2 = strArrSplit[0];
                strConcat = strValueOf.concat("_preferences");
            } else if (length == 2) {
                strConcat = strArrSplit[0];
                str2 = strArrSplit[1];
            } else {
                return null;
            }
            if (!TextUtils.isEmpty(strConcat) && !TextUtils.isEmpty(str2)) {
                return new zzcu(strConcat, str2);
            }
            return null;
        }
        return null;
    }
}
