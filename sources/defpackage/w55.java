package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class w55 extends x55 {
    @Override // defpackage.x55, com.google.android.gms.internal.consent_sdk.zzpm
    public final byte c(int i) {
        if (((47 - (i + 1)) | i) >= 0) {
            return this.c[i];
        }
        if (i < 0) {
            d.l(pv1.k(i, "Index < 0: "));
            return (byte) 0;
        }
        d.l(jc1.k(i, "Index > length: ", ", 47"));
        return (byte) 0;
    }

    @Override // defpackage.x55, com.google.android.gms.internal.consent_sdk.zzpm
    public final byte d(int i) {
        return this.c[i];
    }

    @Override // defpackage.x55, com.google.android.gms.internal.consent_sdk.zzpm
    public final int h() {
        return 47;
    }
}
