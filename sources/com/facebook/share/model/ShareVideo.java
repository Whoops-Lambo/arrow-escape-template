package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.s42;
import defpackage.se2;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/share/model/ShareVideo;", "Lcom/facebook/share/model/ShareMedia;", "Lse2;", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ShareVideo extends ShareMedia<ShareVideo, se2> {

    @NotNull
    public static final Parcelable.Creator<ShareVideo> CREATOR = new s42(10);
    public final Uri b;
    public final int c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.share.model.ShareMedia
    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getC() {
        return this.c;
    }

    public ShareVideo(Parcel parcel) {
        super(parcel);
        this.c = 2;
        this.b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeBundle(this.a);
        parcel.writeParcelable(this.b, 0);
    }

    public ShareVideo(se2 se2Var) {
        super(se2Var);
        this.c = 2;
        this.b = se2Var.b;
    }
}
