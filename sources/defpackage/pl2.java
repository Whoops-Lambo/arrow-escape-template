package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class pl2 implements ol2, Serializable {
    public transient Object a = new Object();
    public final ol2 b;
    public volatile transient boolean c;
    public transient Object d;

    @Override // defpackage.ol2
    public final Object get() {
        if (!this.c) {
            synchronized (this.a) {
                try {
                    if (!this.c) {
                        Object obj = this.b.get();
                        this.d = obj;
                        this.c = true;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.d;
    }

    public final String toString() {
        return jc1.p(new StringBuilder("Suppliers.memoize("), this.c ? jc1.p(new StringBuilder("<supplier that returned "), this.d, ">") : this.b, ")");
    }

    public pl2(ol2 ol2Var) {
        ol2Var.getClass();
        this.b = ol2Var;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.a = new Object();
    }
}
