package com.singular.sdk;

import android.content.Intent;
import android.net.Uri;
import com.singular.sdk.internal.Constants;
import com.singular.sdk.internal.SeoLinkManager;
import com.singular.sdk.internal.SingularGlobalProperty;
import com.singular.sdk.internal.Utils;
import defpackage.d;
import defpackage.h50;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class SingularConfig {
    public final String apiKey;
    public String customSdid;
    public String customUserId;
    public DDLHandler ddlHandler;
    public SingularDeviceAttributionHandler deviceAttributionHandler;
    public String facebookAppId;
    public String fcmDeviceToken;
    public String imei;
    public SingularLinkHandler linkCallback;
    public Uri openUri;
    public String[][] pushNotificationLinkPath;
    public Intent pushNotificationPayload;
    public SDIDAccessorHandler sdidAccessorHandler;
    public final String secret;
    public long shortlinkTimeoutSec;
    public Uri singularLink;
    public SingularUserDetails userDetails;
    public boolean collectOAID = false;
    public Map<String, SingularGlobalProperty> globalProperties = new HashMap();
    public long sessionTimeoutSec = 60;
    public boolean enableLogging = false;
    public int logLevel = 6;
    public boolean isOpenedWithDeepLink = false;

    @Deprecated
    public List<String> approvedDomains = new ArrayList();
    public List<String> espDomains = new ArrayList();
    public List<String> brandedDomains = new ArrayList();
    public Boolean limitDataSharing = null;
    public Boolean limitAdvertisingIdentifiers = Boolean.FALSE;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class DDLHandler {
        public DeferredDeepLinkHandler handler;
        public long timeoutInSec = 60;
    }

    public SingularConfig withLoggingEnabled() {
        this.enableLogging = true;
        return this;
    }

    public SingularConfig withOAIDCollection() {
        this.collectOAID = true;
        return this;
    }

    public static SingularConfig copyWithKeyDecryption(SingularConfig singularConfig) {
        if (!singularConfig.apiKey.endsWith(Constants.ENCRYPTED_KEY_SUFFIX) && !singularConfig.secret.endsWith(Constants.ENCRYPTED_KEY_SUFFIX)) {
            return singularConfig;
        }
        boolean zEndsWith = singularConfig.apiKey.endsWith(Constants.ENCRYPTED_KEY_SUFFIX);
        String strXorDecrypt = singularConfig.apiKey;
        if (zEndsWith) {
            strXorDecrypt = Utils.xorDecrypt(Utils.findAndRemoveSuffixFromEncryptedKeys(strXorDecrypt, Constants.ENCRYPTED_KEY_SUFFIX));
        }
        boolean zEndsWith2 = singularConfig.secret.endsWith(Constants.ENCRYPTED_KEY_SUFFIX);
        String strXorDecrypt2 = singularConfig.secret;
        if (zEndsWith2) {
            strXorDecrypt2 = Utils.xorDecrypt(Utils.findAndRemoveSuffixFromEncryptedKeys(strXorDecrypt2, Constants.ENCRYPTED_KEY_SUFFIX));
        }
        SingularConfig singularConfig2 = new SingularConfig(strXorDecrypt, strXorDecrypt2);
        singularConfig2.facebookAppId = singularConfig.facebookAppId;
        singularConfig2.openUri = singularConfig.openUri;
        singularConfig2.ddlHandler = singularConfig.ddlHandler;
        singularConfig2.customUserId = singularConfig.customUserId;
        singularConfig2.imei = singularConfig.imei;
        singularConfig2.collectOAID = singularConfig.collectOAID;
        singularConfig2.globalProperties = singularConfig.globalProperties;
        singularConfig2.sessionTimeoutSec = singularConfig.sessionTimeoutSec;
        singularConfig2.enableLogging = singularConfig.enableLogging;
        singularConfig2.logLevel = singularConfig.logLevel;
        singularConfig2.singularLink = singularConfig.singularLink;
        singularConfig2.linkCallback = singularConfig.linkCallback;
        singularConfig2.deviceAttributionHandler = singularConfig.deviceAttributionHandler;
        singularConfig2.shortlinkTimeoutSec = singularConfig.shortlinkTimeoutSec;
        singularConfig2.isOpenedWithDeepLink = singularConfig.isOpenedWithDeepLink;
        singularConfig2.approvedDomains = singularConfig.approvedDomains;
        singularConfig2.espDomains = singularConfig.espDomains;
        singularConfig2.fcmDeviceToken = singularConfig.fcmDeviceToken;
        singularConfig2.limitDataSharing = singularConfig.limitDataSharing;
        singularConfig2.limitAdvertisingIdentifiers = singularConfig.limitAdvertisingIdentifiers;
        singularConfig2.customSdid = singularConfig.customSdid;
        singularConfig2.sdidAccessorHandler = singularConfig.sdidAccessorHandler;
        singularConfig2.pushNotificationLinkPath = singularConfig.pushNotificationLinkPath;
        singularConfig2.pushNotificationPayload = singularConfig.pushNotificationPayload;
        singularConfig2.brandedDomains = singularConfig.brandedDomains;
        singularConfig2.userDetails = singularConfig.userDetails;
        return singularConfig2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("apiKey='");
        sb.append(this.apiKey);
        sb.append("', secret='");
        sb.append(this.secret);
        sb.append('\'');
        if (this.openUri != null) {
            sb.append(", openUri=");
            sb.append(this.openUri);
        }
        if (this.ddlHandler != null) {
            sb.append(", ddlHandler=");
            sb.append(this.ddlHandler.getClass().getName());
            sb.append(", timeoutInSec=");
            sb.append(this.ddlHandler.timeoutInSec);
        }
        sb.append(", logging='");
        sb.append(this.enableLogging);
        sb.append("', logLevel='");
        return h50.l(sb, this.logLevel, '\'');
    }

    public SingularConfig withBrandedDomains(List<String> list) {
        this.brandedDomains = list;
        return this;
    }

    public SingularConfig withCustomSdid(String str, SDIDAccessorHandler sDIDAccessorHandler) {
        this.customSdid = str;
        this.sdidAccessorHandler = sDIDAccessorHandler;
        return this;
    }

    public SingularConfig withCustomUserId(String str) {
        this.customUserId = str;
        return this;
    }

    public SingularConfig withDDLHandler(DeferredDeepLinkHandler deferredDeepLinkHandler) {
        if (this.ddlHandler == null) {
            this.ddlHandler = new DDLHandler();
        }
        this.ddlHandler.handler = deferredDeepLinkHandler;
        return this;
    }

    public SingularConfig withDDLTimeoutInSec(long j) {
        if (this.ddlHandler == null) {
            this.ddlHandler = new DDLHandler();
        }
        this.ddlHandler.timeoutInSec = j;
        return this;
    }

    public SingularConfig withESPDomains(List<String> list) {
        this.espDomains = list;
        return this;
    }

    public SingularConfig withFacebookAppId(String str) {
        this.facebookAppId = str;
        return this;
    }

    public SingularConfig withGlobalProperty(String str, String str2, boolean z) {
        if (this.globalProperties.size() >= 5) {
            return this;
        }
        SingularGlobalProperty singularGlobalProperty = new SingularGlobalProperty(str, str2, z);
        this.globalProperties.put(singularGlobalProperty.getKey(), singularGlobalProperty);
        return this;
    }

    public SingularConfig withIMEI(String str) {
        this.imei = str;
        return this;
    }

    public SingularConfig withLimitAdvertisingIdentifiers() {
        this.limitAdvertisingIdentifiers = Boolean.TRUE;
        return this;
    }

    public SingularConfig withLogLevel(int i) {
        this.logLevel = i;
        return this;
    }

    public SingularConfig withOpenURI(Uri uri) {
        this.openUri = uri;
        return this;
    }

    public SingularConfig withPushNotificationPayload(Intent intent, String[]... strArr) {
        this.pushNotificationPayload = intent;
        this.pushNotificationLinkPath = strArr;
        return this;
    }

    public SingularConfig withSdidAccessorHandler(SDIDAccessorHandler sDIDAccessorHandler) {
        this.sdidAccessorHandler = sDIDAccessorHandler;
        return this;
    }

    public SingularConfig withSessionTimeoutInSec(long j) {
        this.sessionTimeoutSec = j;
        return this;
    }

    public SingularConfig withSingularDeviceAttribution(SingularDeviceAttributionHandler singularDeviceAttributionHandler) {
        this.deviceAttributionHandler = singularDeviceAttributionHandler;
        return this;
    }

    @Deprecated
    public SingularConfig withSingularLink(Intent intent, SingularLinkHandler singularLinkHandler, long j, List<String> list) {
        if (this.ddlHandler == null) {
            this.ddlHandler = new DDLHandler();
        }
        this.linkCallback = singularLinkHandler;
        this.shortlinkTimeoutSec = j;
        if (intent != null) {
            Uri data = intent.getData();
            this.singularLink = data;
            if (data != null && "android.intent.action.VIEW".equals(intent.getAction())) {
                this.isOpenedWithDeepLink = true;
            }
            SeoLinkManager.getInstance().captureFromIntent(intent);
        }
        return this;
    }

    public SingularConfig withUserDetails(SingularUserDetails singularUserDetails) {
        this.userDetails = singularUserDetails;
        return this;
    }

    public SingularConfig(String str, String str2) {
        if (!Utils.isEmptyOrNull(str)) {
            if (!Utils.isEmptyOrNull(str2)) {
                this.apiKey = str;
                this.secret = str2;
                return;
            } else {
                d.r("secret can not be null or empty");
                throw null;
            }
        }
        d.r("apiKey can not be null or empty");
        throw null;
    }

    public SingularConfig withFCMDeviceToken(String str) {
        if (Utils.isEmptyOrNull(str)) {
            return this;
        }
        this.fcmDeviceToken = str;
        return this;
    }

    public SingularConfig withLimitDataSharing(boolean z) {
        this.limitDataSharing = Boolean.valueOf(z);
        return this;
    }

    public SingularConfig withSingularLink(Intent intent, SingularLinkHandler singularLinkHandler, long j) {
        return withSingularLink(intent, singularLinkHandler, j, null);
    }

    public SingularConfig withSingularLink(Intent intent, SingularLinkHandler singularLinkHandler) {
        return withSingularLink(intent, singularLinkHandler, 10L, null);
    }

    @Deprecated
    public SingularConfig withSingularLink(Intent intent, SingularLinkHandler singularLinkHandler, List<String> list) {
        return withSingularLink(intent, singularLinkHandler, 10L, list);
    }
}
