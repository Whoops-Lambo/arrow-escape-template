package defpackage;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.media.C4287p2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wf3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C4287p2 b;
    public final /* synthetic */ AdMetaInfo c;

    public /* synthetic */ wf3(C4287p2 c4287p2, AdMetaInfo adMetaInfo, int i) {
        this.a = i;
        this.b = c4287p2;
        this.c = adMetaInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AdMetaInfo adMetaInfo = this.c;
        C4287p2 c4287p2 = this.b;
        switch (i) {
            case 0:
                C4287p2.b(c4287p2, adMetaInfo);
                break;
            default:
                C4287p2.a(c4287p2, adMetaInfo);
                break;
        }
    }
}
