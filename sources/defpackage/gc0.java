package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class gc0 implements Executor {
    public static final gc0 a;
    public static final /* synthetic */ gc0[] b;

    static {
        gc0 gc0Var = new gc0("INSTANCE", 0);
        a = gc0Var;
        b = new gc0[]{gc0Var};
    }

    public static gc0 valueOf(String str) {
        return (gc0) Enum.valueOf(gc0.class, str);
    }

    public static gc0[] values() {
        return (gc0[]) b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
