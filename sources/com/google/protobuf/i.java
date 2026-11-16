package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class i extends k {
    public int a = 0;
    public final int b;
    public final /* synthetic */ ByteString c;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override // com.google.protobuf.ByteString.ByteIterator
    public final byte nextByte() {
        int i = this.a;
        if (i < this.b) {
            this.a = i + 1;
            return this.c.internalByteAt(i);
        }
        defpackage.d.v();
        return (byte) 0;
    }

    public i(ByteString byteString) {
        this.c = byteString;
        this.b = byteString.size();
    }
}
