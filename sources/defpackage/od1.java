package defpackage;

import com.google.protobuf.ByteString;
import com.google.protobuf.LazyStringArrayList;
import java.util.AbstractList;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class od1 extends AbstractList implements RandomAccess {
    public final /* synthetic */ int a;
    public final LazyStringArrayList b;

    public /* synthetic */ od1(LazyStringArrayList lazyStringArrayList, int i) {
        this.a = i;
        this.b = lazyStringArrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        switch (this.a) {
            case 0:
                this.b.add(i, (byte[]) obj);
                ((AbstractList) this).modCount++;
                break;
            default:
                this.b.add(i, (ByteString) obj);
                ((AbstractList) this).modCount++;
                break;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        switch (this.a) {
            case 0:
                return this.b.getByteArray(i);
            default:
                return this.b.getByteString(i);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        switch (this.a) {
            case 0:
                String strRemove = this.b.remove(i);
                ((AbstractList) this).modCount++;
                return LazyStringArrayList.asByteArray(strRemove);
            default:
                String strRemove2 = this.b.remove(i);
                ((AbstractList) this).modCount++;
                return LazyStringArrayList.asByteString(strRemove2);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        switch (this.a) {
            case 0:
                Object andReturn = this.b.setAndReturn(i, (byte[]) obj);
                ((AbstractList) this).modCount++;
                return LazyStringArrayList.asByteArray(andReturn);
            default:
                Object andReturn2 = this.b.setAndReturn(i, (ByteString) obj);
                ((AbstractList) this).modCount++;
                return LazyStringArrayList.asByteString(andReturn2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.size();
    }
}
