package com.inmobi.media;

import com.safedk.android.internal.partials.InMobiFilesBridge;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.inmobi.media.e6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C3984e6 {
    public final C4012f6 a;
    public final boolean[] b;
    public boolean c;
    public final /* synthetic */ C4096i6 d;

    public C3984e6(C4096i6 c4096i6, C4012f6 c4012f6) {
        this.d = c4096i6;
        this.a = c4012f6;
        this.b = c4012f6.c ? null : new boolean[c4096i6.h];
    }

    public final OutputStream a(int i) {
        FileOutputStream fileOutputStreamFileOutputStreamCtor;
        C3957d6 c3957d6;
        synchronized (this.d) {
            try {
                C4012f6 c4012f6 = this.a;
                if (c4012f6.d != this) {
                    throw new IllegalStateException();
                }
                if (!c4012f6.c) {
                    this.b[i] = true;
                }
                File fileB = c4012f6.b(i);
                try {
                    fileOutputStreamFileOutputStreamCtor = InMobiFilesBridge.fileOutputStreamCtor(fileB);
                } catch (FileNotFoundException unused) {
                    this.d.b.mkdirs();
                    try {
                        fileOutputStreamFileOutputStreamCtor = InMobiFilesBridge.fileOutputStreamCtor(fileB);
                    } catch (FileNotFoundException unused2) {
                        return C4096i6.q;
                    }
                }
                c3957d6 = new C3957d6(this, fileOutputStreamFileOutputStreamCtor);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3957d6;
    }
}
