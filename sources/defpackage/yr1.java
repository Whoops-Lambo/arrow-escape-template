package defpackage;

import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class yr1 implements f22 {
    private Object value;

    public abstract void afterChange(KProperty kProperty, Object obj, Object obj2);

    @NotNull
    public String toString() {
        return "ObservableProperty(value=" + this.value + ')';
    }

    public yr1(Object obj) {
        this.value = obj;
    }

    public boolean beforeChange(@NotNull KProperty<?> kProperty, Object obj, Object obj2) {
        kProperty.getClass();
        return true;
    }

    @Override // defpackage.e22
    public Object getValue(@Nullable Object obj, @NotNull KProperty<?> kProperty) {
        kProperty.getClass();
        return this.value;
    }

    @Override // defpackage.f22
    public void setValue(@Nullable Object obj, @NotNull KProperty<?> kProperty, Object obj2) {
        kProperty.getClass();
        Object obj3 = this.value;
        if (!beforeChange(kProperty, obj3, obj2)) {
            return;
        }
        this.value = obj2;
        afterChange(kProperty, obj3, obj2);
    }
}
