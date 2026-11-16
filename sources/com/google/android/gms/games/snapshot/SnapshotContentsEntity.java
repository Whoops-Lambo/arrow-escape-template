package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.internal.zzg;
import com.google.android.gms.internal.games_v2.zzfn;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@UsedByReflection("GamesGmsClientImpl.java")
@SafeParcelable.Class(creator = "SnapshotContentsEntityCreator")
@SafeParcelable.Reserved({1000})
public final class SnapshotContentsEntity extends zzg implements SnapshotContents {

    @SafeParcelable.Field(getter = "getContents", id = 1)
    private Contents zzb;
    private static final Object zza = new Object();

    @NonNull
    public static final Parcelable.Creator<SnapshotContentsEntity> CREATOR = new zza();

    @Override // com.google.android.gms.games.snapshot.SnapshotContents
    public final boolean modifyBytes(int i, @NonNull byte[] bArr, int i2, int i3) {
        return zzc(i, bArr, i2, bArr.length, false);
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotContents
    public final boolean writeBytes(@NonNull byte[] bArr) {
        return zzc(0, bArr, 0, bArr.length, true);
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotContents
    public final void zzb() {
        this.zzb = null;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotContents
    public final boolean isClosed() {
        return this.zzb == null;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotContents
    @NonNull
    public final Contents zza() {
        return this.zzb;
    }

    @SafeParcelable.Constructor
    public SnapshotContentsEntity(@NonNull @SafeParcelable.Param(id = 1) Contents contents) {
        this.zzb = contents;
    }

    private final boolean zzc(int i, byte[] bArr, int i2, int i3, boolean z) {
        Preconditions.checkState(!isClosed(), "Must provide a previously opened SnapshotContents");
        synchronized (zza) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.zzb.a.getFileDescriptor());
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                try {
                    FileChannel channel = fileOutputStream.getChannel();
                    channel.position(i);
                    bufferedOutputStream.write(bArr, i2, i3);
                    if (z) {
                        channel.truncate(bArr.length);
                    }
                    bufferedOutputStream.flush();
                } catch (IOException e) {
                    zzfn.a.i(zzfn.c("SnapshotContentsEntity"), "Failed to write snapshot data", e);
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotContents
    @NonNull
    public final ParcelFileDescriptor getParcelFileDescriptor() {
        Preconditions.checkState(!isClosed(), "Cannot mutate closed contents!");
        return this.zzb.a;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotContents
    @NonNull
    public final byte[] readFully() throws IOException {
        byte[] inputStreamFully;
        Preconditions.checkState(!isClosed(), "Must provide a previously opened Snapshot");
        synchronized (zza) {
            try {
                FileInputStream fileInputStream = new FileInputStream(this.zzb.a.getFileDescriptor());
                BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                try {
                    fileInputStream.getChannel().position(0L);
                    inputStreamFully = IOUtils.readInputStreamFully(bufferedInputStream, false);
                    fileInputStream.getChannel().position(0L);
                } catch (IOException e) {
                    zzfn.a.w(zzfn.c("SnapshotContentsEntity"), "Failed to read snapshot data", e);
                    throw e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return inputStreamFully;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zzb, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
