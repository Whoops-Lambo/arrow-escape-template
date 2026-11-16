package io.p071bidmachine.util.network;

import defpackage.jc1;
import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/bidmachine/util/network/a;", "Ljava/io/IOException;", "", "responseCode", "<init>", "(I)V", "a", "I", "getResponseCode", "()I", "bidmachine-android-sdk_bd_3_8_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class a extends IOException {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int responseCode;

    public a(int i) {
        super(jc1.k(i, "Server returned ", " code"));
        this.responseCode = i;
    }
}
