package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import defpackage.gv;
import defpackage.o91;
import defpackage.sy;
import defpackage.xa0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzbx {
    @NotNull
    public static final xa0 zza(@NotNull Task task) {
        final gv gvVar = new gv();
        task.addOnCompleteListener(zzbv.zza, new OnCompleteListener() { // from class: com.google.android.recaptcha.internal.zzbu
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                sy syVar = gvVar;
                Exception exception = task2.getException();
                if (exception != null) {
                    ((gv) syVar).a0(exception);
                } else if (task2.isCanceled()) {
                    ((o91) syVar).cancel(null);
                } else {
                    ((gv) syVar).M(task2.getResult());
                }
            }
        });
        return new zzbw(gvVar);
    }
}
