package com.google.android.gms.ads.internal.client;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
final class zzes extends zzdj {
    public /* synthetic */ zzes(byte[] bArr) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zze(@Nullable zze zzeVar) {
        AdInspectorError adInspectorError;
        OnAdInspectorClosedListener onAdInspectorClosedListenerZzA = zzeu.zzb().zzA();
        if (onAdInspectorClosedListenerZzA != null) {
            if (zzeVar == null) {
                adInspectorError = null;
            } else {
                adInspectorError = new AdInspectorError(zzeVar.zza, zzeVar.zzb, zzeVar.zzc);
            }
            onAdInspectorClosedListenerZzA.onAdInspectorClosed(adInspectorError);
        }
    }

    private zzes() {
        throw null;
    }
}
