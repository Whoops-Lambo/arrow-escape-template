package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzajj implements Parcelable.Creator<zzajg> {
    @Override // android.os.Parcelable.Creator
    public final zzajg createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        String strCreateString4 = null;
        String strCreateString5 = null;
        String strCreateString6 = null;
        String strCreateString7 = null;
        String strCreateString8 = null;
        String strCreateString9 = null;
        String strCreateString10 = null;
        String strCreateString11 = null;
        String strCreateString12 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        String strCreateString13 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 3:
                    strCreateString13 = SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    strCreateString4 = SafeParcelReader.createString(parcel, header);
                    break;
                case 6:
                    strCreateString5 = SafeParcelReader.createString(parcel, header);
                    break;
                case 7:
                    strCreateString6 = SafeParcelReader.createString(parcel, header);
                    break;
                case 8:
                    strCreateString7 = SafeParcelReader.createString(parcel, header);
                    break;
                case 9:
                    strCreateString8 = SafeParcelReader.createString(parcel, header);
                    break;
                case 10:
                    z2 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 11:
                    z = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 12:
                    strCreateString9 = SafeParcelReader.createString(parcel, header);
                    break;
                case 13:
                    strCreateString10 = SafeParcelReader.createString(parcel, header);
                    break;
                case 14:
                    strCreateString11 = SafeParcelReader.createString(parcel, header);
                    break;
                case 15:
                    strCreateString12 = SafeParcelReader.createString(parcel, header);
                    break;
                case 16:
                    z3 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 17:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        zzajg zzajgVar = new zzajg();
        zzajgVar.a = strCreateString;
        zzajgVar.b = strCreateString13;
        zzajgVar.c = strCreateString3;
        zzajgVar.d = strCreateString4;
        zzajgVar.e = strCreateString5;
        zzajgVar.f = strCreateString6;
        zzajgVar.g = strCreateString7;
        zzajgVar.h = strCreateString8;
        zzajgVar.i = z2;
        zzajgVar.j = z;
        zzajgVar.k = strCreateString9;
        zzajgVar.l = strCreateString10;
        zzajgVar.m = strCreateString11;
        zzajgVar.n = strCreateString12;
        zzajgVar.o = z3;
        zzajgVar.p = strCreateString2;
        return zzajgVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzajg[] newArray(int i) {
        return new zzajg[i];
    }
}
