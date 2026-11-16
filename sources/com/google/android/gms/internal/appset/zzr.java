package com.google.android.gms.internal.appset;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzr implements AppSetIdClient {
    public final zzp a;
    public final zzl b;

    @Override // com.google.android.gms.appset.AppSetIdClient
    public final Task getAppSetIdInfo() {
        return this.a.getAppSetIdInfo().continueWithTask(new Continuation() { // from class: com.google.android.gms.internal.appset.zzq
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                if (!task.isSuccessful() && !task.isCanceled()) {
                    Exception exception = task.getException();
                    if (exception instanceof ApiException) {
                        int statusCode = ((ApiException) exception).getStatusCode();
                        if (statusCode != 43001 && statusCode != 43002 && statusCode != 43003 && statusCode != 17) {
                            if (statusCode == 43000) {
                                return Tasks.forException(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
                            }
                            if (statusCode == 15) {
                                return Tasks.forException(new Exception("The operation to get app set ID timed out. Please try again later."));
                            }
                        } else {
                            return this.a.b.getAppSetIdInfo();
                        }
                    }
                }
                return task;
            }
        });
    }

    public zzr(Context context) {
        zzl zzlVar;
        this.a = new zzp(context, GoogleApiAvailabilityLight.getInstance());
        synchronized (zzl.class) {
            try {
                Preconditions.checkNotNull(context, "Context must not be null");
                if (zzl.d == null) {
                    zzl.d = new zzl(context.getApplicationContext());
                }
                zzlVar = zzl.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b = zzlVar;
    }
}
