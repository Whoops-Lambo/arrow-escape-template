package defpackage;

import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.OfflineLicenseHelper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class as1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ OfflineLicenseHelper b;
    public final /* synthetic */ DrmSession c;
    public final /* synthetic */ lc2 d;

    public /* synthetic */ as1(lc2 lc2Var, DrmSession drmSession, OfflineLicenseHelper offlineLicenseHelper) {
        this.a = 1;
        this.b = offlineLicenseHelper;
        this.c = drmSession;
        this.d = lc2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        DrmSession drmSession = this.c;
        lc2 lc2Var = this.d;
        OfflineLicenseHelper offlineLicenseHelper = this.b;
        switch (i) {
            case 0:
                offlineLicenseHelper.lambda$getLicenseDurationRemainingSec$0(lc2Var, drmSession);
                break;
            case 1:
                offlineLicenseHelper.lambda$acquireFirstSessionOnHandlerThread$3(drmSession, lc2Var);
                break;
            default:
                offlineLicenseHelper.lambda$acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread$1(lc2Var, drmSession);
                break;
        }
    }

    public /* synthetic */ as1(OfflineLicenseHelper offlineLicenseHelper, lc2 lc2Var, DrmSession drmSession, int i) {
        this.a = i;
        this.b = offlineLicenseHelper;
        this.d = lc2Var;
        this.c = drmSession;
    }
}
