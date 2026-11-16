package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.du;
import defpackage.s42;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/facebook/share/model/ShareStoryContent;", "Lcom/facebook/share/model/ShareContent;", "", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ShareStoryContent extends ShareContent<ShareStoryContent, Object> {

    @NotNull
    public static final Parcelable.Creator<ShareStoryContent> CREATOR = new s42(9);
    public final ShareMedia g;
    public final SharePhoto h;
    public final List i;
    public final String j;

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ShareStoryContent(Parcel parcel) {
        List listZ0;
        super(parcel);
        this.g = (ShareMedia) parcel.readParcelable(ShareMedia.class.getClassLoader());
        this.h = (SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            listZ0 = null;
        } else {
            listZ0 = du.z0(arrayList);
        }
        this.i = listZ0;
        this.j = parcel.readString();
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<String> listZ0;
        parcel.getClass();
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.g, 0);
        parcel.writeParcelable(this.h, 0);
        List list = this.i;
        if (list != null) {
            listZ0 = du.z0(list);
        } else {
            listZ0 = null;
        }
        parcel.writeStringList(listZ0);
        parcel.writeString(this.j);
    }
}
