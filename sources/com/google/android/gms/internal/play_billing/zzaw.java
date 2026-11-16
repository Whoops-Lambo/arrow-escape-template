package com.google.android.gms.internal.play_billing;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzaw extends zzas implements zzay {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzay
    public final void G0(String str, String str2, zzba zzbaVar) {
        Parcel parcelR = r();
        parcelR.writeString(str);
        parcelR.writeString(str2);
        zzau.b(parcelR, (zzat) zzbaVar);
        w3(1, parcelR);
    }
}
