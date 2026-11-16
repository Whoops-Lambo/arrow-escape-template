package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.du;
import defpackage.gg0;
import defpackage.qe2;
import defpackage.s42;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/share/model/SharePhotoContent;", "Lcom/facebook/share/model/ShareContent;", "Lqe2;", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SharePhotoContent extends ShareContent<SharePhotoContent, qe2> {

    @NotNull
    public static final Parcelable.Creator<SharePhotoContent> CREATOR = new s42(8);
    public final List g;

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public SharePhotoContent(Parcel parcel) {
        Iterable iterable;
        super(parcel);
        Parcelable[] parcelableArray = parcel.readParcelableArray(ShareMedia.class.getClassLoader());
        if (parcelableArray == null) {
            iterable = gg0.a;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                if (parcelable instanceof ShareMedia) {
                    arrayList.add(parcelable);
                }
            }
            iterable = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : iterable) {
            if (obj instanceof SharePhoto) {
                arrayList2.add(obj);
            }
        }
        this.g = du.z0(arrayList2);
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        super.writeToParcel(parcel, i);
        List list = this.g;
        list.getClass();
        parcel.writeParcelableArray((SharePhoto[]) list.toArray(new SharePhoto[0]), i);
    }

    public SharePhotoContent(qe2 qe2Var) {
        super(qe2Var);
        this.g = du.z0(qe2Var.g);
    }
}
