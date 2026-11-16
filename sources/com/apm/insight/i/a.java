package com.apm.insight.i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.apm.insight.runtime.o;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class a {
    private static volatile UUID a = null;
    private static String b = "";

    public static synchronized String a(Context context) {
        try {
            if (TextUtils.isEmpty(b)) {
                new a(context);
                UUID uuid = a;
                if (uuid != null) {
                    b = uuid.toString();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    @SuppressLint({"MissingPermission", "HardwareIds"})
    private a(Context context) {
        String string;
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    String strC = o.a().c();
                    if (strC != null) {
                        a = UUID.fromString(strC);
                    } else {
                        try {
                            string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                        } catch (Throwable unused) {
                            string = null;
                        }
                        try {
                            if (string != null) {
                                a = UUID.nameUUIDFromBytes(string.getBytes("utf8"));
                            } else {
                                a = UUID.randomUUID();
                            }
                        } catch (Throwable unused2) {
                        }
                        try {
                            o.a().b(a.toString());
                        } catch (Throwable unused3) {
                        }
                    }
                }
            }
        }
    }
}
