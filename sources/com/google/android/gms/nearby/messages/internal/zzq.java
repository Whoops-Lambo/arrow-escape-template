package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.nearby.zzno;
import defpackage.a45;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzq extends com.google.android.gms.internal.nearby.zzb implements zzr {
    @Override // com.google.android.gms.internal.nearby.zzb
    public final boolean r(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) com.google.android.gms.internal.nearby.zzc.a(parcel, Status.CREATOR);
        com.google.android.gms.internal.nearby.zzc.b(parcel);
        zzno zznoVar = (zzno) this;
        synchronized (zznoVar) {
            if (!zznoVar.a) {
                new a45(status);
                throw null;
            }
            String strValueOf = String.valueOf(status);
            Log.wtf("NearbyMessagesCallbackWrapper", "Received multiple statuses: ".concat(strValueOf), new Exception());
        }
        return true;
    }

    public zzq() {
        super("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
    }
}
