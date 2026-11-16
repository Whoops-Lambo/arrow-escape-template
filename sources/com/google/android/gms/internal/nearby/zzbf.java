package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.nearby.exposurenotification.DailySummariesConfig;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzbf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbe[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzcs zzcqVar = null;
        IBinder iBinder = null;
        DailySummariesConfig dailySummariesConfig = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    SafeParcelReader.skipUnknownField(parcel, header);
                } else {
                    dailySummariesConfig = (DailySummariesConfig) SafeParcelReader.createParcelable(parcel, header, DailySummariesConfig.CREATOR);
                }
            } else {
                iBinder = SafeParcelReader.readIBinder(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.exposurenotification.internal.IDailySummaryListCallback");
            if (iInterfaceQueryLocalInterface instanceof zzcs) {
                zzcqVar = (zzcs) iInterfaceQueryLocalInterface;
            } else {
                zzcqVar = new zzcq(iBinder, "com.google.android.gms.nearby.exposurenotification.internal.IDailySummaryListCallback");
            }
        }
        zzbe zzbeVar = new zzbe();
        zzbeVar.a = zzcqVar;
        zzbeVar.b = dailySummariesConfig;
        return zzbeVar;
    }
}
