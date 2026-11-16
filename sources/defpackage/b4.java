package defpackage;

import java.io.Serializable;
import kotlin.reflect.KDeclarationContainer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class b4 implements is0, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4)) {
            return false;
        }
        b4 b4Var = (b4) obj;
        return this.isTopLevel == b4Var.isTopLevel && this.arity == b4Var.arity && this.flags == b4Var.flags && s71.b(this.receiver, b4Var.receiver) && s71.b(this.owner, b4Var.owner) && this.name.equals(b4Var.name) && this.signature.equals(b4Var.signature);
    }

    @Override // defpackage.is0
    public int getArity() {
        return this.arity;
    }

    public KDeclarationContainer getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return p32.a(cls);
        }
        p32.a.getClass();
        return new ct1(cls);
    }

    public int hashCode() {
        Object obj = this.receiver;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.owner;
        return ((((n30.c(n30.c((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31, this.name), 31, this.signature) + (this.isTopLevel ? 1231 : 1237)) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        p32.a.getClass();
        return r32.a(this);
    }

    public b4(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = false;
        this.arity = i;
        this.flags = i2 >> 1;
    }

    public b4(Class cls, String str) {
        this(0, ao.NO_RECEIVER, cls, "<init>", str, 0);
    }
}
