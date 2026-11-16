package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class fu4 implements Executor {
    public static final fu4 a;
    public static final /* synthetic */ fu4[] b;

    static {
        fu4 fu4Var = new fu4("INSTANCE", 0);
        a = fu4Var;
        b = new fu4[]{fu4Var};
    }

    public static fu4[] values() {
        return (fu4[]) b.clone();
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
