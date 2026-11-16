package defpackage;

import com.adsurge.adn.X.B;
import com.adsurge.adn.p053r.b;
import com.adsurge.adn.p053r.d;
import com.adsurge.adn.p053r.i;
import com.adsurge.adn.p053r.j;
import com.adsurge.adn.p053r.m;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ob3 implements B.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ ob3(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // com.adsurge.adn.X.B.a
    public final boolean a(long j) {
        int i = this.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                return bVar.c(j);
            case 1:
                return ((d) bVar).d(j);
            case 2:
                return ((i) bVar).d(j);
            case 3:
                return ((j) bVar).d(j);
            default:
                return ((m) bVar).d(j);
        }
    }
}
