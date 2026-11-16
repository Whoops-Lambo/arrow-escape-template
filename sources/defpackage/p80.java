package defpackage;

import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory$ExtensionLoader$ConstructorSupplier;
import com.google.android.exoplayer2.extractor.Extractor;
import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class p80 {
    public final DefaultExtractorsFactory$ExtensionLoader$ConstructorSupplier a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    public final Extractor a(Object... objArr) {
        Constructor<? extends Extractor> constructor;
        synchronized (this.b) {
            try {
                if (!this.b.get()) {
                    try {
                        constructor = this.a.getConstructor();
                    } catch (ClassNotFoundException unused) {
                        this.b.set(true);
                        constructor = null;
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating extension", e);
                    }
                }
                constructor = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (constructor == null) {
            return null;
        }
        try {
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            dr0.l("Unexpected error creating extractor", e2);
            return null;
        }
    }

    public p80(DefaultExtractorsFactory$ExtensionLoader$ConstructorSupplier defaultExtractorsFactory$ExtensionLoader$ConstructorSupplier) {
        this.a = defaultExtractorsFactory$ExtensionLoader$ConstructorSupplier;
    }
}
