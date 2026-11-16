package com.adsurge.adn.oversea_ad;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class l0 implements RiskDetectResp {
    public final /* synthetic */ Olive a;

    public l0(Olive olive) {
        this.a = olive;
    }

    @Override // com.adsurge.adn.oversea_ad.RiskDetectResp
    public final String getDeviceToken() {
        return this.a.b;
    }

    @Override // com.adsurge.adn.oversea_ad.RiskDetectResp
    public final long getErrorCode() {
        return this.a.a;
    }

    @Override // com.adsurge.adn.oversea_ad.RiskDetectResp
    public final long getStagePackTimeMillis() {
        this.a.getClass();
        return 0L;
    }

    @Override // com.adsurge.adn.oversea_ad.RiskDetectResp
    public final long getStageReqTimeMillis() {
        this.a.getClass();
        return 0L;
    }

    @Override // com.adsurge.adn.oversea_ad.RiskDetectResp
    public final boolean isDowngrade() {
        this.a.getClass();
        return false;
    }
}
