package com.moloco.sdk.internal.services.bidtoken.providers;

import android.media.AudioManager;
import com.moloco.sdk.internal.MolocoLogger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class g implements j {
    public final com.moloco.sdk.internal.services.t a;
    public f b;

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final String c() {
        return "AudSignalProvider";
    }

    public final f d() {
        com.moloco.sdk.internal.services.t tVar = this.a;
        try {
            AudioManager audioManager = tVar.a;
            Integer numValueOf = audioManager != null ? Integer.valueOf(audioManager.getRingerMode()) : null;
            int i = 1;
            if (numValueOf == null || numValueOf.intValue() != 0) {
                if (numValueOf != null && numValueOf.intValue() == 1) {
                    i = 2;
                } else {
                    if (numValueOf != null) {
                        numValueOf.intValue();
                    }
                    i = 3;
                }
            }
            AudioManager audioManager2 = tVar.a;
            return new f(i, Integer.valueOf(audioManager2 != null ? audioManager2.getStreamVolume(3) : 0));
        } catch (Exception e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "AudSignalProvider", "[CBT] AS Error", e, false, 8, null);
            return new f(0, null);
        }
    }

    public g(com.moloco.sdk.internal.services.t tVar) {
        tVar.getClass();
        this.a = tVar;
        this.b = d();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final void a() {
        this.b = d();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final boolean b() {
        f fVarD = d();
        boolean z = !fVarD.equals(this.b);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "AudSignalProvider", "[CBT] needsRefresh: " + z + ", with current: " + fVarD + ", cached: " + this.b, false, 4, null);
        return z;
    }
}
