package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class gy1 extends rc1 implements zr0 {
    public final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy1(boolean z) {
        super(2);
        this.i = z;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        Map map = (Map) obj2;
        ((String) obj).getClass();
        map.getClass();
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((ey1) it.next()).setCurrentState(this.i);
        }
        return az2.a;
    }
}
