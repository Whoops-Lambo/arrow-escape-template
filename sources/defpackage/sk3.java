package defpackage;

import com.google.android.gms.internal.measurement.zzaad;
import com.google.android.gms.internal.measurement.zzaak;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class sk3 {
    public static final zzaad a;

    static {
        zzaad zzaadVar;
        try {
            zzaadVar = zzaak.a;
        } catch (NoClassDefFoundError unused) {
            zzaadVar = null;
        }
        if (zzaadVar == null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                String str = zzaad.a[i];
                try {
                    zzaadVar = (zzaad) Class.forName(str).getConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    th = th;
                    sb.append('\n');
                    sb.append(str);
                    sb.append(": ");
                    if (th instanceof InvocationTargetException) {
                        th = th.getCause();
                    }
                    sb.append(th);
                }
            }
            throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
        }
        a = zzaadVar;
    }
}
