package com.bykv.vk.openvk.preload.geckox.buffer.a;

import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import defpackage.dr0;
import defpackage.vq2;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
final class b implements com.bykv.vk.openvk.preload.geckox.buffer.a {
    private RandomAccessFile a;
    private AtomicBoolean b = new AtomicBoolean(false);
    private File c;

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final synchronized long a(long j) throws IOException {
        int i;
        if (this.b.get()) {
            throw new IOException("released!");
        }
        i = (int) j;
        if (i != j) {
            throw new IOException("too large:".concat(String.valueOf(j)));
        }
        return this.a.skipBytes(i);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int d() throws IOException {
        byte[] bArr = new byte[1];
        if (b(bArr) <= 0) {
            return -1;
        }
        return bArr[0];
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (this.b.get()) {
            dr0.h("released!");
            return 0;
        }
        if (bArr == null || i2 <= 0 || i < 0 || i >= bArr.length) {
            return 0;
        }
        if (i + i2 > bArr.length) {
            i2 = bArr.length - i;
        }
        synchronized (this) {
            i3 = this.a.read(bArr, i, i2);
        }
        return i3;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long c() throws IOException {
        if (!this.b.get()) {
            return this.a.getFilePointer();
        }
        dr0.h("released!");
        return 0L;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void e() {
        if (this.b.getAndSet(true)) {
            return;
        }
        CloseableUtils.close(this.a);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final File f() {
        return this.c;
    }

    public b(File file) throws IOException {
        this.c = file;
        file.getParentFile().mkdirs();
        try {
            this.a = new RandomAccessFile(file, "rw");
        } catch (Exception e) {
            CloseableUtils.close(this.a);
            vq2.m("create raf mSwap failed! path: ", file.getAbsolutePath(), " caused by: ", e.getMessage(), e);
            throw null;
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void b(long j) throws IOException {
        if (!this.b.get()) {
            if (j < 0) {
                j = 0;
            }
            this.a.seek(j);
            return;
        }
        dr0.h("released!");
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr) throws IOException {
        return b(bArr, 0, bArr.length);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long b() throws IOException {
        return this.a.length();
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a(int i) throws IOException {
        a(new byte[]{(byte) i});
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a(byte[] bArr) throws IOException {
        a(bArr, 0, bArr.length);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a() throws IOException {
        if (this.b.get()) {
            dr0.h("released!");
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int a(byte[] bArr, int i, int i2) throws IOException {
        if (!this.b.get()) {
            if (bArr == null || bArr.length == 0 || i2 <= 0 || i < 0 || i >= bArr.length) {
                return 0;
            }
            if (i + i2 > bArr.length) {
                i2 = bArr.length - i;
            }
            synchronized (this) {
                this.a.write(bArr, i, i2);
            }
            return i2;
        }
        dr0.h("released!");
        return 0;
    }
}
