package com.fyber.inneractive.sdk.config.enums;

import android.text.TextUtils;
import com.ironsource.R6;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public enum TapAction {
    CTR(R6.K0),
    FULLSCREEN("fullscreen"),
    DO_NOTHING("noAction");

    private static final Map<String, TapAction> CONSTANTS = new HashMap();
    private final String value;

    static {
        for (TapAction tapAction : values()) {
            CONSTANTS.put(tapAction.value, tapAction);
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    TapAction(String str) {
        this.value = str;
    }

    public static TapAction fromValue(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return CONSTANTS.get(str);
    }
}
