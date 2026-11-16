package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.pe2;
import defpackage.s42;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/share/model/SharePhoto;", "Lcom/facebook/share/model/ShareMedia;", "Lpe2;", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SharePhoto extends ShareMedia<SharePhoto, pe2> {

    @NotNull
    public static final Parcelable.Creator<SharePhoto> CREATOR = new s42(7);
    public final Bitmap b;
    public final Uri c;
    public final boolean d;
    public final String e;
    public final int f;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.share.model.ShareMedia
    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF() {
        return this.f;
    }

    public SharePhoto(Parcel parcel) {
        super(parcel);
        this.f = 1;
        this.b = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.d = parcel.readByte() != 0;
        this.e = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeBundle(this.a);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeString(this.e);
    }

    public SharePhoto(pe2 pe2Var) {
        super(pe2Var);
        this.f = 1;
        this.b = pe2Var.b;
        this.c = pe2Var.c;
        this.d = pe2Var.d;
        this.e = pe2Var.e;
    }
}
