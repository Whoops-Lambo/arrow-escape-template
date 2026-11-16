package com.google.android.gms.games.internal.player;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "ProfilelessRecallSummaryCreator")
public final class zzh extends com.google.android.gms.games.internal.zzg {
    public static final Parcelable.Creator<zzh> CREATOR = new zzi();

    @SafeParcelable.Field(getter = "getRecallTokenSnapshotId", id = 1)
    private final String zza;

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return Objects.equal(this.zza, ((zzh) obj).zza);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzh(@SafeParcelable.Param(id = 1) String str) {
        this.zza = str;
    }
}
