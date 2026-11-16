package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfno {
    public static Task a;
    public static AppSetIdClient b;
    public static final Object c = new Object();

    public static void a(Context context, boolean z) {
        synchronized (c) {
            try {
                if (b == null) {
                    b = AppSet.getClient(context);
                }
                Task task = a;
                if (task == null || ((task.isComplete() && !a.isSuccessful()) || (z && a.isComplete()))) {
                    try {
                        a = ((AppSetIdClient) Preconditions.checkNotNull(b, "the appSetIdClient shouldn't be null")).getAppSetIdInfo();
                    } catch (ArrayIndexOutOfBoundsException e) {
                        String message = e.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 31);
                        sb.append("Failed to get app set ID info: ");
                        sb.append(message);
                        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                        a = Tasks.forException(e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
