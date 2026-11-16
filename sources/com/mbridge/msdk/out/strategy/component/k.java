package com.mbridge.msdk.out.strategy.component;

import com.mbridge.msdk.out.MBridgeIds;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.mbridge.msdk.config.manager.callback.c b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;

    public /* synthetic */ k(com.mbridge.msdk.config.manager.callback.c cVar, Object obj, int i, int i2) {
        this.a = i2;
        this.b = cVar;
        this.c = obj;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.d;
        Object obj = this.c;
        com.mbridge.msdk.config.manager.callback.c cVar = this.b;
        switch (i) {
            case 0:
                ((SplashComponentStrategy.AnonymousClass1) cVar).lambda$onAdCallback$0((MBridgeIds) obj, i2);
                break;
            case 1:
                ((SplashComponentStrategy.AnonymousClass1) cVar).lambda$onAdCallback$5((MBridgeIds) obj, i2);
                break;
            default:
                ((NativeComponentStrategy.AnonymousClass1) cVar).lambda$onAdCallback$1((List) obj, i2);
                break;
        }
    }
}
