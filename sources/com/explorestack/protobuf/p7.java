package com.explorestack.protobuf;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class p7 extends ByteString.AbstractByteIterator {
    public final q7 a;
    public ByteString.ByteIterator b = a();

    /* JADX WARN: Type inference failed for: r1v4, types: [com.explorestack.protobuf.ByteString$ByteIterator] */
    public final ByteString.ByteIterator a() {
        q7 q7Var = this.a;
        if (q7Var.hasNext()) {
            return q7Var.next().iterator2();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // com.explorestack.protobuf.ByteString.ByteIterator
    public final byte nextByte() {
        ByteString.ByteIterator byteIterator = this.b;
        if (byteIterator == null) {
            defpackage.d.v();
            return (byte) 0;
        }
        byte bNextByte = byteIterator.nextByte();
        if (!this.b.hasNext()) {
            this.b = a();
        }
        return bNextByte;
    }

    public p7(s7 s7Var) {
        this.a = new q7(s7Var);
    }
}
