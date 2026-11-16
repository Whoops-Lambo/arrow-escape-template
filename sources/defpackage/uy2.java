package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class uy2 implements Executor {
    public static final uy2 a;
    public static final Handler b;
    public static final /* synthetic */ uy2[] c;

    static {
        uy2 uy2Var = new uy2("INSTANCE", 0);
        a = uy2Var;
        c = new uy2[]{uy2Var};
        b = new Handler(Looper.getMainLooper());
    }

    public static uy2 valueOf(String str) {
        return (uy2) Enum.valueOf(uy2.class, str);
    }

    public static uy2[] values() {
        return (uy2[]) c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b.post(runnable);
    }
}
