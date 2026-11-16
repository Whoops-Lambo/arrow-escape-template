package com.singular.sdk.internal;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class SingularMap extends HashMap<String, String> {
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public String put(String str, String str2) {
        if (Utils.isEmptyOrNull(str2)) {
            if (SingularInstance.getInstance() != null) {
                SingularInstance.collectError("e6");
                return null;
            }
            return null;
        }
        return (String) super.put(str, str2);
    }
}
