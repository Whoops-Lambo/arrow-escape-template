package io.p071bidmachine.media3.exoplayer.hls.playlist;

import android.net.Uri;
import io.p071bidmachine.media3.common.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class n extends o {
    public static final n n;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;
    public final io.p071bidmachine.media3.common.n j;
    public final List k;
    public final Map l;
    public final List m;

    public static void a(List list, ArrayList arrayList) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = ((l) list.get(i)).a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    static {
        List list = Collections.EMPTY_LIST;
        n = new n("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public static ArrayList b(int i, List list, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            for (int i3 = 0; i3 < list2.size(); i3++) {
                StreamKey streamKey = (StreamKey) list2.get(i3);
                if (streamKey.b == i && streamKey.c == i2) {
                    arrayList.add(obj);
                    break;
                }
            }
        }
        return arrayList;
    }

    @Override // io.p071bidmachine.media3.exoplayer.offline.a
    public final Object copy(List list) {
        ArrayList arrayListB = b(0, this.e, list);
        List list2 = Collections.EMPTY_LIST;
        return new n(this.a, this.b, arrayListB, list2, b(1, this.g, list), b(2, this.h, list), list2, this.j, this.k, this.c, this.l, this.m);
    }

    public n(String str, List list, List list2, List list3, List list4, List list5, List list6, io.p071bidmachine.media3.common.n nVar, List list7, boolean z, Map map, List list8) {
        List listUnmodifiableList;
        super(str, list, z);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            Uri uri = ((m) list2.get(i)).a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        a(list3, arrayList);
        a(list4, arrayList);
        a(list5, arrayList);
        a(list6, arrayList);
        this.d = Collections.unmodifiableList(arrayList);
        this.e = Collections.unmodifiableList(list2);
        this.f = Collections.unmodifiableList(list3);
        this.g = Collections.unmodifiableList(list4);
        this.h = Collections.unmodifiableList(list5);
        this.i = Collections.unmodifiableList(list6);
        this.j = nVar;
        if (list7 != null) {
            listUnmodifiableList = Collections.unmodifiableList(list7);
        } else {
            listUnmodifiableList = null;
        }
        this.k = listUnmodifiableList;
        this.l = Collections.unmodifiableMap(map);
        this.m = Collections.unmodifiableList(list8);
    }
}
