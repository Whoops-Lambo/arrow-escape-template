package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.work.WorkerParameters;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.WorkManagerImpl;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@RestrictTo
public class StartWorkRunnable implements Runnable {
    public WorkManagerImpl a;
    public StartStopToken b;
    public WorkerParameters.RuntimeExtras c;

    @Override // java.lang.Runnable
    public final void run() {
        this.a.f.g(this.b, this.c);
    }
}
