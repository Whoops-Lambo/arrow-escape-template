package com.google.android.gms.internal.identity_credentials;

import com.google.android.gms.common.Feature;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zze {
    public static final Feature a;
    public static final Feature b;
    public static final Feature c;
    public static final Feature d;
    public static final Feature[] e;

    static {
        Feature feature = new Feature("GET_CREDENTIAL", 1L);
        a = feature;
        Feature feature2 = new Feature("CREDENTIAL_REGISTRY", 1L);
        Feature feature3 = new Feature("CLEAR_REGISTRY", 2L);
        Feature feature4 = new Feature("CLEAR_CREATION_OPTIONS", 1L);
        Feature feature5 = new Feature("CLEAR_CREDENTIAL_STATE", 1L);
        b = feature5;
        Feature feature6 = new Feature("CREATE_CREDENTIAL", 3L);
        c = feature6;
        Feature feature7 = new Feature("REGISTER_CREATION_OPTIONS", 1L);
        Feature feature8 = new Feature("REGISTER_EXPORT", 1L);
        Feature feature9 = new Feature("IMPORT_CREDENTIALS", 1L);
        Feature feature10 = new Feature("SIGNAL_CREDENTIAL_STATE", 1L);
        d = feature10;
        e = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, feature8, feature9, feature10, new Feature("CLEAR_EXPORT", 1L), new Feature("IMPORT_CREDENTIALS_FOR_DEVICE_SETUP", 3L), new Feature("EXPORT_CREDENTIALS_TO_DEVICE_SETUP", 3L), new Feature("GET_CREDENTIAL_TRANSFER_CAPABILITIES", 3L)};
    }
}
