package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Xb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new Yb[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z;
        String str7;
        String str8;
        parcel.getClass();
        long j = parcel.readLong();
        String string = parcel.readString();
        if (string == null) {
            str = "";
        } else {
            str = string;
        }
        String string2 = parcel.readString();
        if (string2 == null) {
            str2 = "";
        } else {
            str2 = string2;
        }
        String string3 = parcel.readString();
        if (string3 == null) {
            str3 = "";
        } else {
            str3 = string3;
        }
        String string4 = parcel.readString();
        if (string4 == null) {
            str4 = "";
        } else {
            str4 = string4;
        }
        String string5 = parcel.readString();
        if (string5 == null) {
            str5 = "";
        } else {
            str5 = string5;
        }
        String string6 = parcel.readString();
        if (string6 == null) {
            str6 = "";
        } else {
            str6 = string6;
        }
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        String string7 = parcel.readString();
        if (string7 == null) {
            str7 = "";
        } else {
            str7 = string7;
        }
        Zb zb = new Zb(j, str, str2, str3, str4, str5, str6, z2, str7);
        String string8 = parcel.readString();
        if (string8 == null) {
            str8 = "";
        } else {
            str8 = string8;
        }
        Yb yb = new Yb(zb, str8, parcel.readInt(), parcel.readLong());
        yb.e = parcel.readInt();
        yb.f = parcel.readString();
        return yb;
    }
}
