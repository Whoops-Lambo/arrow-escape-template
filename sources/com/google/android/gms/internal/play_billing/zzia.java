package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzia extends RuntimeException {
    public zzia(zzhb zzhbVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzgc d() {
        return new zzgc(getMessage());
    }
}
