package androidx.work.impl.model;

import androidx.room.Dao;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Dao
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/model/SystemIdInfoDao;", "", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface SystemIdInfoDao {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
    }

    void a(WorkGenerationalId workGenerationalId);

    void b(SystemIdInfo systemIdInfo);

    SystemIdInfo c(WorkGenerationalId workGenerationalId);

    ArrayList d();

    void e(String str);
}
