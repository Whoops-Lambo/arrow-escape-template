package androidx.arch.core.executor;

import androidx.annotation.RestrictTo;
import defpackage.b8;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@RestrictTo
public class ArchTaskExecutor extends TaskExecutor {
    public static volatile ArchTaskExecutor b;
    public static final b8 c = new b8(0);
    public final DefaultTaskExecutor a = new DefaultTaskExecutor();

    public static ArchTaskExecutor a() {
        if (b != null) {
            return b;
        }
        synchronized (ArchTaskExecutor.class) {
            try {
                if (b == null) {
                    b = new ArchTaskExecutor();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }
}
