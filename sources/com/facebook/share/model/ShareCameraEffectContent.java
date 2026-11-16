package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.s42;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/facebook/share/model/ShareCameraEffectContent;", "Lcom/facebook/share/model/ShareContent;", "", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ShareCameraEffectContent extends ShareContent<ShareCameraEffectContent, Object> {

    @NotNull
    public static final Parcelable.Creator<ShareCameraEffectContent> CREATOR = new s42(2);
    public String g;
    public CameraEffectArguments h;
    public CameraEffectTextures i;

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        super.writeToParcel(parcel, i);
        parcel.writeString(this.g);
        parcel.writeParcelable(this.h, 0);
        parcel.writeParcelable(this.i, 0);
    }
}
