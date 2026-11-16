package androidx.datastore.core;

import defpackage.fy;
import defpackage.pp1;
import defpackage.t50;
import java.io.FileInputStream;
import java.nio.channels.FileLock;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@t50(c = "androidx.datastore.core.MultiProcessCoordinator", f = "MultiProcessCoordinator.android.kt", l = {62, 87}, m = "tryLock")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final class MultiProcessCoordinator$tryLock$1<T> extends fy {
    public pp1 r;
    public FileInputStream s;
    public FileLock t;
    public boolean u;
    public /* synthetic */ Object v;
    public final /* synthetic */ MultiProcessCoordinator w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiProcessCoordinator$tryLock$1(MultiProcessCoordinator multiProcessCoordinator, fy fyVar) {
        super(fyVar);
        this.w = multiProcessCoordinator;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.a(null, this);
    }
}
