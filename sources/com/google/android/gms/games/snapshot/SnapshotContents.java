package com.google.android.gms.games.snapshot;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.drive.Contents;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public interface SnapshotContents extends Parcelable {
    @NonNull
    ParcelFileDescriptor getParcelFileDescriptor();

    boolean isClosed();

    boolean modifyBytes(int i, @NonNull byte[] bArr, int i2, int i3);

    @NonNull
    byte[] readFully() throws IOException;

    boolean writeBytes(@NonNull byte[] bArr);

    @NonNull
    Contents zza();

    void zzb();
}
