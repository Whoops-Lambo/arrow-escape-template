package defpackage;

import com.inmobi.media.Rn;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.Serializable;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class xv0 implements sr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ Serializable e;
    public final /* synthetic */ Object f;

    public /* synthetic */ xv0(Object obj, Object obj2, Serializable serializable, Serializable serializable2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = serializable;
        this.e = serializable2;
        this.f = obj3;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.f;
        Serializable serializable = this.e;
        Serializable serializable2 = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return HandleInvocationsFromAdViewer.invoke$lambda$0((HandleInvocationsFromAdViewer) obj3, (String) obj2, (String) serializable2, (String) serializable, (AdObject) obj);
            case 1:
                return Rn.a((XmlPullParser) obj3, (Rn) obj2, (ArrayList) serializable2, (m32) serializable, (ArrayList) obj);
            default:
                return Rn.a((XmlPullParser) obj3, (Rn) obj2, (h32) serializable2, (h32) serializable, (ArrayList) obj);
        }
    }
}
