package com.bytedance.sdk.openadsdk.core;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class mw {
    private static volatile mw kgy;
    private Map<String, Map<String, String>> ahm = new ConcurrentHashMap();

    public boolean ahm(String str, String str2) {
        Map<String, String> map;
        Map<String, Map<String, String>> map2 = this.ahm;
        if (map2 == null || !map2.containsKey(str) || (map = this.ahm.get(str)) == null) {
            return false;
        }
        return map.containsKey(str2);
    }

    public void kgy(String str, String str2, String str3) {
        Map<String, Map<String, String>> map = this.ahm;
        if (map == null) {
            return;
        }
        Map<String, String> map2 = map.get(str);
        if (map2 != null) {
            map2.put(str2, str3);
            return;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put(str2, str3);
        this.ahm.put(str, concurrentHashMap);
    }

    public boolean rz(String str, String str2) {
        Map<String, String> map;
        Map<String, Map<String, String>> map2 = this.ahm;
        if (map2 == null || !map2.containsKey(str) || (map = this.ahm.get(str)) == null) {
            return false;
        }
        map.remove(str2);
        return true;
    }

    private mw() {
    }

    public static mw kgy() {
        if (kgy == null) {
            synchronized (mw.class) {
                try {
                    if (kgy == null) {
                        kgy = new mw();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kgy;
    }

    public String kgy(String str, String str2) {
        Map<String, String> map;
        Map<String, Map<String, String>> map2 = this.ahm;
        if (map2 == null || !map2.containsKey(str) || (map = this.ahm.get(str)) == null) {
            return null;
        }
        return map.get(str2);
    }

    public void kgy(String str) {
        Map<String, Map<String, String>> map = this.ahm;
        if (map != null && map.containsKey(str)) {
            Map<String, String> map2 = this.ahm.get(str);
            if (map2 != null) {
                map2.clear();
            }
            this.ahm.remove(str);
        }
    }
}
