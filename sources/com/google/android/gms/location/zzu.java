package com.google.android.gms.location;

import com.google.android.gms.common.Feature;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzu {
    public static final Feature a;
    public static final Feature[] b;

    static {
        Feature feature = new Feature("name_ulr_private", 1L);
        Feature feature2 = new Feature("name_sleep_segment_request", 1L);
        Feature feature3 = new Feature("support_context_feature_id", 1L);
        a = feature3;
        b = new Feature[]{feature, feature2, feature3, new Feature("get_current_location", 1L), new Feature("get_last_activity_feature_id", 1L)};
    }
}
