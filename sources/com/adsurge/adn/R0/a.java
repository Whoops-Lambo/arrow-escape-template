package com.adsurge.adn.R0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a implements f {
    public ByteBuffer a;

    @Override // com.adsurge.adn.R0.f
    public void close() {
    }

    public void a(int i) {
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer == null || i > byteBuffer.capacity()) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
            this.a = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        }
        this.a.clear();
    }

    public void b(int i) {
        this.a.position(a() + i);
    }

    public a() {
        a(10240);
    }

    public byte[] b() {
        return this.a.array();
    }

    public void a(byte[] bArr) {
        this.a.put(bArr);
    }

    public int a() {
        return this.a.position();
    }

    public void a(byte b) {
        this.a.put(b);
    }
}
