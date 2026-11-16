package androidx.credentials;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.du;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/CredentialProviderFactory;", "", "Companion", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CredentialProviderFactory {
    public final Context a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Landroidx/credentials/CredentialProviderFactory$Companion;", "", "", "TAG", "Ljava/lang/String;", "", "MAX_CRED_MAN_PRE_FRAMEWORK_API_LEVEL", "I", "CREDENTIAL_PROVIDER_KEY", "credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public final CredentialProvider b() throws PackageManager.NameNotFoundException {
        String string;
        Context context = this.a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List listZ0 = du.z0(arrayList);
        if (listZ0.isEmpty()) {
            return null;
        }
        Iterator it = listZ0.iterator();
        CredentialProvider credentialProvider = null;
        while (it.hasNext()) {
            try {
                Object objNewInstance = Class.forName((String) it.next()).getConstructor(Context.class).newInstance(context);
                objNewInstance.getClass();
                CredentialProvider credentialProvider2 = (CredentialProvider) objNewInstance;
                if (!credentialProvider2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (credentialProvider != null) {
                        Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    credentialProvider = credentialProvider2;
                }
            } catch (Throwable unused) {
            }
        }
        return credentialProvider;
    }

    public CredentialProviderFactory(Context context) {
        context.getClass();
        this.a = context;
    }

    public static CredentialProvider a(CredentialProviderFactory credentialProviderFactory, Object obj) {
        obj.getClass();
        if (!(obj instanceof CreateRestoreCredentialRequest) && !obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            if (obj instanceof GetCredentialRequest) {
                for (CredentialOption credentialOption : ((GetCredentialRequest) obj).a) {
                    if ((credentialOption instanceof GetRestoreCredentialOption) || (credentialOption instanceof GetDigitalCredentialOption)) {
                        return credentialProviderFactory.b();
                    }
                }
            } else if (!(obj instanceof SignalCredentialStateRequest)) {
                if (obj instanceof CreateDigitalCredentialRequest) {
                    return credentialProviderFactory.b();
                }
            } else {
                return credentialProviderFactory.b();
            }
            Context context = credentialProviderFactory.a;
            context.getClass();
            if (!context.getPackageManager().hasSystemFeature("android.software.leanback") && !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                int i = Build.VERSION.SDK_INT;
                CredentialProviderFrameworkImpl credentialProviderFrameworkImpl = null;
                if (i >= 34) {
                    CredentialProviderFrameworkImpl credentialProviderFrameworkImpl2 = new CredentialProviderFrameworkImpl(context);
                    if (credentialProviderFrameworkImpl2.isAvailableOnDevice()) {
                        credentialProviderFrameworkImpl = credentialProviderFrameworkImpl2;
                    }
                    if (credentialProviderFrameworkImpl == null) {
                        return credentialProviderFactory.b();
                    }
                    return credentialProviderFrameworkImpl;
                }
                if (i > 33) {
                    return null;
                }
                return credentialProviderFactory.b();
            }
            return credentialProviderFactory.b();
        }
        return credentialProviderFactory.b();
    }
}
