package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import io.p071bidmachine.iab.vast.processor.VastAd;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class b implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new AccessToken(parcel);
            case 1:
                parcel.getClass();
                return new AuthenticationToken(parcel);
            case 2:
                parcel.getClass();
                return new AuthenticationTokenClaims(parcel);
            case 3:
                parcel.getClass();
                return new AuthenticationTokenHeader(parcel);
            case 4:
                parcel.getClass();
                return new FacebookRequestError(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, null, false);
            case 5:
                parcel.getClass();
                return new GraphRequest$ParcelableResourceWithMimeType(parcel);
            case 6:
                parcel.getClass();
                return new Profile(parcel);
            default:
                return new VastAd(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new AccessToken[i];
            case 1:
                return new AuthenticationToken[i];
            case 2:
                return new AuthenticationTokenClaims[i];
            case 3:
                return new AuthenticationTokenHeader[i];
            case 4:
                return new FacebookRequestError[i];
            case 5:
                return new GraphRequest$ParcelableResourceWithMimeType[i];
            case 6:
                return new Profile[i];
            default:
                return new VastAd[i];
        }
    }
}
