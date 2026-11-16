package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.oe2;
import defpackage.s42;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/share/model/ShareLinkContent;", "Lcom/facebook/share/model/ShareContent;", "Loe2;", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ShareLinkContent extends ShareContent<ShareLinkContent, oe2> {

    @NotNull
    public static final Parcelable.Creator<ShareLinkContent> CREATOR = new s42(5);
    public final String g;

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ShareLinkContent(Parcel parcel) {
        super(parcel);
        this.g = parcel.readString();
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        super.writeToParcel(parcel, i);
        parcel.writeString(this.g);
    }

    public ShareLinkContent(oe2 oe2Var) {
        super(oe2Var);
        this.g = oe2Var.g;
    }
}
