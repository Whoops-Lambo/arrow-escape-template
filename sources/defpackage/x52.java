package defpackage;

import com.inmobi.media.Rn;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class x52 implements sr0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ XmlPullParser b;
    public final /* synthetic */ Rn c;
    public final /* synthetic */ h32 d;
    public final /* synthetic */ h32 e;

    public /* synthetic */ x52(XmlPullParser xmlPullParser, h32 h32Var, Rn rn, h32 h32Var2) {
        this.b = xmlPullParser;
        this.d = h32Var;
        this.c = rn;
        this.e = h32Var2;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.a;
        h32 h32Var = this.e;
        h32 h32Var2 = this.d;
        Rn rn = this.c;
        XmlPullParser xmlPullParser = this.b;
        switch (i) {
            case 0:
                return Rn.a(xmlPullParser, h32Var2, rn, h32Var);
            default:
                return Rn.a(xmlPullParser, rn, h32Var2, h32Var);
        }
    }

    public /* synthetic */ x52(XmlPullParser xmlPullParser, Rn rn, h32 h32Var, h32 h32Var2) {
        this.b = xmlPullParser;
        this.c = rn;
        this.d = h32Var;
        this.e = h32Var2;
    }
}
