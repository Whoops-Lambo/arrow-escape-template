package io.p071bidmachine.media3.common.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class h implements g {
    public e b;
    public e c;
    public e d;
    public e e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public abstract e b(e eVar);

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }

    @Override // io.p071bidmachine.media3.common.audio.g
    public final void queueEndOfStream() {
        this.h = true;
        d();
    }

    @Override // io.p071bidmachine.media3.common.audio.g
    public final e a(e eVar) {
        this.d = eVar;
        this.e = b(eVar);
        return isActive() ? this.e : e.e;
    }

    public final ByteBuffer f(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // io.p071bidmachine.media3.common.audio.g
    public final void flush() {
        this.g = g.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        c();
    }

    @Override // io.p071bidmachine.media3.common.audio.g
    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.g;
        this.g = g.a;
        return byteBuffer;
    }

    @Override // io.p071bidmachine.media3.common.audio.g
    public boolean isActive() {
        return this.e != e.e;
    }

    @Override // io.p071bidmachine.media3.common.audio.g
    public boolean isEnded() {
        return this.h && this.g == g.a;
    }

    public h() {
        ByteBuffer byteBuffer = g.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        e eVar = e.e;
        this.d = eVar;
        this.e = eVar;
        this.b = eVar;
        this.c = eVar;
    }

    @Override // io.p071bidmachine.media3.common.audio.g
    public final void reset() {
        flush();
        this.f = g.a;
        e eVar = e.e;
        this.d = eVar;
        this.e = eVar;
        this.b = eVar;
        this.c = eVar;
        e();
    }
}
