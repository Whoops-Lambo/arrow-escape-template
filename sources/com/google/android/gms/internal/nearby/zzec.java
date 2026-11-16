package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzec implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzeb[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        zzcp zzcpVar;
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzco zzcmVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    SafeParcelReader.skipUnknownField(parcel, header);
                } else {
                    iBinder2 = SafeParcelReader.readIBinder(parcel, header);
                }
            } else {
                iBinder = SafeParcelReader.readIBinder(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        if (iBinder == null) {
            zzcpVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.exposurenotification.internal.IBooleanResultListener");
            if (iInterfaceQueryLocalInterface instanceof zzcp) {
                zzcpVar = (zzcp) iInterfaceQueryLocalInterface;
            } else {
                zzcpVar = new zzcp(iBinder, "com.google.android.gms.nearby.exposurenotification.internal.IBooleanResultListener");
            }
        }
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.exposurenotification.internal.IBooleanCallback");
            if (iInterfaceQueryLocalInterface2 instanceof zzco) {
                zzcmVar = (zzco) iInterfaceQueryLocalInterface2;
            } else {
                zzcmVar = new zzcm(iBinder2, "com.google.android.gms.nearby.exposurenotification.internal.IBooleanCallback");
            }
        }
        zzeb zzebVar = new zzeb();
        zzebVar.b = zzcpVar;
        zzebVar.a = zzcmVar;
        return zzebVar;
    }
}
