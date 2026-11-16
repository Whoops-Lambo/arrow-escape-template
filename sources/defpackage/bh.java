package defpackage;

import com.mbridge.msdk.config.manager.callback.a;
import com.mbridge.msdk.out.strategy.component.BannerComponentStrategy;
import com.mbridge.msdk.out.strategy.component.BaseComponentStrategy;
import com.mbridge.msdk.out.strategy.component.BidComponentStrategy;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bh implements a {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ BaseComponentStrategy c;

    public /* synthetic */ bh(BaseComponentStrategy baseComponentStrategy, String str, int i) {
        this.a = i;
        this.c = baseComponentStrategy;
        this.b = str;
    }

    @Override // com.mbridge.msdk.config.manager.callback.a
    public final void a(Map map) {
        int i = this.a;
        String str = this.b;
        BaseComponentStrategy baseComponentStrategy = this.c;
        switch (i) {
            case 0:
                ((BannerComponentStrategy) baseComponentStrategy).lambda$loadFromBid$1(str, map);
                break;
            default:
                ((BidComponentStrategy) baseComponentStrategy).lambda$loadFromBid$0(str, map);
                break;
        }
    }
}
