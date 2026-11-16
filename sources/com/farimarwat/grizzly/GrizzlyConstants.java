package com.farimarwat.grizzly;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/farimarwat/grizzly/GrizzlyConstants;", "", "()V", "EXTRA_MESSAGE", "", "getEXTRA_MESSAGE", "()Ljava/lang/String;", "EXTRA_TITLE", "getEXTRA_TITLE", "TAG", "getTAG", "grizzly_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GrizzlyConstants {

    @NotNull
    public static final GrizzlyConstants INSTANCE = new GrizzlyConstants();

    @NotNull
    private static final String EXTRA_TITLE = "title";

    @NotNull
    private static final String EXTRA_MESSAGE = "message";

    @NotNull
    private static final String TAG = "GRIZZLY";

    @NotNull
    public final String getEXTRA_MESSAGE() {
        return EXTRA_MESSAGE;
    }

    @NotNull
    public final String getEXTRA_TITLE() {
        return EXTRA_TITLE;
    }

    @NotNull
    public final String getTAG() {
        return TAG;
    }

    private GrizzlyConstants() {
    }
}
