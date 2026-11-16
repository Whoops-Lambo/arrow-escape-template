package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.internal.zzg;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@UsedByReflection("GamesGmsClientImpl.java")
@SafeParcelable.Class(creator = "SnapshotEntityCreator")
@SafeParcelable.Reserved({1000})
public final class SnapshotEntity extends zzg implements Snapshot {

    @NonNull
    public static final Parcelable.Creator<SnapshotEntity> CREATOR = new zzb();

    @SafeParcelable.Field(getter = "getMetadata", id = 1)
    private final SnapshotMetadataEntity zza;

    @SafeParcelable.Field(getter = "getSnapshotContents", id = 3)
    private final SnapshotContentsEntity zzb;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.common.data.Freezable
    @NonNull
    public Snapshot freeze() {
        return this;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof Snapshot)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Snapshot snapshot = (Snapshot) obj;
        return Objects.equal(snapshot.getMetadata(), getMetadata()) && Objects.equal(snapshot.getSnapshotContents(), getSnapshotContents());
    }

    @Override // com.google.android.gms.common.data.Freezable
    @NonNull
    public final /* bridge */ /* synthetic */ Snapshot freeze() {
        return this;
    }

    @Override // com.google.android.gms.games.snapshot.Snapshot
    @NonNull
    public SnapshotMetadata getMetadata() {
        return this.zza;
    }

    @Override // com.google.android.gms.games.snapshot.Snapshot
    @Nullable
    public SnapshotContents getSnapshotContents() {
        SnapshotContentsEntity snapshotContentsEntity = this.zzb;
        if (snapshotContentsEntity.isClosed()) {
            return null;
        }
        return snapshotContentsEntity;
    }

    @SafeParcelable.Constructor
    public SnapshotEntity(@NonNull @SafeParcelable.Param(id = 1) SnapshotMetadata snapshotMetadata, @NonNull @SafeParcelable.Param(id = 3) SnapshotContentsEntity snapshotContentsEntity) {
        this.zza = new SnapshotMetadataEntity(snapshotMetadata);
        this.zzb = snapshotContentsEntity;
    }

    public int hashCode() {
        return Objects.hashCode(getMetadata(), getSnapshotContents());
    }

    @NonNull
    public String toString() {
        boolean z;
        Objects.ToStringHelper toStringHelperAdd = Objects.toStringHelper(this).add("Metadata", getMetadata());
        if (getSnapshotContents() != null) {
            z = true;
        } else {
            z = false;
        }
        return toStringHelperAdd.add("HasContents", Boolean.valueOf(z)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getMetadata(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, getSnapshotContents(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
