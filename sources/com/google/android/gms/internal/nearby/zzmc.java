package com.google.android.gms.internal.nearby;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzmc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        String strCreateString;
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        byte[] bArrCreateByteArray = null;
        String str = null;
        String strCreateString2 = null;
        zzlx zzlxVar = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        boolean z = false;
        int i = 0;
        long j4 = -1;
        ParcelFileDescriptor parcelFileDescriptor = null;
        String strCreateString3 = null;
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        Uri uri = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    j = SafeParcelReader.readLong(parcel, header);
                    z = z;
                    strCreateString = str;
                    break;
                case 2:
                    i = SafeParcelReader.readInt(parcel, header);
                    strCreateString = str;
                    break;
                case 3:
                    bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                    strCreateString = str;
                    break;
                case 4:
                    parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.createParcelable(parcel, header, ParcelFileDescriptor.CREATOR);
                    strCreateString = str;
                    break;
                case 5:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    strCreateString = str;
                    break;
                case 6:
                    j4 = SafeParcelReader.readLong(parcel, header);
                    z = z;
                    strCreateString = str;
                    break;
                case 7:
                    parcelFileDescriptor2 = (ParcelFileDescriptor) SafeParcelReader.createParcelable(parcel, header, ParcelFileDescriptor.CREATOR);
                    strCreateString = str;
                    break;
                case 8:
                    uri = (Uri) SafeParcelReader.createParcelable(parcel, header, Uri.CREATOR);
                    strCreateString = str;
                    break;
                case 9:
                    j2 = SafeParcelReader.readLong(parcel, header);
                    z = z;
                    strCreateString = str;
                    break;
                case 10:
                    z = SafeParcelReader.readBoolean(parcel, header);
                    strCreateString = str;
                    break;
                case 11:
                    zzlxVar = (zzlx) SafeParcelReader.createParcelable(parcel, header, zzlx.CREATOR);
                    z = z;
                    strCreateString = str;
                    break;
                case 12:
                    j3 = SafeParcelReader.readLong(parcel, header);
                    strCreateString = str;
                    break;
                case 13:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    strCreateString = str;
                    break;
                case 14:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    strCreateString = str;
                    break;
            }
            str = strCreateString;
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        zzmb zzmbVar = new zzmb();
        zzmbVar.a = j;
        zzmbVar.b = i;
        zzmbVar.c = bArrCreateByteArray;
        zzmbVar.d = parcelFileDescriptor;
        zzmbVar.e = strCreateString3;
        zzmbVar.f = j4;
        zzmbVar.g = parcelFileDescriptor2;
        zzmbVar.h = uri;
        zzmbVar.i = j2;
        zzmbVar.j = z;
        zzmbVar.k = zzlxVar;
        zzmbVar.l = j3;
        zzmbVar.m = strCreateString2;
        zzmbVar.n = str;
        return zzmbVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzmb[i];
    }
}
