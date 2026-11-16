package com.google.android.gms.internal.auth;

import android.os.Parcel;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.common.api.Status;
import defpackage.ll3;
import defpackage.xc5;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzl extends zzb implements zzm {
    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean r(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        Status status = (Status) zzc.a(parcel, Status.CREATOR);
        AccountChangeEventsResponse accountChangeEventsResponse = (AccountChangeEventsResponse) zzc.a(parcel, AccountChangeEventsResponse.CREATOR);
        zzc.b(parcel);
        ll3.a(status, accountChangeEventsResponse, ((xc5) this).a);
        return true;
    }

    public zzl() {
        super("com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback");
    }
}
