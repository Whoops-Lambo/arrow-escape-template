package com.google.android.gms.games.internal.v2.appshortcuts;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.PersistableBundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "GamesAppShortcutCreator")
public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new zzj();

    @Nullable
    @SafeParcelable.Field(getter = "getId", id = 1)
    private final String zza;

    @Nullable
    @SafeParcelable.Field(getter = "getExtras", id = 2)
    private final PersistableBundle zzb;

    @Nullable
    @SafeParcelable.Field(getter = "isPinned", id = 3)
    private final Boolean zzc;

    @Nullable
    @SafeParcelable.Field(getter = "isEnabled", id = 4)
    private final Boolean zzd;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        SafeParcelWriter.writeBooleanObject(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeBooleanObject(parcel, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Nullable
    public final String zza() {
        return this.zza;
    }

    @SafeParcelable.Constructor
    public zzi(@Nullable @SafeParcelable.Param(id = 1) String str, @Nullable @SafeParcelable.Param(id = 2) PersistableBundle persistableBundle, @Nullable @SafeParcelable.Param(id = 3) Boolean bool, @Nullable @SafeParcelable.Param(id = 4) Boolean bool2) {
        this.zza = str;
        this.zzb = persistableBundle;
        this.zzc = bool;
        this.zzd = bool2;
    }
}
