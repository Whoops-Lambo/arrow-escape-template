package defpackage;

import com.inmobi.media.Rn;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class w52 implements sr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ XmlPullParser b;
    public final /* synthetic */ Rn c;

    public /* synthetic */ w52(XmlPullParser xmlPullParser, Rn rn, int i) {
        this.a = i;
        this.b = xmlPullParser;
        this.c = rn;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.a;
        Rn rn = this.c;
        XmlPullParser xmlPullParser = this.b;
        switch (i) {
            case 0:
                return Rn.f(xmlPullParser, rn);
            case 1:
                return Rn.d(xmlPullParser, rn);
            case 2:
                return Rn.g(xmlPullParser, rn);
            case 3:
                return Rn.c(xmlPullParser, rn);
            case 4:
                return Rn.h(xmlPullParser, rn);
            case 5:
                return Rn.a(xmlPullParser, rn);
            case 6:
                return Rn.e(xmlPullParser, rn);
            default:
                return Rn.b(xmlPullParser, rn);
        }
    }
}
