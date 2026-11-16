package defpackage;

import com.inmobi.media.Ej;
import com.unity3d.ads.adplayer.WebViewAdPlayer;
import com.unity3d.ads.core.domain.adquality.AndroidUpdateAdQualitySessionToken;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class w6 implements sr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ w6(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                return AndroidUpdateAdQualitySessionToken.invoke$lambda$0(str);
            case 1:
                return Short.valueOf(Ej.m(str));
            default:
                return WebViewAdPlayer.onBroadcastEvent$lambda$23(str);
        }
    }
}
