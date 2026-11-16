package com.google.android.gms.games.internal.v2.appshortcuts;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "GamesAppShortcutsConfigCreator")
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();

    @SafeParcelable.Field(getter = "getAppId", id = 1)
    private final long zza;

    @Nullable
    @SafeParcelable.Field(getter = "getAppPackage", id = 2)
    private final String zzb;

    @SafeParcelable.Field(getter = "getAppShortcutsMaxNumber", id = 3)
    private final int zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getAppShortcutsTrampolineActivity", id = 4)
    private final ComponentName zzd;

    @Nullable
    @SafeParcelable.Field(getter = "getAppShortcutsTargetActivity", id = 5)
    private final String zze;

    public final int zza() {
        return this.zzc;
    }

    @Nullable
    public final String zzb() {
        return this.zze;
    }

    @SafeParcelable.Constructor
    public zzr(@SafeParcelable.Param(id = 1) long j, @Nullable @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i, @Nullable @SafeParcelable.Param(id = 4) ComponentName componentName, @Nullable @SafeParcelable.Param(id = 5) String str2) {
        this.zza = j;
        this.zzb = str;
        this.zzc = i;
        this.zzd = componentName;
        this.zze = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.zza);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
