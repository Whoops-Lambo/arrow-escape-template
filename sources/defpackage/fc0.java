package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class fc0 implements Executor {
    public static final fc0 b = new fc0(0);
    public static final /* synthetic */ fc0 c = new fc0(1);
    public static final /* synthetic */ fc0 d = new fc0(2);
    public final /* synthetic */ int a;

    private final /* synthetic */ void a(Runnable runnable) {
    }

    public /* synthetic */ fc0(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                runnable.run();
                break;
            case 1:
                break;
            default:
                runnable.run();
                break;
        }
    }
}
