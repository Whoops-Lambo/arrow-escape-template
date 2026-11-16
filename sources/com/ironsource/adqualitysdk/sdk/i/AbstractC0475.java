package com.ironsource.adqualitysdk.sdk.i;

import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ʹ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC0475 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static final HashMap f1034 = new HashMap();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m485(String str) {
        HashMap map = f1034;
        String str2 = (String) map.get(str);
        if (str2 != null) {
            return str2;
        }
        map.put(str, str);
        return str;
    }
}
