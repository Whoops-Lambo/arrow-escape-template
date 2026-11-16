package com.explorestack.protobuf;

import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class q7 implements Iterator {
    public final ArrayDeque a;
    public ByteString.LeafByteString b;

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ByteString.LeafByteString next() {
        ByteString.LeafByteString leafByteString;
        ByteString.LeafByteString leafByteString2 = this.b;
        ByteString.LeafByteString leafByteString3 = null;
        if (leafByteString2 == null) {
            defpackage.d.v();
            return null;
        }
        do {
            ArrayDeque arrayDeque = this.a;
            if (arrayDeque != null && !arrayDeque.isEmpty()) {
                ByteString byteString = ((s7) arrayDeque.pop()).c;
                while (byteString instanceof s7) {
                    s7 s7Var = (s7) byteString;
                    arrayDeque.push(s7Var);
                    byteString = s7Var.b;
                }
                leafByteString = (ByteString.LeafByteString) byteString;
            }
            this.b = leafByteString3;
            return leafByteString2;
        } while (leafByteString.isEmpty());
        leafByteString3 = leafByteString;
        this.b = leafByteString3;
        return leafByteString2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public q7(ByteString byteString) {
        if (byteString instanceof s7) {
            s7 s7Var = (s7) byteString;
            ArrayDeque arrayDeque = new ArrayDeque(s7Var.e);
            this.a = arrayDeque;
            arrayDeque.push(s7Var);
            ByteString byteString2 = s7Var.b;
            while (byteString2 instanceof s7) {
                s7 s7Var2 = (s7) byteString2;
                this.a.push(s7Var2);
                byteString2 = s7Var2.b;
            }
            this.b = (ByteString.LeafByteString) byteString2;
            return;
        }
        this.a = null;
        this.b = (ByteString.LeafByteString) byteString;
    }
}
