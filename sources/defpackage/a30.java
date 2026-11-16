package defpackage;

import android.adservices.customaudience.CustomAudience;
import android.adservices.customaudience.JoinCustomAudienceRequest;
import android.adservices.customaudience.LeaveCustomAudienceRequest;
import android.adservices.measurement.DeletionRequest;
import android.credentials.ClearCredentialStateException;
import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.credentials.CredentialManager;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.credentials.PrepareGetCredentialResponse;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class a30 {
    public static /* synthetic */ void A() {
    }

    public static /* synthetic */ void B() {
    }

    public static /* synthetic */ void C() {
        new LeaveCustomAudienceRequest.Builder();
    }

    public static /* synthetic */ void D() {
        new JoinCustomAudienceRequest.Builder();
    }

    public static /* synthetic */ CustomAudience.Builder b() {
        return new CustomAudience.Builder();
    }

    public static /* synthetic */ DeletionRequest.Builder c() {
        return new DeletionRequest.Builder();
    }

    public static /* synthetic */ ClearCredentialStateException f(String str, String str2) {
        return new ClearCredentialStateException(str, str2);
    }

    public static /* bridge */ /* synthetic */ ClearCredentialStateException g(Throwable th) {
        return (ClearCredentialStateException) th;
    }

    public static /* synthetic */ CreateCredentialException h(String str, String str2) {
        return new CreateCredentialException(str, str2);
    }

    public static /* bridge */ /* synthetic */ CreateCredentialException i(Throwable th) {
        return (CreateCredentialException) th;
    }

    public static /* bridge */ /* synthetic */ CreateCredentialResponse j(Object obj) {
        return (CreateCredentialResponse) obj;
    }

    public static /* bridge */ /* synthetic */ CredentialManager l(Object obj) {
        return (CredentialManager) obj;
    }

    public static /* synthetic */ GetCredentialException m(String str, String str2) {
        return new GetCredentialException(str, str2);
    }

    public static /* bridge */ /* synthetic */ GetCredentialException n(Throwable th) {
        return (GetCredentialException) th;
    }

    public static /* bridge */ /* synthetic */ GetCredentialResponse o(Object obj) {
        return (GetCredentialResponse) obj;
    }

    public static /* bridge */ /* synthetic */ PrepareGetCredentialResponse p(Object obj) {
        return (PrepareGetCredentialResponse) obj;
    }

    public static /* synthetic */ void u() {
    }

    public static /* synthetic */ void z() {
    }
}
