package androidx.credentials.provider;

import android.os.Bundle;
import defpackage.d;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/provider/BeginCreateCustomCredentialRequest;", "Landroidx/credentials/provider/BeginCreateCredentialRequest;", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BeginCreateCustomCredentialRequest extends BeginCreateCredentialRequest {
    public BeginCreateCustomCredentialRequest(Bundle bundle, String str) {
        if (str.length() > 0) {
            return;
        }
        d.r("type should not be empty");
        throw null;
    }
}
