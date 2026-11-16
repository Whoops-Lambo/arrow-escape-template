package defpackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.AbstractCollection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class ca2 implements Externalizable {
    public AbstractCollection a;
    public final int b;

    private final Object readResolve() {
        return this.a;
    }

    public ca2(AbstractCollection abstractCollection, int i) {
        this.a = abstractCollection;
        this.b = i;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        AbstractCollection abstractCollectionD;
        objectInput.getClass();
        byte b = objectInput.readByte();
        int i = b & 1;
        if ((b & (-2)) == 0) {
            int i2 = objectInput.readInt();
            if (i2 >= 0) {
                int i3 = 0;
                if (i != 0) {
                    if (i == 1) {
                        fc2 fc2Var = new fc2(i2);
                        while (i3 < i2) {
                            fc2Var.add(objectInput.readObject());
                            i3++;
                        }
                        abstractCollectionD = kc2.f(fc2Var);
                    } else {
                        throw new InvalidObjectException(n30.k("Unsupported collection type tag: ", i, '.'));
                    }
                } else {
                    qe1 qe1Var = new qe1(i2);
                    while (i3 < i2) {
                        qe1Var.add(objectInput.readObject());
                        i3++;
                    }
                    abstractCollectionD = eu.d(qe1Var);
                }
                this.a = abstractCollectionD;
                return;
            }
            throw new InvalidObjectException(n30.k("Illegal size value: ", i2, '.'));
        }
        throw new InvalidObjectException(n30.k("Unsupported flags value: ", b, '.'));
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.getClass();
        objectOutput.writeByte(this.b);
        objectOutput.writeInt(this.a.size());
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }
}
