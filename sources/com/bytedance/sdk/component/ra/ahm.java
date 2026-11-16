package com.bytedance.sdk.component.ra;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class ahm {
    public static boolean kgy(List<String> list, String str) {
        if (list != null && !list.isEmpty()) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                try {
                    if (Pattern.matches(it.next(), str)) {
                        return true;
                    }
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "evwvnBeuaMCFf8NUgAI=", "Uv0Omg2qbNWUf8VR", 22);
                }
            }
        }
        return false;
    }
}
