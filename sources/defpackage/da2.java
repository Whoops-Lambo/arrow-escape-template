package defpackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class da2 implements Externalizable {
    public fh1 a;

    private final Object readResolve() {
        return this.a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        objectInput.getClass();
        byte b = objectInput.readByte();
        if (b == 0) {
            int i = objectInput.readInt();
            if (i >= 0) {
                fh1 fh1Var = new fh1(i);
                for (int i2 = 0; i2 < i; i2++) {
                    fh1Var.put(objectInput.readObject(), objectInput.readObject());
                }
                this.a = fh1Var.d();
                return;
            }
            throw new InvalidObjectException(n30.k("Illegal size value: ", i, '.'));
        }
        throw new InvalidObjectException(pv1.k(b, "Unsupported flags value: "));
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.getClass();
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.a.i);
        for (Map.Entry entry : (gh1) this.a.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }
}
