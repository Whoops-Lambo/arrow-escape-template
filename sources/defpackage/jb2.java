package defpackage;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import androidx.datastore.core.UncloseableOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class jb2 implements Serializer {
    public final tb2 a;

    @Override // androidx.datastore.core.Serializer
    public final Object getDefaultValue() {
        return new ib2(this.a.a(null), null, null);
    }

    @Override // androidx.datastore.core.Serializer
    public final Object readFrom(InputStream inputStream, dy dyVar) throws CorruptionException {
        try {
            q91 q91Var = r91.d;
            String strB = kk2.B(h00.p(inputStream));
            q91Var.getClass();
            return (ib2) q91Var.a(strB, ib2.Companion.serializer());
        } catch (Exception e) {
            throw new CorruptionException("Cannot parse session data", e);
        }
    }

    @Override // androidx.datastore.core.Serializer
    public final Object writeTo(Object obj, OutputStream outputStream, dy dyVar) throws IOException {
        byte[] bytes = r91.d.b(ib2.Companion.serializer(), (ib2) obj).getBytes(er.a);
        bytes.getClass();
        ((UncloseableOutputStream) outputStream).a.write(bytes);
        return az2.a;
    }

    public jb2(tb2 tb2Var) {
        tb2Var.getClass();
        this.a = tb2Var;
    }
}
