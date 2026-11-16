package com.google.android.gms.nearby.exposurenotification;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public enum zzj {
    /* JADX INFO: Fake field, exist only in values array */
    INFECTIOUSNESS_NONE(0),
    /* JADX INFO: Fake field, exist only in values array */
    INFECTIOUSNESS_STANDARD(1),
    /* JADX INFO: Fake field, exist only in values array */
    INFECTIOUSNESS_HIGH(2);

    public final int a;

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.a);
    }

    zzj(int i) {
        this.a = i;
    }
}
