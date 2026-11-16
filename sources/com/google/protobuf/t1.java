package com.google.protobuf;

import defpackage.c62;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class t1 extends k {
    public final c62 a;
    public ByteString.ByteIterator b = a();

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.protobuf.ByteString$ByteIterator] */
    public final ByteString.ByteIterator a() {
        c62 c62Var = this.a;
        if (c62Var.hasNext()) {
            return c62Var.a().iterator2();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // com.google.protobuf.ByteString.ByteIterator
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

    public t1(u1 u1Var) {
        this.a = new c62(u1Var);
    }
}
