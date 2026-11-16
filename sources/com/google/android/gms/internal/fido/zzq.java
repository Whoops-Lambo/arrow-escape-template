package com.google.android.gms.internal.fido;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzq extends zzb implements zzr {
    @Override // com.google.android.gms.internal.fido.zzb
    public final boolean r(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) zzc.a(parcel, Status.CREATOR);
        PendingIntent pendingIntent = (PendingIntent) zzc.a(parcel, PendingIntent.CREATOR);
        zzc.b(parcel);
        e(status, pendingIntent);
        return true;
    }

    public zzq() {
        super("com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
    }
}
