package com.ironsource.sdk.utils;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class IronSourceQaProperties {
    private static IronSourceQaProperties a;
    private static Map<String, String> b = new HashMap();

    public static IronSourceQaProperties getInstance() {
        if (a == null) {
            a = new IronSourceQaProperties();
        }
        return a;
    }

    public static boolean isInitialized() {
        return a != null;
    }

    public Map<String, String> getParameters() {
        return b;
    }

    public void setQaParameter(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        b.put(str, str2);
    }

    private IronSourceQaProperties() {
    }
}
