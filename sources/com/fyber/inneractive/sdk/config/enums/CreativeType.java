package com.fyber.inneractive.sdk.config.enums;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public enum CreativeType {
    PLAYABLE,
    NOT_SET;

    public static CreativeType fromValue(String str) {
        if (str == null) {
            return NOT_SET;
        }
        return "playable".equals(str.toLowerCase(Locale.US)) ? PLAYABLE : NOT_SET;
    }
}
