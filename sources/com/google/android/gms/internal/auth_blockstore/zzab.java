package com.google.android.gms.internal.auth_blockstore;

import com.google.android.gms.common.Feature;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzab {
    public static final Feature a;
    public static final Feature b;
    public static final Feature c;
    public static final Feature[] d;

    static {
        Feature feature = new Feature("auth_blockstore", 3L);
        Feature feature2 = new Feature("blockstore_data_transfer", 1L);
        Feature feature3 = new Feature("blockstore_notify_app_restore", 1L);
        Feature feature4 = new Feature("blockstore_store_bytes_with_options", 2L);
        Feature feature5 = new Feature("blockstore_is_end_to_end_encryption_available", 1L);
        Feature feature6 = new Feature("blockstore_enable_cloud_backup", 1L);
        Feature feature7 = new Feature("blockstore_delete_bytes", 2L);
        Feature feature8 = new Feature("blockstore_retrieve_bytes_with_options", 3L);
        Feature feature9 = new Feature("auth_clear_restore_credential", 1L);
        a = feature9;
        Feature feature10 = new Feature("auth_create_restore_credential", 1L);
        b = feature10;
        Feature feature11 = new Feature("auth_get_restore_credential", 1L);
        c = feature11;
        d = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, feature8, feature9, feature10, feature11};
    }
}
