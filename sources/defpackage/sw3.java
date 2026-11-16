package defpackage;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class sw3 implements OnSuccessListener, OnFailureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TaskCompletionSource b;
    public final /* synthetic */ Context c;

    public sw3(dw dwVar, TaskCompletionSource taskCompletionSource, Context context, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = taskCompletionSource;
                this.c = context;
                Objects.requireNonNull(dwVar);
                break;
            case 2:
                this.b = taskCompletionSource;
                this.c = context;
                Objects.requireNonNull(dwVar);
                break;
            case 3:
                this.b = taskCompletionSource;
                this.c = context;
                Objects.requireNonNull(dwVar);
                break;
            case 4:
                this.b = taskCompletionSource;
                this.c = context;
                Objects.requireNonNull(dwVar);
                break;
            case 5:
                this.b = taskCompletionSource;
                this.c = context;
                Objects.requireNonNull(dwVar);
                break;
            default:
                this.b = taskCompletionSource;
                this.c = context;
                Objects.requireNonNull(dwVar);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        switch (this.a) {
            case 1:
                this.b.setException(exc);
                dw.w(this.c);
                break;
            case 2:
            default:
                this.b.setException(exc);
                dw.w(this.c);
                break;
            case 3:
                this.b.setException(exc);
                dw.w(this.c);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public /* synthetic */ void onSuccess(Object obj) {
        switch (this.a) {
            case 0:
                this.b.setResult((AuthResult) obj);
                dw.w(this.c);
                break;
            case 1:
            default:
                this.b.setResult((AuthResult) obj);
                dw.w(this.c);
                break;
            case 2:
                this.b.setResult((AuthResult) obj);
                dw.w(this.c);
                break;
        }
    }
}
