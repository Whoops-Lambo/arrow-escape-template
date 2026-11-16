package com.bytedance.sdk.openadsdk.ay;

import com.ironsource.X3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public enum uq {
    TYPE_2G("2g"),
    TYPE_3G(X3.a),
    TYPE_4G("4g"),
    TYPE_5G("5g"),
    TYPE_WIFI("wifi"),
    TYPE_MOBILE("mobile"),
    TYPE_UNKNOWN("unknown");

    private String fi;

    @Override // java.lang.Enum
    public String toString() {
        return this.fi;
    }

    uq(String str) {
        this.fi = str;
    }
}
