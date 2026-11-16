package com.adsurge.adn.oversea_ad;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class Vermillion implements Parcelable {
    public final int a;
    public final byte[] b;
    public final int c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeByteArray(this.b);
        parcel.writeInt(this.c);
    }

    public Vermillion(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.createByteArray();
        this.c = parcel.readInt();
    }
}
