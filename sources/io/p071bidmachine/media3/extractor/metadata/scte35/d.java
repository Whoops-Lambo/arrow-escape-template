package io.p071bidmachine.media3.extractor.metadata.scte35;

import defpackage.jc1;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends b {
    public final long a;
    public final long b;
    public final List c;

    @Override // io.p071bidmachine.media3.extractor.metadata.scte35.b
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb.append(this.a);
        sb.append(", programSplicePlaybackPositionUs= ");
        return jc1.m(this.b, " }", sb);
    }

    public d(List list, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = Collections.unmodifiableList(list);
    }
}
