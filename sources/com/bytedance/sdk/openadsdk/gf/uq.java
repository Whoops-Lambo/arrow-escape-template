package com.bytedance.sdk.openadsdk.gf;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.utils.vrj;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class uq extends kgy {
    public static rz kgy;

    public static String kgy(com.bytedance.sdk.component.fi.ahm.rz rzVar, String str) {
        rz rzVarKgy;
        Map map;
        if (!vrj.rz() || (rzVarKgy = ahm.kgy("net")) == null || (map = (Map) rzVarKgy.kgy(1, str)) == null) {
            return str;
        }
        String str2 = (String) map.get("url");
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        Map map2 = (Map) map.get("header");
        if (map2 != null) {
            for (String str3 : map2.keySet()) {
                rzVar.ahm(str3, (String) map2.get(str3));
            }
        }
        return str;
    }
}
