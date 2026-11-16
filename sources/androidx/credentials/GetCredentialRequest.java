package androidx.credentials;

import android.os.Bundle;
import defpackage.d;
import defpackage.eu;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/GetCredentialRequest;", "", "Builder", "Companion", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetCredentialRequest {
    public final List a;
    public final boolean b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/GetCredentialRequest$Builder;", "", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        public final ArrayList a = new ArrayList();
        public boolean b;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/credentials/GetCredentialRequest$Companion;", "", "", "BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", "Ljava/lang/String;", "BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", "BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static Bundle a(GetCredentialRequest getCredentialRequest) {
            getCredentialRequest.getClass();
            Bundle bundle = new Bundle();
            bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
            bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", getCredentialRequest.b);
            bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
            return bundle;
        }
    }

    public GetCredentialRequest(List list, boolean z) {
        this.a = list;
        this.b = z;
        if (!list.isEmpty()) {
            if (list.size() > 1) {
                List list2 = list;
                int i = 0;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if ((((CredentialOption) it.next()) instanceof GetDigitalCredentialOption) && (i = i + 1) < 0) {
                            eu.F();
                            throw null;
                        }
                    }
                }
                if (i > 0 && i != this.a.size()) {
                    d.r("Digital Credential Option cannot be used with other credential option.");
                    throw null;
                }
                Iterator it2 = this.a.iterator();
                while (it2.hasNext()) {
                    if (((CredentialOption) it2.next()) instanceof GetRestoreCredentialOption) {
                        d.r("Only a single GetRestoreCredentialOption should be provided.");
                        throw null;
                    }
                }
                return;
            }
            return;
        }
        d.r("credentialOptions should not be empty");
        throw null;
    }
}
