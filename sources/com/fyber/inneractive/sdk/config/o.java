package com.fyber.inneractive.sdk.config;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class o {
    public final HashMap a = new HashMap();

    public final boolean a() {
        try {
            if (this.a.containsKey("dsos")) {
                return Boolean.parseBoolean((String) this.a.get("dsos"));
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
