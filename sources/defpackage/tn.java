package defpackage;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public interface tn {
    void a(qn qnVar);

    void b(qn qnVar, boolean z);

    void delete();

    boolean exists();

    void initialize(long j);

    void load(HashMap map, SparseArray sparseArray);

    void storeFully(HashMap map);

    void storeIncremental(HashMap map);
}
