package defpackage;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class i02 extends ao implements KProperty {
    private final boolean syntheticJavaProperty;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i02) {
            i02 i02Var = (i02) obj;
            return getOwner().equals(i02Var.getOwner()) && getName().equals(i02Var.getName()) && getSignature().equals(i02Var.getSignature()) && s71.b(getBoundReceiver(), i02Var.getBoundReceiver());
        }
        if (obj instanceof KProperty) {
            return obj.equals(compute());
        }
        return false;
    }

    public i02(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.syntheticJavaProperty = (i & 2) == 2;
    }

    @Override // defpackage.ao
    public KCallable compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    @Override // defpackage.ao
    public KProperty getReflected() {
        if (this.syntheticJavaProperty) {
            d.u("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
            return null;
        }
        KCallable kCallableCompute = compute();
        if (kCallableCompute != this) {
            return (KProperty) kCallableCompute;
        }
        throw new nc1();
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // kotlin.reflect.KProperty
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // kotlin.reflect.KProperty
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        KCallable kCallableCompute = compute();
        if (kCallableCompute != this) {
            return kCallableCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
