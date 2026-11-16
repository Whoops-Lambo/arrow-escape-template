package com.facebook.ads.redexgen.X;

import com.inmobi.media.core.config.models.CrashConfig;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class P1 implements ZK {
    public final /* synthetic */ C2245Ow A00;

    public P1(C2245Ow c2245Ow) {
        this.A00 = c2245Ow;
    }

    @Override // com.facebook.ads.redexgen.X.ZK
    public final long A8U() {
        return this.A00.A0B.A0C(this.A00.A07);
    }

    @Override // com.facebook.ads.redexgen.X.ZK
    public final ZJ A9e(long j) {
        long jA0D = this.A00.A0B.A0D(j);
        long j2 = this.A00.A09;
        long j3 = this.A00.A08;
        long targetGranule = this.A00.A09;
        long j4 = (j3 - targetGranule) * jA0D;
        long targetGranule2 = this.A00.A07;
        long estimatedPosition = N1.A0T((j2 + (j4 / targetGranule2)) - CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, this.A00.A09, this.A00.A08 - 1);
        return new ZJ(new ZL(j, estimatedPosition));
    }

    @Override // com.facebook.ads.redexgen.X.ZK
    public final boolean ABR() {
        return true;
    }
}
