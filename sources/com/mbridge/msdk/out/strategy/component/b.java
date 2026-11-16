package com.mbridge.msdk.out.strategy.component;

import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MBridgeIds b;
    public final /* synthetic */ com.mbridge.msdk.config.manager.callback.c c;
    public final /* synthetic */ Serializable d;

    public /* synthetic */ b(com.mbridge.msdk.config.manager.callback.c cVar, MBridgeIds mBridgeIds, Serializable serializable, int i) {
        this.a = i;
        this.c = cVar;
        this.b = mBridgeIds;
        this.d = serializable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Serializable serializable = this.d;
        MBridgeIds mBridgeIds = this.b;
        com.mbridge.msdk.config.manager.callback.c cVar = this.c;
        switch (i) {
            case 0:
                ((BannerComponentStrategy.AnonymousClass1) cVar).lambda$onAdCallback$1(mBridgeIds, (String) serializable);
                break;
            case 1:
                ((BaseVideoComponentStrategy.AnonymousClass1) cVar).lambda$onAdCallback$1(mBridgeIds, (RewardInfo) serializable);
                break;
            case 2:
                ((BaseVideoComponentStrategy.AnonymousClass2) cVar).lambda$onAdCallback$1(mBridgeIds, (RewardInfo) serializable);
                break;
            default:
                ((SplashComponentStrategy.AnonymousClass1) cVar).lambda$onAdCallback$3(mBridgeIds, (String) serializable);
                break;
        }
    }
}
