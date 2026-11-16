package com.facebook;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/facebook/v;", "Lcom/facebook/u;", "Lcom/facebook/n0;", "graphResponse", "", "errorMessage", "<init>", "(Lcom/facebook/n0;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "c", "Lcom/facebook/n0;", "getGraphResponse", "()Lcom/facebook/n0;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class v extends u {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final n0 graphResponse;

    @Override // com.facebook.u, java.lang.Throwable
    @NotNull
    public String toString() {
        n0 n0Var = this.graphResponse;
        FacebookRequestError facebookRequestError = n0Var != null ? n0Var.d : null;
        StringBuilder sb = new StringBuilder("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(" ");
        }
        if (facebookRequestError != null) {
            sb.append("httpResponseCode: ");
            sb.append(facebookRequestError.a);
            sb.append(", facebookErrorCode: ");
            sb.append(facebookRequestError.b);
            sb.append(", facebookErrorType: ");
            sb.append(facebookRequestError.d);
            sb.append(", message: ");
            sb.append(facebookRequestError.a());
            sb.append("}");
        }
        return sb.toString();
    }

    public v(@Nullable n0 n0Var, @Nullable String str) {
        super(str);
        this.graphResponse = n0Var;
    }
}
