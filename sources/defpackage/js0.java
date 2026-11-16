package defpackage;

import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class js0 extends ao implements is0, KFunction {
    private final int arity;

    public js0(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof js0) {
            js0 js0Var = (js0) obj;
            return getName().equals(js0Var.getName()) && getSignature().equals(js0Var.getSignature()) && s71.b(getBoundReceiver(), js0Var.getBoundReceiver()) && s71.b(getOwner(), js0Var.getOwner());
        }
        if (obj instanceof KFunction) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // defpackage.ao
    public KCallable computeReflected() {
        p32.a.getClass();
        return this;
    }

    @Override // defpackage.is0
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.ao
    public KFunction getReflected() {
        KCallable kCallableCompute = compute();
        if (kCallableCompute != this) {
            return (KFunction) kCallableCompute;
        }
        throw new nc1();
    }

    public int hashCode() {
        int iHashCode;
        if (getOwner() == null) {
            iHashCode = 0;
        } else {
            iHashCode = getOwner().hashCode() * 31;
        }
        return getSignature().hashCode() + ((getName().hashCode() + iHashCode) * 31);
    }

    @Override // kotlin.reflect.KFunction
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // kotlin.reflect.KFunction
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // kotlin.reflect.KFunction
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // kotlin.reflect.KFunction
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // defpackage.ao, kotlin.reflect.KCallable
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        KCallable kCallableCompute = compute();
        if (kCallableCompute != this) {
            return kCallableCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
