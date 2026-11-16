package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@SafeParcelable.Class(creator = "ContentsCreator")
@SafeParcelable.Reserved({1})
@Deprecated
@KeepForSdk
public class Contents extends AbstractSafeParcelable {

    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<Contents> CREATOR = new zza();
    public final ParcelFileDescriptor a;
    public final int b;
    public final int c;
    public final DriveId d;
    public final boolean e;
    public final String f;

    public Contents(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, DriveId driveId, boolean z, String str) {
        this.a = parcelFileDescriptor;
        this.b = i;
        this.c = i2;
        this.d = driveId;
        this.e = z;
        this.f = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.a, i, false);
        SafeParcelWriter.writeInt(parcel, 3, this.b);
        SafeParcelWriter.writeInt(parcel, 4, this.c);
        SafeParcelWriter.writeParcelable(parcel, 5, this.d, i, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.e);
        SafeParcelWriter.writeString(parcel, 8, this.f, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
