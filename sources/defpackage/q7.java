package defpackage;

import com.facebook.a0;
import io.p071bidmachine.rendering.internal.detector.brokencreative.a;
import io.p071bidmachine.rendering.internal.detector.brokencreative.b;
import io.p071bidmachine.rendering.model.k;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class q7 extends rc1 implements zr0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q7(Object obj, int i) {
        super(2);
        this.i = i;
        this.j = obj;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.i;
        az2 az2Var = az2.a;
        Object obj3 = this.j;
        switch (i) {
            case 0:
                try {
                    a0.c().execute(new q4(5, (Integer) obj2, (List) obj3));
                } catch (Exception unused) {
                }
                break;
            case 1:
                String str = (String) obj;
                Map map = (Map) obj2;
                str.getClass();
                map.getClass();
                for (Map.Entry entry : ((rw1) ep0.s(str, (LinkedHashMap) obj3)).b.entrySet()) {
                    String str2 = (String) entry.getKey();
                    boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
                    ey1 ey1Var = (ey1) map.get(str2);
                    if (ey1Var != null) {
                        ey1Var.setCurrentState(zBooleanValue);
                    }
                }
                break;
            default:
                a aVar = (a) obj;
                k kVar = (k) obj2;
                aVar.getClass();
                b bVar = (b) obj3;
                CopyOnWriteArrayList copyOnWriteArrayList = bVar.j;
                if (kVar != null) {
                    copyOnWriteArrayList.add(kVar);
                }
                CopyOnWriteArrayList copyOnWriteArrayList2 = bVar.i;
                copyOnWriteArrayList2.remove(aVar);
                if (copyOnWriteArrayList2.isEmpty() && !bVar.b.get()) {
                    bVar.f.invoke(copyOnWriteArrayList);
                }
                break;
        }
        return az2Var;
        return az2Var;
    }
}
