package defpackage;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.media.C4156kb;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ge3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C4156kb b;
    public final /* synthetic */ AdMetaInfo c;

    public /* synthetic */ ge3(C4156kb c4156kb, AdMetaInfo adMetaInfo, int i) {
        this.a = i;
        this.b = c4156kb;
        this.c = adMetaInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AdMetaInfo adMetaInfo = this.c;
        C4156kb c4156kb = this.b;
        switch (i) {
            case 0:
                C4156kb.b(c4156kb, adMetaInfo);
                break;
            default:
                C4156kb.a(c4156kb, adMetaInfo);
                break;
        }
    }
}
