package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.s71;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.f8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4740f8 extends Throwable {

    @NotNull
    private final IronSourceError a;

    @NotNull
    public final IronSourceError a() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C4740f8.class.equals(obj.getClass())) {
            return false;
        }
        C4740f8 c4740f8 = (C4740f8) obj;
        if (this.a.getErrorCode() != c4740f8.a.getErrorCode()) {
            return false;
        }
        return s71.b(this.a.getErrorMessage(), c4740f8.a.getErrorMessage());
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.a.getErrorCode()), this.a.getErrorMessage());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4740f8(@NotNull IronSourceError ironSourceError) {
        super(ironSourceError.getErrorMessage());
        ironSourceError.getClass();
        this.a = ironSourceError;
    }
}
