package com.adsurge.adn.oversea_ad;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements ITuringDID {
    public final /* synthetic */ r a;

    public f0(r rVar) {
        this.a = rVar;
    }

    @Override // com.adsurge.adn.oversea_ad.ITuringDID
    public final String getAIDCode() {
        return this.a.g;
    }

    @Override // com.adsurge.adn.oversea_ad.ITuringDID
    public final String getAIDTicket() {
        return this.a.f;
    }

    @Override // com.adsurge.adn.oversea_ad.ITuringDID
    public final int getErrorCode() {
        return this.a.c;
    }

    @Override // com.adsurge.adn.oversea_ad.ITuringDID
    public final long getExpiredTimestamp() {
        return this.a.b;
    }

    @Override // com.adsurge.adn.oversea_ad.ITuringDID
    public final String getOpenIdTicket() {
        return this.a.a;
    }

    @Override // com.adsurge.adn.oversea_ad.ITuringDID
    public final String getTAIDTicket() {
        return this.a.e;
    }
}
