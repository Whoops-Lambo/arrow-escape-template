package com.explorestack.protobuf;

import defpackage.e32;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class r5 extends e implements s5, RandomAccess {
    public static final r5 c;
    public final ArrayList b;

    static {
        r5 r5Var = new r5();
        r5Var.a = false;
        c = r5Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        c();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.b;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                arrayList.set(i, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, l5.a);
        if (f9.a.i(0, 0, bArr.length, bArr) == 0) {
            arrayList.set(i, str);
        }
        return str;
    }

    @Override // com.explorestack.protobuf.s5
    public final ByteString getByteString(int i) {
        ByteString byteStringCopyFromUtf8;
        ArrayList arrayList = this.b;
        Object obj = arrayList.get(i);
        if (obj instanceof ByteString) {
            byteStringCopyFromUtf8 = (ByteString) obj;
        } else {
            byteStringCopyFromUtf8 = obj instanceof String ? ByteString.copyFromUtf8((String) obj) : ByteString.copyFrom((byte[]) obj);
        }
        if (byteStringCopyFromUtf8 != obj) {
            arrayList.set(i, byteStringCopyFromUtf8);
        }
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.s5
    public final Object getRaw(int i) {
        return this.b.get(i);
    }

    @Override // com.explorestack.protobuf.s5
    public final List getUnderlyingElements() {
        return Collections.unmodifiableList(this.b);
    }

    @Override // com.explorestack.protobuf.s5
    public final s5 getUnmodifiableView() {
        return this.a ? new x8(this) : this;
    }

    @Override // com.explorestack.protobuf.k5
    public final k5 mutableCopyWithCapacity(int i) {
        ArrayList arrayList = this.b;
        if (i < arrayList.size()) {
            e32.a();
            return null;
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new r5(arrayList2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        c();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        return obj2 instanceof ByteString ? ((ByteString) obj2).toStringUtf8() : new String((byte[]) obj2, l5.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    public r5(s5 s5Var) {
        this.b = new ArrayList(s5Var.size());
        addAll(s5Var);
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        c();
        if (collection instanceof s5) {
            collection = ((s5) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.explorestack.protobuf.s5
    public final void b(ByteString byteString) {
        c();
        this.b.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        c();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        c();
        Object objRemove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (objRemove instanceof ByteString) {
            return ((ByteString) objRemove).toStringUtf8();
        }
        return new String((byte[]) objRemove, l5.a);
    }

    public r5(int i) {
        this(new ArrayList(i));
    }

    public r5() {
        this(10);
    }

    public r5(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
