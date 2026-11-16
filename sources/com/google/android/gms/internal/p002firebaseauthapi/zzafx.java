package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.wo3;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class zzafx {
    public zzaet a;
    public Executor b;

    public final Task a(wo3 wo3Var) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Executor executor = this.b;
        zzafw zzafwVar = new zzafw();
        zzafwVar.a = this;
        zzafwVar.b = wo3Var;
        zzafwVar.c = taskCompletionSource;
        executor.execute(zzafwVar);
        return taskCompletionSource.getTask();
    }
}
