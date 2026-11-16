package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class zzbkg {
    public final LinkedList a = new LinkedList();
    public final LinkedHashMap b;
    public final Object c;

    public final void a(zzbkd zzbkdVar, long j, String... strArr) {
        synchronized (this.c) {
            this.a.add(new zzbkd(j, strArr[0], zzbkdVar));
        }
    }

    public final zzbkf b() {
        zzbkf zzbkfVar;
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.J2)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.c) {
            try {
                LinkedList<zzbkd> linkedList = this.a;
                for (zzbkd zzbkdVar : linkedList) {
                    long j = zzbkdVar.a;
                    String str = zzbkdVar.b;
                    zzbkd zzbkdVar2 = zzbkdVar.c;
                    if (zzbkdVar2 != null && j > 0) {
                        long j2 = j - zzbkdVar2.a;
                        sb.append(str);
                        sb.append('.');
                        sb.append(j2);
                        sb.append(',');
                        if (zBooleanValue) {
                            boolean zContainsKey = map.containsKey(Long.valueOf(zzbkdVar2.a));
                            long j3 = zzbkdVar2.a;
                            if (zContainsKey) {
                                StringBuilder sb2 = (StringBuilder) map.get(Long.valueOf(j3));
                                sb2.append('+');
                                sb2.append(str);
                            } else {
                                map.put(Long.valueOf(j3), new StringBuilder(str));
                            }
                        }
                    }
                }
                linkedList.clear();
                String string = null;
                if (!TextUtils.isEmpty(null)) {
                    sb.append((String) null);
                } else if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                StringBuilder sb3 = new StringBuilder();
                if (zBooleanValue) {
                    for (Map.Entry entry : map.entrySet()) {
                        sb3.append((CharSequence) entry.getValue());
                        sb3.append('.');
                        sb3.append((((Long) entry.getKey()).longValue() - com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime()) + com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
                        sb3.append(',');
                    }
                    if (sb3.length() > 0) {
                        sb3.setLength(sb3.length() - 1);
                    }
                    string = sb3.toString();
                }
                zzbkfVar = new zzbkf(sb.toString(), string);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbkfVar;
    }

    public zzbkg(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.b = linkedHashMap;
        this.c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str);
    }

    public final void c(String str, String str2) {
        zzbjw zzbjwVarA;
        if (!TextUtils.isEmpty(str2) && (zzbjwVarA = com.google.android.gms.ads.internal.zzt.zzh().a()) != null) {
            synchronized (this.c) {
                zzbkc zzbkcVar = (zzbkc) zzbjwVarA.c.get(str);
                if (zzbkcVar == null) {
                    zzbkcVar = zzbkc.a;
                }
                LinkedHashMap linkedHashMap = this.b;
                linkedHashMap.put(str, zzbkcVar.a((String) linkedHashMap.get(str), str2));
            }
        }
    }
}
