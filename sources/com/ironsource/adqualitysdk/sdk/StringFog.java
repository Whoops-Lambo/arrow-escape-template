package com.ironsource.adqualitysdk.sdk;

import com.ironsource.adqualitysdk.sdk.i.AbstractC0700;
import com.ironsource.adqualitysdk.sdk.i.AbstractC1243;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class StringFog {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static final ConcurrentHashMap f71 = new ConcurrentHashMap();

    public static String decrypt(String str, String str2) {
        ConcurrentHashMap concurrentHashMap = f71;
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) concurrentHashMap.get(str);
        if (concurrentHashMap2 == null) {
            concurrentHashMap2 = new ConcurrentHashMap();
            ConcurrentHashMap concurrentHashMap3 = (ConcurrentHashMap) concurrentHashMap.putIfAbsent(str, concurrentHashMap2);
            if (concurrentHashMap3 != null) {
                concurrentHashMap2 = concurrentHashMap3;
            }
        }
        String str3 = (String) concurrentHashMap2.get(str2);
        if (str3 != null) {
            return str3;
        }
        String strM892 = AbstractC1243.m892(AbstractC0700.m578(str), AbstractC0700.m578(str2));
        concurrentHashMap2.put(str2, strM892);
        return strM892;
    }
}
