package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
final class zav implements zabt {
    final /* synthetic */ zax zaa;

    @Override // com.google.android.gms.common.api.internal.zabt
    public final void zaa(@Nullable Bundle bundle) {
        zax zaxVar = this.zaa;
        zaxVar.zay().lock();
        try {
            zaxVar.zaq(bundle);
            zaxVar.zat(ConnectionResult.RESULT_SUCCESS);
            zaxVar.zao();
        } finally {
            this.zaa.zay().unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabt
    public final void zab(@NonNull ConnectionResult connectionResult) {
        zax zaxVar = this.zaa;
        zaxVar.zay().lock();
        try {
            zaxVar.zat(connectionResult);
            zaxVar.zao();
        } finally {
            this.zaa.zay().unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabt
    public final void zac(int i, boolean z) {
        zax zaxVar = this.zaa;
        zaxVar.zay().lock();
        try {
            if (zaxVar.zaw() || zaxVar.zau() == null || !zaxVar.zau().isSuccess()) {
                zaxVar.zax(false);
                zaxVar.zap(i, z);
            } else {
                zaxVar.zax(true);
                zaxVar.zas().onConnectionSuspended(i);
            }
        } finally {
            this.zaa.zay().unlock();
        }
    }

    public /* synthetic */ zav(zax zaxVar, byte[] bArr) {
        Objects.requireNonNull(zaxVar);
        this.zaa = zaxVar;
    }
}
