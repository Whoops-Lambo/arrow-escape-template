package defpackage;

import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.domain.LegacyShowUseCase;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xd1 implements sr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Listeners b;
    public final /* synthetic */ String c;

    public /* synthetic */ xd1(Listeners listeners, String str, int i) {
        this.a = i;
        this.b = listeners;
        this.c = str;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.a;
        String str = this.c;
        Listeners listeners = this.b;
        switch (i) {
            case 0:
                return LegacyShowUseCase.showClicked$lambda$7(listeners, str);
            case 1:
                return LegacyShowUseCase.showStarted$lambda$6(listeners, str);
            case 2:
                return LegacyShowUseCase.bannerLeftApplication$lambda$4(listeners, str);
            default:
                return LegacyShowUseCase.showReceivedReward$lambda$3(listeners, str);
        }
    }
}
