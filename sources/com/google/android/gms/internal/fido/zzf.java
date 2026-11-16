package com.google.android.gms.internal.fido;

import android.os.Parcel;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import defpackage.aa5;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzf extends zzb implements zzg {
    @Override // com.google.android.gms.internal.fido.zzb
    public final boolean r(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            ArrayList arrayList = parcel.readArrayList(zzc.a);
            zzc.b(parcel);
            ((aa5) this).a.setResult(arrayList);
        } else {
            if (i != 2) {
                return false;
            }
            Status status = (Status) zzc.a(parcel, Status.CREATOR);
            zzc.b(parcel);
            ((aa5) this).a.trySetException(new ApiException(status));
        }
        parcel2.writeNoException();
        return true;
    }

    public zzf() {
        super("com.google.android.gms.fido.fido2.api.ICredentialListCallback");
    }
}
