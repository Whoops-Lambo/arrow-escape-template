package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.Image;
import defpackage.uu;
import java.util.Comparator;

/* JADX INFO: renamed from: com.inmobi.media.ml, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4222ml implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return uu.k(Integer.valueOf(((Image) obj2).getWidth()), Integer.valueOf(((Image) obj).getWidth()));
    }
}
