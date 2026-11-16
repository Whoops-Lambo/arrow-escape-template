package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.MimeTypes;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"com/facebook/GraphRequest$ParcelableResourceWithMimeType", "Landroid/os/Parcelable;", "RESOURCE", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GraphRequest$ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<GraphRequest$ParcelableResourceWithMimeType<?>> CREATOR = new b(5);
    public final String a;
    public final Parcelable b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 1;
    }

    public GraphRequest$ParcelableResourceWithMimeType(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readParcelable(a0.a().getClassLoader());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }

    public GraphRequest$ParcelableResourceWithMimeType(Parcelable parcelable) {
        this.a = MimeTypes.IMAGE_PNG;
        this.b = parcelable;
    }
}
