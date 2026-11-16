package com.unity3d.services.core.properties;

import defpackage.n30;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/services/core/properties/SessionIdReader;", "", "<init>", "()V", "sessionId", "", "getSessionId", "()Ljava/lang/String;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SessionIdReader {

    @NotNull
    public static final SessionIdReader INSTANCE = new SessionIdReader();

    @NotNull
    private static final String sessionId = n30.f();

    @NotNull
    public final String getSessionId() {
        return sessionId;
    }

    private SessionIdReader() {
    }
}
