package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
abstract class zzj extends com.google.android.gms.common.internal.zzy {
    private final int zza;

    public abstract byte[] zzc();

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof com.google.android.gms.common.internal.zzz)) {
            return false;
        }
        try {
            com.google.android.gms.common.internal.zzz zzzVar = (com.google.android.gms.common.internal.zzz) obj;
            if (zzzVar.zze() != this.zza) {
                return false;
            }
            return Arrays.equals(zzc(), (byte[]) ObjectWrapper.z1(zzzVar.zzd()));
        } catch (RemoteException e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            return false;
        }
    }

    public final int hashCode() {
        return this.zza;
    }

    @Override // com.google.android.gms.common.internal.zzz
    public final int zze() {
        return this.zza;
    }

    public zzj(byte[] bArr) {
        boolean z;
        if (bArr.length == 25) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.zza = Arrays.hashCode(bArr);
    }

    @Override // com.google.android.gms.common.internal.zzz
    public final IObjectWrapper zzd() {
        return new ObjectWrapper(zzc());
    }
}
