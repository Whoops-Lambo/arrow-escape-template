package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzpd {
    public static final zzpd b = new zzpd();
    public final HashMap a = new HashMap();

    public final synchronized void a(String str, zzcs zzcsVar) {
        try {
            boolean zContainsKey = this.a.containsKey(str);
            HashMap map = this.a;
            if (!zContainsKey) {
                map.put(str, zzcsVar);
                return;
            }
            if (((zzcs) map.get(str)).equals(zzcsVar)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(this.a.get(str)) + "), cannot insert " + String.valueOf(zzcsVar));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            a((String) entry.getKey(), (zzcs) entry.getValue());
        }
    }
}
