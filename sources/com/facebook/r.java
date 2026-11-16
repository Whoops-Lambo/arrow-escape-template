package com.facebook;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.singular.sdk.internal.Constants;
import defpackage.nj;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/facebook/r;", "Lcom/facebook/u;", "", "message", "", IronSourceConstants.EVENTS_ERROR_CODE, "failingUrl", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "c", "I", "getErrorCode", "()I", "d", "Ljava/lang/String;", "getFailingUrl", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "com/facebook/q", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class r extends u {

    @NotNull
    public static final q e = new q();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int errorCode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final String failingUrl;

    @Override // com.facebook.u, java.lang.Throwable
    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("{FacebookDialogException: errorCode: ");
        sb.append(this.errorCode);
        sb.append(", message: ");
        sb.append(getMessage());
        sb.append(", url: ");
        return nj.q(sb, this.failingUrl, "}");
    }

    public r(@Nullable String str, int i, @Nullable String str2) {
        super(str);
        this.errorCode = i;
        this.failingUrl = str2;
    }
}
