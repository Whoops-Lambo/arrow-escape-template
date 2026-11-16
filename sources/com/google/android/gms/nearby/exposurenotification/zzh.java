package com.google.android.gms.nearby.exposurenotification;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public enum zzh {
    /* JADX INFO: Fake field, exist only in values array */
    LOWEST_CONFIDENCE(0),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_CONFIDENCE(1),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIUM_CONFIDENCE(2),
    /* JADX INFO: Fake field, exist only in values array */
    HIGH_CONFIDENCE(3);

    public final int a;

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.a);
    }

    zzh(int i) {
        this.a = i;
    }
}
