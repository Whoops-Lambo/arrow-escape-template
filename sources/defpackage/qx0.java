package defpackage;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.k;
import com.unity3d.ads.adplayer.WebViewAdPlayer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qx0 implements sr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ qx0(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(z);
            case 1:
                return WebViewAdPlayer.sendFocusChange$lambda$18(z);
            case 2:
                return WebViewAdPlayer.sendVisibilityChange$lambda$17(z);
            case 3:
                return WebViewAdPlayer.sendMuteChange$lambda$16(z);
            default:
                return k.a(z);
        }
    }
}
