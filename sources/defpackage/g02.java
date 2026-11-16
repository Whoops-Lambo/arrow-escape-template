package defpackage;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class g02 extends i02 implements KProperty2 {
    @Override // defpackage.ao
    public final KCallable computeReflected() {
        p32.a.getClass();
        return this;
    }

    @Override // kotlin.reflect.KProperty2, defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        return ((h02) this).get(obj, obj2);
    }

    @Override // kotlin.reflect.KProperty2
    public final Object getDelegate(Object obj, Object obj2) {
        return ((KProperty2) getReflected()).getDelegate(obj, obj2);
    }

    @Override // kotlin.reflect.KProperty
    public final KProperty2.Getter getGetter() {
        return ((KProperty2) getReflected()).getGetter();
    }
}
