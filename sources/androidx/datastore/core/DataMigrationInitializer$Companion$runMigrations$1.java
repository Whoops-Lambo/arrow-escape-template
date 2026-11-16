package androidx.datastore.core;

import defpackage.fy;
import defpackage.t50;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@t50(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", l = {42, 57}, m = "runMigrations")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final class DataMigrationInitializer$Companion$runMigrations$1<T> extends fy {
    public Serializable r;
    public Iterator s;
    public /* synthetic */ Object t;
    public int u;

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.u |= Integer.MIN_VALUE;
        return DataMigrationInitializer.Companion.a(null, null, this);
    }
}
