package androidx.datastore.core;

import defpackage.fy;
import defpackage.t50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@t50(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", l = {101}, m = "readScope")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final class FileStorageConnection$readScope$1<R> extends fy {
    public FileStorageConnection r;
    public FileReadScope s;
    public boolean t;
    public /* synthetic */ Object u;
    public final /* synthetic */ FileStorageConnection v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileStorageConnection$readScope$1(FileStorageConnection fileStorageConnection, fy fyVar) {
        super(fyVar);
        this.v = fileStorageConnection;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.d(null, this);
    }
}
