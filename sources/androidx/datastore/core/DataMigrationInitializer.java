package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.az2;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.l7;
import defpackage.m32;
import defpackage.wr0;
import defpackage.wz2;
import defpackage.zr0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/datastore/core/DataMigrationInitializer;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Companion", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DataMigrationInitializer<T> {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/datastore/core/DataMigrationInitializer$Companion;", "", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Code duplicated, block: B:27:0x006b  */
        /* JADX WARN: Code duplicated, block: B:37:0x0091  */
        /* JADX WARN: Code duplicated, block: B:39:0x0094  */
        /* JADX WARN: Code duplicated, block: B:43:0x0093 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0065->B:45:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0082 -> B:25:0x0065). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0085 -> B:25:0x0065). Please report as a decompilation issue!!! */
        public static final Object a(List list, InitializerApi initializerApi, fy fyVar) throws Throwable {
            DataMigrationInitializer$Companion$runMigrations$1 dataMigrationInitializer$Companion$runMigrations$1;
            List list2;
            m32 m32Var;
            Iterator<T> it;
            Throwable th;
            wr0 wr0Var;
            if (fyVar instanceof DataMigrationInitializer$Companion$runMigrations$1) {
                dataMigrationInitializer$Companion$runMigrations$1 = (DataMigrationInitializer$Companion$runMigrations$1) fyVar;
                int i = dataMigrationInitializer$Companion$runMigrations$1.u;
                if ((i & Integer.MIN_VALUE) != 0) {
                    dataMigrationInitializer$Companion$runMigrations$1.u = i - Integer.MIN_VALUE;
                } else {
                    dataMigrationInitializer$Companion$runMigrations$1 = new DataMigrationInitializer$Companion$runMigrations$1(fyVar);
                }
            } else {
                dataMigrationInitializer$Companion$runMigrations$1 = new DataMigrationInitializer$Companion$runMigrations$1(fyVar);
            }
            Object obj = dataMigrationInitializer$Companion$runMigrations$1.t;
            int i2 = dataMigrationInitializer$Companion$runMigrations$1.u;
            Object obj2 = dz.a;
            if (i2 != 0) {
                if (i2 == 1) {
                    list2 = (List) dataMigrationInitializer$Companion$runMigrations$1.r;
                    wz2.a0(obj);
                } else {
                    if (i2 != 2) {
                        e32.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = dataMigrationInitializer$Companion$runMigrations$1.s;
                    m32Var = (m32) dataMigrationInitializer$Companion$runMigrations$1.r;
                    try {
                        wz2.a0(obj);
                    } catch (Throwable th2) {
                        Object obj3 = m32Var.a;
                        if (obj3 == null) {
                            m32Var.a = th2;
                        } else {
                            l7.a((Throwable) obj3, th2);
                        }
                    }
                }
                while (it.hasNext()) {
                    wr0Var = (wr0) it.next();
                    dataMigrationInitializer$Companion$runMigrations$1.r = m32Var;
                    dataMigrationInitializer$Companion$runMigrations$1.s = it;
                    dataMigrationInitializer$Companion$runMigrations$1.u = 2;
                    if (wr0Var.invoke(dataMigrationInitializer$Companion$runMigrations$1) == obj2) {
                        return obj2;
                    }
                }
                th = (Throwable) m32Var.a;
                if (th == null) {
                    return az2.a;
                }
                throw th;
            }
            wz2.a0(obj);
            ArrayList arrayList = new ArrayList();
            zr0 dataMigrationInitializer$Companion$runMigrations$2 = new DataMigrationInitializer$Companion$runMigrations$2(list, arrayList, null);
            dataMigrationInitializer$Companion$runMigrations$1.r = arrayList;
            dataMigrationInitializer$Companion$runMigrations$1.u = 1;
            if (initializerApi.a(dataMigrationInitializer$Companion$runMigrations$2, dataMigrationInitializer$Companion$runMigrations$1) == obj2) {
                return obj2;
            }
            list2 = arrayList;
            m32Var = new m32();
            it = list2.iterator();
            while (it.hasNext()) {
                wr0Var = (wr0) it.next();
                dataMigrationInitializer$Companion$runMigrations$1.r = m32Var;
                dataMigrationInitializer$Companion$runMigrations$1.s = it;
                dataMigrationInitializer$Companion$runMigrations$1.u = 2;
                if (wr0Var.invoke(dataMigrationInitializer$Companion$runMigrations$1) == obj2) {
                    return obj2;
                }
            }
            th = (Throwable) m32Var.a;
            if (th == null) {
                return az2.a;
            }
            throw th;
        }
    }
}
