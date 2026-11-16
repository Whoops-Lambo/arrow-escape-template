package com.google.android.gms.nearby;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.nearby.zzji;
import com.google.android.gms.internal.nearby.zzl;
import com.google.android.gms.internal.nearby.zzry;
import com.google.android.gms.nearby.messages.internal.zzbx;
import com.google.android.gms.nearby.messages.internal.zzby;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Nearby {
    static {
        new Api("Nearby.CONNECTIONS_API", zzji.b, zzji.a);
        new zzji();
        new Api("Nearby.MESSAGES_API", zzbx.b, zzbx.a);
        new zzby();
        new Api("Nearby.BOOTSTRAP_API", zzl.b, zzl.a);
        new zzl();
    }

    private Nearby() {
    }

    public static boolean a(Context context) {
        Object obj;
        String str;
        Object obj2;
        boolean z = true;
        if (Wrappers.packageManager(context).checkCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES") != 0) {
            return true;
        }
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = zzry.a;
        synchronized (zzry.class) {
            zzry.a(contentResolver);
            obj = zzry.j;
        }
        HashMap map = zzry.f;
        Boolean bool = Boolean.TRUE;
        synchronized (zzry.class) {
            try {
                str = null;
                if (map.containsKey("gms:nearby:requires_gms_check")) {
                    obj2 = map.get("gms:nearby:requires_gms_check");
                    if (obj2 == null) {
                        obj2 = bool;
                    }
                } else {
                    obj2 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Boolean bool2 = (Boolean) obj2;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        synchronized (zzry.class) {
            try {
                zzry.a(contentResolver);
                Object obj3 = zzry.j;
                if (zzry.e.containsKey("gms:nearby:requires_gms_check")) {
                    String str2 = (String) zzry.e.get("gms:nearby:requires_gms_check");
                    if (str2 != null) {
                        str = str2;
                    }
                } else {
                    int length = zzry.k.length;
                    Cursor cursorQuery = contentResolver.query(zzry.a, null, null, new String[]{"gms:nearby:requires_gms_check"}, null);
                    if (cursorQuery != null) {
                        try {
                            if (!cursorQuery.moveToFirst()) {
                                zzry.b(obj3, null);
                            } else {
                                String string = cursorQuery.getString(1);
                                if (string != null && string.equals(null)) {
                                    string = null;
                                }
                                zzry.b(obj3, string);
                                if (string != null) {
                                    str = string;
                                }
                            }
                            cursorQuery.close();
                        } catch (Throwable th2) {
                            cursorQuery.close();
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (str == null || str.equals("")) {
            bool = bool2;
        } else if (!zzry.b.matcher(str).matches()) {
            if (zzry.c.matcher(str).matches()) {
                bool = Boolean.FALSE;
                z = false;
            } else {
                Log.w("Gservices", "attempt to read gservices key gms:nearby:requires_gms_check (value \"" + str + "\") as boolean");
                bool = bool2;
            }
        }
        synchronized (zzry.class) {
            try {
                if (obj == zzry.j) {
                    map.put("gms:nearby:requires_gms_check", bool);
                    zzry.e.remove("gms:nearby:requires_gms_check");
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return z;
    }
}
