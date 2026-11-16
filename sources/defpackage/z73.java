package defpackage;

import com.unity3d.ads.adplayer.WebViewAdPlayer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class z73 implements sr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ byte[] b;

    public /* synthetic */ z73(byte[] bArr, int i) {
        this.a = i;
        this.b = bArr;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.a;
        byte[] bArr = this.b;
        switch (i) {
            case 0:
                return WebViewAdPlayer.sendUserConsentChange$lambda$21(bArr);
            case 1:
                return WebViewAdPlayer.sendPrivacyFsmChange$lambda$22(bArr);
            default:
                return WebViewAdPlayer.onAllowedPiiChange$lambda$24(bArr);
        }
    }
}
