package com.fyber.inneractive.sdk.ignite;

import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public enum m {
    TRUE_SINGLE_TAP("tst"),
    SINGLE_TAP(CmcdConfiguration.KEY_STREAM_TYPE),
    NONE("none");

    private static final Map<String, m> CONSTANTS = new HashMap();
    private final String value;

    static {
        for (m mVar : values()) {
            CONSTANTS.put(mVar.value, mVar);
        }
    }

    public static m a(String str) {
        return CONSTANTS.get(str);
    }

    m(String str) {
        this.value = str;
    }

    public final String a() {
        return this.value;
    }
}
