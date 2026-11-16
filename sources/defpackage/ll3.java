package defpackage;

import android.os.Parcelable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.auth.zzg;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ll3 extends GoogleApi implements zzg {
    public static final Logger a;

    static {
        new Api("GoogleAuthService.API", new w95(), new Api.ClientKey());
        a = new Logger("Auth", "GoogleAuthServiceClient");
    }

    public static /* bridge */ /* synthetic */ void a(Status status, Parcelable parcelable, TaskCompletionSource taskCompletionSource) {
        if (!TaskUtil.trySetResultOrApiException(status, parcelable, taskCompletionSource)) {
            a.w("The task is already complete.", new Object[0]);
        }
    }
}
