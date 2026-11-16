package com.adsurge.adn.p042m1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class k extends a {
    @Override // com.adsurge.adn.p042m1.a
    public int a(FileOutputStream fileOutputStream) throws a.C0122a, a.b {
        byte[] bArr = new byte[8192];
        this.c.a(this.b.length());
        while (!this.e.get()) {
            try {
                int i = this.a.read(bArr);
                if (i <= 0 || this.e.get()) {
                    break;
                }
                try {
                    fileOutputStream.write(bArr, 0, i);
                    this.c.a(this.b.length());
                } catch (IOException e) {
                    throw new a.b(e);
                }
            } catch (IOException e2) {
                throw new a.C0122a(e2);
            }
        }
        return 0;
    }

    public k(InputStream inputStream, File file, c cVar) {
        super(inputStream, file, cVar);
    }
}
