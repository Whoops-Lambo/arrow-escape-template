package defpackage;

import java.util.ArrayList;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class dy1 extends yr1 {
    public final /* synthetic */ ey1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy1(Boolean bool, ey1 ey1Var) {
        super(bool);
        this.b = ey1Var;
    }

    @Override // defpackage.yr1
    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        if (((Boolean) obj).booleanValue() != zBooleanValue) {
            ArrayList arrayList = this.b.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj3 = arrayList.get(i);
                i++;
                wv1 wv1Var = (wv1) obj3;
                if (wv1Var.getCurrentState() != zBooleanValue) {
                    wv1Var.setCurrentState(zBooleanValue);
                }
            }
        }
    }
}
