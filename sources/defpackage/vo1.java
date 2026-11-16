package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class vo1 extends o1 {
    public transient ol2 g;

    @Override // defpackage.o1
    public final Map h() {
        Map map = this.e;
        if (map instanceof NavigableMap) {
            return new w1(this, (NavigableMap) this.e);
        }
        return map instanceof SortedMap ? new z1(this, (SortedMap) this.e) : new u1(this, this.e);
    }

    @Override // defpackage.o1
    public final Collection i() {
        return (List) this.g.get();
    }

    @Override // defpackage.o1
    public final Set j() {
        Map map = this.e;
        if (map instanceof NavigableMap) {
            return new x1(this, (NavigableMap) this.e);
        }
        return map instanceof SortedMap ? new a2(this, (SortedMap) this.e) : new v1(this, this.e);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        this.g = (ol2) object;
        Object object2 = objectInputStream.readObject();
        Objects.requireNonNull(object2);
        k((Map) object2);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.g);
        objectOutputStream.writeObject(this.e);
    }
}
