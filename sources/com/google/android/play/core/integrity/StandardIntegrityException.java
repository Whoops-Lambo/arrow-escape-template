package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.singular.sdk.internal.UserDetailsUtils;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class StandardIntegrityException extends ApiException {
    private final Throwable a;

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardIntegrityException(int i, Throwable th) {
        super(new Status(i, "Standard Integrity API error (" + i + "): " + com.google.android.play.core.integrity.model.b.a(i) + UserDetailsUtils.UserDetailsLiterals.DOT));
        Locale locale = Locale.ROOT;
        if (i != 0) {
            this.a = th;
        } else {
            defpackage.d.r("ErrorCode should not be 0.");
            throw null;
        }
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
