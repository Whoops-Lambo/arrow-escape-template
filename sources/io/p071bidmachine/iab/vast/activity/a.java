package io.p071bidmachine.iab.vast.activity;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class a implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                VastView$A vastView$A = new VastView$A(parcel);
                vastView$A.a = (VastView$C) parcel.readParcelable(VastView$C.class.getClassLoader());
                return vastView$A;
            default:
                VastView$C vastView$C = new VastView$C();
                vastView$C.a = null;
                vastView$C.b = 5.0f;
                vastView$C.c = 0;
                vastView$C.d = 0;
                vastView$C.e = true;
                vastView$C.f = false;
                vastView$C.g = false;
                vastView$C.h = false;
                vastView$C.i = false;
                vastView$C.j = false;
                vastView$C.k = false;
                vastView$C.l = false;
                vastView$C.m = true;
                vastView$C.n = false;
                vastView$C.a = parcel.readString();
                vastView$C.b = parcel.readFloat();
                vastView$C.c = parcel.readInt();
                vastView$C.d = parcel.readInt();
                vastView$C.e = parcel.readByte() != 0;
                vastView$C.f = parcel.readByte() != 0;
                vastView$C.g = parcel.readByte() != 0;
                vastView$C.h = parcel.readByte() != 0;
                vastView$C.i = parcel.readByte() != 0;
                vastView$C.j = parcel.readByte() != 0;
                vastView$C.k = parcel.readByte() != 0;
                vastView$C.l = parcel.readByte() != 0;
                vastView$C.m = parcel.readByte() != 0;
                vastView$C.n = parcel.readByte() != 0;
                return vastView$C;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new VastView$A[i];
            default:
                return new VastView$C[i];
        }
    }
}
