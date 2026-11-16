package defpackage;

import com.google.android.gms.ads.VideoController;
import com.google.android.gms.internal.ads.zzdjz;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuthException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class dc5 implements Continuation, zzdjz {
    public static final /* synthetic */ dc5 a = new dc5();

    @Override // com.google.android.gms.internal.ads.zzdjz
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo82zza(Object obj) {
        ((VideoController.VideoLifecycleCallbacks) obj).onVideoStart();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        String message;
        if (task.isSuccessful()) {
            return Tasks.forResult(null);
        }
        Exception exception = task.getException();
        String str = "";
        if (exception == null) {
            message = "";
        } else {
            message = exception.getMessage();
        }
        if (message != null) {
            str = message;
        }
        return Tasks.forException(new FirebaseAuthException("INTERNAL_ERROR", str));
    }
}
