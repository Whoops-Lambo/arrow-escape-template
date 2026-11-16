package defpackage;

import com.google.android.gms.internal.auth.zzez;
import com.google.android.gms.internal.auth.zzfe;
import com.google.android.gms.internal.auth.zzff;
import com.google.android.gms.internal.auth.zzhe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class tg4 extends ch4 {
    public static final Class c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override // defpackage.ch4
    public final void a(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) jv4.d(obj, j);
        if (list instanceof zzff) {
            objUnmodifiableList = ((zzff) list).zze();
        } else if (!c.isAssignableFrom(list.getClass())) {
            if ((list instanceof mk4) && (list instanceof zzez)) {
                zzez zzezVar = (zzez) list;
                if (zzezVar.zzc()) {
                    zzezVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        } else {
            return;
        }
        jv4.j(j, obj, objUnmodifiableList);
    }

    @Override // defpackage.ch4
    public final void b(long j, Object obj, Object obj2) {
        List list;
        List list2;
        List listZzd;
        List list3 = (List) jv4.d(obj2, j);
        int size = list3.size();
        List list4 = (List) jv4.d(obj, j);
        if (list4.isEmpty()) {
            if (list4 instanceof zzff) {
                listZzd = new zzfe(size);
            } else if ((list4 instanceof mk4) && (list4 instanceof zzez)) {
                listZzd = ((zzez) list4).zzd(size);
            } else {
                listZzd = new ArrayList(size);
            }
            jv4.j(j, obj, listZzd);
            list2 = listZzd;
        } else {
            if (c.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size);
                arrayList.addAll(list4);
                jv4.j(j, obj, arrayList);
                list = arrayList;
            } else if (list4 instanceof zzhe) {
                zzhe zzheVar = (zzhe) list4;
                zzfe zzfeVar = new zzfe(zzheVar.size() + size);
                zzfeVar.addAll(zzfeVar.b.size(), zzheVar);
                jv4.j(j, obj, zzfeVar);
                list = zzfeVar;
            } else if ((list4 instanceof mk4) && (list4 instanceof zzez)) {
                zzez zzezVar = (zzez) list4;
                if (!zzezVar.zzc()) {
                    list2 = list4;
                    list2 = list4;
                    list2 = list4;
                    zzez zzezVarZzd = zzezVar.zzd(list4.size() + size);
                    jv4.j(j, obj, zzezVarZzd);
                    list2 = zzezVarZzd;
                }
            }
            list2 = list;
        }
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        int size2 = list2.size();
        int size3 = list3.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list3);
        }
        if (size2 > 0) {
            list3 = list2;
        }
        jv4.j(j, obj, list3);
    }
}
