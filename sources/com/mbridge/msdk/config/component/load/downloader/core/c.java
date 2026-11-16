package com.mbridge.msdk.config.component.load.downloader.core;

import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class c extends FutureTask<h> implements Comparable<c> {
    private final h a;

    public c(h hVar) {
        super(hVar, null);
        this.a = hVar;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(c cVar) {
        h hVar = this.a;
        int i = hVar.a;
        h hVar2 = cVar.a;
        int i2 = hVar2.a;
        return i == i2 ? hVar.b - hVar2.b : i2 - i;
    }
}
