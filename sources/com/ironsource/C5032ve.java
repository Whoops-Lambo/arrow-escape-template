package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.ve, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5032ve extends IllegalArgumentException {

    @NotNull
    private final IronSourceError a;
    private final int b;

    @NotNull
    public final IronSourceError a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5032ve(@NotNull IronSourceError ironSourceError) {
        super(ironSourceError.getErrorMessage());
        ironSourceError.getClass();
        this.a = ironSourceError;
        this.b = ironSourceError.getErrorCode();
    }
}
