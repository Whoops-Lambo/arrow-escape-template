package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public interface c91 extends qy {
    kr attachChild(mr mrVar);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    l92 getChildren();

    ad0 invokeOnCompletion(wr0 wr0Var);

    ad0 invokeOnCompletion(boolean z, boolean z2, wr0 wr0Var);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    Object join(dy dyVar);

    boolean start();
}
