package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.PushbackInputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class oy3 extends PushbackInputStream {
    public final /* synthetic */ py3 a;

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.a.c.a();
        super.close();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oy3(py3 py3Var, ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream) {
        super(autoCloseInputStream, 1);
        this.a = py3Var;
    }
}
