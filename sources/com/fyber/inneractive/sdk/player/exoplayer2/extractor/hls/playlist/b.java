package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import com.fyber.inneractive.sdk.player.exoplayer2.o;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends e {
    public final List b;
    public final List c;
    public final List d;
    public final o e;
    public final List f;

    public b(String str, List list, List list2, List list3, o oVar, List list4) {
        List listUnmodifiableList;
        super(str);
        this.b = Collections.unmodifiableList(list);
        this.c = Collections.unmodifiableList(list2);
        this.d = Collections.unmodifiableList(list3);
        this.e = oVar;
        if (list4 != null) {
            listUnmodifiableList = Collections.unmodifiableList(list4);
        } else {
            listUnmodifiableList = null;
        }
        this.f = listUnmodifiableList;
    }
}
