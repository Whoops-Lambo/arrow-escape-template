package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@KeepForSdk
public class NativeOnCompleteListener implements OnCompleteListener<Object> {
    private final long zza;

    @KeepForSdk
    public native void nativeOnComplete(long j, @Nullable Object obj, boolean z, boolean z2, @Nullable String str);

    @KeepForSdk
    public static void createAndAddCallback(@NonNull Task<Object> task, long j) {
        task.addOnCompleteListener(new NativeOnCompleteListener(j));
    }

    @KeepForSdk
    public NativeOnCompleteListener(long j) {
        this.zza = j;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    @KeepForSdk
    public void onComplete(@NonNull Task<Object> task) {
        Object result;
        String message;
        Exception exception;
        if (task.isSuccessful()) {
            result = task.getResult();
            message = null;
        } else if (!task.isCanceled() && (exception = task.getException()) != null) {
            message = exception.getMessage();
            result = null;
        } else {
            result = null;
            message = null;
        }
        nativeOnComplete(this.zza, result, task.isSuccessful(), task.isCanceled(), message);
    }
}
