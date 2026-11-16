package com.adsurge.adn.G1;

import com.adsurge.adn.N.b;
import com.adsurge.adn.ads.AdSurgeAdFormat;
import com.adsurge.adn.x1.l;
import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class a extends com.adsurge.adn.p067y.a {
    public final ConcurrentHashMap c;

    /* JADX INFO: renamed from: com.adsurge.adn.G1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class C0075a implements Comparator {
        public C0075a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            return Long.compare(file.lastModified(), file2.lastModified());
        }
    }

    public static long c() {
        return ((long) b.a("skpdc", 500, (AdSurgeAdFormat) null, (String) null)) * 1048576;
    }

    public a(File file, ConcurrentHashMap concurrentHashMap) {
        super(file, c());
        this.c = concurrentHashMap;
    }

    @Override // com.adsurge.adn.p067y.a
    public boolean a(File file) {
        String name = file.getName();
        Iterator it = this.c.keySet().iterator();
        while (it.hasNext()) {
            if (name.equals(l.a((String) it.next()))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.adsurge.adn.p067y.a
    public List a(File[] fileArr) {
        Arrays.sort(fileArr, new C0075a());
        return Arrays.asList(fileArr);
    }
}
