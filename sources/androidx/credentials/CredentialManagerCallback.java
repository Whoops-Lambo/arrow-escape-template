package androidx.credentials;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/credentials/CredentialManagerCallback;", "", "R", "E", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface CredentialManagerCallback<R, E> {
    void a(Object obj);

    void onResult(Object obj);
}
