package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class n extends zzavh {
    public static final n c = new n();

    @Override // com.google.android.gms.internal.ads.zzavh
    public final zzavl b(String str) {
        if ("moov".equals(str)) {
            return new zzavn();
        }
        return "mvhd".equals(str) ? new zzavo() : new zzavp(str);
    }
}
