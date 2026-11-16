package com.google.android.gms.internal.ads;

import defpackage.fu4;
import defpackage.gu4;
import defpackage.ho1;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzhey {
    public static Executor a(Executor executor, gu4 gu4Var) {
        executor.getClass();
        if (executor == fu4.a) {
            return executor;
        }
        return new ho1(executor, gu4Var, 1);
    }
}
