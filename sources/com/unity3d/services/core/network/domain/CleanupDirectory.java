package com.unity3d.services.core.network.domain;

import com.unity3d.ads.core.log.Logger;
import defpackage.an0;
import defpackage.at;
import defpackage.bn0;
import defpackage.cn0;
import defpackage.dt1;
import defpackage.du;
import defpackage.en0;
import defpackage.fn0;
import defpackage.gg0;
import defpackage.m92;
import defpackage.p8;
import defpackage.q8;
import defpackage.s92;
import defpackage.tt0;
import defpackage.uu;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/unity3d/services/core/network/domain/CleanupDirectory;", "", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Lcom/unity3d/ads/core/log/Logger;)V", "Ljava/io/File;", "directory", "", "sizeLimitMb", "", "ageLimitMs", "Laz2;", "invoke", "(Ljava/io/File;IJ)V", "Lcom/unity3d/ads/core/log/Logger;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CleanupDirectory {

    @NotNull
    private final Logger logger;

    public CleanupDirectory(@NotNull Logger logger) {
        logger.getClass();
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dt1 invoke$lambda$3(dt1 dt1Var, File file) {
        dt1Var.getClass();
        file.getClass();
        return new dt1(Long.valueOf(((Number) dt1Var.a).longValue() - file.length()), du.p0((List) dt1Var.b, file));
    }

    /* JADX WARN: Type inference failed for: r14v4, types: [com.unity3d.services.core.network.domain.CleanupDirectory$invoke$$inlined$sortedBy$1] */
    public final void invoke(@NotNull File directory, int sizeLimitMb, long ageLimitMs) {
        List list;
        directory.getClass();
        if (directory.exists() && directory.isDirectory()) {
            an0 an0VarF = cn0.F(directory, bn0.a);
            CleanupDirectory$invoke$cachedFiles$1 cleanupDirectory$invoke$cachedFiles$1 = CleanupDirectory$invoke$cachedFiles$1.INSTANCE;
            cleanupDirectory$invoke$cachedFiles$1.getClass();
            int i = 1;
            fn0 fn0Var = new fn0(an0VarF, true, cleanupDirectory$invoke$cachedFiles$1);
            en0 en0Var = new en0(fn0Var);
            long length = 0;
            long length2 = 0;
            while (en0Var.hasNext()) {
                length2 += ((File) en0Var.next()).length();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            en0 en0Var2 = new en0(fn0Var);
            while (en0Var2.hasNext()) {
                Object next = en0Var2.next();
                if (((File) next).lastModified() + ageLimitMs < jCurrentTimeMillis) {
                    arrayList.add(next);
                } else {
                    arrayList2.add(next);
                }
            }
            int size = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                length += ((File) obj).length();
            }
            long j = length2 - length;
            int size2 = arrayList.size();
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                ((File) obj2).delete();
            }
            long j2 = sizeLimitMb * 1048576;
            if (j > j2) {
                tt0 tt0Var = new tt0(new p8(arrayList2, i), (CleanupDirectory$invoke$$inlined$sortedBy$1) new Comparator() { // from class: com.unity3d.services.core.network.domain.CleanupDirectory$invoke$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return uu.k(Long.valueOf(((File) t).lastModified()), Long.valueOf(((File) t2).lastModified()));
                    }
                });
                Object obj3 = null;
                m92 m92VarT = at.t(new s92(new dt1(Long.valueOf(j), gg0.a), tt0Var, new q8(2), null));
                while (m92VarT.hasNext()) {
                    Object next2 = m92VarT.next();
                    if (((Number) ((dt1) next2).a).longValue() <= j2) {
                        obj3 = next2;
                        break;
                    }
                }
                dt1 dt1Var = (dt1) obj3;
                List list2 = arrayList2;
                if (dt1Var != null && (list = (List) dt1Var.b) != null) {
                    list2 = arrayList2;
                    list2 = list;
                }
                list2 = arrayList2;
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
                return;
            }
            return;
        }
        this.logger.debug("Directory does not exist or is not a directory: " + directory + ", nothing to clean up.");
    }
}
