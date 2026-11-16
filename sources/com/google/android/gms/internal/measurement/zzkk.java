package com.google.android.gms.internal.measurement;

import android.util.Pair;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import defpackage.tx;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@ShowFirstParty
public final class zzkk extends GoogleApi {
    public static final /* synthetic */ int a = 0;

    static {
        Pair.create(new zzkm(), Tasks.forResult(null));
    }

    public final Task a(String str) {
        return doRead(TaskApiCall.builder().run(new tx(str, 22)).build());
    }
}
