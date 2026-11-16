package com.google.android.gms.games.internal.v2.appshortcuts;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@RequiresApi
@SafeParcelable.Class(creator = "ExpectedShortcutsStateCreator")
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new zzh();

    @Nullable
    @SafeParcelable.Field(getter = "getRemovedShortcutIds", id = 1)
    private final List zza;

    @Nullable
    @SafeParcelable.Field(getter = "getAddedShortcuts", id = 2)
    private final List zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getDisabledShortcutIds", id = 3)
    private final List zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getEnabledShortcutIds", id = 4)
    private final List zzd;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringList(parcel, 1, list, false);
        SafeParcelWriter.writeTypedList(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeStringList(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeStringList(parcel, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Nullable
    public final List zza() {
        return this.zza;
    }

    @Nullable
    public final List zzb() {
        return this.zzb;
    }

    @Nullable
    public final List zzc() {
        return this.zzc;
    }

    @Nullable
    public final List zzd() {
        return this.zzd;
    }

    @SafeParcelable.Constructor
    public zzg(@Nullable @SafeParcelable.Param(id = 1) List list, @Nullable @SafeParcelable.Param(id = 2) List list2, @Nullable @SafeParcelable.Param(id = 3) List list3, @Nullable @SafeParcelable.Param(id = 4) List list4) {
        this.zza = list;
        this.zzb = list2;
        this.zzc = list3;
        this.zzd = list4;
    }
}
