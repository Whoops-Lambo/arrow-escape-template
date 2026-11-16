package com.google.unity.ads.nativead;

import com.google.unity.ads.PluginUtils;
import com.google.unity.ads.R;
import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public enum UnityNativeTemplateType {
    SMALL(R.layout.small_template_view_layout),
    MEDIUM(R.layout.medium_template_view_layout),
    NEXTGEN_SMALL(R.layout.nextgen_small_template_view_layout),
    NEXTGEN_MEDIUM(R.layout.nextgen_medium_template_view_layout);

    private final int resourceId;

    public static UnityNativeTemplateType fromIntValue(int i) {
        if (i >= 0 && i < values().length) {
            return values()[i];
        }
        pv1.u(i, "Invalid template type index: ", PluginUtils.LOGTAG);
        return MEDIUM;
    }

    public int resourceId() {
        return this.resourceId;
    }

    UnityNativeTemplateType(int i) {
        this.resourceId = i;
    }
}
