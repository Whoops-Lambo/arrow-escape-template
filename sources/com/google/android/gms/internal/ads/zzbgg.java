package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbgg extends com.google.android.gms.ads.internal.client.zzck {
    public final AppEventListener a;

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public final void zza(String str, String str2) {
        this.a.onAppEvent(str, str2);
    }

    public zzbgg(AppEventListener appEventListener) {
        this.a = appEventListener;
    }
}
