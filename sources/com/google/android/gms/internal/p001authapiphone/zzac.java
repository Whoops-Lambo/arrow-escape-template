package com.google.android.gms.internal.p001authapiphone;

import com.google.android.gms.common.Feature;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzac {
    public static final Feature a;
    public static final Feature[] b;

    static {
        Feature feature = new Feature("sms_code_autofill", 2L);
        Feature feature2 = new Feature("sms_code_browser", 2L);
        Feature feature3 = new Feature("sms_retrieve", 1L);
        a = feature3;
        b = new Feature[]{feature, feature2, feature3, new Feature("user_consent", 3L)};
    }
}
