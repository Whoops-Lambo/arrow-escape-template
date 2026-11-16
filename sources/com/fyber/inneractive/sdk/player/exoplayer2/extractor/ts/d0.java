package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class d0 {
    public final String a;
    public final List b;
    public final byte[] c;

    public d0(int i, String str, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.a = str;
        if (arrayList == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.b = listUnmodifiableList;
        this.c = bArr;
    }
}
