package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.hu4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class zzhdy extends zzhcz {
    public static zzhdy s(ListenableFuture listenableFuture) {
        return listenableFuture instanceof zzhdy ? (zzhdy) listenableFuture : new hu4(listenableFuture);
    }
}
