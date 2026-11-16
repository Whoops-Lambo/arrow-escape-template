package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.Dao;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Dao
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/model/WorkProgressDao;", "", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@RestrictTo
public interface WorkProgressDao {
    void a(String str);

    void b();

    void c(WorkProgress workProgress);
}
