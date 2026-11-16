package com.bytedance.sdk.openadsdk.core.widget.kgy;

import android.util.Log;
import android.webkit.CookieManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class kgy {
    public static Map<String, String> kgy(Map<String, List<String>> map, String str) {
        HashMap map2 = new HashMap();
        if (map != null && !map.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if (key != null && value != null && !value.isEmpty()) {
                    if (key.equalsIgnoreCase("set-cookie")) {
                        arrayList.addAll(value);
                    } else {
                        map2.put(key, kgy(value));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                kgy(arrayList, str);
            }
        }
        return map2;
    }

    private static String kgy(List<String> list) {
        if (list != null && !list.isEmpty()) {
            if (list.size() == 1) {
                return list.get(0);
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(list.get(i));
            }
            return sb.toString();
        }
        return "";
    }

    private static void kgy(List<String> list, String str) {
        CookieManager cookieManager = CookieManager.getInstance();
        for (String str2 : list) {
            try {
                cookieManager.setCookie("https://".concat(String.valueOf(str)), str2);
                cookieManager.flush();
                Log.d("Cookie", "Set cookie for " + str + ": " + str2);
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+SSRBLl9iZdP1UuFFLc=", "c+sskQauSsiOXNJPmBSy", "U+8jkQ+5WsKUadhShxilOw==", 83);
                Log.e("Cookie", "Failed to set cookie", e);
            }
        }
    }
}
