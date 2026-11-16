package io.p071bidmachine.core;

import androidx.annotation.Nullable;
import java.net.URLConnection;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f {
    public Object createFailResult(i iVar, URLConnection uRLConnection, byte[] bArr) throws Exception {
        return null;
    }

    public abstract Object createSuccessResult(i iVar, URLConnection uRLConnection, byte[] bArr) throws Exception;

    @Nullable
    public abstract byte[] obtainData(i iVar, URLConnection uRLConnection, @Nullable Object obj) throws Exception;

    public abstract void prepareHeaders(i iVar, URLConnection uRLConnection);

    public void prepareRequest(i iVar, URLConnection uRLConnection) {
    }
}
