package com.google.android.gms.nearby.exposurenotification;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public enum ExposureNotificationStatus {
    /* JADX INFO: Fake field, exist only in values array */
    ACTIVATED(1),
    /* JADX INFO: Fake field, exist only in values array */
    INACTIVATED(2),
    /* JADX INFO: Fake field, exist only in values array */
    BLUETOOTH_DISABLED(4),
    /* JADX INFO: Fake field, exist only in values array */
    LOCATION_DISABLED(8),
    /* JADX INFO: Fake field, exist only in values array */
    NO_CONSENT(16),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_IN_ALLOWLIST(32),
    /* JADX INFO: Fake field, exist only in values array */
    BLUETOOTH_SUPPORT_UNKNOWN(64),
    /* JADX INFO: Fake field, exist only in values array */
    HW_NOT_SUPPORT(128),
    /* JADX INFO: Fake field, exist only in values array */
    FOCUS_LOST(256),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_STORAGE(512),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(1024),
    /* JADX INFO: Fake field, exist only in values array */
    EN_NOT_SUPPORT(2048),
    /* JADX INFO: Fake field, exist only in values array */
    USER_PROFILE_NOT_SUPPORT(4096);

    public final long a;

    ExposureNotificationStatus(long j) {
        this.a = j;
    }
}
