package defpackage;

import androidx.annotation.Nullable;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class kh3 implements Runnable {

    @Nullable
    private final TaskCompletionSource a;

    public abstract void b();

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    @Nullable
    public final TaskCompletionSource c() {
        return this.a;
    }

    public kh3() {
        this.a = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e) {
            a(e);
        }
    }

    public kh3(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }
}
