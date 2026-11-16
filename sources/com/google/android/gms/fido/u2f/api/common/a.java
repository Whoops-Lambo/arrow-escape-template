package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ChannelIdValue.ChannelIdValueType[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = parcel.readInt();
        try {
            Parcelable.Creator<ChannelIdValue> creator = ChannelIdValue.CREATOR;
            for (ChannelIdValue.ChannelIdValueType channelIdValueType : ChannelIdValue.ChannelIdValueType.values()) {
                if (i == channelIdValueType.a) {
                    return channelIdValueType;
                }
            }
            throw new ChannelIdValue.UnsupportedChannelIdValueTypeException(i);
        } catch (ChannelIdValue.UnsupportedChannelIdValueTypeException e) {
            dr0.m(e);
            return null;
        }
    }
}
