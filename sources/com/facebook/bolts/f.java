package com.facebook.bolts;

import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/bolts/f;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "<init>", "(Ljava/lang/Exception;)V", "facebook-bolts_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull Exception exc) {
        super("An exception was thrown by an Executor", exc);
        exc.getClass();
    }
}
