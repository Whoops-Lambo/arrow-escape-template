package androidx.work.impl;

import androidx.annotation.RestrictTo;
import androidx.lifecycle.MutableLiveData;
import androidx.work.Operation;
import androidx.work.impl.utils.futures.SettableFuture;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo
public class OperationImpl implements Operation {
    public final MutableLiveData c = new MutableLiveData();
    public final SettableFuture d = new SettableFuture();

    public final void a(Operation.State state) {
        this.c.j(state);
        boolean z = state instanceof Operation.State.SUCCESS;
        SettableFuture settableFuture = this.d;
        if (z) {
            settableFuture.i((Operation.State.SUCCESS) state);
        } else if (state instanceof Operation.State.FAILURE) {
            settableFuture.j(((Operation.State.FAILURE) state).a);
        }
    }

    public OperationImpl() {
        a(Operation.b);
    }
}
