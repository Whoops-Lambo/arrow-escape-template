package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.nearby.exposurenotification.ExposureConfiguration;
import com.google.android.gms.nearby.exposurenotification.TemporaryExposureKey;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzeg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzef[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzcv zzctVar = null;
        ArrayList arrayListCreateTypedList = null;
        IBinder iBinder = null;
        ArrayList arrayListCreateTypedList2 = null;
        ExposureConfiguration exposureConfiguration = null;
        String strCreateString = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header, TemporaryExposureKey.CREATOR);
                    break;
                case 2:
                    iBinder = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 3:
                    arrayListCreateTypedList2 = SafeParcelReader.createTypedList(parcel, header, ParcelFileDescriptor.CREATOR);
                    break;
                case 4:
                    exposureConfiguration = (ExposureConfiguration) SafeParcelReader.createParcelable(parcel, header, ExposureConfiguration.CREATOR);
                    break;
                case 5:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 6:
                    iBinder2 = SafeParcelReader.readIBinder(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        IStatusCallback iStatusCallbackAsInterface = IStatusCallback.Stub.asInterface(iBinder);
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.nearby.exposurenotification.internal.IDiagnosisKeyFileSupplier");
            if (iInterfaceQueryLocalInterface instanceof zzcv) {
                zzctVar = (zzcv) iInterfaceQueryLocalInterface;
            } else {
                zzctVar = new zzct(iBinder2, "com.google.android.gms.nearby.exposurenotification.internal.IDiagnosisKeyFileSupplier");
            }
        }
        zzef zzefVar = new zzef();
        zzefVar.a = arrayListCreateTypedList;
        zzefVar.b = iStatusCallbackAsInterface;
        zzefVar.c = arrayListCreateTypedList2;
        zzefVar.d = exposureConfiguration;
        zzefVar.e = strCreateString;
        zzefVar.f = zzctVar;
        return zzefVar;
    }
}
