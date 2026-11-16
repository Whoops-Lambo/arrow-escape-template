package defpackage;

import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.Rn;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class q41 implements sr0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q41(InMobiBanner inMobiBanner, PublisherCallbacks publisherCallbacks, boolean z) {
        this.c = inMobiBanner;
        this.d = publisherCallbacks;
        this.b = z;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.d;
        boolean z = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return InMobiBanner.a((InMobiBanner) obj2, (PublisherCallbacks) obj, z);
            default:
                return Rn.a((XmlPullParser) obj2, z, (Rn) obj);
        }
    }

    public /* synthetic */ q41(XmlPullParser xmlPullParser, boolean z, Rn rn) {
        this.c = xmlPullParser;
        this.b = z;
        this.d = rn;
    }
}
