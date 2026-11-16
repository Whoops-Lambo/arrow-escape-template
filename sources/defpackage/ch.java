package defpackage;

import com.mbridge.msdk.config.manager.callback.a;
import com.mbridge.msdk.out.strategy.component.BannerComponentStrategy;
import com.mbridge.msdk.out.strategy.component.BaseComponentStrategy;
import com.mbridge.msdk.out.strategy.component.ComponentStrategy;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ch implements a {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseComponentStrategy b;

    public /* synthetic */ ch(BaseComponentStrategy baseComponentStrategy, int i) {
        this.a = i;
        this.b = baseComponentStrategy;
    }

    @Override // com.mbridge.msdk.config.manager.callback.a
    public final void a(Map map) {
        int i = this.a;
        BaseComponentStrategy baseComponentStrategy = this.b;
        switch (i) {
            case 0:
                ((BannerComponentStrategy) baseComponentStrategy).lambda$load$0(map);
                break;
            default:
                ((ComponentStrategy) baseComponentStrategy).lambda$load$0(map);
                break;
        }
    }
}
