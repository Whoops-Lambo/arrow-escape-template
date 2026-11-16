package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class kh0 extends n1 implements jh0, RandomAccess, Serializable {
    public final Enum[] a;

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new lh0(this.a);
    }

    @Override // defpackage.i0, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        return ((Enum) n8.g0(r3.ordinal(), this.a)) == r3;
    }

    @Override // java.util.List
    public final Object get(int i) {
        j1 j1Var = n1.Companion;
        Enum[] enumArr = this.a;
        int length = enumArr.length;
        j1Var.getClass();
        j1.b(i, length);
        return enumArr[i];
    }

    @Override // defpackage.i0
    public final int getSize() {
        return this.a.length;
    }

    @Override // defpackage.n1, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) n8.g0(iOrdinal, this.a)) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // defpackage.n1, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) n8.g0(iOrdinal, this.a)) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    public kh0(Enum[] enumArr) {
        enumArr.getClass();
        this.a = enumArr;
    }
}
