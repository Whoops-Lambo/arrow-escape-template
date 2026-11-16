package com.google.android.gms.identitycredentials.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.identitycredentials.RegistrationResponse;
import com.google.android.gms.tasks.TaskCompletionSource;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/google/android/gms/identitycredentials/internal/InternalIdentityCredentialClient$registerCredentials$1$callback$1", "Lcom/google/android/gms/identitycredentials/internal/IdentityCredentialBaseCallbacks;", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InternalIdentityCredentialClient$registerCredentials$1$callback$1 extends IdentityCredentialBaseCallbacks {
    @Override // com.google.android.gms.identitycredentials.internal.IdentityCredentialBaseCallbacks, com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
    public final void G3(Status status, RegistrationResponse registrationResponse) {
        status.getClass();
        TaskUtil.setResultOrApiException(status, registrationResponse, (TaskCompletionSource<RegistrationResponse>) null);
    }
}
