package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.s42;
import defpackage.tx;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/share/model/ShareHashtag;", "", "tx", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ShareHashtag implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ShareHashtag> CREATOR = new s42(4);
    public final String a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ShareHashtag(Parcel parcel) {
        this.a = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
    }

    public ShareHashtag(tx txVar) {
        this.a = txVar.b;
    }
}
