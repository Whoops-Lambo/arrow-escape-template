package com.facebook;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \f2\u00020\u0001:\u0001\u000eB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/facebook/e0;", "Lcom/facebook/u;", "Lcom/facebook/FacebookRequestError;", "requestError", "", "errorMessage", "<init>", "(Lcom/facebook/FacebookRequestError;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "c", "Lcom/facebook/FacebookRequestError;", "d", "()Lcom/facebook/FacebookRequestError;", "com/facebook/d0", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e0 extends u {

    @NotNull
    public static final d0 d = new d0();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final FacebookRequestError requestError;

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final FacebookRequestError getRequestError() {
        return this.requestError;
    }

    @Override // com.facebook.u, java.lang.Throwable
    @NotNull
    public String toString() {
        return "{FacebookServiceException: httpResponseCode: " + this.requestError.a + ", facebookErrorCode: " + this.requestError.b + ", facebookErrorType: " + this.requestError.d + ", message: " + this.requestError.a() + "}";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(@NotNull FacebookRequestError facebookRequestError, @Nullable String str) {
        super(str);
        facebookRequestError.getClass();
        this.requestError = facebookRequestError;
    }
}
