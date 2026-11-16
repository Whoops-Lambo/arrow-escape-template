package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.d7;
import defpackage.fo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/share/model/CameraEffectTextures;", "", "fo", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CameraEffectTextures implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CameraEffectTextures> CREATOR = new d7(5);
    public final Bundle a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public CameraEffectTextures(Parcel parcel) {
        this.a = parcel.readBundle(CameraEffectTextures.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeBundle(this.a);
    }

    public CameraEffectTextures(fo foVar) {
        this.a = foVar.a;
    }
}
