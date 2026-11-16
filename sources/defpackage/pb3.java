package defpackage;

import androidx.arch.core.util.Function;
import com.applovin.impl.m5;
import com.applovin.impl.sdk.ad.b;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class pb3 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ pb3(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        int i = this.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                return bVar.i((m5) obj);
            case 1:
                return bVar.k((m5) obj);
            case 2:
                return bVar.d((m5) obj);
            case 3:
                return bVar.m((m5) obj);
            case 4:
                return bVar.g((m5) obj);
            case 5:
                return bVar.e((m5) obj);
            case 6:
                return bVar.f((m5) obj);
            case 7:
                return bVar.j((m5) obj);
            case 8:
                return bVar.a((JSONArray) obj);
            case 9:
                return bVar.b((m5) obj);
            case 10:
                return bVar.c((m5) obj);
            default:
                return bVar.a((m5) obj);
        }
    }
}
