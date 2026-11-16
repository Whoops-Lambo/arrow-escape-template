package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;
import defpackage.de2;
import defpackage.tx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b&\u0018\u0000*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000*\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u00020\u0004:\u0001\u0002¨\u0006\u0005"}, d2 = {"Lcom/facebook/share/model/ShareContent;", "M", "Lde2;", "B", "", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ShareContent<M extends ShareContent<M, B>, B extends de2> implements Parcelable {
    public final Uri a;
    public final List b;
    public final String c;
    public final String d;
    public final String e;
    public final ShareHashtag f;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ShareContent(Parcel parcel) {
        List listUnmodifiableList;
        this.a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            listUnmodifiableList = null;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.b = listUnmodifiableList;
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        tx txVar = new tx(6);
        ShareHashtag shareHashtag = (ShareHashtag) parcel.readParcelable(ShareHashtag.class.getClassLoader());
        if (shareHashtag != null) {
            txVar.b = shareHashtag.a;
        }
        this.f = new ShareHashtag(txVar);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, 0);
        parcel.writeStringList(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeParcelable(this.f, 0);
    }

    public ShareContent(de2 de2Var) {
        this.a = de2Var.a;
        this.b = de2Var.b;
        this.c = de2Var.c;
        this.d = de2Var.d;
        this.e = de2Var.e;
        this.f = de2Var.f;
    }
}
