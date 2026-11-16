package com.ironsource;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
final class L4 implements U3 {

    @NotNull
    public static final L4 a = new L4();

    private L4() {
    }

    @Override // com.ironsource.U3
    @NotNull
    public InputStream a(@NotNull String str) throws IOException {
        str.getClass();
        InputStream inputStreamOpenStream = new URL(str).openStream();
        inputStreamOpenStream.getClass();
        return inputStreamOpenStream;
    }
}
