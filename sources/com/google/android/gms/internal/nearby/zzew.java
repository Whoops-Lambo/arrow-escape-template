package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.nearby.exposurenotification.ExposureConfiguration;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzew implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzev[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        IBinder iBinder = null;
        ExposureConfiguration exposureConfiguration = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 3) {
                if (fieldId != 4) {
                    SafeParcelReader.skipUnknownField(parcel, header);
                } else {
                    exposureConfiguration = (ExposureConfiguration) SafeParcelReader.createParcelable(parcel, header, ExposureConfiguration.CREATOR);
                }
            } else {
                iBinder = SafeParcelReader.readIBinder(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        IStatusCallback iStatusCallbackAsInterface = IStatusCallback.Stub.asInterface(iBinder);
        zzev zzevVar = new zzev();
        zzevVar.a = iStatusCallbackAsInterface;
        zzevVar.b = exposureConfiguration;
        return zzevVar;
    }
}
