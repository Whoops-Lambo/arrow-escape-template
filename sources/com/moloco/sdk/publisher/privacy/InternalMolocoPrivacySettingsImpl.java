package com.moloco.sdk.publisher.privacy;

import android.content.Context;
import android.preference.PreferenceManager;
import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.dk2;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0017\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\fH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/moloco/sdk/publisher/privacy/InternalMolocoPrivacySettingsImpl;", "Lcom/moloco/sdk/publisher/privacy/InternalMolocoPrivacySettings;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "getUpdatedPrivacySettings", "Lcom/moloco/sdk/publisher/privacy/MolocoPrivacy$PrivacySettings;", "privacySettings", "getTCFConsent", "", "gdprApplies", "", "(Landroid/content/Context;)Ljava/lang/Boolean;", "getUSPrivacyConsentString", "userSetUsPrivacy", "Companion", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InternalMolocoPrivacySettingsImpl implements InternalMolocoPrivacySettings {

    @NotNull
    private static final String IABTCF_GDPR_APPLIES_KEY = "IABTCF_gdprApplies";

    @NotNull
    private static final String IABTCF_TC_STRING_KEY = "IABTCF_TCString";

    @NotNull
    private static final String IAB_US_PRIVACY_STRING_KEY = "IABUSPrivacy_String";

    @NotNull
    private final Context context;
    public static final int $stable = 8;

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public InternalMolocoPrivacySettingsImpl(@NotNull Context context) {
        context.getClass();
        this.context = context;
    }

    private final Boolean gdprApplies(Context context) {
        Object obj = PreferenceManager.getDefaultSharedPreferences(context).getAll().get(IABTCF_GDPR_APPLIES_KEY);
        if (obj instanceof Integer) {
            int iIntValue = ((Number) obj).intValue();
            if (iIntValue != 0) {
                if (iIntValue == 1) {
                    return Boolean.TRUE;
                }
                return null;
            }
            return Boolean.FALSE;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String lowerCase = ((String) obj).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            int iHashCode = lowerCase.hashCode();
            if (iHashCode != 48) {
                if (iHashCode != 49) {
                    if (iHashCode != 3569038) {
                        if (iHashCode == 97196323 && lowerCase.equals("false")) {
                            return Boolean.FALSE;
                        }
                        return null;
                    }
                    if (lowerCase.equals("true")) {
                        return Boolean.TRUE;
                    }
                    return null;
                }
                if (lowerCase.equals("1")) {
                    return Boolean.TRUE;
                }
                return null;
            }
            if (lowerCase.equals("0")) {
                return Boolean.FALSE;
            }
            return null;
        }
        return null;
    }

    private final String getTCFConsent(Context context) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("IABTCF_TCString", null);
        if (string == null || dk2.Z(string)) {
            return null;
        }
        return string;
    }

    private final String getUSPrivacyConsentString(Context context, String userSetUsPrivacy) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString(IAB_US_PRIVACY_STRING_KEY, null);
        if (string != null && !dk2.Z(string)) {
            return string;
        }
        return userSetUsPrivacy;
    }

    @Override // com.moloco.sdk.publisher.privacy.InternalMolocoPrivacySettings
    @NotNull
    public MolocoPrivacy.PrivacySettings getUpdatedPrivacySettings(@NotNull MolocoPrivacy.PrivacySettings privacySettings) {
        privacySettings.getClass();
        Boolean boolGdprApplies = gdprApplies(this.context);
        if (boolGdprApplies == null) {
            boolGdprApplies = privacySettings.getIsUserConsent();
        }
        return new MolocoPrivacy.PrivacySettings(boolGdprApplies, privacySettings.getIsAgeRestrictedUser(), privacySettings.getIsDoNotSell(), getTCFConsent(this.context), getUSPrivacyConsentString(this.context, privacySettings.get_usPrivacy()));
    }
}
