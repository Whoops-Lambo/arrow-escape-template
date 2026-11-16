package androidx.datastore.core;

import defpackage.fy;
import defpackage.t50;
import java.io.FileOutputStream;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@t50(c = "androidx.datastore.core.FileWriteScope", f = "FileStorage.kt", l = {201}, m = "writeData")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final class FileWriteScope$writeData$1 extends fy {
    public FileOutputStream r;
    public FileOutputStream s;
    public /* synthetic */ Object t;
    public final /* synthetic */ FileWriteScope u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileWriteScope$writeData$1(FileWriteScope fileWriteScope, fy fyVar) {
        super(fyVar);
        this.u = fileWriteScope;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.b(null, this);
    }
}
