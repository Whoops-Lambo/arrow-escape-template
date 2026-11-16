package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.util.Assertions;
import defpackage.j80;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class c implements ExoMediaDrm.OnEventListener {
    public final /* synthetic */ DefaultDrmSessionManager a;

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm.OnEventListener
    public final void onEvent(ExoMediaDrm exoMediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        ((j80) Assertions.checkNotNull(this.a.mediaDrmHandler)).obtainMessage(i, bArr).sendToTarget();
    }

    public c(DefaultDrmSessionManager defaultDrmSessionManager) {
        this.a = defaultDrmSessionManager;
    }
}
