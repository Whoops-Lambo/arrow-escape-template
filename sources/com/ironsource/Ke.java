package com.ironsource;

import android.content.Context;
import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import com.ironsource.environment.NetworkStateReceiver;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public interface Ke {
    @NotNull
    B7 a();

    @Nullable
    Ue a(@NotNull Context context, @NotNull String str);

    @Nullable
    NetworkStateReceiver a(@NotNull Context context, @NotNull Jc jc);

    @NotNull
    String a(@NotNull Context context);

    void a(long j, @NotNull Ue.a aVar);

    void a(@NotNull Context context, @NotNull NetworkStateReceiver networkStateReceiver);

    void a(@NotNull He he);

    void a(@NotNull N1 n1);

    void a(@MainThread @NotNull Runnable runnable);

    void a(@MainThread @NotNull Runnable runnable, long j);

    void a(@NotNull String str, @NotNull String str2);

    void b();

    void b(@MainThread @NotNull Runnable runnable);

    boolean b(@NotNull Context context);

    @Nullable
    C4796ia c();

    @NotNull
    String c(@NotNull Context context);

    void c(@InterfaceC5065xb @NotNull Runnable runnable);

    void d(@WorkerThread @NotNull Runnable runnable);

    boolean d();

    void e();

    void f();

    void g();

    void h();

    @NotNull
    C4670ba i();

    static /* synthetic */ void a(Ke ke, Runnable runnable, long j, int i, Object obj) {
        if (obj != null) {
            defpackage.d.u("Super calls with default arguments not supported in this target, function: postOnUIThread");
            return;
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        ke.a(runnable, j);
    }
}
