package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.Image;
import defpackage.uu;
import java.util.Comparator;

/* JADX INFO: renamed from: com.inmobi.media.jl, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4138jl implements Comparator {
    public final /* synthetic */ int a;

    public C4138jl(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return uu.k(Integer.valueOf(Math.abs(((Image) obj).getWidth() - this.a)), Integer.valueOf(Math.abs(((Image) obj2).getWidth() - this.a)));
    }
}
