package androidx.work.impl.model;

import android.annotation.SuppressLint;
import androidx.room.Dao;
import androidx.work.Data;
import androidx.work.WorkInfo;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Dao
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/model/WorkSpecDao;", "", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@SuppressLint({"UnknownNullness"})
public interface WorkSpecDao {
    void a(String str);

    void b(WorkSpec workSpec);

    ArrayList c(String str);

    WorkInfo.State d(String str);

    ArrayList e(String str);

    ArrayList f();

    int g(WorkInfo.State state, String str);

    boolean h();

    int i(String str);

    void j(String str);

    int k(long j, String str);

    ArrayList l(long j);

    ArrayList m();

    WorkSpec n(String str);

    int o();

    ArrayList p();

    ArrayList q(String str);

    ArrayList r(int i);

    void s(String str, Data data);

    void t(long j, String str);

    ArrayList u();

    int v(String str);
}
