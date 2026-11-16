package com.adsurge.adn.oversea_ad;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class u0 extends Thread {
    public final InputStream a;
    public final ByteArrayOutputStream b;
    public final /* synthetic */ x0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(x0 x0Var, String str, InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream) {
        super(str);
        this.c = x0Var;
        this.a = inputStream;
        this.b = byteArrayOutputStream;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i = this.a.read(bArr);
                if (i < 0) {
                    synchronized (this.c.b) {
                        this.b.write(":RET=EOF".getBytes());
                        this.b.flush();
                    }
                    synchronized (this.c.a) {
                        this.c.a.notifyAll();
                    }
                    return;
                }
                if (i > 0) {
                    synchronized (this.c.b) {
                        this.b.write(bArr, 0, i);
                        this.b.flush();
                    }
                    synchronized (this.c.a) {
                        this.c.a.notifyAll();
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
