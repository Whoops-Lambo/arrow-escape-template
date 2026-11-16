package defpackage;

import com.inmobi.media.Rn;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class y52 implements sr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ XmlPullParser b;
    public final /* synthetic */ Rn c;
    public final /* synthetic */ h32 d;

    public /* synthetic */ y52(XmlPullParser xmlPullParser, Rn rn, h32 h32Var, int i) {
        this.a = i;
        this.b = xmlPullParser;
        this.c = rn;
        this.d = h32Var;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.a;
        h32 h32Var = this.d;
        Rn rn = this.c;
        XmlPullParser xmlPullParser = this.b;
        switch (i) {
            case 0:
                return Rn.b(xmlPullParser, rn, h32Var);
            default:
                return Rn.a(xmlPullParser, rn, h32Var);
        }
    }
}
