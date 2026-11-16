package androidx.datastore.core;

import defpackage.fy;
import defpackage.t50;
import java.io.FileInputStream;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@t50(c = "androidx.datastore.core.FileReadScope", f = "FileStorage.kt", l = {169, 178}, m = "readData$suspendImpl")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final class FileReadScope$readData$1<T> extends fy {
    public Object r;
    public FileInputStream s;
    public /* synthetic */ Object t;
    public final /* synthetic */ FileReadScope u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileReadScope$readData$1(FileReadScope fileReadScope, fy fyVar) {
        super(fyVar);
        this.u = fileReadScope;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return FileReadScope.f(this.u, this);
    }
}
