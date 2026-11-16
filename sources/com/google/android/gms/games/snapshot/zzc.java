package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SnapshotMetadataChangeEntity[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        Long longObject = null;
        BitmapTeleporter bitmapTeleporter = null;
        Uri uri = null;
        Long longObject2 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 4) {
                        if (fieldId != 5) {
                            if (fieldId != 6) {
                                SafeParcelReader.skipUnknownField(parcel, header);
                            } else {
                                longObject2 = SafeParcelReader.readLongObject(parcel, header);
                            }
                        } else {
                            bitmapTeleporter = (BitmapTeleporter) SafeParcelReader.createParcelable(parcel, header, BitmapTeleporter.CREATOR);
                        }
                    } else {
                        uri = (Uri) SafeParcelReader.createParcelable(parcel, header, Uri.CREATOR);
                    }
                } else {
                    longObject = SafeParcelReader.readLongObject(parcel, header);
                }
            } else {
                strCreateString = SafeParcelReader.createString(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new SnapshotMetadataChangeEntity(strCreateString, longObject, bitmapTeleporter, uri, longObject2);
    }
}
