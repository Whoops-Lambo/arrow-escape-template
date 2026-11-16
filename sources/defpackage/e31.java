package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class e31 extends uh implements ue1, Serializable {
    public final transient d42 e;
    public final transient int f;

    @Override // defpackage.so1
    public final int size() {
        return 0;
    }

    @Override // com.google.common.collect.a
    public final boolean a(Object obj) {
        return obj != null && super.a(obj);
    }

    @Override // defpackage.so1
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final d31 get(Object obj) {
        d31 d31Var = (d31) d42.g.get(obj);
        if (d31Var != null) {
            return d31Var;
        }
        z21 z21Var = d31.b;
        return y32.e;
    }

    @Override // defpackage.so1
    public final Collection d() {
        Collection l31Var = this.a;
        if (l31Var == null) {
            l31Var = new l31(this);
            this.a = l31Var;
        }
        return (u21) l31Var;
    }

    @Override // defpackage.so1
    public final boolean put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.a, defpackage.so1
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.so1
    public final Collection values() {
        Collection n31Var = this.c;
        if (n31Var == null) {
            n31Var = new n31(this);
            this.c = n31Var;
        }
        return (u21) n31Var;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i >= 0) {
            g31 g31VarD = i31.d();
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object object = objectInputStream.readObject();
                Objects.requireNonNull(object);
                int i4 = objectInputStream.readInt();
                if (i4 > 0) {
                    y21 y21VarX = d31.x();
                    for (int i5 = 0; i5 < i4; i5++) {
                        Object object2 = objectInputStream.readObject();
                        Objects.requireNonNull(object2);
                        y21VarX.a(object2);
                    }
                    g31VarD.b(object, y21VarX.g());
                    i2 += i4;
                } else {
                    throw new InvalidObjectException(pv1.k(i4, "Invalid value count "));
                }
            }
            try {
                d42 d42VarA = g31VarD.a(true);
                x41 x41Var = m31.a;
                x41Var.getClass();
                try {
                    ((Field) x41Var.b).set(this, d42VarA);
                    x41 x41Var2 = m31.b;
                    x41Var2.getClass();
                    try {
                        ((Field) x41Var2.b).set(this, Integer.valueOf(i2));
                        return;
                    } catch (IllegalAccessException e) {
                        d.p(e);
                        return;
                    }
                } catch (IllegalAccessException e2) {
                    d.p(e2);
                    return;
                }
            } catch (IllegalArgumentException e3) {
                throw ((InvalidObjectException) new InvalidObjectException(e3.getMessage()).initCause(e3));
            }
        }
        throw new InvalidObjectException(pv1.k(i, "Invalid key count "));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        qb5.s(this, objectOutputStream);
    }
}
