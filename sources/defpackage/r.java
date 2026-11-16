package defpackage;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.media.A2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ A2 b;
    public final /* synthetic */ AdMetaInfo c;

    public /* synthetic */ r(A2 a2, AdMetaInfo adMetaInfo, int i) {
        this.a = i;
        this.b = a2;
        this.c = adMetaInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AdMetaInfo adMetaInfo = this.c;
        A2 a2 = this.b;
        switch (i) {
            case 0:
                A2.b(a2, adMetaInfo);
                break;
            default:
                A2.a(a2, adMetaInfo);
                break;
        }
    }
}
