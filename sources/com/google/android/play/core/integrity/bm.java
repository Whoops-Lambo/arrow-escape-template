package com.google.android.play.core.integrity;

import androidx.annotation.Nullable;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.kh3;
import defpackage.qa3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
abstract class bm extends kh3 {
    final /* synthetic */ bn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(@Nullable bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f = bnVar;
    }

    @Override // defpackage.kh3
    public final void a(Exception exc) {
        if (!(exc instanceof qa3)) {
            super.a(exc);
        } else if (bn.k(this.f)) {
            super.a(new StandardIntegrityException(-2, exc));
        } else {
            super.a(new StandardIntegrityException(-9, exc));
        }
    }
}
