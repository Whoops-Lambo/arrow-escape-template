package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class cm2 implements gd1, Serializable {
    public sr0 a;
    public volatile Object b;
    public final Object c;

    private final Object writeReplace() {
        return new m61(getValue());
    }

    @Override // defpackage.gd1
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.b;
        t40 t40Var = t40.g;
        if (obj != t40Var) {
            return obj;
        }
        synchronized (this.c) {
            objInvoke = this.b;
            if (objInvoke == t40Var) {
                sr0 sr0Var = this.a;
                sr0Var.getClass();
                objInvoke = sr0Var.invoke();
                this.b = objInvoke;
                this.a = null;
            }
        }
        return objInvoke;
    }

    @Override // defpackage.gd1
    public final boolean isInitialized() {
        return this.b != t40.g;
    }

    public cm2(sr0 sr0Var) {
        sr0Var.getClass();
        this.a = sr0Var;
        this.b = t40.g;
        this.c = this;
    }

    public final String toString() {
        if (isInitialized()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
