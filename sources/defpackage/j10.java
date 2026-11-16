package defpackage;

import com.applovin.impl.x4;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j10 implements Continuation, x4.b {
    public final /* synthetic */ Runnable a;

    public /* synthetic */ j10(Runnable runnable) {
        this.a = runnable;
    }

    @Override // com.applovin.impl.x4.b
    public void a(boolean z, Object obj, Object obj2) {
        x4.a(this.a, z, obj, obj2);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        this.a.run();
        return Tasks.forResult(null);
    }
}
